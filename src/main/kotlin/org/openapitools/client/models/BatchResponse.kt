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

/**
 *
 *
 * @param body
 * @param headers
 * @param requestId
 * @param statusCode
 */


data class BatchResponse(

    @Json(name = "body")
    val body: kotlin.String? = null,

    @Json(name = "headers")
    val headers: kotlin.collections.Set<Header>? = null,

    @Json(name = "requestId")
    val requestId: kotlin.Long? = null,

    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null

)

