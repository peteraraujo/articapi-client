package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the canvas of the sequence.
 *
 * @property type The type of the canvas.
 * @property id The ID of the canvas.
 * @property label The label of the canvas.
 * @property width The width of the canvas.
 * @property height The height of the canvas.
 * @property images The images of the canvas.
 */
@Serializable
data class Canvas(
    @SerialName("@type")
    val type: String? = null,

    @SerialName("@id")
    val id: String? = null,

    @SerialName("label")
    val label: String? = null,

    @SerialName("width")
    val width: Int? = null,

    @SerialName("height")
    val height: Int? = null,

    @SerialName("images")
    val images: List<Image>? = null
)