package com.peteraraujo.articapi.models.error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiError(

    @SerialName("status")
    val status: Int? = null,

    @SerialName("error")
    val error: String? = null,

    @SerialName("detail")
    val detail: String? = null,

)