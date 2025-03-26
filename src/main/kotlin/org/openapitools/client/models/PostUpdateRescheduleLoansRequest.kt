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
 * PostUpdateRescheduleLoansRequest
 *
 * @param approvedOnDate 
 * @param dateFormat 
 * @param locale 
 * @param rejectedOnDate 
 */


data class PostUpdateRescheduleLoansRequest (

    @Json(name = "approvedOnDate")
    val approvedOnDate: kotlin.String? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "rejectedOnDate")
    val rejectedOnDate: kotlin.String? = null

) {


}

