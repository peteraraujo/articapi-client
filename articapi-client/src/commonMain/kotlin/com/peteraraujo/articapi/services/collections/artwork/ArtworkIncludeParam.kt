package com.peteraraujo.articapi.services.collections.artwork

import com.peteraraujo.articapi.services.commons.Param

/**
 * Include param options.
 *
 */
enum class ArtworkIncludeParam(override val value: String) : Param {
    ArtistPivots("artist_pivots"),
    Dates("dates"),
    PlacePivots("place_pivots"),
    Sites("sites")
}
