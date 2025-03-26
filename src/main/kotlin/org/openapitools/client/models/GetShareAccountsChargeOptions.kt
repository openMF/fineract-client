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

import org.openapitools.client.models.GetShareAccountsChargeAppliesTo
import org.openapitools.client.models.GetShareAccountsChargeCalculationType
import org.openapitools.client.models.GetShareAccountsChargePaymentMode
import org.openapitools.client.models.GetShareAccountsChargeTimeType
import org.openapitools.client.models.GetShareAccountsCurrency

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param active 
 * @param amount 
 * @param calculationType 
 * @param chargeAppliesTo 
 * @param chargeTimeType 
 * @param currency 
 * @param id 
 * @param name 
 * @param paymentMode 
 * @param penalty 
 */


data class GetShareAccountsChargeOptions (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "amount")
    val amount: kotlin.Int? = null,

    @Json(name = "calculationType")
    val calculationType: GetShareAccountsChargeCalculationType? = null,

    @Json(name = "chargeAppliesTo")
    val chargeAppliesTo: GetShareAccountsChargeAppliesTo? = null,

    @Json(name = "chargeTimeType")
    val chargeTimeType: GetShareAccountsChargeTimeType? = null,

    @Json(name = "currency")
    val currency: GetShareAccountsCurrency? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "paymentMode")
    val paymentMode: GetShareAccountsChargePaymentMode? = null,

    @Json(name = "penalty")
    val penalty: kotlin.Boolean? = null

) {


}

