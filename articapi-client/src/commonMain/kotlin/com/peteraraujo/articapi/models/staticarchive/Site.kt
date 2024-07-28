package com.peteraraujo.articapi.models.staticarchive

import com.peteraraujo.articapi.models.collections.artwork.Artwork
import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An archived static microsite.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property description Explanation of what this site is.
 * @property webUrl URL to this site.
 * @property exhibitionIds Unique identifier of the exhibitions this site is associated with.
 * @property exhibitionTitles Names of the exhibitions this site is associated with.
 * @property artworkIds Unique identifiers of the artworks this site is associated with.
 * @property artworkTitles Names of the artworks this site is associated with.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property artworks Optional artwork list.
 */
@Serializable
data class Site(

    @SerialName("id")
    val id: Int? = null,

    @SerialName("api_model")
    val apiModel: String? = null,

    @SerialName("api_link")
    val apiLink: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("_score")
    val score: Float? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("web_url")
    val webUrl: String? = null,

    @SerialName("exhibition_ids")
    val exhibitionIds: List<Int>? = null,

    @SerialName("exhibition_titles")
    val exhibitionTitles: List<String>? = null,

    @SerialName("artwork_ids")
    val artworkIds: List<Int>? = null,

    @SerialName("artwork_titles")
    val artworkTitles: List<String>? = null,

    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,

    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: SuggestAutocomplete? = null,

    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,

    @SerialName("updated_at")
    val updatedAt: String? = null,

    @SerialName("timestamp")
    val timestamp: String? = null,

    @SerialName("artworks")
    val artworks: List<Artwork>? = null,
)
