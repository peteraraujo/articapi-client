package com.peteraraujo.articapi.mock.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property id The ID of the model.
 * @property title The title of the model.
 * @property titleList An optional list of titles.
 * */
@Serializable
data class MockModel(
    @SerialName(value = "id")
    val id: Int? = null,

    @SerialName(value = "title")
    val title: String? = null,

    @SerialName(value = "title_list")
    val titleList: List<String>? = null,

    @SerialName(value = "thumbnail")
    val thumbnail: String? = null,
)
