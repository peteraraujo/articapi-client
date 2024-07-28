package com.peteraraujo.articapi.models.collections.artwork

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DimensionDetail(
    @SerialName("depth")
    val depth: Double? = null,
    @SerialName("width")
    val width: Double? = null,
    @SerialName("height")
    val height: Double? = null,
    @SerialName("diameter")
    val diameter: Double? = null,
    @SerialName("depth_cm")
    val depthCm: Double? = null,
    @SerialName("width_cm")
    val widthCm: Double? = null,
    @SerialName("height_cm")
    val heightCm: Double? = null,
    @SerialName("diameter_cm")
    val diameterCm: Double? = null,
    @SerialName("depth_in")
    val depthIn: Double? = null,
    @SerialName("width_in")
    val widthIn: Double? = null,
    @SerialName("height_in")
    val heightIn: Double? = null,
    @SerialName("diameter_in")
    val diameterIn: Double? = null,
    @SerialName("clarification")
    val clarification: String? = null,
)