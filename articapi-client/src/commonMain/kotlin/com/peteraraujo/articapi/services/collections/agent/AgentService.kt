package com.peteraraujo.articapi.services.collections.agent

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.Agent
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Agent] endpoints.
 *
 * @param client The HTTP client to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class AgentService(client: HttpClient = ArticApiClient.defaultClient, json: Json = ArticApiClient.defaultJson) :
    BaseServiceWithSearch<Agent, Int, AgentFieldParam>(
        client = client,
        endpoint = "agents",
        entitySerializer = BaseResponse.serializer(Agent.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Agent.serializer())),
        json = json
    )