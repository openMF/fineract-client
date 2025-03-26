package org.openapitools.client.apis

import org.openapitools.client.models.DeleteAccountNumberFormatsResponse
import org.openapitools.client.models.GetAccountNumberFormatsIdResponse
import org.openapitools.client.models.GetAccountNumberFormatsResponseTemplate
import org.openapitools.client.models.PostAccountNumberFormatsRequest
import org.openapitools.client.models.PostAccountNumberFormatsResponse
import org.openapitools.client.models.PutAccountNumberFormatsRequest
import org.openapitools.client.models.PutAccountNumberFormatsResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface AccountNumberFormatApi {
    /**
     * Create an Account number format
     * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
     * Responses:
     *  - 200: OK
     *
     * @param postAccountNumberFormatsRequest  (optional)
     * @return [PostAccountNumberFormatsResponse]
     */
    @POST("v1/accountnumberformats")
    suspend fun create(@Body postAccountNumberFormatsRequest: PostAccountNumberFormatsRequest? = null): PostAccountNumberFormatsResponse

    /**
     * Delete an Account number format
     * Note: Account numbers created while this format was active would remain unchanged.
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @return [DeleteAccountNumberFormatsResponse]
     */
    @DELETE("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun delete(@Path("accountNumberFormatId") accountNumberFormatId: Long): DeleteAccountNumberFormatsResponse

    /**
     * List Account number formats
     * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetAccountNumberFormatsIdResponse>]
     */
    @GET("v1/accountnumberformats")
    suspend fun retrieveAll3(): List<GetAccountNumberFormatsIdResponse>

    /**
     * Retrieve an Account number format
     * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @return [GetAccountNumberFormatsIdResponse]
     */
    @GET("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun retrieveOne(@Path("accountNumberFormatId") accountNumberFormatId: Long): GetAccountNumberFormatsIdResponse

    /**
     * Retrieve Account number format Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetAccountNumberFormatsResponseTemplate]
     */
    @GET("v1/accountnumberformats/template")
    suspend fun retrieveTemplate2(): GetAccountNumberFormatsResponseTemplate

    /**
     * Update an Account number format
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountNumberFormatId accountNumberFormatId
     * @param putAccountNumberFormatsRequest
     * @return [PutAccountNumberFormatsResponse]
     */
    @PUT("v1/accountnumberformats/{accountNumberFormatId}")
    suspend fun update1(
        @Path("accountNumberFormatId") accountNumberFormatId: Long,
        @Body putAccountNumberFormatsRequest: PutAccountNumberFormatsRequest
    ): PutAccountNumberFormatsResponse

}
