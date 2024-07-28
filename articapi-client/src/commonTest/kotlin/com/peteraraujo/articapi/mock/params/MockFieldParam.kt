package com.peteraraujo.articapi.mock.params

import com.peteraraujo.articapi.services.commons.Param

enum class MockFieldParam(override val value: String) : Param {

    Id("id"),
    Title("title"),
    TitleList("title_list"),


}