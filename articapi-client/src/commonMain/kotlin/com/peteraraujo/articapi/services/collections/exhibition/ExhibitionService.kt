package com.peteraraujo.articapi.services.collections.exhibition

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Exhibition
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearchAndIncludeParam
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Exhibition] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 *
 */
class ExhibitionService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearchAndIncludeParam<Exhibition, Int, ExhibitionFieldParam, ExhibitionIncludeParam>(
        client = client,
        endpoint = "exhibitions",
        entitySerializer = BaseResponse.serializer(Exhibition.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Exhibition.serializer())),
        json = json
    )
