/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.GetDataTablesResponse
import org.openapitools.client.models.ResultsetColumnHeaderData

class GetDataTablesResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetDataTablesResponse
        //val modelInstance = GetDataTablesResponse()

        // to test the property `applicationTableName`
        should("test applicationTableName") {
            // uncomment below to test the property
            //modelInstance.applicationTableName shouldBe ("TODO")
        }

        // to test the property `columnHeaderData`
        should("test columnHeaderData") {
            // uncomment below to test the property
            //modelInstance.columnHeaderData shouldBe ("TODO")
        }

        // to test the property `registeredTableName`
        should("test registeredTableName") {
            // uncomment below to test the property
            //modelInstance.registeredTableName shouldBe ("TODO")
        }

    }
}
