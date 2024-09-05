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
 * @param code 
 * @param indexed Defaults to false
 * @param mandatory 
 * @param name 
 * @param type 
 * @param unique 
 */


data class PutDataTablesRequestAddColumns (

    @Json(name = "code")
    val code: kotlin.String? = null,

    /* Defaults to false */
    @Json(name = "indexed")
    val indexed: kotlin.Boolean? = null,

    @Json(name = "mandatory")
    val mandatory: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "unique")
    val unique: kotlin.Boolean? = null

) {


}

