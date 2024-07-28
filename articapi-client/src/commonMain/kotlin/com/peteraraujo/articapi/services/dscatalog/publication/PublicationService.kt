package com.peteraraujo.articapi.services.dscatalog.publication

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.dscatalog.Publication
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Publication] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class PublicationService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Publication, Int, PublicationFieldParam>(
        client = client,
        endpoint = "publications",
        entitySerializer = BaseResponse.serializer(Publication.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Publication.serializer())),
        json = json
    )