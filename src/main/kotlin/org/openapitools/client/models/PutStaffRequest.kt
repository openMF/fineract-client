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
 * PutStaffRequest
 *
 * @param externalId 
 * @param isLoanOfficer 
 */


data class PutStaffRequest (

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "isLoanOfficer")
    val isLoanOfficer: kotlin.Boolean? = null

) {


}

