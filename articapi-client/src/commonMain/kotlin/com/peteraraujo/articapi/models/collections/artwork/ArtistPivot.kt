package com.peteraraujo.articapi.models.collections.artwork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents an artist pivot associated with an artwork.
 * @property isPreferred Indicates if the artist pivot is preferred.
 * @property artistTitle The title of the artist associated with the artwork.
 * @property artistId The ID of the artist associated with the artwork.
 * @property roleTitle The title of the role associated with the artist pivot.
 * @property roleId The ID of the role associated with the artist pivot.
 */
@Serializable
data class ArtistPivot(
    @SerialName("is_preferred") val isPreferred: Boolean = false,
    @SerialName("artist_title") val artistTitle: String? = null,
    @SerialName("artist_id") val artistId: Int? = null,
    @SerialName("role_title") val roleTitle: String? = null,
    @SerialName("role_id") val roleId: Int? = null
)