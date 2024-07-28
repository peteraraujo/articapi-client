package com.peteraraujo.articapi.models.collections

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A kind of object or work, e.g., Painting, Sculpture, Book, etc.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property title The name of this resource.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property aatId Identifier of reconciled (most similar) term in the Getty's Art and Architecture Thesaurus (AAT).
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 */
@Serializable
data class ArtworkType(

    @SerialName("id")
    val id: Int? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("api_model")
    val apiModel: String? = null,

    @SerialName("api_link")
    val apiLink: String? = null,

    @SerialName("aat_id")
    val aatId: Int? = null,

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

