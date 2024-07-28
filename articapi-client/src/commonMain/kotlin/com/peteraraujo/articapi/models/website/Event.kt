package com.peteraraujo.articapi.models.website

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An event on the website.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property titleDisplay The name of this event formatted with HTML (optional).
 * @property imageUrl The URL of an image representing this page.
 * @property heroCaption Text displayed with the hero image on the event.
 * @property shortDescription Brief description of the event.
 * @property headerDescription Brief description of the event displayed below the title.
 * @property listDescription One-sentence description of the event displayed in listings.
 * @property description All copytext of the event.
 * @property location Where the event takes place.
 * @property eventTypeId Unique identifier indicating the preferred type of this event.
 * @property altEventTypeIds Unique identifiers indicating the alternate types of this event.
 * @property audienceId Unique identifier indicating the preferred audience for this event.
 * @property altAudienceIds Unique identifiers indicating the alternate audiences for this event.
 * @property programIds Unique identifiers indicating the programs this event is a part of.
 * @property programTitles Titles of the programs this event is a part of.
 * @property isTicketed Whether a ticket is required to attend the event.
 * @property ticketedEventId Id of ticketed event.
 * @property rsvpLink The URL to the sales site for this event.
 * @property buyButtonText The text used on the ticket/registration button.
 * @property buyButtonCaption Additional text below the ticket/registration button.
 * @property isRegistrationRequired Whether registration is required to attend the event.
 * @property isMemberExclusive Whether the event is exclusive to members of the museum.
 * @property isSoldOut Whether the event is sold out.
 * @property isFree Whether the event is free.
 * @property isPrivate Whether the event is private.
 * @property isAdmissionRequired Whether admission to the museum is required to attend this event.
 * @property isAfterHours Whether the event is to be held after the museum closes.
 * @property isVirtualEvent Whether the event is being held virtually.
 * @property virtualEventUrl Url of virtual event, if available.
 * @property virtualEventPasscode Passcode of virtual event, if available.
 * @property startDate The date the event begins.
 * @property endDate The date the event ends.
 * @property startTime The time the event starts.
 * @property endTime The time the event ends.
 * @property dateDisplay A readable display of the event dates.
 * @property doorTime The time the doors open for this event.
 * @property layoutType Number indicating the type of layout this event page uses.
 * @property slug A string used in the URL for this event.
 * @property entrance Which entrance to use for this event.
 * @property joinUrl URL to the membership signup page via this event.
 * @property surveyUrl URL to the survey associated with this event.
 * @property eventHostId Unique identifier of the host (cf. event programs) that is presenting this event.
 * @property eventHostTitle Unique identifier of the host (cf. event programs) that is presenting this event.
 * @property searchTags Editor-specified list of tags to aid in internal search.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 */
@Serializable
data class Event(
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
    @SerialName("title_display")
    val titleDisplay: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("hero_caption")
    val heroCaption: String? = null,
    @SerialName("short_description")
    val shortDescription: String? = null,
    @SerialName("header_description")
    val headerDescription: String? = null,
    @SerialName("list_description")
    val listDescription: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("location")
    val location: String? = null,
    @SerialName("event_type_id")
    val eventTypeId: Int? = null,
    @SerialName("alt_event_type_ids")
    val altEventTypeIds: List<Int>? = null,
    @SerialName("audience_id")
    val audienceId: Int? = null,
    @SerialName("alt_audience_ids")
    val altAudienceIds: List<Int>? = null,
    @SerialName("program_ids")
    val programIds: List<Int>? = null,
    @SerialName("program_titles")
    val programTitles: List<String>? = null,
    @SerialName("is_ticketed")
    val isTicketed: Boolean? = null,
    @SerialName("ticketed_event_id")
    val ticketedEventId: Int? = null,
    @SerialName("rsvp_link")
    val rsvpLink: String? = null,
    @SerialName("buy_button_text")
    val buyButtonText: String? = null,
    @SerialName("buy_button_caption")
    val buyButtonCaption: String? = null,
    @SerialName("is_registration_required")
    val isRegistrationRequired: Boolean? = null,
    @SerialName("is_member_exclusive")
    val isMemberExclusive: Boolean? = null,
    @SerialName("is_sold_out")
    val isSoldOut: Boolean? = null,
    @SerialName("is_free")
    val isFree: Boolean? = null,
    @SerialName("is_private")
    val isPrivate: Boolean? = null,
    @SerialName("is_admission_required")
    val isAdmissionRequired: Boolean? = null,
    @SerialName("is_after_hours")
    val isAfterHours: Boolean? = null,
    @SerialName("is_virtual_event")
    val isVirtualEvent: Boolean? = null,
    @SerialName("virtual_event_url")
    val virtualEventUrl: String? = null,
    @SerialName("virtual_event_passcode")
    val virtualEventPasscode: String? = null,
    @SerialName("start_date")
    val startDate: String? = null,
    @SerialName("end_date")
    val endDate: String? = null,
    @SerialName("start_time")
    val startTime: String? = null,
    @SerialName("end_time")
    val endTime: String? = null,
    @SerialName("date_display")
    val dateDisplay: String? = null,
    @SerialName("door_time")
    val doorTime: String? = null,
    @SerialName("layout_type")
    val layoutType: Int? = null,
    @SerialName("slug")
    val slug: String? = null,
    @SerialName("entrance")
    val entrance: String? = null,
    @SerialName("join_url")
    val joinUrl: String? = null,
    @SerialName("survey_url")
    val surveyUrl: String? = null,
    @SerialName("event_host_id")
    val eventHostId: Int? = null,
    @SerialName("event_host_title")
    val eventHostTitle: String? = null,
    @SerialName("search_tags")
    val searchTags: List<String>? = null,
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
