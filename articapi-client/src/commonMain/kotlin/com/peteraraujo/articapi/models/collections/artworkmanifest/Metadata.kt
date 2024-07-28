package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the metadata associated with the artwork.
 *
 * @property label The label of the metadata.
 * @property value The value of the metadata.
 */
@Serializable
data class Metadata(
    @SerialName("label")
    val label: String? = null,

    @SerialName("value")
    val value: String? = null
)