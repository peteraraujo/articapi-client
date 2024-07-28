package com.peteraraujo.articapi.models.collections.artwork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
/**
 * Represents a pivot point for a place.
 *
 * @property isPreferred Indicates if the place is preferred.
 * @property artworkTitle The title of the artwork associated with the place.
 * @property artworkId The ID of the artwork associated with the place.
 * @property placeTitle The title of the place.
 * @property placeId The ID of the place.
 * @property qualifierTitle The title of the qualifier associated with the place.
 * @property qualifierId The ID of the qualifier associated with the place.
 */
data class PlacePivot(
    @SerialName("is_preferred")
    val isPreferred: Boolean = false,

    @SerialName("artwork_title")
    val artworkTitle: String? = null,

    @SerialName("artwork_id")
    val artworkId: Int? = null,

    @SerialName("place_title")
    val placeTitle: String? = null,

    @SerialName("place_id")
    val placeId: Int? = null,

    @SerialName("qualifier_title")
    val qualifierTitle: String? = null,

    @SerialName("qualifier_id")
    val qualifierId: Int? = null,
)

