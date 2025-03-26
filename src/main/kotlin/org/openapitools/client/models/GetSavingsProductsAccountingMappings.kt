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

import org.openapitools.client.models.GetSavingsProductsIncomeFromFeeAccount
import org.openapitools.client.models.GetSavingsProductsIncomeFromPenaltyAccount
import org.openapitools.client.models.GetSavingsProductsInterestOnSavingsAccount
import org.openapitools.client.models.GetSavingsProductsSavingsControlAccount
import org.openapitools.client.models.GetSavingsProductsSavingsReferenceAccount
import org.openapitools.client.models.GetSavingsProductsTransfersInSuspenseAccount

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param incomeFromFeeAccount 
 * @param incomeFromPenaltyAccount 
 * @param interestOnSavingsAccount 
 * @param savingsControlAccount 
 * @param savingsReferenceAccount 
 * @param transfersInSuspenseAccount 
 */


data class GetSavingsProductsAccountingMappings (

    @Json(name = "incomeFromFeeAccount")
    val incomeFromFeeAccount: GetSavingsProductsIncomeFromFeeAccount? = null,

    @Json(name = "incomeFromPenaltyAccount")
    val incomeFromPenaltyAccount: GetSavingsProductsIncomeFromPenaltyAccount? = null,

    @Json(name = "interestOnSavingsAccount")
    val interestOnSavingsAccount: GetSavingsProductsInterestOnSavingsAccount? = null,

    @Json(name = "savingsControlAccount")
    val savingsControlAccount: GetSavingsProductsSavingsControlAccount? = null,

    @Json(name = "savingsReferenceAccount")
    val savingsReferenceAccount: GetSavingsProductsSavingsReferenceAccount? = null,

    @Json(name = "transfersInSuspenseAccount")
    val transfersInSuspenseAccount: GetSavingsProductsTransfersInSuspenseAccount? = null

) {


}

