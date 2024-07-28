package com.peteraraujo.articapi.mock.baseservices

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.mock.models.MockModel
import com.peteraraujo.articapi.mock.params.MockFieldParam
import com.peteraraujo.articapi.mock.params.MockIncludeParam
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearchAndIncludeParam
import io.ktor.client.HttpClient
import kotlinx.serialization.builtins.ListSerializer

class MockBaseServiceWithSearchAndIncludeParam(
    client: HttpClient
) : BaseServiceWithSearchAndIncludeParam<MockModel, Int, MockFieldParam, MockIncludeParam>(
    client = client,
    endpoint = "mock",
    entitySerializer = BaseResponse.serializer(MockModel.serializer()),
    listEntitySerializer = BaseResponse.serializer(ListSerializer(MockModel.serializer())),
    json = ArticApiClient.defaultJson
) {
}