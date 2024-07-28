package com.peteraraujo.articapi.models.collections.commons

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property h Dominant hue of the color.
 * @property l Dominant lightness of the color.
 * @property s Dominant saturation of the color.
 * @property percentage Percentage of the color in the image.
 * @property population Population of the color in the image.
 *
 * */
@Serializable
data class Color(

    @SerialName("h") val h: Int? = null,

    @SerialName("l") val l: Int? = null,

    @SerialName("s") val s: Int? = null,

    @SerialName("percentage") val percentage: Double? = null,

    @SerialName("population") val population: Int? = null
)