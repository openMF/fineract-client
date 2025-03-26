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
 * @param active 
 * @param closed 
 * @param closedObligationsMet 
 * @param closedRescheduled 
 * @param closedWrittenOff 
 * @param code 
 * @param description 
 * @param id 
 * @param overpaid 
 * @param pendingApproval 
 * @param waitingForDisbursal 
 */


data class GetSelfClientsLoanAccountsStatus (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "closedObligationsMet")
    val closedObligationsMet: kotlin.Boolean? = null,

    @Json(name = "closedRescheduled")
    val closedRescheduled: kotlin.Boolean? = null,

    @Json(name = "closedWrittenOff")
    val closedWrittenOff: kotlin.Boolean? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "overpaid")
    val overpaid: kotlin.Boolean? = null,

    @Json(name = "pendingApproval")
    val pendingApproval: kotlin.Boolean? = null,

    @Json(name = "waitingForDisbursal")
    val waitingForDisbursal: kotlin.Boolean? = null

) {


}

