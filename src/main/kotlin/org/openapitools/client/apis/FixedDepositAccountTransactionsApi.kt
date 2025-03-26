package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface FixedDepositAccountTransactionsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param transactionId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun adjustTransaction(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Path("transactionId") transactionId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param transactionId
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun retrieveOne18(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Path("transactionId") transactionId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
    suspend fun retrieveTemplate14(@Path("fixedDepositAccountId") fixedDepositAccountId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions")
    suspend fun transaction(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

}
