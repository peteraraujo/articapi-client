package com.peteraraujo.articapi.services.mockbaseservices

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.exceptions.ItemNotFoundException
import com.peteraraujo.articapi.mock.baseservices.MockBaseService
import com.peteraraujo.articapi.mock.params.MockFieldParam
import com.peteraraujo.articapi.mock.responses.MOCK_404_NOT_FOUND_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_LIST_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_LIST_TITLE_ONLY_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_SINGLE_RESPONSE
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.respondError
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MockBaseServiceTests {

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
            MockBaseService(client = client)
        } catch (e: Exception) {
            throw AssertionError(e.message)
        }

    }

    @Test
    fun getById_successResponse_withoutErrors() =
        runTest {

            val engine = MockEngine { _ ->
                respond(
                    content = MOCK_MODEL_SINGLE_RESPONSE,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(customEngine = engine).client

            val service = MockBaseService(client = client)

            try {

                service.getById(1)

            } catch (e: Exception) {
                throw AssertionError(e.message)
            }

        }

    @Test
    fun getById_successResponse_shouldReturnCorrectData() =
        runTest {

            val engine = MockEngine { _ ->
                respond(
                    content = MOCK_MODEL_SINGLE_RESPONSE,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(customEngine = engine).client

            val service = MockBaseService(client = client)

            val result = service.getById(1)

            assertEquals(
                result.data.id,
                1
            )

            assertEquals(
                result.data.title,
                "Mock Title"
            )

            // No include param was used, so the list should be null.
            assertEquals(
                result.data.titleList,
                null
            )

            // No pagination was used, so the pagination should be null.
            assertEquals(
                result.pagination,
                null
            )


        }

    @Test
    fun getById_404NotFoundResponse_shouldThrowNoItemFoundException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.NotFound,
                content = MOCK_404_NOT_FOUND_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        val service = MockBaseService(client = client)

        assertFailsWith<ItemNotFoundException> {

            service.getById(1)

        }

    }

    @Test
    fun getItems_successResponse_withoutErrors() =
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

            val service = MockBaseService(client = client)

            try {

                service.getItems()

            } catch (e: Exception) {
                throw AssertionError(e.message)
            }

        }

    @Test
    fun getItems_successResponse_shouldReturnCorrectData() =
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

            val service = MockBaseService(client = client)

            val result = service.getItems()

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
    fun getItems_successResponse_shouldReturnSelectedFieldsOnly() =
        runTest {

            val engine = MockEngine { _ ->
                respond(
                    content = MOCK_MODEL_LIST_TITLE_ONLY_RESPONSE,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(customEngine = engine).client

            val service = MockBaseService(client = client)

            val result = service.getItems(fields = listOf(MockFieldParam.Title))

            assertEquals(
                result.data.size,
                2
            )

            assertNull(
                result.data[0].id
            )

            assertNotNull(
                result.data[0].title
            )

            assertEquals(
                result.data[0].title,
                "Mock Title"
            )

            assertEquals(
                result.data[1].title,
                "Mock Title 2"
            )


        }

    @Test
    fun getItems_request_shouldParseIdsCorrectly() =
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
            MockBaseService(client = client).getItems(
                ids = listOf(
                    1,
                    2
                )
            )

            // Get request
            val request = engine.requestHistory[0]

            val idParamValue = request.url.parameters["ids"]

            assertEquals(
                idParamValue,
                "1,2"
            )

        }

    @Test
    fun getItems_request_shouldParseFieldsCorrectly() =
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
            MockBaseService(client = client).getItems(
                fields = listOf(
                    MockFieldParam.Id,
                    MockFieldParam.Title
                )
            )

            // Get request
            val request = engine.requestHistory[0]

            val fieldParamValue = request.url.parameters["fields"]

            assertEquals(
                expected = "id,title",
                actual = fieldParamValue,
            )


        }

    @Test
    fun getByIdAsHttpResponse_successResponse_withoutErrors() =
        runTest {

            val engine = MockEngine { _ ->
                respond(
                    content = MOCK_MODEL_SINGLE_RESPONSE,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(customEngine = engine).client

            val service = MockBaseService(client = client)

            try {

                service.getByIdAsHttpResponse(1)

            } catch (e: Exception) {
                throw AssertionError(e.message)
            }

        }

    @Test
    fun getByIdAsHttpResponse_successResponse_shouldReturnCorrectData() =
        runTest {

            val content = MOCK_MODEL_SINGLE_RESPONSE

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

            val service = MockBaseService(client = client)

            val result = service.getByIdAsHttpResponse(1)

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

    @Test
    fun getByIdAsHttpResponse_404NotFoundResponse_shouldThrowNoItemFoundException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.NotFound,
                content = MOCK_404_NOT_FOUND_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        val service = MockBaseService(client = client)

        assertFailsWith<ItemNotFoundException> {

            service.getByIdAsHttpResponse(1)

        }

    }

    @Test
    fun getItemsAsHttpResponse_successResponse_withoutErrors() =
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

            val service = MockBaseService(client = client)

            try {

                service.getItemsAsHttpResponse()

            } catch (e: Exception) {
                throw AssertionError(e.message)
            }

        }

    @Test
    fun getItemsAsHttpResponse_successResponse_shouldReturnCorrectData() =
        runTest {

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

            val service = MockBaseService(client = client)

            val result = service.getItemsAsHttpResponse()


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