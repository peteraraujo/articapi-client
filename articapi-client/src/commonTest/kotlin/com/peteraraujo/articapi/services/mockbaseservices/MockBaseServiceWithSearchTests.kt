package com.peteraraujo.articapi.services.mockbaseservices

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.mock.baseservices.MockBaseServiceWithSearch
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_EMPTY_LIST_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_LIST_RESPONSE
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class MockBaseServiceWithSearchTests {

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
            MockBaseServiceWithSearch(client = client)
        } catch (e: Exception) {
            throw AssertionError(e.message)
        }

    }

    @Test
    fun search_successResponse_shouldReturnCorrectData() = runTest {

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

        val service = MockBaseServiceWithSearch(client = client)

        val result = service.search(search = "Mock")

        assertNotNull(
            result.pagination
        )

        assertTrue(
            result.data.isNotEmpty()
        )

        assertEquals(
            result.data.size,
            2
        )

        assertEquals(
            result.data[0].id,
            1
        )

        assertEquals(
            result.data[0].title,
            "Mock Title"
        )


    }

    @Test
    fun search_noResultsResponse_shouldReturnEmptyList() = runTest {

        val engine = MockEngine { _ ->
            respond(
                content = MOCK_MODEL_EMPTY_LIST_RESPONSE,
                status = HttpStatusCode.OK,
                headers = headersOf(
                    HttpHeaders.ContentType,
                    "application/json"
                )
            )
        }

        val client = ArticApiClient(customEngine = engine).client

        val service = MockBaseServiceWithSearch(client = client)

        val result = service.search(search = "Real")

        assertTrue(
            result.data.isEmpty()
        )


    }

    @Test
    fun search_request_shouldParseFacetsCorrectly() =
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
            MockBaseServiceWithSearch(client = client).search(facets = listOf("facet1", "facet2"))

            // Get request
            val request = engine.requestHistory[0]

            val facetParamValue = request.url.parameters["facets"]

            assertEquals(
                facetParamValue,
                "facet1,facet2"
            )

        }

    @Test
    fun searchAsHttpResponse_successResponse_shouldReturnCorrectData() = runTest {

        val content = MOCK_MODEL_LIST_RESPONSE

        val engine = MockEngine { _ ->
            respond(
                content = content,
                status = HttpStatusCode.OK,
                headers = headersOf(
                    HttpHeaders.ContentType,
                    "application/json"
                )
            )
        }

        val client = ArticApiClient(customEngine = engine).client

        val service = MockBaseServiceWithSearch(client = client)

        val result = service.searchAsHttpResponse(search = "Mock")

        // Check body is correct.
        assertEquals(
            actual = result.bodyAsText(),
            expected = content
        )

        // Check content type is correct.
        assertEquals(
            actual = result.contentType(),
            expected = ContentType.Application.Json
        )


    }

}