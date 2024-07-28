package com.peteraraujo.articapi.services.website.genericpage

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.GenericPage
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [GenericPage] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class GenericPageService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<GenericPage, Int, GenericPageFieldParam>(
        client = client,
        endpoint = "generic-pages",
        entitySerializer = BaseResponse.serializer(GenericPage.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(GenericPage.serializer())),
        json = json
    )