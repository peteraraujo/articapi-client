package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the sequence of the artwork.
 *
 * @property type The type of the sequence.
 * @property canvases The canvases of the sequence.
 */
@Serializable
data class Sequence(
    @SerialName("@type")
    val type: String? = null,

    @SerialName("canvases")
    val canvases: List<Canvas>? = null
)