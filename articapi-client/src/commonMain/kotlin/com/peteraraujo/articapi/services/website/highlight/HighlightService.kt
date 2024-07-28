package com.peteraraujo.articapi.services.website.highlight

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.Highlight
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Highlight] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class HighlightService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Highlight, Int, HighlightFieldParam>(
        client = client,
        endpoint = "highlights",
        entitySerializer = BaseResponse.serializer(Highlight.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Highlight.serializer())),
        json = json
    )