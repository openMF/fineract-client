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
 * @param id 
 * @param isSystemDefined 
 * @param name 
 */


data class PaymentType (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "isSystemDefined")
    val isSystemDefined: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

) {


}

