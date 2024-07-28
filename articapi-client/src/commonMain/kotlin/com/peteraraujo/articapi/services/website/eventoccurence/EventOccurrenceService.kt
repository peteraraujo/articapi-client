package com.peteraraujo.articapi.services.website.eventoccurence

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.EventOccurrence
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import data.services.articapi.services.website.eventoccurence.EventOccurrenceFieldParam
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [EventOccurrence] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class EventOccurrenceService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<EventOccurrence, String, EventOccurrenceFieldParam>(
        client = client,
        endpoint = "event-occurrences",
        entitySerializer = BaseResponse.serializer(EventOccurrence.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(EventOccurrence.serializer())),
        json = json
    )