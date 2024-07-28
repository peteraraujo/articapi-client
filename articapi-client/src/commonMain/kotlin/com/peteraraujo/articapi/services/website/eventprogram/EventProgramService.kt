package com.peteraraujo.articapi.services.website.eventprogram

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.EventProgram
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [EventProgram] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class EventProgramService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<EventProgram, Int, EventProgramFieldParam>(
        client = client,
        endpoint = "event-programs",
        entitySerializer = BaseResponse.serializer(EventProgram.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(EventProgram.serializer())),
        json = json
    )