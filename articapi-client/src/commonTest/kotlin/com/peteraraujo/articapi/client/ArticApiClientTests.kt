package com.peteraraujo.articapi.client

import com.peteraraujo.articapi.exceptions.InvalidLimitException
import com.peteraraujo.articapi.exceptions.InvalidNumberOfResultsException
import com.peteraraujo.articapi.exceptions.ItemNotFoundException
import com.peteraraujo.articapi.mock.models.MockModel
import com.peteraraujo.articapi.mock.responses.MOCK_403_INVALID_LIMIT_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_403_INVALID_NUMBER_OF_RESULTS_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_404_NOT_FOUND_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_404_SOMETHING_WENT_WRONG_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_SINGLE_RESPONSE
import com.peteraraujo.articapi.mock.responses.MOCK_MODEL_SINGLE_RESPONSE_UNKNOWN_KEY
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.respondError
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

class ArticApiClientTests {

    @Test
    fun checkClientInitializes() =
        runTest {

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

            val client = ArticApiClient(customEngine = engine)

            assertNotNull(client.client)

        }

    @Test
    fun checkClientCanTakeRequests() =
        runTest {

            val responseContent = MOCK_MODEL_SINGLE_RESPONSE

            val engine = MockEngine { _ ->
                respond(
                    content = responseContent,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(
                customEngine = engine
            ).client

            try {
                client.get(urlString = "mock/1")
            } catch (e: Exception) {
                throw AssertionError(e.message)
            }

        }

    @Test
    fun checkResponseStatus() =
        runTest {

            val responseContent = MOCK_MODEL_SINGLE_RESPONSE

            val engine = MockEngine { _ ->
                respond(
                    content = responseContent,
                    status = HttpStatusCode.OK,
                    headers = headersOf(
                        HttpHeaders.ContentType,
                        "application/json"
                    )
                )
            }

            val client = ArticApiClient(
                customEngine = engine
            ).client

            val response =
                client.get(urlString = "mock/1")

            assertEquals(
                response.bodyAsText(),
                responseContent
            )
            assertEquals(
                response.status,
                HttpStatusCode.OK
            )
            assertEquals(
                response.headers[HttpHeaders.ContentType],
                "application/json"
            )

        }

    @Test
    fun error_403InvalidLimit_shouldThrowInvalidLimitException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.Forbidden,
                content = MOCK_403_INVALID_LIMIT_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        assertFailsWith<InvalidLimitException> {

            client.get(urlString = "mock?limit=101")

        }

    }

    @Test
    fun error_403InvalidNumberOfResults_shouldThrowInvalidNumberOfResultsException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.Forbidden,
                content = MOCK_403_INVALID_NUMBER_OF_RESULTS_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        assertFailsWith<InvalidNumberOfResultsException> {

            client.get(urlString = "mock?limit=100&page=101")

        }

    }

    @Test
    fun error_404GeneralError_shouldThrowClientRequestException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.NotFound,
                content = MOCK_404_SOMETHING_WENT_WRONG_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        assertFailsWith<ClientRequestException> {

            client.get(urlString = "mock/1")

        }

    }

    @Test
    fun error_404ItemNotFound_shouldThrowItemNotFoundException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.NotFound,
                content = MOCK_404_NOT_FOUND_RESPONSE
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        assertFailsWith<ItemNotFoundException> {

            client.get(urlString = "mock/1")

        }

    }

    @Test
    fun error_500GeneralError_shouldThrowServerResponseException() = runTest {

        val engine = MockEngine { _ ->

            respondError(
                status = HttpStatusCode.InternalServerError,
            )

        }

        val client = ArticApiClient(customEngine = engine).client

        assertFailsWith<ServerResponseException> {

            client.get(urlString = "mock/1")

        }

    }

    @Test
    fun defaultJson_shouldIgnoreUnknownKeys() = runTest {

        val engine = MockEngine { _ ->
            respond(
                content = MOCK_MODEL_SINGLE_RESPONSE_UNKNOWN_KEY,
                status = HttpStatusCode.OK,
                headers = headersOf(
                    HttpHeaders.ContentType,
                    "application/json"
                )
            )
        }

        val client = ArticApiClient(customEngine = engine).client

        val responseString = client.get(urlString = "mock/1").bodyAsText()

        try {
            ArticApiClient.defaultJson.decodeFromString(
                string = responseString,
                deserializer = MockModel.serializer()
            )
        } catch (e: Exception) {

            throw AssertionError(e.message)

        }




    }

}