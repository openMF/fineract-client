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

import org.openapitools.client.models.PutAccountNumberFormatschangesSwagger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutAccountNumberFormatsResponse
 *
 * @param changes 
 * @param resourceId 
 */


data class PutAccountNumberFormatsResponse (

    @Json(name = "changes")
    val changes: PutAccountNumberFormatschangesSwagger? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}

