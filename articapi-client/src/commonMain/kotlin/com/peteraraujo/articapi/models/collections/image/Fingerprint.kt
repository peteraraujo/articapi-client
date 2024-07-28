package com.peteraraujo.articapi.models.collections.image

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
/**
 * Represents the fingerprint associated with an image.
 *
 * @property ahash Image hash generated using ahash algorithm with 64 boolean subfields.
 * @property dhash Image hash generated using dhash algorithm.
 * @property phash Image hash generated using phash algorithm with 64 boolean subfields.
 * @property whash Image hash generated using whash algorithm.
 */
@Serializable
data class Fingerprint(
    @SerialName("ahash")
    val ahash: String? = null,

    @SerialName("dhash")
    val dhash: String? = null,

    @SerialName("phash")
    val phash: String? = null,

    @SerialName("whash")
    val whash: String? = null
)