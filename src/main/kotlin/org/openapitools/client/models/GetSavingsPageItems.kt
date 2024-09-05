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

import org.openapitools.client.models.GetSavingsCurrency
import org.openapitools.client.models.GetSavingsInterestCalculationDaysInYearType
import org.openapitools.client.models.GetSavingsInterestCalculationType
import org.openapitools.client.models.GetSavingsInterestCompoundingPeriodType
import org.openapitools.client.models.GetSavingsInterestPostingPeriodType
import org.openapitools.client.models.GetSavingsStatus
import org.openapitools.client.models.GetSavingsSummary
import org.openapitools.client.models.GetSavingsTimeline

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
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


data class GetSavingsPageItems (

    @Json(name = "accountNo")
    val accountNo: kotlin.String? = null,

    @Json(name = "clientId")
    val clientId: kotlin.Int? = null,

    @Json(name = "clientName")
    val clientName: kotlin.String? = null,

    @Json(name = "currency")
    val currency: GetSavingsCurrency? = null,

    @Json(name = "fieldOfficerId")
    val fieldOfficerId: kotlin.Int? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "interestCalculationDaysInYearType")
    val interestCalculationDaysInYearType: GetSavingsInterestCalculationDaysInYearType? = null,

    @Json(name = "interestCalculationType")
    val interestCalculationType: GetSavingsInterestCalculationType? = null,

    @Json(name = "interestCompoundingPeriodType")
    val interestCompoundingPeriodType: GetSavingsInterestCompoundingPeriodType? = null,

    @Json(name = "interestPostingPeriodType")
    val interestPostingPeriodType: GetSavingsInterestPostingPeriodType? = null,

    @Json(name = "nominalAnnualInterestRate")
    val nominalAnnualInterestRate: kotlin.Double? = null,

    @Json(name = "savingsProductId")
    val savingsProductId: kotlin.Int? = null,

    @Json(name = "savingsProductName")
    val savingsProductName: kotlin.String? = null,

    @Json(name = "status")
    val status: GetSavingsStatus? = null,

    @Json(name = "summary")
    val summary: GetSavingsSummary? = null,

    @Json(name = "timeline")
    val timeline: GetSavingsTimeline? = null

) {


}

