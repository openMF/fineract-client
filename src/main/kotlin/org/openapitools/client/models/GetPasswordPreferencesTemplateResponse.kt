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
 * GetPasswordPreferencesTemplateResponse
 *
 * @param active 
 * @param description 
 * @param id 
 * @param key 
 */


data class GetPasswordPreferencesTemplateResponse (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "key")
    val key: kotlin.String? = null

) {


}

