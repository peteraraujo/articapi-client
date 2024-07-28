package com.peteraraujo.articapi.services.collections.gallery

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class GalleryFieldParam(override val value: String) : Param {

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
     * Latitude coordinate of the center of the room.
     */
    Latitude(value = "latitude"),

    /**
     * Longitude coordinate of the center of the room.
     */
    Longitude(value = "longitude"),

    /**
     * Reconciled identifier of this object in the Getty's Thesaurus of Geographic Names (TGN).
     */
    TgnId(value = "tgn_id"),

    /**
     * Whether the gallery is currently closed.
     */
    IsClosed(value = "is_closed"),

    /**
     * The gallery's room number. For "Gallery 100A", this would be "100A".
     */
    Number(value = "number"),

    /**
     * The level the gallery is on, e.g., 1, 2, 3, or LL.
     */
    Floor(value = "floor"),

    /**
     * Latitude and longitude coordinates of the center of the room.
     */
    Latlon(value = "latlon"),

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
