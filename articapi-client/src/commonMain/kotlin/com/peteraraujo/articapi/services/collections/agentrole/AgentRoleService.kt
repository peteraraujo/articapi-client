package com.peteraraujo.articapi.services.collections.agentrole

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.collections.AgentRole
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [AgentRole] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class AgentRoleService(client: HttpClient = ArticApiClient.defaultClient, json: Json = ArticApiClient.defaultJson) :
    BaseService<AgentRole, Int, AgentRoleFieldParam>(
        client = client,
        endpoint = "agent-roles",
        entitySerializer = BaseResponse.serializer(AgentRole.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(AgentRole.serializer())),
        json = json
    )