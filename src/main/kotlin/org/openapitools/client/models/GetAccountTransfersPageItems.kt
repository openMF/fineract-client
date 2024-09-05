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

import org.openapitools.client.models.GetAccountTransfersFromAccountType
import org.openapitools.client.models.GetAccountTransfersFromClientOptions
import org.openapitools.client.models.GetAccountTransfersPageItemsCurrency
import org.openapitools.client.models.GetAccountTransfersPageItemsFromAccount
import org.openapitools.client.models.GetAccountTransfersPageItemsFromOffice
import org.openapitools.client.models.GetAccountTransfersPageItemsToAccountType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param currency 
 * @param fromAccount 
 * @param fromAccountType 
 * @param fromClient 
 * @param fromOffice 
 * @param id 
 * @param reversed 
 * @param toAccount 
 * @param toAccountType 
 * @param toClient 
 * @param toOffice 
 * @param transferAmount 
 * @param transferDate 
 * @param transferDescription 
 */


data class GetAccountTransfersPageItems (

    @Json(name = "currency")
    val currency: GetAccountTransfersPageItemsCurrency? = null,

    @Json(name = "fromAccount")
    val fromAccount: GetAccountTransfersPageItemsFromAccount? = null,

    @Json(name = "fromAccountType")
    val fromAccountType: GetAccountTransfersFromAccountType? = null,

    @Json(name = "fromClient")
    val fromClient: GetAccountTransfersFromClientOptions? = null,

    @Json(name = "fromOffice")
    val fromOffice: GetAccountTransfersPageItemsFromOffice? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "reversed")
    val reversed: kotlin.Boolean? = null,

    @Json(name = "toAccount")
    val toAccount: GetAccountTransfersPageItemsFromAccount? = null,

    @Json(name = "toAccountType")
    val toAccountType: GetAccountTransfersPageItemsToAccountType? = null,

    @Json(name = "toClient")
    val toClient: GetAccountTransfersFromClientOptions? = null,

    @Json(name = "toOffice")
    val toOffice: GetAccountTransfersPageItemsFromOffice? = null,

    @Json(name = "transferAmount")
    val transferAmount: kotlin.Float? = null,

    @Json(name = "transferDate")
    val transferDate: java.time.LocalDate? = null,

    @Json(name = "transferDescription")
    val transferDescription: kotlin.String? = null

) {


}

