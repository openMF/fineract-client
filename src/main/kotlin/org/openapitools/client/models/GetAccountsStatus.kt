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
 * @param approved 
 * @param closed 
 * @param code 
 * @param description 
 * @param id 
 * @param rejected 
 * @param submittedAndPendingApproval 
 */


data class GetAccountsStatus (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "approved")
    val approved: kotlin.Boolean? = null,

    @Json(name = "closed")
    val closed: kotlin.Boolean? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "rejected")
    val rejected: kotlin.Boolean? = null,

    @Json(name = "submittedAndPendingApproval")
    val submittedAndPendingApproval: kotlin.Boolean? = null

) {


}

