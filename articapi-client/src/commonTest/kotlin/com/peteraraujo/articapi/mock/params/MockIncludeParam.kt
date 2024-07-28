package com.peteraraujo.articapi.mock.params

import com.peteraraujo.articapi.services.commons.Param

enum class MockIncludeParam(override val value: String) : Param {

    TitleList("title_list"),
    Thumbnail("thumbnail")

}