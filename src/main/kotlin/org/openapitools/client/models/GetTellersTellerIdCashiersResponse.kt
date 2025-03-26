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

import org.openapitools.client.models.CashierData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetTellersTellerIdCashiersResponse
 *
 * @param cashiers 
 * @param officeId 
 * @param officeName 
 * @param tellerId 
 * @param tellerName 
 */


data class GetTellersTellerIdCashiersResponse (

    @Json(name = "cashiers")
    val cashiers: kotlin.collections.List<CashierData>? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "tellerId")
    val tellerId: kotlin.Long? = null,

    @Json(name = "tellerName")
    val tellerName: kotlin.String? = null

) {


}

