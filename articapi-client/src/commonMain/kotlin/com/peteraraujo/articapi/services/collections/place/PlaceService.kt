package com.peteraraujo.articapi.services.collections.place

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Place
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Place] endpoints.
 *
 * @param client The HTTP client to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class PlaceService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Place, Int, PlaceFieldParam>(
        client = client,
        endpoint = "places",
        entitySerializer = BaseResponse.serializer(Place.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Place.serializer())),
        json = json
    )
