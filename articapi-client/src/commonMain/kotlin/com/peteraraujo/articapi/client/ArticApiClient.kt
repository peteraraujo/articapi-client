package com.peteraraujo.articapi.client

import com.peteraraujo.articapi.exceptions.InvalidLimitException
import com.peteraraujo.articapi.exceptions.InvalidNumberOfResultsException
import com.peteraraujo.articapi.exceptions.ItemNotFoundException
import com.peteraraujo.articapi.models.error.ApiError
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.HttpResponseValidator
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json

/**
 * Creates [HttpClient] to interact with Artic API. Use [ArticApiClient.defaultClient] for default implementation.
 * */
class ArticApiClient(
    customEngine: HttpClientEngine? = null,
    url: String = DEFAULT_URL,
    logLevel: LogLevel = LogLevel.INFO,
) {

    val engine = customEngine ?: defaultEngine

    /**
     * [HttpClient] to interact with Artic API.
     * */
    val client = HttpClient(this.engine) {

        expectSuccess = true

        if (logLevel != LogLevel.NONE) {
            install(Logging) {

                level = logLevel

            }
        }

        defaultRequest {
            url(url)
        }

        HttpResponseValidator {

            handleResponseExceptionWithRequest { cause, _ ->

                val clientException =
                    cause as? ClientRequestException ?: return@handleResponseExceptionWithRequest
                val exceptionResponse = clientException.response

                when (exceptionResponse.status) {

                    HttpStatusCode.NotFound -> {
                        val errorBody = try {
                            defaultJson.decodeFromString(
                                deserializer = ApiError.serializer(),
                                string = exceptionResponse.bodyAsText()
                            )
                        } catch (e: IllegalArgumentException) {
                            return@handleResponseExceptionWithRequest
                        } catch (e: SerializationException) {
                            return@handleResponseExceptionWithRequest
                        }

                        // Artic API returns 404 with this error message for not found items.
                        if (errorBody.error == "Not found") throw ItemNotFoundException()
                    }

                    HttpStatusCode.Forbidden -> {

                        val errorBody = try {
                            defaultJson.decodeFromString(
                                deserializer = ApiError.serializer(),
                                string = exceptionResponse.bodyAsText()
                            )
                        } catch (e: IllegalArgumentException) {
                            return@handleResponseExceptionWithRequest
                        } catch (e: SerializationException) {
                            return@handleResponseExceptionWithRequest
                        }

                        when (errorBody.error) {

                            // Artic API returns 403 with this error message when limit is invalid (for example: 101).
                            "Invalid limit" -> throw InvalidLimitException()

                            // Artic API returns 403 with this error message when number of results is invalid (for example: limit=100, page=101).
                            "Invalid number of results" -> throw InvalidNumberOfResultsException()

                        }

                    }

                }

            }

        }

    }

    companion object {

        /**
         * Default request base URL to interact with Artic API.
         * */
        const val DEFAULT_URL = "https://api.artic.edu/api/v1/"

        /**
         * Default [Json] to deserialize Artic API responses.
         * */
        val defaultJson by lazy {

            Json {

                ignoreUnknownKeys = true
                isLenient = true

            }

        }

        /**
         * Default [HttpClient] to interact with Artic API
         * **/
        val defaultClient by lazy {

            ArticApiClient().client

        }

    }


}