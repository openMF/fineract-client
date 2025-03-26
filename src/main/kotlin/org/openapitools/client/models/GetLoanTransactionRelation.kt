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
 * @param amount 
 * @param fromLoanTransaction 
 * @param paymentType 
 * @param relationType 
 * @param toLoanCharge 
 * @param toLoanTransaction 
 */


data class GetLoanTransactionRelation (

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "fromLoanTransaction")
    val fromLoanTransaction: kotlin.Long? = null,

    @Json(name = "paymentType")
    val paymentType: kotlin.String? = null,

    @Json(name = "relationType")
    val relationType: kotlin.String? = null,

    @Json(name = "toLoanCharge")
    val toLoanCharge: kotlin.Long? = null,

    @Json(name = "toLoanTransaction")
    val toLoanTransaction: kotlin.Long? = null

) {


}

