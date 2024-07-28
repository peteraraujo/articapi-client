package com.peteraraujo.articapi.services.collections.categoryterm

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class CategoryTermFieldParam(override val value: String) : Param {

    /** Unique identifier of this resource. Taken from the source system. */
    Id(value = "id"),

    /** The name of this resource. */
    Title(value = "title"),

    /** REST API resource type or endpoint. */
    ApiModel(value = "api_model"),

    /** REST API link for this resource. */
    ApiLink(value = "api_link"),

    /** Search score. */
    Score("_score"),

    /** Takes one of the following values: classification, material, technique, style, subject, department, theme. */
    Subtype(value = "subtype"),

    /** Unique identifier of this category's parent. */
    ParentId(value = "parent_id"),

    /** Identifier of reconciled (most similar) term in the Getty's Art and Architecture Thesaurus (AAT). */
    AatId(value = "aat_id"),

    /** Date and time the resource was updated in the source system. */
    SourceUpdatedAt(value = "source_updated_at"),

    /** Date and time the record was updated in the aggregator database. */
    UpdatedAt(value = "updated_at"),

    /** Date and time the record was updated in the aggregator search index. */
    Timestamp(value = "timestamp"),

    /** Internal field to power the /autocomplete endpoint. Do not use directly. */
    SuggestAutocompleteBoosted(value = "suggest_autocomplete_boosted"),

    /** Internal field to power the /autosuggest endpoint. Do not use directly. */
    SuggestAutocompleteAll(value = "suggest_autocomplete_all")
}
