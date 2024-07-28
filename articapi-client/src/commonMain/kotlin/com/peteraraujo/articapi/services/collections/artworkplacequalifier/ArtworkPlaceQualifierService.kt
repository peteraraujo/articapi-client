package com.peteraraujo.articapi.services.collections.artworkplacequalifier

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.ArtworkPlaceQualifier
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [ArtworkPlaceQualifier] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ArtworkPlaceQualifierService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) : BaseService<ArtworkPlaceQualifier, Int, ArtworkPlaceQualifierFieldParam>(
    client = client,
    endpoint = "artwork-place-qualifiers",
    entitySerializer = BaseResponse.serializer(ArtworkPlaceQualifier.serializer()),
    listEntitySerializer = BaseResponse.serializer(ListSerializer(ArtworkPlaceQualifier.serializer())),
    json = json
)