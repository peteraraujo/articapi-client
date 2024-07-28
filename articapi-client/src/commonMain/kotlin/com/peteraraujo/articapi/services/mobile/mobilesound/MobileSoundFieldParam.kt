package com.peteraraujo.articapi.services.mobile.mobilesound

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class MobileSoundFieldParam(override val value: String) : Param {

    /**
     * Unique identifier of this resource. Taken from the source system.
     */
    Id("id"),

    /**
     * Name of this mobile audio file – derived from the artwork and tour titles.
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
     * URL to the audio file.
     */
    WebUrl("web_url"),

    /**
     * Text transcription of the audio file.
     */
    Transcript("transcript"),

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
