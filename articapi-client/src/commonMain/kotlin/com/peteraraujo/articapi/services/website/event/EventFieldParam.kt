package com.peteraraujo.articapi.services.website.event

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class EventFieldParam(override val value: String) : Param {

    /**
     * Unique identifier of this resource. Taken from the source system.
     */
    Id("id"),

    /**
     * The name of this resource.
     */
    Title("title"),

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
     * The name of this event formatted with HTML (optional).
     */
    TitleDisplay("title_display"),

    /**
     * The URL of an image representing this page.
     */
    ImageUrl("image_url"),

    /**
     * Text displayed with the hero image on the event.
     */
    HeroCaption("hero_caption"),

    /**
     * Brief description of the event.
     */
    ShortDescription("short_description"),

    /**
     * Brief description of the event displayed below the title.
     */
    HeaderDescription("header_description"),

    /**
     * One-sentence description of the event displayed in listings.
     */
    ListDescription("list_description"),

    /**
     * All copytext of the event.
     */
    Description("description"),

    /**
     * Where the event takes place.
     */
    Location("location"),

    /**
     * Unique identifier indicating the preferred type of this event.
     */
    EventTypeId("event_type_id"),

    /**
     * Unique identifiers indicating the alternate types of this event.
     */
    AltEventTypeIds("alt_event_type_ids"),

    /**
     * Unique identifier indicating the preferred audience for this event.
     */
    AudienceId("audience_id"),

    /**
     * Unique identifiers indicating the alternate audiences for this event.
     */
    AltAudienceIds("alt_audience_ids"),

    /**
     * Unique identifiers indicating the programs this event is a part of.
     */
    ProgramIds("program_ids"),

    /**
     * Titles of the programs this event is a part of.
     */
    ProgramTitles("program_titles"),

    /**
     * Whether a ticket is required to attend the event.
     */
    IsTicketed("is_ticketed"),

    /** Id of ticketed event. */
    TicketedEventId("ticketed_event_id"),

    /**
     * The URL to the sales site for this event.
     */
    RsvpLink("rsvp_link"),

    /**
     * The text used on the ticket/registration button.
     */
    BuyButtonText("buy_button_text"),

    /**
     * Additional text below the ticket/registration button.
     */
    BuyButtonCaption("buy_button_caption"),

    /**
     * Whether registration is required to attend the event.
     */
    IsRegistrationRequired("is_registration_required"),

    /**
     * Whether the event is exclusive to members of the museum.
     */
    IsMemberExclusive("is_member_exclusive"),

    /**
     * Whether the event is sold out.
     */
    IsSoldOut("is_sold_out"),

    /**
     * Whether the event is free.
     */
    IsFree("is_free"),

    /**
     * Whether the event is private.
     */
    IsPrivate("is_private"),

    /**
     * Whether admission to the museum is required to attend this event.
     */
    IsAdmissionRequired("is_admission_required"),

    /**
     * Whether the event is to be held after the museum closes.
     */
    IsAfterHours("is_after_hours"),

    /**
     * Whether the event is being held virtually.
     */
    IsVirtualEvent("is_virtual_event"),

    /**
     * Url of virtual event, if available.
     */
    VirtualEventUrl("virtual_event_url"),

    /**
     * Passcode of virtual event, if available.
     */
    VirtualEventPasscode("virtual_event_passcode"),

    /**
     * The date the event begins.
     */
    StartDate("start_date"),

    /**
     * The date the event ends.
     */
    EndDate("end_date"),

    /**
     * The time the event starts.
     */
    StartTime("start_time"),

    /**
     * The time the event ends.
     */
    EndTime("end_time"),

    /**
     * A readable display of the event dates.
     */
    DateDisplay("date_display"),

    /**
     * The time the doors open for this event.
     */
    DoorTime("door_time"),

    /**
     * Number indicating the type of layout this event page uses.
     */
    LayoutType("layout_type"),

    /**
     * A string used in the URL for this event.
     */
    Slug("slug"),

    /**
     * Which entrance to use for this event.
     */
    Entrance("entrance"),

    /**
     * URL to the membership signup page via this event.
     */
    JoinUrl("join_url"),

    /**
     * URL to the survey associated with this event.
     */
    SurveyUrl("survey_url"),

    /**
     * Unique identifier of the host (cf. event programs) that is presenting this event.
     */
    EventHostId("event_host_id"),

    /**
     * Unique identifier of the host (cf. event programs) that is presenting this event.
     */
    EventHostTitle("event_host_title"),

    /**
     * Editor-specified list of tags to aid in internal search.
     */
    SearchTags("search_tags"),

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
    Timestamp("timestamp");
}
