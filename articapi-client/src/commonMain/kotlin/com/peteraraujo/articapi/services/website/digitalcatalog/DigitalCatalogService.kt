package com.peteraraujo.articapi.services.website.digitalcatalog

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.DigitalCatalog
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [DigitalCatalog] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class DigitalCatalogService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<DigitalCatalog, Int, DigitalCatalogFieldParam>(
        client = client,
        endpoint = "digital-catalogs",
        entitySerializer = BaseResponse.serializer(DigitalCatalog.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(DigitalCatalog.serializer())),
        json = json
    )