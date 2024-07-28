package com.peteraraujo.articapi.services.collections.video

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Video
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Video] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class VideoService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Video, String, VideoFieldParam>(
        client = client,
        endpoint = "videos",
        entitySerializer = BaseResponse.serializer(Video.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Video.serializer())),
        json = json
    )