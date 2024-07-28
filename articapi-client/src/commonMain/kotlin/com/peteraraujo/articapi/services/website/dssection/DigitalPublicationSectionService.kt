package com.peteraraujo.articapi.services.website.dssection

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.DigitalPublicationSection
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [DigitalPublicationSection] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class DigitalPublicationSectionService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<DigitalPublicationSection, Int, DigitalPublicationSectionFieldParam>(
        client = client,
        endpoint = "digital-publication-sections",
        entitySerializer = BaseResponse.serializer(DigitalPublicationSection.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(DigitalPublicationSection.serializer())),
        json = json
    )