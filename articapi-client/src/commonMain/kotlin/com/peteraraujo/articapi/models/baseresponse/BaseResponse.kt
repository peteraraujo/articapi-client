package com.peteraraujo.articapi.models.baseresponse

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Serves as a base body response for most endpoints.
 * */
@Serializable
data class BaseResponse<T>(
    @SerialName("pagination")
    val pagination: Pagination? = null,
    @SerialName("data")
    val data: T,
    @SerialName("info")
    val info: Info? = null,
    @SerialName("config")
    val config: Config? = null,
    )