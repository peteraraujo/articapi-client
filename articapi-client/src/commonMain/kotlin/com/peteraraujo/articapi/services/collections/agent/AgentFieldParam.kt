package com.peteraraujo.articapi.services.collections.agent

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class AgentFieldParam(override val  value: String) : Param {
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
     * Sortable name for this agent, typically with last name first.
     */
    SortTitle(value = "sort_title"),

    /**
     * Alternate names for this agent.
     */
    AltTitles(value = "alt_titles"),

    /**
     * Whether the agent is an artist. Solely based on whether the agent is related to an artwork record.
     */
    IsArtist(value = "is_artist"),

    /**
     * The year this agent was born.
     */
    BirthDate(value = "birth_date"),

    /**
     * The year this agent died.
     */
    DeathDate(value = "death_date"),

    /**
     * A biographical description of the agent.
     */
    Description(value = "description"),

    /**
     * Unique identifier of this agent in Getty's ULAN.
     */
    UlanId(value = "ulan_id"),

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