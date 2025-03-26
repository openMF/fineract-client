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
import org.openapitools.client.models.GetSavingsProductsAccountingMappingOptions
import org.openapitools.client.models.GetSavingsProductsChargeOptions
import org.openapitools.client.models.GetSavingsProductsInterestCalculationDaysInYearType
import org.openapitools.client.models.GetSavingsProductsInterestCalculationType
import org.openapitools.client.models.GetSavingsProductsInterestCompoundingPeriodType
import org.openapitools.client.models.GetSavingsProductsInterestPostingPeriodType
import org.openapitools.client.models.GetSavingsProductsLockinPeriodFrequencyTypeOptions
import org.openapitools.client.models.GetSavingsProductsPaymentTypeOptions
import org.openapitools.client.models.GetSavingsProductsTemplateAccountingRule
import org.openapitools.client.models.GetSavingsProductsWithdrawalFeeTypeOptions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetSavingsProductsTemplateResponse
 *
 * @param accountMapping 
 * @param accountingMappingOptions 
 * @param accountingRule 
 * @param accountingRuleOptions 
 * @param chargeOptions 
 * @param currency 
 * @param currencyOptions 
 * @param interestCalculationDaysInYearType 
 * @param interestCalculationDaysInYearTypeOptions 
 * @param interestCalculationType 
 * @param interestCalculationTypeOptions 
 * @param interestCompoundingPeriodType 
 * @param interestCompoundingPeriodTypeOptions 
 * @param interestPostingPeriodType 
 * @param interestPostingPeriodTypeOptions 
 * @param lockinPeriodFrequencyTypeOptions 
 * @param paymentTypeOptions 
 * @param withdrawalFeeTypeOptions 
 */


data class GetSavingsProductsTemplateResponse (

    @Json(name = "accountMapping")
    val accountMapping: GetSavingsCurrency? = null,

    @Json(name = "accountingMappingOptions")
    val accountingMappingOptions: GetSavingsProductsAccountingMappingOptions? = null,

    @Json(name = "accountingRule")
    val accountingRule: GetSavingsProductsTemplateAccountingRule? = null,

    @Json(name = "accountingRuleOptions")
    val accountingRuleOptions: kotlin.collections.Set<GetSavingsProductsTemplateAccountingRule>? = null,

    @Json(name = "chargeOptions")
    val chargeOptions: kotlin.collections.Set<GetSavingsProductsChargeOptions>? = null,

    @Json(name = "currency")
    val currency: GetSavingsCurrency? = null,

    @Json(name = "currencyOptions")
    val currencyOptions: kotlin.collections.Set<GetSavingsCurrency>? = null,

    @Json(name = "interestCalculationDaysInYearType")
    val interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType? = null,

    @Json(name = "interestCalculationDaysInYearTypeOptions")
    val interestCalculationDaysInYearTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCalculationDaysInYearType>? = null,

    @Json(name = "interestCalculationType")
    val interestCalculationType: GetSavingsProductsInterestCalculationType? = null,

    @Json(name = "interestCalculationTypeOptions")
    val interestCalculationTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCalculationType>? = null,

    @Json(name = "interestCompoundingPeriodType")
    val interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType? = null,

    @Json(name = "interestCompoundingPeriodTypeOptions")
    val interestCompoundingPeriodTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestCompoundingPeriodType>? = null,

    @Json(name = "interestPostingPeriodType")
    val interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType? = null,

    @Json(name = "interestPostingPeriodTypeOptions")
    val interestPostingPeriodTypeOptions: kotlin.collections.Set<GetSavingsProductsInterestPostingPeriodType>? = null,

    @Json(name = "lockinPeriodFrequencyTypeOptions")
    val lockinPeriodFrequencyTypeOptions: kotlin.collections.Set<GetSavingsProductsLockinPeriodFrequencyTypeOptions>? = null,

    @Json(name = "paymentTypeOptions")
    val paymentTypeOptions: kotlin.collections.Set<GetSavingsProductsPaymentTypeOptions>? = null,

    @Json(name = "withdrawalFeeTypeOptions")
    val withdrawalFeeTypeOptions: kotlin.collections.Set<GetSavingsProductsWithdrawalFeeTypeOptions>? = null

) {


}

