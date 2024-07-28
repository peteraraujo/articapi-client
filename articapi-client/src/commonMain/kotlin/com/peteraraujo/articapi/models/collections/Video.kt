package com.peteraraujo.articapi.models.collections

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A moving image representation of a collections resource, like an artwork, artist, exhibition, etc.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property lakeGuid Unique UUID of this resource in LAKE, our DAMS.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property type Type always takes one of the following values: image, sound, text, video.
 * @property altText Alternative text for the asset to describe it to people with low or no vision.
 * @property content Text of or URL to the contents of this asset.
 * @property isMultimediaResource Whether this resource is considered to be multimedia.
 * @property isEducationalResource Whether this resource is considered to be educational.
 * @property isTeacherResource Whether this resource is considered to be educational.
 * @property creditLine Asset-specific copyright information.
 * @property contentETag Arbitrary unique identifier that changes when the binary file gets updated.
 * @property artworkIds Unique identifiers of the artworks associated with this asset.
 * @property artworkTitles Names of the artworks associated with this asset.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 */
@Serializable
data class Video(
    @SerialName("id")
    val id: String? = null,
    @SerialName("lake_guid")
    val lakeGuid: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("type")
    val type: String? = null,
    @SerialName("alt_text")
    val altText: String? = null,
    @SerialName("content")
    val content: String? = null,
    @SerialName("is_multimedia_resource")
    val isMultimediaResource: Boolean? = null,
    @SerialName("is_educational_resource")
    val isEducationalResource: Boolean? = null,
    @SerialName("is_teacher_resource")
    val isTeacherResource: Boolean? = null,
    @SerialName("credit_line")
    val creditLine: String? = null,
    @SerialName("content_e_tag")
    val contentETag: String? = null,
    @SerialName("artwork_ids")
    val artworkIds: List<Int>? = null,
    @SerialName("artwork_titles")
    val artworkTitles: List<String>? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: SuggestAutocomplete? = null,
)
