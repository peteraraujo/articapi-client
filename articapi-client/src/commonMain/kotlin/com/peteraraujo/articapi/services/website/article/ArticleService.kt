package com.peteraraujo.articapi.services.website.article

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.website.Article
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Article] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ArticleService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Article, Int, ArticleFieldParam>(
        client = client,
        endpoint = "articles",
        entitySerializer = BaseResponse.serializer(Article.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Article.serializer())),
        json = json
    )