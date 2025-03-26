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

import org.openapitools.client.models.PutProductsChanges

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutProductsTypeProductIdResponse
 *
 * @param changes 
 * @param resourceId 
 */


data class PutProductsTypeProductIdResponse (

    @Json(name = "changes")
    val changes: PutProductsChanges? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}

