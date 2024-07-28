package com.peteraraujo.articapi.services.collections.image

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 */
enum class ImageFieldParam(override val value: String) : Param {

    /** Unique identifier of this resource. Taken from the source system. */
    Id(value = "id"),

    /** Unique UUID of this resource in LAKE, our DAMS. */
    LakeGuid(value = "lake_guid"),

    /** REST API resource type or endpoint. */
    ApiModel(value = "api_model"),

    /** REST API link for this resource. */
    ApiLink(value = "api_link"),

    /** Search score. */
    Score("_score"),

    /** The name of this resource. */
    Title(value = "title"),

    /** Type always takes one of the following values: image, sound, text, video. */
    Type(value = "type"),

    /** Alternative text for the asset to describe it to people with low or no vision. */
    AltText(value = "alt_text"),

    /** Text of or URL to the contents of this asset. */
    Content(value = "content"),

    /** Whether this resource is considered to be multimedia. */
    IsMultimediaResource(value = "is_multimedia_resource"),

    /** Whether this resource is considered to be educational. */
    IsEducationalResource(value = "is_educational_resource"),

    /** Whether this resource is considered to be educational. */
    IsTeacherResource(value = "is_teacher_resource"),

    /** Asset-specific copyright information. */
    CreditLine(value = "credit_line"),

    /** Arbitrary unique identifier that changes when the binary file gets updated. */
    ContentETag(value = "content_e_tag"),

    /** IIIF URL of this image. */
    IiifUrl(value = "iiif_url"),

    /** Native width of the image. */
    Width(value = "width"),

    /** Native height of the image. */
    Height(value = "height"),

    /** Low-quality image placeholder (LQIP). Currently a 5x5-constrained, base64-encoded GIF. */
    Lqip(value = "lqip"),

    /** Unbounded positive float representing an abstract measure of colorfulness. */
    Colorfulness(value = "colorfulness"),

    /** Dominant color of this image in HSL. */
    Color(value = "color"),

    /** Image hash generated using phash algorithm with 64 boolean subfields. */
    Ahash(value = "ahash"),

    /** Image hash generated using phash algorithm with 64 boolean subfields. */
    Phash(value = "phash"),

    /** Image hashes: aHash, dHash, pHash, wHash. */
    Fingerprint(value = "fingerprint"),

    /** Unique identifiers of the artworks associated with this asset. */
    ArtworkIds(value = "artwork_ids"),

    /** Names of the artworks associated with this asset. */
    ArtworkTitles(value = "artwork_titles"),

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
