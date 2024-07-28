package com.peteraraujo.articapi.services.collections.categoryterm

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.CategoryTerm
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json


/**
 * Service for interacting with [CategoryTerm] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class CategoryTermService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<CategoryTerm, Int, CategoryTermFieldParam>(
        client = client,
        endpoint = "category-terms",
        entitySerializer = BaseResponse.serializer(CategoryTerm.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(CategoryTerm.serializer())),
        json = json
    )