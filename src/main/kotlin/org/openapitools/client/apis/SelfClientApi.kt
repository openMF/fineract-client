package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.GetSelfClientsClientIdAccountsResponse
import org.openapitools.client.models.GetSelfClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.GetSelfClientsClientIdChargesResponse
import org.openapitools.client.models.GetSelfClientsClientIdResponse
import org.openapitools.client.models.GetSelfClientsClientIdTransactionsResponse
import org.openapitools.client.models.GetSelfClientsClientIdTransactionsTransactionIdResponse
import org.openapitools.client.models.GetSelfClientsResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface SelfClientApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @param contentLength  (optional)
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/self/clients/{clientId}/images")
    suspend fun addNewClientImage2(
        @Path("clientId") clientId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @DELETE("v1/self/clients/{clientId}/images")
    suspend fun deleteClientImage1(@Path("clientId") clientId: Long): String

    /**
     * List Clients associated to the user
     * The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     * Responses:
     *  - 200: OK
     *
     * @param displayName displayName (optional)
     * @param firstName firstName (optional)
     * @param lastName lastName (optional)
     * @param offset offset (optional)
     * @param status status (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetSelfClientsResponse]
     */
    @GET("v1/self/clients")
    suspend fun retrieveAll36(
        @Query("displayName") displayName: String? = null,
        @Query("firstName") firstName: String? = null,
        @Query("lastName") lastName: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("status") status: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): GetSelfClientsResponse

    /**
     * List Client Charges
     * The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @param pendingPayment pendingPayment (optional)
     * @param limit limit (optional)
     * @param offset offset (optional)
     * @return [GetSelfClientsClientIdChargesResponse]
     */
    @GET("v1/self/clients/{clientId}/charges")
    suspend fun retrieveAllClientCharges1(
        @Path("clientId") clientId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all",
        @Query("pendingPayment") pendingPayment: Boolean? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null
    ): GetSelfClientsClientIdChargesResponse

    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetSelfClientsClientIdTransactionsResponse]
     */
    @GET("v1/self/clients/{clientId}/transactions")
    suspend fun retrieveAllClientTransactions2(
        @Path("clientId") clientId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetSelfClientsClientIdTransactionsResponse

    /**
     * Retrieve client accounts overview
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [GetSelfClientsClientIdAccountsResponse]
     */
    @GET("v1/self/clients/{clientId}/accounts")
    suspend fun retrieveAssociatedAccounts2(@Path("clientId") clientId: Long): GetSelfClientsClientIdAccountsResponse

    /**
     * Retrieve a Client Charge
     * Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeId chargeId
     * @return [GetSelfClientsClientIdChargesChargeIdResponse]
     */
    @GET("v1/self/clients/{clientId}/charges/{chargeId}")
    suspend fun retrieveClientCharge1(
        @Path("clientId") clientId: Long,
        @Path("chargeId") chargeId: Long
    ): GetSelfClientsClientIdChargesChargeIdResponse

    /**
     * Retrieve a Client Transaction
     * Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param transactionId transactionId
     * @return [GetSelfClientsClientIdTransactionsTransactionIdResponse]
     */
    @GET("v1/self/clients/{clientId}/transactions/{transactionId}")
    suspend fun retrieveClientTransaction4(
        @Path("clientId") clientId: Long,
        @Path("transactionId") transactionId: Long
    ): GetSelfClientsClientIdTransactionsTransactionIdResponse

    /**
     * Retrieve Client Image
     * Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param maxWidth  (optional)
     * @param maxHeight  (optional)
     * @param output  (optional)
     * @return [Unit]
     */
    @GET("v1/self/clients/{clientId}/images")
    suspend fun retrieveImage1(
        @Path("clientId") clientId: Long,
        @Query("maxWidth") maxWidth: Int? = null,
        @Query("maxHeight") maxHeight: Int? = null,
        @Query("output") output: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/self/clients/{clientId}/obligeedetails")
    suspend fun retrieveObligeeDetails2(@Path("clientId") clientId: Long): String

    /**
     * Retrieve a Client
     * Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [GetSelfClientsClientIdResponse]
     */
    @GET("v1/self/clients/{clientId}")
    suspend fun retrieveOne28(@Path("clientId") clientId: Long): GetSelfClientsClientIdResponse

}
