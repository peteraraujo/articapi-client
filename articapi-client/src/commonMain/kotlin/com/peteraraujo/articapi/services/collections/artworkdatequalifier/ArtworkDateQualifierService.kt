package com.peteraraujo.articapi.services.collections.artworkdatequalifier

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.ArtworkDateQualifier
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [ArtworkDateQualifier] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ArtworkDateQualifierService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) : BaseService<ArtworkDateQualifier, Int, ArtworkDateQualifierFieldParam>(
    client = client,
    endpoint = "artwork-date-qualifiers",
    entitySerializer = BaseResponse.serializer(ArtworkDateQualifier.serializer()),
    listEntitySerializer = BaseResponse.serializer(ListSerializer(ArtworkDateQualifier.serializer())),
    json = json
)

