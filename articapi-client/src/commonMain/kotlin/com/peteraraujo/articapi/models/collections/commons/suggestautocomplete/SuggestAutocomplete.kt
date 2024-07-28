package com.peteraraujo.articapi.models.collections.commons.suggestautocomplete

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SuggestAutocomplete(
    @SerialName("input")
    val input: List<String>? = null,
    @SerialName("weight")
    val weight: Int? = null,
    @SerialName("contexts")
    val contexts: Contexts? = null,
)