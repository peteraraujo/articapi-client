package com.peteraraujo.articapi.services.dscatalog.publication

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class PublicationFieldParam(override val value: String) : Param {

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

    /** Search score. */
    Score("_score"),

    /**
     * REST API link for this resource.
     */
    ApiLink("api_link"),

    /**
     * URL of this resource.
     */
    WebUrl("web_url"),

    /**
     * Unique identifiers of the sections associated with this resource.
     */
    SectionIds("section_ids"),

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
