package com.peteraraujo.articapi.services.collections.image

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.image.Image
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Image] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ImageService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Image, String, ImageFieldParam>(
        client = client,
        endpoint = "images",
        entitySerializer = BaseResponse.serializer(Image.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Image.serializer())),
        json = json
    )