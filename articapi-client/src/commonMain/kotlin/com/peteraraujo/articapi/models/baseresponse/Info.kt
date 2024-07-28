package com.peteraraujo.articapi.models.baseresponse

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Info(
    @SerialName("license_text")
    val licenseText: String,
    @SerialName("license_links")
    val licenseLinks: List<String>,
    @SerialName("version")
    val version: String
)