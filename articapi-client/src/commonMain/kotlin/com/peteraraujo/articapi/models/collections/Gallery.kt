package com.peteraraujo.articapi.models.collections

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A room or hall that works of art are displayed in.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property title The name of this resource.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property score Search score.
 * @property latitude Latitude coordinate of the center of the room.
 * @property longitude Longitude coordinate of the center of the room.
 * @property tgnId Reconciled identifier of this object in the Getty's Thesaurus of Geographic Names (TGN).
 * @property isClosed Whether the gallery is currently closed.
 * @property number The gallery's room number. For "Gallery 100A", this would be "100A".
 * @property floor The level the gallery is on, e.g., 1, 2, 3, or LL.
 * @property latlon Latitude and longitude coordinates of the center of the room.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 */
@Serializable
data class Gallery(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("latitude")
    val latitude: Double? = null,
    @SerialName("longitude")
    val longitude: Double? = null,
    @SerialName("tgn_id")
    val tgnId: Int? = null,
    @SerialName("is_closed")
    val isClosed: Boolean? = null,
    @SerialName("number")
    val number: String? = null,
    @SerialName("floor")
    val floor: String? = null,
    @SerialName("latlon")
    val latlon: String? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: SuggestAutocomplete? = null,
)
