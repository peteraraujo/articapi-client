package com.peteraraujo.articapi.services.website.educatorresource

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class EducatorResourceFieldParam(override val value: String) : Param {

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
     * The URL to this page on our website.
     */
    WebUrl("web_url"),

    /**
     * The text of the page.
     */
    Copy("copy"),

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
