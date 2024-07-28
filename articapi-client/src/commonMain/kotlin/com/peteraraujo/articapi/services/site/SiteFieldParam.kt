package com.peteraraujo.articapi.services.site

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class SiteFieldParam(override val  value: String) : Param {

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
     * Explanation of what this site is.
     */
    Description("description"),

    /**
     * URL to this site.
     */
    WebUrl("web_url"),

    /**
     * Unique identifier of the exhibitions this site is associated with.
     */
    ExhibitionIds("exhibition_ids"),

    /**
     * Names of the exhibitions this site is associated with.
     */
    ExhibitionTitles("exhibition_titles"),

    /**
     * Unique identifiers of the artworks this site is associated with.
     */
    ArtworkIds("artwork_ids"),

    /**
     * Names of the artworks this site is associated with.
     */
    ArtworkTitles("artwork_titles"),

    /** Optional artwork list. */
    Artworks(value = "artworks"),

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