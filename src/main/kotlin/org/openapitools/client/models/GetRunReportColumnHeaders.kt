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
 * @param columnName 
 * @param columnType 
 * @param columnValues 
 * @param isColumnNullable 
 * @param isColumnPrimaryKey 
 */


data class GetRunReportColumnHeaders (

    @Json(name = "columnName")
    val columnName: kotlin.String? = null,

    @Json(name = "columnType")
    val columnType: kotlin.String? = null,

    @Json(name = "columnValues")
    val columnValues: kotlin.String? = null,

    @Json(name = "isColumnNullable")
    val isColumnNullable: kotlin.Boolean? = null,

    @Json(name = "isColumnPrimaryKey")
    val isColumnPrimaryKey: kotlin.Boolean? = null

) {


}

