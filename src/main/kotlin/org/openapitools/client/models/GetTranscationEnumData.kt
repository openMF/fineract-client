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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param amountHold 
 * @param amountRelease 
 * @param approveTransfer 
 * @param code 
 * @param deposit 
 * @param dividendPayout 
 * @param escheat 
 * @param feeDeduction 
 * @param id 
 * @param initiateTransfer 
 * @param interestPosting 
 * @param overdraftFee 
 * @param overdraftInterest 
 * @param rejectTransfer 
 * @param `value` 
 * @param withdrawTransfer 
 * @param withdrawal 
 * @param withholdTax 
 * @param writtenoff 
 */


data class GetTranscationEnumData (

    @Json(name = "amountHold")
    val amountHold: kotlin.Boolean? = null,

    @Json(name = "amountRelease")
    val amountRelease: kotlin.Boolean? = null,

    @Json(name = "approveTransfer")
    val approveTransfer: kotlin.Boolean? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "deposit")
    val deposit: kotlin.Boolean? = null,

    @Json(name = "dividendPayout")
    val dividendPayout: kotlin.Boolean? = null,

    @Json(name = "escheat")
    val escheat: kotlin.Boolean? = null,

    @Json(name = "feeDeduction")
    val feeDeduction: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "initiateTransfer")
    val initiateTransfer: kotlin.Boolean? = null,

    @Json(name = "interestPosting")
    val interestPosting: kotlin.Boolean? = null,

    @Json(name = "overdraftFee")
    val overdraftFee: kotlin.Boolean? = null,

    @Json(name = "overdraftInterest")
    val overdraftInterest: kotlin.Boolean? = null,

    @Json(name = "rejectTransfer")
    val rejectTransfer: kotlin.Boolean? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "withdrawTransfer")
    val withdrawTransfer: kotlin.Boolean? = null,

    @Json(name = "withdrawal")
    val withdrawal: kotlin.Boolean? = null,

    @Json(name = "withholdTax")
    val withholdTax: kotlin.Boolean? = null,

    @Json(name = "writtenoff")
    val writtenoff: kotlin.Boolean? = null

) {


}

