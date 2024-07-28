package com.peteraraujo.articapi.services.commons.baseservices

import com.peteraraujo.articapi.exceptions.InvalidLimitException
import com.peteraraujo.articapi.exceptions.InvalidNumberOfResultsException
import com.peteraraujo.articapi.exceptions.ItemNotFoundException
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
 * Base service with most basic endpoint types.
 *
 * @param client [HttpClient] to use for making requests.
 * @param endpoint Endpoint's relative path.
 * @param entitySerializer Serializer to process [Entity].
 * @param listEntitySerializer Serializer to process list of [Entity].
 * @param json [Json] instance to use for serialization.
 *
 * */
abstract class BaseService<Entity, Id, FieldParam : Param> internal constructor(
    private val client: HttpClient,
    protected open val endpoint: String,
    private val listEntitySerializer: KSerializer<BaseResponse<List<Entity>>>,
    private val entitySerializer: KSerializer<BaseResponse<Entity>>,
    private val json: Json
) {

    /**
     * Retrieves a list of items.
     *
     * @param ids List of resource ids to retrieve.
     * @param limit The number of resources to return per page.
     * @param page The page of resources to retrieve.
     * @param rawFields List of fields to return per resource.
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
        fields: List<FieldParam>? = null,
    ): HttpResponse {

        val fieldList = mutableListOf<String>()

        rawFields?.let { fieldList += rawFields }
        fields?.let { fieldList += fields.map { it.value } }

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

        }

    }

    /**
     * Retrieves a list of items.
     *
     * @param ids List of resource ids to retrieve.
     * @param limit The number of resources to return per page.
     * @param page The page of resources to retrieve.
     * @param rawFields List of fields to return per resource.
     * @param fields List of fields to return per resource.
     *
     * @return [BaseResponse] containing the result list.
     *
     * @throws InvalidLimitException Limit is invalid.
     * @throws InvalidNumberOfResultsException Number of results is invalid.
     */
    suspend fun getItems(
        ids: List<Id>? = null,
        page: Int? = null,
        limit: Int? = null,
        rawFields: List<String>? = null,
        fields: List<FieldParam>? = null,
    ): BaseResponse<List<Entity>> {

        return json.decodeFromString(
            deserializer = listEntitySerializer,
            string = getItemsAsHttpResponse(ids, page, limit, rawFields, fields).bodyAsText()
        )

    }

    /**
     * Get a single item by the given identifier.
     *
     * @param id The identifier of the item.
     * @param rawFields List of fields to return per resource.
     * @param fields List of fields to return per resource.
     *
     * @return The requested [HttpResponse].
     * @throws ItemNotFoundException if the item was not found.
     *
     */
    suspend fun getByIdAsHttpResponse(
        id: Id,
        rawFields: List<String>? = null,
        fields: List<FieldParam>? = null,
    ): HttpResponse {

        val fieldList = mutableListOf<String>()

        rawFields?.let { fieldList += rawFields }
        fields?.let { fieldList += fields.map { it.value } }

        return client.get("$endpoint/$id") {
            if (fieldList.isNotEmpty()) {
                parameter(
                    "fields",
                    fieldList.distinct().joinToString(separator = ",")
                )
            }

        }

    }


    /**
     * Get a single item by the given identifier.
     *
     * @param id The identifier of the item.
     * @param rawFields List of fields to return per resource.
     * @param fields List of fields to return per resource.
     *
     * @return [BaseResponse] containing the requested item.
     * @throws ItemNotFoundException if the item was not found.
     *
     */
    suspend fun getById(
        id: Id,
        rawFields: List<String>? = null,
        fields: List<FieldParam>? = null,
    ): BaseResponse<Entity> {

        return json.decodeFromString(
            deserializer = entitySerializer,
            string = getByIdAsHttpResponse(id, rawFields, fields).bodyAsText()
        )

    }




}