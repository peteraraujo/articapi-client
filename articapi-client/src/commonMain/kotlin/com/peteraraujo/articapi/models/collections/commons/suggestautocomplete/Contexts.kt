package com.peteraraujo.articapi.models.collections.commons.suggestautocomplete

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Contexts(
    @SerialName("groupings")
    val groupings: List<String>? = null,
)