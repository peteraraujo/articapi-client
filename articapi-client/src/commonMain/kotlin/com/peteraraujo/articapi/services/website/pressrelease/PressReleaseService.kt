package com.peteraraujo.articapi.services.website.pressrelease

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.PressRelease
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [PressRelease] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class PressReleaseService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<PressRelease, Int, PressReleaseFieldParam>(
        client = client,
        endpoint = "press-releases",
        entitySerializer = BaseResponse.serializer(PressRelease.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(PressRelease.serializer())),
        json = json
    )