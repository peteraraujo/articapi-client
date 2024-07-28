package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the rendering details of the artwork.
 *
 * @property id The ID of the rendering.
 * @property format The format of the rendering.
 * @property label The label of the rendering.
 */
@Serializable
data class Rendering(
    @SerialName("@id")
    val id: String? = null,

    @SerialName("format")
    val format: String? = null,

    @SerialName("label")
    val label: String? = null
)