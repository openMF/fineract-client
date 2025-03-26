package org.openapitools.client.apis

import org.openapitools.client.models.DeleteTellersTellerIdCashiersCashierIdResponse
import org.openapitools.client.models.GetTellersResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersCashierIdResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersResponse
import org.openapitools.client.models.GetTellersTellerIdCashiersTemplateResponse
import org.openapitools.client.models.PostTellersRequest
import org.openapitools.client.models.PostTellersResponse
import org.openapitools.client.models.PostTellersTellerIdCashiersCashierIdAllocateRequest
import org.openapitools.client.models.PostTellersTellerIdCashiersCashierIdAllocateResponse
import org.openapitools.client.models.PostTellersTellerIdCashiersCashierIdSettleRequest
import org.openapitools.client.models.PostTellersTellerIdCashiersCashierIdSettleResponse
import org.openapitools.client.models.PostTellersTellerIdCashiersRequest
import org.openapitools.client.models.PostTellersTellerIdCashiersResponse
import org.openapitools.client.models.PutTellersRequest
import org.openapitools.client.models.PutTellersResponse
import org.openapitools.client.models.PutTellersTellerIdCashiersCashierIdRequest
import org.openapitools.client.models.PutTellersTellerIdCashiersCashierIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface TellerCashManagementApi {
    /**
     * Allocate Cash To Cashier
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @param postTellersTellerIdCashiersCashierIdAllocateRequest
     * @return [PostTellersTellerIdCashiersCashierIdAllocateResponse]
     */
    @POST("v1/tellers/{tellerId}/cashiers/{cashierId}/allocate")
    suspend fun allocateCashToCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long,
        @Body postTellersTellerIdCashiersCashierIdAllocateRequest: PostTellersTellerIdCashiersCashierIdAllocateRequest
    ): PostTellersTellerIdCashiersCashierIdAllocateResponse

    /**
     * Create Cashiers
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param postTellersTellerIdCashiersRequest
     * @return [PostTellersTellerIdCashiersResponse]
     */
    @POST("v1/tellers/{tellerId}/cashiers")
    suspend fun createCashier(
        @Path("tellerId") tellerId: Long,
        @Body postTellersTellerIdCashiersRequest: PostTellersTellerIdCashiersRequest
    ): PostTellersTellerIdCashiersResponse

    /**
     * Create teller
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     * Responses:
     *  - 200: OK
     *
     * @param postTellersRequest
     * @return [PostTellersResponse]
     */
    @POST("v1/tellers")
    suspend fun createTeller(@Body postTellersRequest: PostTellersRequest): PostTellersResponse

    /**
     * Delete Cashier
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @return [DeleteTellersTellerIdCashiersCashierIdResponse]
     */
    @DELETE("v1/tellers/{tellerId}/cashiers/{cashierId}")
    suspend fun deleteCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long
    ): DeleteTellersTellerIdCashiersCashierIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param tellerId tellerId
     * @return [kotlin.String]
     */
    @DELETE("v1/tellers/{tellerId}")
    suspend fun deleteTeller(@Path("tellerId") tellerId: Long): String

    /**
     * Retrieve a cashier
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @return [GetTellersTellerIdCashiersCashierIdResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers/{cashierId}")
    suspend fun findCashierData(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long
    ): GetTellersTellerIdCashiersCashierIdResponse

    /**
     * Retrieve tellers
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @return [GetTellersResponse]
     */
    @GET("v1/tellers/{tellerId}")
    suspend fun findTeller(@Path("tellerId") tellerId: Long): GetTellersResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param tellerId tellerId
     * @param transactionId transactionId
     * @return [kotlin.String]
     */
    @GET("v1/tellers/{tellerId}/transactions/{transactionId}")
    suspend fun findTransactionData(
        @Path("tellerId") tellerId: Long,
        @Path("transactionId") transactionId: Long
    ): String

    /**
     * List Cashiers
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param fromdate fromdate (optional)
     * @param todate todate (optional)
     * @return [GetTellersTellerIdCashiersResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers")
    suspend fun getCashierData1(
        @Path("tellerId") tellerId: Long,
        @Query("fromdate") fromdate: String? = null,
        @Query("todate") todate: String? = null
    ): GetTellersTellerIdCashiersResponse

    /**
     * Find Cashiers
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @return [GetTellersTellerIdCashiersTemplateResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers/template")
    suspend fun getCashierTemplate(@Path("tellerId") tellerId: Long): GetTellersTellerIdCashiersTemplateResponse

    /**
     * Retrieve Cashier Transaction Template
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @return [GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers/{cashierId}/transactions/template")
    suspend fun getCashierTxnTemplate(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long
    ): GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param tellerId tellerId
     * @param cashierId cashierId (optional)
     * @param dateRange dateRange (optional)
     * @return [kotlin.String]
     */
    @GET("v1/tellers/{tellerId}/journals")
    suspend fun getJournalData(
        @Path("tellerId") tellerId: Long,
        @Query("cashierId") cashierId: Long? = null,
        @Query("dateRange") dateRange: String? = null
    ): String

    /**
     * List all tellers
     * Retrieves list tellers
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @return [kotlin.collections.List<GetTellersResponse]
     */
    @GET("v1/tellers")
    suspend fun getTellerData(@Query("officeId") officeId: Long? = null): List<GetTellersResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param tellerId tellerId
     * @param dateRange dateRange (optional)
     * @return [kotlin.String]
     */
    @GET("v1/tellers/{tellerId}/transactions")
    suspend fun getTransactionData(
        @Path("tellerId") tellerId: Long,
        @Query("dateRange") dateRange: String? = null
    ): String

    /**
     * Retrieve Cashier Transaction
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @param currencyCode currencyCode (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers/{cashierId}/transactions")
    suspend fun getTransactionsForCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long,
        @Query("currencyCode") currencyCode: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse>

    /**
     * Transactions Wtih Summary For Cashier
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @param currencyCode currencyCode (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse]
     */
    @GET("v1/tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions")
    suspend fun getTransactionsWtihSummaryForCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long,
        @Query("currencyCode") currencyCode: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse

    /**
     * Settle Cash From Cashier
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @param postTellersTellerIdCashiersCashierIdSettleRequest
     * @return [PostTellersTellerIdCashiersCashierIdSettleResponse]
     */
    @POST("v1/tellers/{tellerId}/cashiers/{cashierId}/settle")
    suspend fun settleCashFromCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long,
        @Body postTellersTellerIdCashiersCashierIdSettleRequest: PostTellersTellerIdCashiersCashierIdSettleRequest
    ): PostTellersTellerIdCashiersCashierIdSettleResponse

    /**
     * Update Cashier
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param cashierId cashierId
     * @param putTellersTellerIdCashiersCashierIdRequest
     * @return [PutTellersTellerIdCashiersCashierIdResponse]
     */
    @PUT("v1/tellers/{tellerId}/cashiers/{cashierId}")
    suspend fun updateCashier(
        @Path("tellerId") tellerId: Long,
        @Path("cashierId") cashierId: Long,
        @Body putTellersTellerIdCashiersCashierIdRequest: PutTellersTellerIdCashiersCashierIdRequest
    ): PutTellersTellerIdCashiersCashierIdResponse

    /**
     * Update teller
     *
     * Responses:
     *  - 200: OK
     *
     * @param tellerId tellerId
     * @param putTellersRequest
     * @return [PutTellersResponse]
     */
    @PUT("v1/tellers/{tellerId}")
    suspend fun updateTeller(
        @Path("tellerId") tellerId: Long,
        @Body putTellersRequest: PutTellersRequest
    ): PutTellersResponse

}
