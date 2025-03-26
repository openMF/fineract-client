package org.openapitools.client.apis

import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdChargesResponse
import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse
import org.openapitools.client.models.GetSelfSavingsAccountsResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SelfSavingsAccountApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param accountId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/self/savingsaccounts/{accountId}")
    suspend fun modifySavingsAccountApplication(
        @Path("accountId") accountId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [kotlin.collections.List<GetSelfSavingsAccountsAccountIdChargesResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}/charges")
    suspend fun retrieveAllSavingsAccountCharges1(
        @Path("accountId") accountId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): List<GetSelfSavingsAccountsAccountIdChargesResponse>

    /**
     * Retrieve a savings account
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetSelfSavingsAccountsResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}")
    suspend fun retrieveSavings(
        @Path("accountId") accountId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): GetSelfSavingsAccountsResponse

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}")
    suspend fun retrieveSavingsAccountCharge1(
        @Path("accountId") accountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long
    ): GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * Retrieve Savings Account Transaction
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param transactionId transactionId
     * @return [GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}/transactions/{transactionId}")
    suspend fun retrieveSavingsTransaction(
        @Path("accountId") accountId: Long,
        @Path("transactionId") transactionId: Long
    ): GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/savingsaccounts")
    suspend fun submitSavingsAccountApplication(
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @param productId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsaccounts/template")
    suspend fun template18(
        @Query("clientId") clientId: Long? = null,
        @Query("productId") productId: Long? = null
    ): String

}
