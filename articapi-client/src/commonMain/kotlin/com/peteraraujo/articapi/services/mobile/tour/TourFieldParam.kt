package com.peteraraujo.articapi.services.mobile.tour

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class TourFieldParam(override val value: String) : Param {

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
     * The main image for the tour.
     */
    Image("image"),

    /**
     * Explanation of what the tour is.
     */
    Description("description"),

    /**
     * Text introducing the tour.
     */
    Intro("intro"),

    /**
     * Number representing this tour's sort order.
     */
    Weight("weight"),

    /**
     * Link to the audio file of the introduction.
     */
    IntroLink("intro_link"),

    /**
     * Transcript of the introduction audio to the tour.
     */
    IntroTranscript("intro_transcript"),

    /**
     * Names of the artworks featured in this tour's tour stops.
     */
    ArtworkTitles("artwork_titles"),

    /**
     * Names of the artists of the artworks featured in this tour's tour stops.
     */
    ArtistTitles("artist_titles"),

    /** Optional tour stop list. */
    TourStops(value = "tour_stops"),

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
