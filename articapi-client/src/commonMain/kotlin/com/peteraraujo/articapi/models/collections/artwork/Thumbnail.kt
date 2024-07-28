package com.peteraraujo.articapi.models.collections.artwork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Thumbnail(
    @SerialName("lqip")
    val lqip: String? = null,
    @SerialName("width")
    val width: Int? = null,
    @SerialName("height")
    val height: Int? = null,
    @SerialName("alt_text")
    val altText: String? = null,
)