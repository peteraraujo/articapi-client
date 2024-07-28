package com.peteraraujo.articapi.models.mobile

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The audio file for a stop on a tour.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property webUrl The URL to this page on our website.
 * @property score Search score.
 * @property transcript Text transcription of the audio file.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.


 */
@Serializable
data class MobileSound(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("web_url")
    val webUrl: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("transcript")
    val transcript: String? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocomplete>? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null
)
