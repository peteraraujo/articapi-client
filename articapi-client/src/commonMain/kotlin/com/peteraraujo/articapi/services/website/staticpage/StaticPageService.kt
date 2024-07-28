package com.peteraraujo.articapi.services.website.staticpage

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.StaticPage
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [StaticPage] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class StaticPageService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<StaticPage, Int, StaticPageFieldParam>(
        client = client,
        endpoint = "static-pages",
        entitySerializer = BaseResponse.serializer(StaticPage.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(StaticPage.serializer())),
        json = json
    )