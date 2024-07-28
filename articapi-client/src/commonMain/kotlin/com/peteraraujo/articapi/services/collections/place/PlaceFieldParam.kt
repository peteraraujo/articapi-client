package com.peteraraujo.articapi.services.collections.place

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class PlaceFieldParam(override val value: String) : Param {

    /**
     * Unique identifier of this resource. Taken from the source system.
     */
    Id(value = "id"),

    /**
     * The name of this resource.
     */
    Title(value = "title"),

    /**
     * REST API resource type or endpoint.
     */
    ApiModel(value = "api_model"),

    /**
     * REST API link for this resource.
     */
    ApiLink(value = "api_link"),

    /** Search score. */
    Score("_score"),

    /**
     * Reconciled identifier of this object in the Getty's Thesaurus of Geographic Names (TGN).
     */
    TgnId(value = "tgn_id"),

    /**
     * Date and time the resource was updated in the source system.
     */
    SourceUpdatedAt(value = "source_updated_at"),

    /**
     * Date and time the record was updated in the aggregator database.
     */
    UpdatedAt(value = "updated_at"),

    /**
     * Date and time the record was updated in the aggregator search index.
     */
    Timestamp(value = "timestamp"),

    /**
     * Internal field to power the /autocomplete endpoint. Do not use directly.
     */
    SuggestAutocompleteBoosted(value = "suggest_autocomplete_boosted"),

    /**
     * Internal field to power the /autosuggest endpoint. Do not use directly.
     */
    SuggestAutocompleteAll(value = "suggest_autocomplete_all"),
}