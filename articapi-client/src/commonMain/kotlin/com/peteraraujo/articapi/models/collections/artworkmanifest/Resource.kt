package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the resource of the image.
 *
 * @property type The type of the resource.
 * @property id The ID of the resource.
 * @property width The width of the resource.
 * @property height The height of the resource.
 * @property service The service of the resource.
 */
@Serializable
data class Resource(
    @SerialName("@type")
    val type: String? = null,

    @SerialName("@id")
    val id: String? = null,

    @SerialName("width")
    val width: Int? = null,

    @SerialName("height")
    val height: Int? = null,

    @SerialName("service")
    val service: Service? = null
)