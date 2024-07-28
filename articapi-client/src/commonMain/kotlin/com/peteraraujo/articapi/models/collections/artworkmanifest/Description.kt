package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the description of the artwork.
 *
 * @property value The value of the description.
 * @property language The language of the description.
 */
@Serializable
data class Description(
    @SerialName("value")
    val value: String? = null,

    @SerialName("language")
    val language: String? = null
)