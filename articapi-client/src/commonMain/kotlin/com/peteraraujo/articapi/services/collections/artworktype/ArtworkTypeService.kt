package com.peteraraujo.articapi.services.collections.artworktype

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.ArtworkType
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json


/**
 * Service for interacting with [ArtworkType] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ArtworkTypeService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseService<ArtworkType, Int, ArtworkTypeFieldParam>(
        client = client,
        endpoint = "artwork-types",
        entitySerializer = BaseResponse.serializer(ArtworkType.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(ArtworkType.serializer())),
        json = json
    )