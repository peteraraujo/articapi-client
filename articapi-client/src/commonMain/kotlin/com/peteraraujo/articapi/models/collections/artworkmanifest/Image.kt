package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the image of the canvas.
 *
 * @property type The type of the image.
 * @property motivation The motivation of the image.
 * @property resource The URL of the image resource.
 */
@Serializable
data class Image(
    @SerialName("@type")
    val type: String? = null,

    @SerialName("motivation")
    val motivation: String? = null,

    @SerialName("resource")
    val resource: Resource? = null
)