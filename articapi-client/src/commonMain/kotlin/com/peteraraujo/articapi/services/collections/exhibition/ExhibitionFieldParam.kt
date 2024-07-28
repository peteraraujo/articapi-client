package com.peteraraujo.articapi.services.collections.exhibition

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 * */
enum class ExhibitionFieldParam(override val value: String) : Param {

    /** Unique identifier of this resource. Taken from the source system. */
    Id(value = "id"),

    /** The name of this resource. */
    Title(value = "title"),

    /** REST API resource type or endpoint. */
    ApiModel(value = "api_model"),

    /** REST API link for this resource. */
    ApiLink(value = "api_link"),

    /** Is this exhibition currently featured on Artic's website? */
    IsFeatured(value = "is_featured"),

    /** Search score. */
    Score("_score"),

    /** osition of the exhibition. */
    Position(value = "position"),

    /** Brief explanation of what this exhibition is. */
    ShortDescription(value = "short_description"),

    /** URL to this exhibition on our website. */
    WebUrl(value = "web_url"),

    /** URL to the hero image from the website. */
    ImageUrl(value = "image_url"),

    /** Whether the exhibition is open or closed. */
    Status(value = "status"),

    /** Date the exhibition opened at the Art Institute of Chicago. */
    AicStartAt(value = "aic_start_at"),

    /** Date the exhibition closed at the Art Institute of Chicago. */
    AicEndAt(value = "aic_end_at"),

    /** Unique identifier of the gallery that mainly housed the exhibition. */
    GalleryId(value = "gallery_id"),

    /** The name of the gallery that mainly housed the exhibition. */
    GalleryTitle(value = "gallery_title"),

    /** Unique identifiers of the artworks that were part of the exhibition. */
    ArtworkIds(value = "artwork_ids"),

    /** Names of the artworks that were part of the exhibition. */
    ArtworkTitles(value = "artwork_titles"),

    /** Unique identifiers of the artist agent records representing who was shown in the exhibition. */
    ArtistIds(value = "artist_ids"),

    /** Unique identifiers of the microsites this exhibition is a part of. */
    SiteIds(value = "site_ids"),

    /** Unique identifier of the preferred image to use to represent this exhibition. */
    ImageId(value = "image_id"),

    /** Unique identifiers of all non-preferred images of this exhibition. */
    AltImageIds(value = "alt_image_ids"),

    /** Unique identifiers of assets that serve as documentation for this exhibition. */
    DocumentIds(value = "document_ids"),
    /** Date and time the resource was updated in the source system. */
    SourceUpdatedAt(value = "source_updated_at"),

    /** Date and time the record was updated in the aggregator database. */
    UpdatedAt(value = "updated_at"),

    /** Date and time the record was updated in the aggregator search index. */
    Timestamp(value = "timestamp"),

    /** Internal field to power the /autocomplete endpoint. Do not use directly. */
    SuggestAutocompleteBoosted(value = "suggest_autocomplete_boosted"),

    /** Internal field to power the /autosuggest endpoint. Do not use directly. */
    SuggestAutocompleteAll(value = "suggest_autocomplete_all"),

    /** Optional site list that can be added with 'include' param when available. */
    Sites(value = "sites"),

    /** Optional artwork list that can be added with 'include' param when available. */
    Artworks(value = "artworks"),

}