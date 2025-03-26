package org.openapitools.client.apis

import com.squareup.moshi.Json
import org.openapitools.client.models.PagedLocalRequestAdvancedQueryRequest
import org.openapitools.client.models.PostSavingsAccountBulkReversalTransactionsRequest
import org.openapitools.client.models.PostSavingsAccountTransactionsRequest
import org.openapitools.client.models.PostSavingsAccountTransactionsResponse
import org.openapitools.client.models.SavingsAccountTransactionsSearchResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SavingsAccountTransactionsApi {
    /**
     * Undo/Reverse/Modify/Release Amount transaction API
     * Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount
     * Responses:
     *  - 200: OK
     *
     * @param savingsId
     * @param transactionId
     * @param postSavingsAccountBulkReversalTransactionsRequest
     * @param command  (optional)
     * @return [kotlin.collections.List<PostSavingsAccountBulkReversalTransactionsRequest]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun adjustTransaction1(
        @Path("savingsId") savingsId: Long,
        @Path("transactionId") transactionId: Long,
        @Body postSavingsAccountBulkReversalTransactionsRequest: PostSavingsAccountBulkReversalTransactionsRequest,
        @Query("command") command: String? = null
    ): List<PostSavingsAccountBulkReversalTransactionsRequest>

    /**
     * Advanced search Savings Account Transactions
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savingsId
     * @param pagedLocalRequestAdvancedQueryRequest  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/query")
    suspend fun advancedQuery1(
        @Path("savingsId") savingsId: Long,
        @Body pagedLocalRequestAdvancedQueryRequest: PagedLocalRequestAdvancedQueryRequest? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @param transactionId
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun retrieveOne24(
        @Path("savingsId") savingsId: Long,
        @Path("transactionId") transactionId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/template")
    suspend fun retrieveTemplate19(@Path("savingsId") savingsId: Long): String


    /**
     * enum for parameter sortOrder
     */
    enum class SortOrderSearchTransactions(val value: String) {
        @Json(name = "ASC")
        ASC("ASC"),
        @Json(name = "DESC")
        DESC("DESC")
    }

    /**
     * Search Savings Account Transactions
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savings account id
     * @param fromDate minimum value date (inclusive) (optional)
     * @param toDate maximum value date (inclusive) (optional)
     * @param fromSubmittedDate minimum booking date (inclusive) (optional)
     * @param toSubmittedDate maximum booking date (inclusive) (optional)
     * @param fromAmount minimum transaction amount (inclusive) (optional)
     * @param toAmount maximum transaction amount (inclusive) (optional)
     * @param types transaction types (optional)
     * @param credit credit (optional)
     * @param debit debit (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy sort properties (optional)
     * @param sortOrder sort direction (optional)
     * @param locale locale (optional)
     * @param dateFormat date format (optional)
     * @return [SavingsAccountTransactionsSearchResponse]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/search")
    suspend fun searchTransactions(
        @Path("savingsId") savingsId: Long,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
        @Query("fromSubmittedDate") fromSubmittedDate: String? = null,
        @Query("toSubmittedDate") toSubmittedDate: String? = null,
        @Query("fromAmount") fromAmount: java.math.BigDecimal? = null,
        @Query("toAmount") toAmount: java.math.BigDecimal? = null,
        @Query("types") types: String? = null,
        @Query("credit") credit: Boolean? = null,
        @Query("debit") debit: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: SortOrderSearchTransactions? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): SavingsAccountTransactionsSearchResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId
     * @param postSavingsAccountTransactionsRequest
     * @param command  (optional)
     * @return [PostSavingsAccountTransactionsResponse]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions")
    suspend fun transaction2(
        @Path("savingsId") savingsId: Long,
        @Body postSavingsAccountTransactionsRequest: PostSavingsAccountTransactionsRequest,
        @Query("command") command: String? = null
    ): PostSavingsAccountTransactionsResponse

}
