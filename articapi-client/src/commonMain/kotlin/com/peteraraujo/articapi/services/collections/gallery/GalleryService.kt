package com.peteraraujo.articapi.services.collections.gallery

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Gallery
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 *
 * Service for interacting with [Gallery] endpoints.
 *
 * @param client The HTTP client to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class GalleryService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Gallery, Int, GalleryFieldParam>(
        client = client,
        endpoint = "galleries",
        entitySerializer = BaseResponse.serializer(Gallery.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Gallery.serializer())),
        json = json
    )