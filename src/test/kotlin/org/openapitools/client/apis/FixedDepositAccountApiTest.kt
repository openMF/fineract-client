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

import org.openapitools.client.apis.FixedDepositAccountApi
import org.openapitools.client.models.DeleteFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetFixedDepositAccountsResponse
import org.openapitools.client.models.GetFixedDepositAccountsTemplateResponse
import org.openapitools.client.models.PostFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.PostFixedDepositAccountsRequest
import org.openapitools.client.models.PostFixedDepositAccountsResponse
import org.openapitools.client.models.PutFixedDepositAccountsAccountIdRequest
import org.openapitools.client.models.PutFixedDepositAccountsAccountIdResponse

class FixedDepositAccountApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FixedDepositAccountApi
        //val apiInstance = FixedDepositAccountApi()

        // to test accountClosureTemplate
        should("test accountClosureTemplate") {
            // uncomment below to test accountClosureTemplate
            //val accountId : kotlin.Long = 789 // kotlin.Long | accountId
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : kotlin.String = apiInstance.accountClosureTemplate(accountId, command)
            //result shouldBe ("TODO")
        }

        // to test delete15
        should("test delete15") {
            // uncomment below to test delete15
            //val accountId : kotlin.Long = 789 // kotlin.Long | accountId
            //val result : DeleteFixedDepositAccountsAccountIdResponse = apiInstance.delete15(accountId)
            //result shouldBe ("TODO")
        }

        // to test getFixedDepositTemplate
        should("test getFixedDepositTemplate") {
            // uncomment below to test getFixedDepositTemplate
            //val officeId : kotlin.Long = 789 // kotlin.Long | 
            //val staffId : kotlin.Long = 789 // kotlin.Long | 
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //apiInstance.getFixedDepositTemplate(officeId, staffId, dateFormat)
        }

        // to test getFixedDepositTransactionTemplate
        should("test getFixedDepositTransactionTemplate") {
            // uncomment below to test getFixedDepositTransactionTemplate
            //val officeId : kotlin.Long = 789 // kotlin.Long | 
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //apiInstance.getFixedDepositTransactionTemplate(officeId, dateFormat)
        }

        // to test handleCommands4
        should("test handleCommands4") {
            // uncomment below to test handleCommands4
            //val accountId : kotlin.Long = 789 // kotlin.Long | accountId
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : PostFixedDepositAccountsAccountIdResponse = apiInstance.handleCommands4(accountId, body, command)
            //result shouldBe ("TODO")
        }

        // to test postFixedDepositTemplate
        should("test postFixedDepositTemplate") {
            // uncomment below to test postFixedDepositTemplate
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //val locale : kotlin.String = locale_example // kotlin.String | 
            //val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.postFixedDepositTemplate(dateFormat, locale, uploadedInputStream)
            //result shouldBe ("TODO")
        }

        // to test postFixedDepositTransactionTemplate
        should("test postFixedDepositTransactionTemplate") {
            // uncomment below to test postFixedDepositTransactionTemplate
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //val locale : kotlin.String = locale_example // kotlin.String | 
            //val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.postFixedDepositTransactionTemplate(dateFormat, locale, uploadedInputStream)
            //result shouldBe ("TODO")
        }

        // to test retrieveAll29
        should("test retrieveAll29") {
            // uncomment below to test retrieveAll29
            //val paged : kotlin.Boolean = true // kotlin.Boolean | paged
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
            //val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
            //val result : kotlin.collections.List<GetFixedDepositAccountsResponse> = apiInstance.retrieveAll29(paged, offset, limit, orderBy, sortOrder)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne19
        should("test retrieveOne19") {
            // uncomment below to test retrieveOne19
            //val accountId : kotlin.Long = 789 // kotlin.Long | accountId
            //val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
            //val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
            //val result : GetFixedDepositAccountsAccountIdResponse = apiInstance.retrieveOne19(accountId, staffInSelectedOfficeOnly, chargeStatus)
            //result shouldBe ("TODO")
        }

        // to test submitApplication
        should("test submitApplication") {
            // uncomment below to test submitApplication
            //val postFixedDepositAccountsRequest : PostFixedDepositAccountsRequest =  // PostFixedDepositAccountsRequest | 
            //val result : PostFixedDepositAccountsResponse = apiInstance.submitApplication(postFixedDepositAccountsRequest)
            //result shouldBe ("TODO")
        }

        // to test template12
        should("test template12") {
            // uncomment below to test template12
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val groupId : kotlin.Long = 789 // kotlin.Long | groupId
            //val productId : kotlin.Long = 789 // kotlin.Long | productId
            //val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
            //val result : GetFixedDepositAccountsTemplateResponse = apiInstance.template12(clientId, groupId, productId, staffInSelectedOfficeOnly)
            //result shouldBe ("TODO")
        }

        // to test update16
        should("test update16") {
            // uncomment below to test update16
            //val accountId : kotlin.Long = 789 // kotlin.Long | accountId
            //val putFixedDepositAccountsAccountIdRequest : PutFixedDepositAccountsAccountIdRequest =  // PutFixedDepositAccountsAccountIdRequest | 
            //val result : PutFixedDepositAccountsAccountIdResponse = apiInstance.update16(accountId, putFixedDepositAccountsAccountIdRequest)
            //result shouldBe ("TODO")
        }

    }
}
