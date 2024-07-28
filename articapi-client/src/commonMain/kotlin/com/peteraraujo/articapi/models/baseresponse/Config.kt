package com.peteraraujo.articapi.models.baseresponse

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Config(
    @SerialName("iiif_url")
    val iiifUrl: String,
    @SerialName("website_url")
    val websiteUrl: String
)