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
 * DeleteUsersUserIdResponse
 *
 * @param changes 
 * @param officeId 
 * @param resourceId 
 */


data class DeleteUsersUserIdResponse (

    @Json(name = "changes")
    val changes: kotlin.Any? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}

