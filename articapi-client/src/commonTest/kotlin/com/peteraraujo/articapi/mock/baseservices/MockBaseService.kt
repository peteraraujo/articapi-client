package com.peteraraujo.articapi.mock.baseservices

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.mock.models.MockModel
import com.peteraraujo.articapi.mock.params.MockFieldParam
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseService
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer

class MockBaseService(
    client: HttpClient,
) : BaseService<MockModel, Int, MockFieldParam>(
    client = client,
    endpoint = "mock",
    listEntitySerializer = BaseResponse.serializer(ListSerializer(MockModel.serializer())),
    entitySerializer = BaseResponse.serializer(MockModel.serializer()),
    json = ArticApiClient.defaultJson
)