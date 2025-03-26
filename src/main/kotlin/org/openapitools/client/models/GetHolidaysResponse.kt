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

import org.openapitools.client.models.EnumOptionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetHolidaysResponse
 *
 * @param fromDate 
 * @param id 
 * @param name 
 * @param officeId 
 * @param repaymentsRescheduledTo 
 * @param status 
 * @param toDate 
 */


data class GetHolidaysResponse (

    @Json(name = "fromDate")
    val fromDate: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "repaymentsRescheduledTo")
    val repaymentsRescheduledTo: java.time.LocalDate? = null,

    @Json(name = "status")
    val status: EnumOptionData? = null,

    @Json(name = "toDate")
    val toDate: java.time.LocalDate? = null

) {


}

