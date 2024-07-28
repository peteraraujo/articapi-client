package com.peteraraujo.articapi.services.site

import com.peteraraujo.articapi.services.commons.Param

/**
 * Include param options.
 * */
enum class SiteIncludeParam(
    override val value: String
) : Param {

    Artworks(value = "artworks")

}