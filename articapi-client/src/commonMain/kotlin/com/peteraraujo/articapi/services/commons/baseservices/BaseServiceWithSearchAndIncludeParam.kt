package com.peteraraujo.articapi.services.commons.baseservices

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
 * Base service with most basic endpoint types plus [search] and [getItems] with 'include' param.
 *
 * @param client [HttpClient] to use for making requests.
 * @param endpoint Endpoint's relative path.
 * @param entitySerializer Serializer to process [Entity].
 * @param listEntitySerializer Serializer to process list of [Entity].
 * @param json [Json] instance to use for serialization.
 *
 * */
abstract class BaseServiceWithSearchAndIncludeParam<Entity, Id, FieldParam : Param, IncludeParam : Param> internal constructor(
    private val client: HttpClient,
    override val endpoint: String,
    private val listEntitySerializer: KSerializer<BaseResponse<List<Entity>>>,
    entitySerializer: KSerializer<BaseResponse<Entity>>,
    private val json: Json
) : BaseServiceWithSearch<Entity, Id, FieldParam>(
    client,
    endpoint,
    listEntitySerializer,
    entitySerializer,
    json
) {

    /**
     * Retrieves a list of items.
     *
     * @param ids List of resource ids to retrieve.
     * @param limit The number of resources to return per page.
     * @param page The page of resources to retrieve.
     * @param rawFields List of fields to return per resource.
     * @param rawInclude List of subresource to embed in the returned resources.
     * @param include List of subresource to embed in the returned resources.
     * @param fields List of fields to return per resource.
     *
     * @return The requested [HttpResponse].
     *
     * @throws InvalidLimitException Limit is invalid.
     * @throws InvalidNumberOfResultsException Number of results is invalid.
     */
    suspend fun getItemsAsHttpResponse(
        ids: List<Id>? = null,
        page: Int? = null,
        limit: Int? = null,
        rawFields: List<String>? = null,
        rawInclude: List<String>? = null,
        fields: List<FieldParam>? = null,
        include: List<IncludeParam>? = null,
    ): HttpResponse {

        val fieldList = mutableListOf<String>()

        rawFields?.let { fieldList += rawFields }
        fields?.let { fieldList += fields.map { it.value } }

        val includeList = mutableListOf<String>()

        rawInclude?.let { includeList += rawInclude }
        include?.let { includeList += include.map { it.value } }

        return client.get(urlString = endpoint) {

            parameter(
                "ids",
                ids?.distinct()
                    ?.joinToString(",")
            )
            parameter(
                "limit",
                limit
            )
            parameter(
                "page",
                page
            )
            if (fieldList.isNotEmpty()) {
                parameter(
                    "fields",
                    fieldList.distinct().joinToString(separator = ",")
                )
            }

            if (includeList.isNotEmpty()) {
                parameter(
                    "include",
                    includeList.distinct().joinToString(separator = ",")
                )
            }

        }

    }

    /**
     * Retrieves a list of items.
     *
     * @param ids List of resource ids to retrieve.
     * @param limit The number of resources to return per page.
     * @param page The page of resources to retrieve.
     * @param rawFields List of fields to return per resource.
     * @param rawInclude List of subresource to embed in the returned resources.
     * @param fields List of fields to return per resource.
     * @param include List of subresource to embed in the returned resources.
     *
     * @return [BaseResponse] containing the list of artworks.
     *
     * @throws InvalidLimitException Limit is invalid.
     * @throws InvalidNumberOfResultsException Number of results is invalid.
     */
    suspend fun getItems(
        ids: List<Id>? = null,
        page: Int? = null,
        limit: Int? = null,
        rawFields: List<String>? = null,
        rawInclude: List<String>? = null,
        fields: List<FieldParam>? = null,
        include: List<IncludeParam>? = null,
    ): BaseResponse<List<Entity>> {

        return json.decodeFromString(
            deserializer = listEntitySerializer,
            string = getItemsAsHttpResponse(ids, page, limit, rawFields, rawInclude, fields, include).bodyAsText()
        )

    }

}