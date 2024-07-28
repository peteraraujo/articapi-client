package com.peteraraujo.articapi.services.website.printedcatalog

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.PrintedCatalog
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [PrintedCatalog] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class PrintedCatalogService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<PrintedCatalog, Int, PrintedCatalogFieldParam>(
        client = client,
        endpoint = "printed-catalogs",
        entitySerializer = BaseResponse.serializer(PrintedCatalog.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(PrintedCatalog.serializer())),
        json = json
    )