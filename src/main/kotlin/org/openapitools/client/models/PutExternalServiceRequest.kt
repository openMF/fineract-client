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
 * PutExternalServiceRequest
 *
 * @param password 
 * @param username 
 */


data class PutExternalServiceRequest (

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "username")
    val username: kotlin.String? = null

) {


}

