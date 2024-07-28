package com.peteraraujo.articapi.services.dscatalog.section

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options.
 */
enum class SectionFieldParam(override val value: String) : Param {

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
     * URL to the section.
     */
    WebUrl("web_url"),

    /**
     * An accession number parsed from the title or tombstone.
     */
    Accession("accession"),

    /**
     * Unique identifier of the page on the website that represents the publication this section belongs to.
     */
    GenericPageId("generic_page_id"),

    /**
     * Unique identifier of the artwork with which this section is associated.
     */
    ArtworkId("artwork_id"),

    /**
     * Name of the publication this section belongs to.
     */
    PublicationTitle("publication_title"),

    /**
     * Unique identifier of the publication this section belongs to.
     */
    PublicationId("publication_id"),

    /**
     * Content of this section in plaintext.
     */
    Content("content"),

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
