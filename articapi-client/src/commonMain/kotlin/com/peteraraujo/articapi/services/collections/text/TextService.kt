package com.peteraraujo.articapi.services.collections.text

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Text
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Text] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class TextService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Text, String, TextFieldParam>(
        client = client,
        endpoint = "texts",
        entitySerializer = BaseResponse.serializer(Text.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Text.serializer())),
        json = json
    )