package com.peteraraujo.articapi.models.collections.artwork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a date associated with an artwork.
 * @property isPreferred Indicates if the date is preferred.
 * @property dateEarliest The earliest date associated with the artwork.
 * @property dateLatest The latest date associated with the artwork.
 * @property artworkTitle The title of the artwork associated with the date.
 * @property artworkId The ID of the artwork associated with the date.
 * @property qualifierTitle The title of the qualifier associated with the date.
 * @property qualifierId The ID of the qualifier associated with the date.
 */
@Serializable
data class Date(
    @SerialName("is_preferred") val isPreferred: Boolean = false,
    @SerialName("date_earliest") val dateEarliest: String? = null,
    @SerialName("date_latest") val dateLatest: String? = null,
    @SerialName("artwork_title") val artworkTitle: String? = null,
    @SerialName("artwork_id") val artworkId: Int? = null,
    @SerialName("qualifier_title") val qualifierTitle: String? = null,
    @SerialName("qualifier_id") val qualifierId: Int? = null
)