package com.peteraraujo.articapi.services.collections.exhibition

import com.peteraraujo.articapi.services.commons.Param

/**
 * Include param options.
 */
enum class ExhibitionIncludeParam(override val value: String) : Param {
    Artworks("artworks"),
    Sites("sites")
}