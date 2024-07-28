package com.peteraraujo.articapi.services.mockbaseservices

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.mock.baseservices.MockBaseServiceWithSearchAndIncludeParam
import com.peteraraujo.articapi.mock.params.MockIncludeParam
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_LIST_RESPONSE
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class MockBaseServiceWithSearchAndIncludeParamTests {

    @Test
    fun shouldInstantiateWithoutErrors() {

        val engine = MockEngine { _ ->
            respond(
                content = "",
                status = HttpStatusCode.OK,
                headers = headersOf(
                    HttpHeaders.ContentType,
                    "application/json"
                )
            )
        }

        val client = ArticApiClient(customEngine = engine).client

        try {
            MockBaseServiceWithSearchAndIncludeParam(client = client)
        } catch (e: Exception) {
            throw AssertionError(e.message)
        }

    }

    @Test
    fun getItems_request_shouldParseIncludeCorrectly() =
        runTest {

            val engine = MockEngine { _ ->

                respond(
                    content = MOCK_MODEL_LIST_RESPONSE,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(customEngine = engine).client

            // Make request
            MockBaseServiceWithSearchAndIncludeParam(client = client).getItems(
                include = listOf(
                    MockIncludeParam.TitleList,
                    MockIncludeParam.Thumbnail
                )
            )

            // Get request
            val request = engine.requestHistory[0]

            val fieldParamValue = request.url.parameters["include"]

            assertEquals(
                actual = fieldParamValue,
                expected = "title_list,thumbnail"
            )


        }

}