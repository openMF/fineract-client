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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.GlobalConfigurationApi
import org.openapitools.client.models.GetGlobalConfigurationsResponse
import org.openapitools.client.models.GlobalConfigurationPropertyData
import org.openapitools.client.models.PutGlobalConfigurationsRequest
import org.openapitools.client.models.PutGlobalConfigurationsResponse

class GlobalConfigurationApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GlobalConfigurationApi
        //val apiInstance = GlobalConfigurationApi()

        // to test retrieveConfiguration
        should("test retrieveConfiguration") {
            // uncomment below to test retrieveConfiguration
            //val survey : kotlin.Boolean = true // kotlin.Boolean | survey
            //val result : GetGlobalConfigurationsResponse = apiInstance.retrieveConfiguration(survey)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne3
        should("test retrieveOne3") {
            // uncomment below to test retrieveOne3
            //val configId : kotlin.Long = 789 // kotlin.Long | configId
            //val result : GetGlobalConfigurationsResponse = apiInstance.retrieveOne3(configId)
            //result shouldBe ("TODO")
        }

        // to test retrieveOneByName
        should("test retrieveOneByName") {
            // uncomment below to test retrieveOneByName
            //val name : kotlin.String = name_example // kotlin.String | name
            //val result : GlobalConfigurationPropertyData = apiInstance.retrieveOneByName(name)
            //result shouldBe ("TODO")
        }

        // to test updateConfiguration1
        should("test updateConfiguration1") {
            // uncomment below to test updateConfiguration1
            //val configId : kotlin.Long = 789 // kotlin.Long | configId
            //val putGlobalConfigurationsRequest : PutGlobalConfigurationsRequest =  // PutGlobalConfigurationsRequest | 
            //val result : PutGlobalConfigurationsResponse = apiInstance.updateConfiguration1(configId, putGlobalConfigurationsRequest)
            //result shouldBe ("TODO")
        }

    }
}
