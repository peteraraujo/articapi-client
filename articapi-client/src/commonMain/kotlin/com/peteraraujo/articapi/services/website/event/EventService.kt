package com.peteraraujo.articapi.services.website.event

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.Event
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Event] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class EventService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Event, Int, EventFieldParam>(
        client = client,
        endpoint = "events",
        entitySerializer = BaseResponse.serializer(Event.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Event.serializer())),
        json = json
    )