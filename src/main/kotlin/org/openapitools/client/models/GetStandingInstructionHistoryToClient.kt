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
 * @param displayName 
 * @param id 
 * @param officeId 
 * @param officeName 
 */


data class GetStandingInstructionHistoryToClient (

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null

) {


}

