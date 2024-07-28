package com.peteraraujo.articapi.services.mobile.mobilesound

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.mobile.MobileSound
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [MobileSound] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class MobileSoundService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<MobileSound, Int, MobileSoundFieldParam>(
        client = client,
        endpoint = "mobile-sounds",
        entitySerializer = BaseResponse.serializer(MobileSound.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(MobileSound.serializer())),
        json = json
    )