package com.peteraraujo.articapi.models.collections.artworkmanifest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the service of the resource.
 *
 * @property context The context of the service.
 * @property id The ID of the service.
 * @property profile The profile of the service.
 */
@Serializable
data class Service(
    @SerialName("@context")
    val context: String? = null,

    @SerialName("@id")
    val id: String? = null,

    @SerialName("profile")
    val profile: String? = null
)