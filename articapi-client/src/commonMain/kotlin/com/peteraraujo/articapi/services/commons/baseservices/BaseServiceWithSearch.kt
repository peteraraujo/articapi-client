package com.peteraraujo.articapi.services.commons.baseservices

import com.peteraraujo.articapi.exceptions.InvalidLimitException
import com.peteraraujo.articapi.exceptions.InvalidNumberOfResultsException
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.Param
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

/**
 * Base service with most basic endpoint types plus [search].
 *
 * @param client [HttpClient] to use for making requests.
 * @param endpoint Endpoint's relative path.
 * @param entitySerializer Serializer to process [Entity].
 * @param listEntitySerializer Serializer to process list of [Entity].
 * @param json [Json] instance to use for serialization.
 * */
abstract class BaseServiceWithSearch<Entity, Id, FieldParam : Param> internal constructor(
    private val client: HttpClient,
    override val endpoint: String,
    private val listEntitySerializer: KSerializer<BaseResponse<List<Entity>>>,
    entitySerializer: KSerializer<BaseResponse<Entity>>,
    private val json: Json
) : BaseService<Entity, Id, FieldParam>(
    client,
    endpoint,
    listEntitySerializer,
    entitySerializer,
    json
) {


    /**
     * Search items.
     *
     * @param search Your search query.
     * @param query For complex queries, you can pass Elasticsearch domain syntax queries here.
     * @param sort Used in conjunction with query.
     * @param from Starting point of results. Pagination via Elasticsearch conventions.
     * @param size Number of results to return. Pagination via Elasticsearch conventions.
     * @param facets A list of 'count' aggregation facets to include in the results.
     * @param rawFields List of fields to return per resource.
     * @param fields List of fields to return per resource.
     *
     * @return The requested [HttpResponse].
     *
     * @throws InvalidLimitException Limit (size) is invalid.
     * @throws InvalidNumberOfResultsException Number of results is invalid.
     */
    suspend fun searchAsHttpResponse(
        search: String? = null,
        query: String? = null,
        sort: String? = null,
        from: Int? = null,
        size: Int? = null,
        facets: List<String>? = null,
        rawFields: List<String>? = null,
        fields: List<FieldParam>? = null,
    ): HttpResponse {

        val fieldList = mutableListOf<String>()

        rawFields?.let { fieldList += rawFields }
        fields?.let { fieldList += fields.map { it.value } }

        return client.get("$endpoint/search") {

            parameter(
                "q",
                search
            )
            parameter(
                "query",
                query
            )
            parameter(
                "sort",
                sort
            )
            parameter(
                "from",
                from
            )
            parameter(
                "size",
                size
            )
            parameter(
                "facets",
                facets?.distinct()
                    ?.joinToString(",")
            )
            if (fieldList.isNotEmpty()) {
                parameter(
                    "fields",
                    fieldList.distinct().joinToString(separator = ",")
                )
            }
        }

    }

    /**
     * Search items.
     *
     * @param search Your search query.
     * @param query For complex queries, you can pass Elasticsearch domain syntax queries here.
     * @param sort Used in conjunction with query.
     * @param from Starting point of results. Pagination via Elasticsearch conventions.
     * @param size Number of results to return. Pagination via Elasticsearch conventions.
     * @param facets A list of 'count' aggregation facets to include in the results.
     * @param rawFields List of fields to return per resource.
     * @param fields List of fields to return per resource.
     *
     * @return [BaseResponse] containing the result list.
     *
     * @throws InvalidLimitException Limit (size) is invalid.
     * @throws InvalidNumberOfResultsException Number of results is invalid.
     */
    suspend fun search(
        search: String? = null,
        query: String? = null,
        sort: String? = null,
        from: Int? = null,
        size: Int? = null,
        facets: List<String>? = null,
        rawFields: List<String>? = null,
        fields: List<FieldParam>? = null,
    ): BaseResponse<List<Entity>> {

        return json.decodeFromString(
            deserializer = listEntitySerializer,
            string = searchAsHttpResponse(
                search,
                query,
                sort,
                from,
                size,
                facets,
                rawFields,
                fields
            ).bodyAsText()
        )

    }

}