package com.peteraraujo.articapi.services.mobile.tour

import com.peteraraujo.articapi.services.commons.Param

/**
 * Include param options.
 */
enum class TourIncludeParam(override val value: String) : Param {
    TourStop("tour_stops")
}