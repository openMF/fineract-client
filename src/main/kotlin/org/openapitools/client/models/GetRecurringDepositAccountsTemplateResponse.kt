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

import org.openapitools.client.models.GetRecurringProductOptions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetRecurringDepositAccountsTemplateResponse
 *
 * @param clientId 
 * @param clientName 
 * @param productOptions 
 */


data class GetRecurringDepositAccountsTemplateResponse (

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "clientName")
    val clientName: kotlin.String? = null,

    @Json(name = "productOptions")
    val productOptions: kotlin.collections.Set<GetRecurringProductOptions>? = null

) {


}

