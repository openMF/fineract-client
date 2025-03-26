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

import org.openapitools.client.models.GetSelfSavingsCurrency
import org.openapitools.client.models.GetSelfSavingsInterestCalculationDaysInYearType
import org.openapitools.client.models.GetSelfSavingsInterestCalculationType
import org.openapitools.client.models.GetSelfSavingsInterestCompoundingPeriodType
import org.openapitools.client.models.GetSelfSavingsInterestPostingPeriodType
import org.openapitools.client.models.GetSelfSavingsStatus
import org.openapitools.client.models.GetSelfSavingsSummary
import org.openapitools.client.models.GetSelfSavingsTimeline

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetSelfSavingsAccountsResponse
 *
 * @param accountNo 
 * @param clientId 
 * @param clientName 
 * @param currency 
 * @param fieldOfficerId 
 * @param id 
 * @param interestCalculationDaysInYearType 
 * @param interestCalculationType 
 * @param interestCompoundingPeriodType 
 * @param interestPostingPeriodType 
 * @param nominalAnnualInterestRate 
 * @param savingsProductId 
 * @param savingsProductName 
 * @param status 
 * @param summary 
 * @param timeline 
 */


data class GetSelfSavingsAccountsResponse (

    @Json(name = "accountNo")
    val accountNo: kotlin.Long? = null,

    @Json(name = "clientId")
    val clientId: kotlin.Int? = null,

    @Json(name = "clientName")
    val clientName: kotlin.String? = null,

    @Json(name = "currency")
    val currency: GetSelfSavingsCurrency? = null,

    @Json(name = "fieldOfficerId")
    val fieldOfficerId: kotlin.Int? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "interestCalculationDaysInYearType")
    val interestCalculationDaysInYearType: GetSelfSavingsInterestCalculationDaysInYearType? = null,

    @Json(name = "interestCalculationType")
    val interestCalculationType: GetSelfSavingsInterestCalculationType? = null,

    @Json(name = "interestCompoundingPeriodType")
    val interestCompoundingPeriodType: GetSelfSavingsInterestCompoundingPeriodType? = null,

    @Json(name = "interestPostingPeriodType")
    val interestPostingPeriodType: GetSelfSavingsInterestPostingPeriodType? = null,

    @Json(name = "nominalAnnualInterestRate")
    val nominalAnnualInterestRate: kotlin.Double? = null,

    @Json(name = "savingsProductId")
    val savingsProductId: kotlin.Int? = null,

    @Json(name = "savingsProductName")
    val savingsProductName: kotlin.String? = null,

    @Json(name = "status")
    val status: GetSelfSavingsStatus? = null,

    @Json(name = "summary")
    val summary: GetSelfSavingsSummary? = null,

    @Json(name = "timeline")
    val timeline: GetSelfSavingsTimeline? = null

) {


}

