package com.peteraraujo.articapi.models.collections

import com.peteraraujo.articapi.models.collections.artwork.Artwork
import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import com.peteraraujo.articapi.models.staticarchive.Site
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An organized presentation and display of a selection of artworks.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property title The name of this resource.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property score Search score.
 * @property isFeatured Is this exhibition currently featured on our website?
 * @property position Position of the exhibition.
 * @property shortDescription Brief explanation of what this exhibition is.
 * @property webUrl URL to this exhibition on our website.
 * @property imageUrl URL to the hero image from the website.
 * @property status Whether the exhibition is open or closed.
 * @property aicStartAt Date the exhibition opened at the Art Institute of Chicago.
 * @property aicEndAt Date the exhibition closed at the Art Institute of Chicago.
 * @property galleryId Unique identifier of the gallery that mainly housed the exhibition.
 * @property galleryTitle The name of the gallery that mainly housed the exhibition.
 * @property artworkIds Unique identifiers of the artworks that were part of the exhibition.
 * @property artworkTitles Names of the artworks that were part of the exhibition.
 * @property artistIds Unique identifiers of the artist agent records representing who was shown in the exhibition.
 * @property siteIds Unique identifiers of the microsites this exhibition is a part of.
 * @property imageId Unique identifier of the preferred image to use to represent this exhibition.
 * @property altImageIds Unique identifiers of all non-preferred images of this exhibition.
 * @property documentIds Unique identifiers of assets that serve as documentation for this exhibition.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property artworks Optional artwork list that can be added with 'include' param when available.
 * @property sites Optional site list that can be added with 'include' param when available.
 */
@Serializable
data class Exhibition(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("is_featured")
    val isFeatured: Boolean? = null,
    @SerialName("position")
    val position: Int? = null,
    @SerialName("short_description")
    val shortDescription: String? = null,
    @SerialName("web_url")
    val webUrl: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("status")
    val status: String? = null,
    @SerialName("aic_start_at")
    val aicStartAt: String? = null,
    @SerialName("aic_end_at")
    val aicEndAt: String? = null,
    @SerialName("gallery_id")
    val galleryId: Long? = null,
    @SerialName("gallery_title")
    val galleryTitle: String? = null,
    @SerialName("artwork_ids")
    val artworkIds: List<Int>? = null,
    @SerialName("artwork_titles")
    val artworkTitles: List<String>? = null,
    @SerialName("artist_ids")
    val artistIds: List<Int>? = null,
    @SerialName("site_ids")
    val siteIds: List<Int>? = null,
    @SerialName("image_id")
    val imageId: String? = null,
    @SerialName("alt_image_ids")
    val altImageIds: List<String>? = null,
    @SerialName("document_ids")
    val documentIds: List<String>? = null,
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
    @SerialName("sites")
    val sites: List<Site>? = null,
)
