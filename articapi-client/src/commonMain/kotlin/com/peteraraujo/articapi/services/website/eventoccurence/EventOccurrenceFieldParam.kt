package data.services.articapi.services.website.eventoccurence

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */

/**
 * Enum representing properties of the EventOccurrence class.
 */
enum class EventOccurrenceFieldParam(override val value: String): Param {

    /**
     * Unique identifier of this resource. Taken from the source system.
     */
    Id("id"),

    /**
     * REST API resource type or endpoint.
     */
    ApiModel("api_model"),

    /**
     * REST API link for this resource.
     */
    ApiLink("api_link"),

    /** Search score. */
    Score("_score"),

    /**
     * The name of this resource.
     */
    Title("title"),

    /**
     * Identifier of the master event of which this is an occurrence.
     */
    EventId("event_id"),

    /**
     * Brief description of the event.
     */
    ShortDescription("short_description"),

    /**
     * Description of the event.
     */
    Description("description"),

    /**
     * The URL of an image representing this page.
     */
    ImageUrl("image_url"),

    /**
     * Whether the event is private. Private events should be omitted from listings.
     */
    IsPrivate("is_private"),

    /**
     * The date the event occurrence begins.
     */
    StartAt("start_at"),

    /**
     * The date the event occurrence ends.
     */
    EndAt("end_at"),

    /**
     * Where the event takes place.
     */
    Location("location"),

    /**
     * The URL to the sales site or an RSVP link for this event.
     */
    ButtonUrl("button_url"),

    /**
     * The text used on the ticket/registration button.
     */
    ButtonText("button_text"),

    /**
     * Additional text below the ticket/registration button.
     */
    ButtonCaption("button_caption"),

    /**
     * Internal field to power the /autocomplete endpoint. Do not use directly.
     */
    SuggestAutocompleteBoosted("suggest_autocomplete_boosted"),

    /**
     * Internal field to power the /autosuggest endpoint. Do not use directly.
     */
    SuggestAutocompleteAll("suggest_autocomplete_all"),

    /**
     * Date and time the resource was updated in the source system.
     */
    SourceUpdatedAt("source_updated_at"),

    /**
     * Date and time the record was updated in the aggregator database.
     */
    UpdatedAt("updated_at"),

    /**
     * Date and time the record was updated in the aggregator search index.
     */
    Timestamp("timestamp")
}
