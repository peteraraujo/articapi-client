package com.peteraraujo.articapi.services.collections.agenttype

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.AgentType
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [AgentType] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class AgentTypeService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseService<AgentType, Int, AgentTypeFieldParam>(
        client = client,
        endpoint = "agent-types",
        entitySerializer = BaseResponse.serializer(AgentType.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(AgentType.serializer())),
        json = json
    )
