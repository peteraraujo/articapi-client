package com.peteraraujo.articapi.models.dscatalog

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a chapter of publication.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property webUrl The URL to this page on our website.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property accession An accession number parsed from the title or tombstone.
 * @property genericPageId Unique identifier of the page on the website that represents the publication this section belongs to.
 * @property artworkId Unique identifier of the artwork with which this section is associated.
 * @property publicationTitle Name of the publication this section belongs to.
 * @property publicationId Unique identifier of the publication this section belongs to.
 * @property content Content of this section in plaintext.
 */
@Serializable
data class Section(
    @SerialName("id")
    val id: Long? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("web_url")
    val webUrl: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("accession")
    val accession: String? = null,
    @SerialName("generic_page_id")
    val genericPageId: Int? = null,
    @SerialName("artwork_id")
    val artworkId: Int? = null,
    @SerialName("publication_title")
    val publicationTitle: String? = null,
    @SerialName("publication_id")
    val publicationId: Int? = null,
    @SerialName("content")
    val content: String? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocomplete>? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null
)
