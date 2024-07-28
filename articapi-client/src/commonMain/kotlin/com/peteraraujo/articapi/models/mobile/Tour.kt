package com.peteraraujo.articapi.models.mobile

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A collection of audio tour stops to form a tour.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property image The main image for the tour.
 * @property description Explanation of what the tour is.
 * @property intro Text introducing the tour.
 * @property weight Number representing this tour's sort order.
 * @property introLink Link to the audio file of the introduction.
 * @property introTranscript Transcript of the introduction audio to the tour.
 * @property artworkTitles Names of the artworks featured in this tour's tour stops.
 * @property artistTitles Names of the artists of the artworks featured in this tour's tour stops.
 * @property tourStops Optional tour stop list.
 */
@Serializable
data class Tour(
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
    @SerialName("image")
    val image: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("intro")
    val intro: String? = null,
    @SerialName("weight")
    val weight: Int? = null,
    @SerialName("intro_link")
    val introLink: String? = null,
    @SerialName("intro_transcript")
    val introTranscript: String? = null,
    @SerialName("artwork_titles")
    val artworkTitles: List<String>? = null,
    @SerialName("artist_titles")
    val artistTitles: List<String>? = null,
    @SerialName("tour_stops")
    val tourStops: List<String>? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: SuggestAutocomplete? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
)

