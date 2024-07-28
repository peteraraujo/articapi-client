package com.peteraraujo.articapi.services.collections.artwork

import com.peteraraujo.articapi.client.ArticApiClient
import com.peteraraujo.articapi.exceptions.ItemNotFoundException
import com.peteraraujo.articapi.models.baseresponse.BaseResponse
import com.peteraraujo.articapi.models.collections.artwork.Artwork
import com.peteraraujo.articapi.models.collections.artworkmanifest.ArtworkManifest
import com.peteraraujo.articapi.services.commons.baseservices.BaseServiceWithSearchAndIncludeParam
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

/**
 * Service for interacting with [Artwork] endpoints.
 *
 * @param client [HttpClient] to use for making requests.
 * @param json [Json] instance to use for serialization.
 *
 */
class ArtworkService(
    private val client: HttpClient = ArticApiClient.defaultClient,
    json: Json = ArticApiClient.defaultJson,
) : BaseServiceWithSearchAndIncludeParam<Artwork, Int, ArtworkFieldParam, ArtworkIncludeParam>(
    client = client,
    endpoint = "artworks",
    entitySerializer = BaseResponse.serializer(Artwork.serializer()),
    listEntitySerializer = BaseResponse.serializer(ListSerializer(Artwork.serializer())),
    json = json
) {


    /**
     * Get a representation of the artwork in the IIIF Presentation API format.
     *
     * @param id The identifier of the artwork from the collections management system.
     *
     * @return The requested [HttpResponse].
     *
     * @throws ItemNotFoundException if the item was not found.
     */
    suspend fun getArtworkManifestAsHttpResponse(id: Int): HttpResponse {
        return client.get("$endpoint/$id/manifest.json")
    }

    /**
     * Get a representation of the artwork in the IIIF Presentation API format.
     *
     * @param id The identifier of the artwork from the collections management system.
     *
     * @return The requested [ArtworkManifest].
     * @throws ItemNotFoundException if the item was not found.
     */
    suspend fun getArtworkManifest(id: Int): ArtworkManifest {
        return getArtworkManifestAsHttpResponse(id).body()
    }

}