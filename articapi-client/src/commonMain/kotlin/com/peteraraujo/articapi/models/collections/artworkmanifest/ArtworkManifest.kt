package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * IIIF Manifests for public domain artworks.
 * A manifest is a resource defined by the IIIF Presentation API.
 * Each manifest contains artwork metadata—such as title, artist name,
 * and copyright info—alongside a list of images associated with that artwork.
 *
 * @property context The context of the manifest.
 * @property id The ID of the manifest.
 * @property type The type of the manifest.
 * @property label The label of the artwork.
 * @property description The description of the artwork.
 * @property metadata The metadata associated with the artwork.
 * @property attribution The attribution of the artwork.
 * @property logo The logo of the artwork.
 * @property within The URL within which the artwork exists.
 * @property rendering The rendering details of the artwork.
 * @property sequences The sequences of the artwork.
 */
@Serializable
data class ArtworkManifest(

    @SerialName("@context")
    val context: String? = null,

    @SerialName("@id")
    val id: String? = null,

    @SerialName("@type")
    val type: String? = null,

    @SerialName("label")
    val label: String? = null,

    @SerialName("description")
    val description: List<Description>? = null,

    @SerialName("metadata")
    val metadata: List<Metadata>? = null,

    @SerialName("attribution")
    val attribution: String? = null,

    @SerialName("logo")
    val logo: String? = null,

    @SerialName("within")
    val within: String? = null,

    @SerialName("rendering")
    val rendering: Rendering? = null,

    @SerialName("sequences")
    val sequences: List<Sequence>? = null,

    )