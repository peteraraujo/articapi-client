package com.peteraraujo.articapi.services.site

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.staticarchive.Site
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearchAndIncludeParam
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Site] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class SiteService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearchAndIncludeParam<Site, Int, SiteFieldParam, SiteIncludeParam>(
        client = client,
        endpoint = "sites",
        entitySerializer = BaseResponse.serializer(Site.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Site.serializer())),
        json = json
    )