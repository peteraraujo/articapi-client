package com.peteraraujo.articapi.models.website

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An occurrence of an event on the website.
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
 * @property title The name of this resource.
 * @property eventId Identifier of the master event of which this is an occurrence.
 * @property shortDescription Brief description of the event.
 * @property description Description of the event.
 * @property imageUrl The URL of an image representing this page.
 * @property isPrivate Whether the event is private. Private events should be omitted from listings.
 * @property startAt The date the event occurrence begins.
 * @property endAt The date the event occurrence ends.
 * @property location Where the event takes place.
 * @property buttonUrl The URL to the sales site or an RSVP link for this event.
 * @property buttonText The text used on the ticket/registration button.
 * @property buttonCaption Additional text below the ticket/registration button.
 */
@Serializable
data class EventOccurrence(
    @SerialName("id")
    val id: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("event_id")
    val eventId: Int? = null,
    @SerialName("short_description")
    val shortDescription: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("is_private")
    val isPrivate: Boolean? = null,
    @SerialName("start_at")
    val startAt: String? = null,
    @SerialName("end_at")
    val endAt: String? = null,
    @SerialName("location")
    val location: String? = null,
    @SerialName("button_url")
    val buttonUrl: String? = null,
    @SerialName("button_text")
    val buttonText: String? = null,
    @SerialName("button_caption")
    val buttonCaption: String? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocomplete>? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
)
