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

import org.openapitools.client.apis.AccountNumberFormatApi
import org.openapitools.client.models.DeleteAccountNumberFormatsResponse
import org.openapitools.client.models.GetAccountNumberFormatsIdResponse
import org.openapitools.client.models.GetAccountNumberFormatsResponseTemplate
import org.openapitools.client.models.PostAccountNumberFormatsRequest
import org.openapitools.client.models.PostAccountNumberFormatsResponse
import org.openapitools.client.models.PutAccountNumberFormatsRequest
import org.openapitools.client.models.PutAccountNumberFormatsResponse

class AccountNumberFormatApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AccountNumberFormatApi
        //val apiInstance = AccountNumberFormatApi()

        // to test create
        should("test create") {
            // uncomment below to test create
            //val postAccountNumberFormatsRequest : PostAccountNumberFormatsRequest =  // PostAccountNumberFormatsRequest | 
            //val result : PostAccountNumberFormatsResponse = apiInstance.create(postAccountNumberFormatsRequest)
            //result shouldBe ("TODO")
        }

        // to test delete
        should("test delete") {
            // uncomment below to test delete
            //val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId
            //val result : DeleteAccountNumberFormatsResponse = apiInstance.delete(accountNumberFormatId)
            //result shouldBe ("TODO")
        }

        // to test retrieveAll3
        should("test retrieveAll3") {
            // uncomment below to test retrieveAll3
            //val result : kotlin.collections.List<GetAccountNumberFormatsIdResponse> = apiInstance.retrieveAll3()
            //result shouldBe ("TODO")
        }

        // to test retrieveOne
        should("test retrieveOne") {
            // uncomment below to test retrieveOne
            //val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId
            //val result : GetAccountNumberFormatsIdResponse = apiInstance.retrieveOne(accountNumberFormatId)
            //result shouldBe ("TODO")
        }

        // to test retrieveTemplate2
        should("test retrieveTemplate2") {
            // uncomment below to test retrieveTemplate2
            //val result : GetAccountNumberFormatsResponseTemplate = apiInstance.retrieveTemplate2()
            //result shouldBe ("TODO")
        }

        // to test update1
        should("test update1") {
            // uncomment below to test update1
            //val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId
            //val putAccountNumberFormatsRequest : PutAccountNumberFormatsRequest =  // PutAccountNumberFormatsRequest | 
            //val result : PutAccountNumberFormatsResponse = apiInstance.update1(accountNumberFormatId, putAccountNumberFormatsRequest)
            //result shouldBe ("TODO")
        }

    }
}
