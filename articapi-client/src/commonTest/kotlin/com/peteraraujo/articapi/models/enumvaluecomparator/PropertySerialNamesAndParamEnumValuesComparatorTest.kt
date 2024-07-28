package com.peteraraujo.articapi.models.enumvaluecomparator

import com.peteraraujo.articapi.services.commons.Param
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.test.Test
import kotlin.test.assertContains

class PropertySerialNamesAndParamEnumValuesComparatorTest {

    @Test
    fun checkComparePropertySerialNamesAndParamEnumValuesCanDetectErrors() = runTest {

        val paramEnumValuesPerPropertySerialNames =
            PropertySerialNamesAndParamEnumValuesComparator.compareParamEnumValuesPerPropertySerialNames(
                serializedDataClass = MockModelWithExtraProperty.serializer(),
                fieldParams = MockDataModelFieldParamWithExtraEnum.entries
            )

        val propertySerialNamesAndParamEnumValues =
            PropertySerialNamesAndParamEnumValuesComparator.comparePropertySerialNamesPerParamEnumValues(
                serializedDataClass = MockModelWithExtraProperty.serializer(),
                fieldParams = MockDataModelFieldParamWithExtraEnum.entries
            )

        assertContains(iterable = paramEnumValuesPerPropertySerialNames, element = "extra_enum")

        assertContains(iterable = propertySerialNamesAndParamEnumValues, element = "extra_property")

    }

    @Serializable
    private data class MockModelWithExtraProperty(

        @SerialName(value = "id")
        val id: Int? = null,

        @SerialName(value = "name")
        val name: String? = null,

        @SerialName(value = "extra_property")
        val extraProperty: String? = null
    )

    private enum class MockDataModelFieldParamWithExtraEnum(override val value: String) : Param {

        Id(value = "id"),

        Name(value = "name"),

        ExtraEnum(value = "extra_enum"),


    }

}