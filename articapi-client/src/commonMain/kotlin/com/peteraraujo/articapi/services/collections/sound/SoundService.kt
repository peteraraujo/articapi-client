package com.peteraraujo.articapi.services.collections.sound

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Sound
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Sound] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class SoundService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Sound, String, SoundFieldParam>(
        client = client,
        endpoint = "sounds",
        entitySerializer = BaseResponse.serializer(Sound.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Sound.serializer())),
        json = json
    )