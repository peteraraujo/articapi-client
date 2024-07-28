package com.peteraraujo.articapi.models.collections

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a person or organization. In the API, this includes artists.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property title The name of this resource.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property score Search score.
 * @property sortTitle Sortable name for this agent, typically with last name first.
 * @property altTitles Alternate names for this agent.
 * @property isArtist Whether the agent is an artist. Solely based on whether the agent is related to an artwork record.
 * @property birthDate The year this agent was born.
 * @property deathDate The year this agent died.
 * @property description A biographical description of the agent.
 * @property ulanId Unique identifier of this agent in Getty's ULAN.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 */
@Serializable
data class Agent(

    @SerialName("id") val id: Int? = null,

    @SerialName("title") val title: String? = null,

    @SerialName("api_model") val apiModel: String? = null,

    @SerialName("api_link") val apiLink: String? = null,

    @SerialName("_score") val score: Float? = null,

    @SerialName("sort_title") val sortTitle: String? = null,

    @SerialName("alt_titles") val altTitles: List<String>? = null,

    @SerialName("is_artist") val isArtist: Boolean? = null,

    @SerialName("birth_date") val birthDate: Int? = null,

    @SerialName("death_date") val deathDate: Int? = null,

    @SerialName("description") val description: String? = null,

    @SerialName("ulan_id") val ulanId: Int? = null,

    @SerialName("source_updated_at") val sourceUpdatedAt: String? = null,

    @SerialName("updated_at") val updatedAt: String? = null,

    @SerialName("timestamp") val timestamp: String? = null,

    @SerialName("suggest_autocomplete_boosted") val suggestAutocompleteBoosted: SuggestAutocomplete? = null,

    @SerialName("suggest_autocomplete_all") val suggestAutocompleteAll: SuggestAutocomplete? = null,

    )
