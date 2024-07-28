package com.peteraraujo.articapi.services.dscatalog.section

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.dscatalog.Section
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Section] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class SectionService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Section, Long, SectionFieldParam>(
        client = client,
        endpoint = "sections",
        entitySerializer = BaseResponse.serializer(Section.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Section.serializer())),
        json = json
    )