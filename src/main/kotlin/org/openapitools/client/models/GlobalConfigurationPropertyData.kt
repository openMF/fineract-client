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
 * @param dateValue 
 * @param description 
 * @param enabled 
 * @param id 
 * @param name 
 * @param stringValue 
 * @param trapDoor 
 * @param `value` 
 */


data class GlobalConfigurationPropertyData (

    @Json(name = "dateValue")
    val dateValue: java.time.LocalDate? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "stringValue")
    val stringValue: kotlin.String? = null,

    @Json(name = "trapDoor")
    val trapDoor: kotlin.Boolean? = null,

    @Json(name = "value")
    val `value`: kotlin.Long? = null

) {


}

