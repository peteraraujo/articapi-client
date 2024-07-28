package com.peteraraujo.articapi.services.mobile.tour

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.mobile.Tour
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearchAndIncludeParam
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Tour] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class TourService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearchAndIncludeParam<Tour, Int, TourFieldParam, TourIncludeParam>(
        client = client,
        endpoint = "tours",
        entitySerializer = BaseResponse.serializer(Tour.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Tour.serializer())),
        json = json
    )