package org.openapitools.client.apis

import org.openapitools.client.models.GetClientsClientIdTransactionsResponse
import org.openapitools.client.models.GetClientsClientIdTransactionsTransactionIdResponse
import org.openapitools.client.models.PostClientsClientIdTransactionsTransactionIdResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientTransactionApi {
    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetClientsClientIdTransactionsResponse]
     */
    @GET("v1/clients/{clientId}/transactions")
    suspend fun retrieveAllClientTransactions(
        @Path("clientId") clientId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetClientsClientIdTransactionsResponse

    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions  clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param clientExternalId clientExternalId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetClientsClientIdTransactionsResponse]
     */
    @GET("v1/clients/external-id/{clientExternalId}/transactions")
    suspend fun retrieveAllClientTransactions1(
        @Path("clientExternalId") clientExternalId: String,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetClientsClientIdTransactionsResponse

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param transactionId transactionId
     * @return [GetClientsClientIdTransactionsTransactionIdResponse]
     */
    @GET("v1/clients/{clientId}/transactions/{transactionId}")
    suspend fun retrieveClientTransaction(
        @Path("clientId") clientId: Long,
        @Path("transactionId") transactionId: Long
    ): GetClientsClientIdTransactionsTransactionIdResponse

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/1/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   clients/1/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param transactionExternalId transactionExternalId
     * @return [GetClientsClientIdTransactionsTransactionIdResponse]
     */
    @GET("v1/clients/{clientId}/transactions/external-id/{transactionExternalId}")
    suspend fun retrieveClientTransaction1(
        @Path("clientId") clientId: Long,
        @Path("transactionExternalId") transactionExternalId: String
    ): GetClientsClientIdTransactionsTransactionIdResponse

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/1   clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/1?fields&#x3D;id,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientExternalId clientExternalId
     * @param transactionId transactionId
     * @return [GetClientsClientIdTransactionsTransactionIdResponse]
     */
    @GET("v1/clients/external-id/{clientExternalId}/transactions/{transactionId}")
    suspend fun retrieveClientTransaction2(
        @Path("clientExternalId") clientExternalId: String,
        @Path("transactionId") transactionId: Long
    ): GetClientsClientIdTransactionsTransactionIdResponse

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientExternalId clientExternalId
     * @param transactionExternalId transactionExternalId
     * @return [GetClientsClientIdTransactionsTransactionIdResponse]
     */
    @GET("v1/clients/external-id/{clientExternalId}/transactions/external-id/{transactionExternalId}")
    suspend fun retrieveClientTransaction3(
        @Path("clientExternalId") clientExternalId: String,
        @Path("transactionExternalId") transactionExternalId: String
    ): GetClientsClientIdTransactionsTransactionIdResponse

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param transactionId transactionId
     * @param command command (optional)
     * @return [PostClientsClientIdTransactionsTransactionIdResponse]
     */
    @POST("v1/clients/{clientId}/transactions/{transactionId}")
    suspend fun undoClientTransaction(
        @Path("clientId") clientId: Long,
        @Path("transactionId") transactionId: Long,
        @Query("command") command: String? = null
    ): PostClientsClientIdTransactionsTransactionIdResponse

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param transactionExternalId transactionExternalId
     * @param command command (optional)
     * @return [PostClientsClientIdTransactionsTransactionIdResponse]
     */
    @POST("v1/clients/{clientId}/transactions/external-id/{transactionExternalId}")
    suspend fun undoClientTransaction1(
        @Path("clientId") clientId: Long,
        @Path("transactionExternalId") transactionExternalId: String,
        @Query("command") command: String? = null
    ): PostClientsClientIdTransactionsTransactionIdResponse

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * Responses:
     *  - 200: OK
     *
     * @param clientExternalId clientExternalId
     * @param transactionId transactionId
     * @param command command (optional)
     * @return [PostClientsClientIdTransactionsTransactionIdResponse]
     */
    @POST("v1/clients/external-id/{clientExternalId}/transactions/{transactionId}")
    suspend fun undoClientTransaction2(
        @Path("clientExternalId") clientExternalId: String,
        @Path("transactionId") transactionId: Long,
        @Query("command") command: String? = null
    ): PostClientsClientIdTransactionsTransactionIdResponse

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     * Responses:
     *  - 200: OK
     *
     * @param clientExternalId clientExternalId
     * @param transactionExternalId transactionExternalId
     * @param command command (optional)
     * @return [PostClientsClientIdTransactionsTransactionIdResponse]
     */
    @POST("v1/clients/external-id/{clientExternalId}/transactions/external-id/{transactionExternalId}")
    suspend fun undoClientTransaction3(
        @Path("clientExternalId") clientExternalId: String,
        @Path("transactionExternalId") transactionExternalId: String,
        @Query("command") command: String? = null
    ): PostClientsClientIdTransactionsTransactionIdResponse

}
