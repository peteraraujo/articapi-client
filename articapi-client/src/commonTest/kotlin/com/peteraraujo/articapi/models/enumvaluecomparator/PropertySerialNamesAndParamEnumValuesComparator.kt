package com.peteraraujo.articapi.models.enumvaluecomparator

import com.peteraraujo.articapi.services.commons.Param
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.elementNames

object PropertySerialNamesAndParamEnumValuesComparator {

    @OptIn(ExperimentalSerializationApi::class)
    suspend fun <DataClass, FieldParamEnum : Param> compareParamEnumValuesPerPropertySerialNames(
        serializedDataClass: KSerializer<DataClass>,
        fieldParams: List<FieldParamEnum>
    ) = coroutineScope {

        val propertySerialNames = serializedDataClass.descriptor.elementNames

        val paramValues = fieldParams.map { it.value }

        return@coroutineScope paramValues.map { value ->

            async {
                return@async if (!propertySerialNames.contains(value)) value
                else null
            }

        }.awaitAll().filterNotNull()

    }

    @OptIn(ExperimentalSerializationApi::class)
    suspend fun <DataClass, FieldParamEnum : Param> comparePropertySerialNamesPerParamEnumValues(
        serializedDataClass: KSerializer<DataClass>,
        fieldParams: List<FieldParamEnum>
    ) = coroutineScope {

        val propertySerialNames = serializedDataClass.descriptor.elementNames

        val paramValues = fieldParams.map { it.value }

        return@coroutineScope propertySerialNames.map { property ->

            async {
                return@async if (!paramValues.contains(property)) property
                else null
            }

        }.awaitAll().filterNotNull()

    }

}

