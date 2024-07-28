package com.peteraraujo.articapi.services.product

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.shop.Product
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearch
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Product] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 */
class ProductService(
    client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) :
    BaseServiceWithSearch<Product, Int, ProductFieldParam>(
        client = client,
        endpoint = "products",
        entitySerializer = BaseResponse.serializer(Product.serializer()),
        listEntitySerializer = BaseResponse.serializer(ListSerializer(Product.serializer())),
        json = json
    )