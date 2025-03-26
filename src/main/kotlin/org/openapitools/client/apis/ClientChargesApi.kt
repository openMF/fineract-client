package org.openapitools.client.apis

import org.openapitools.client.models.DeleteClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.GetClientsChargesPageItems
import org.openapitools.client.models.GetClientsClientIdChargesResponse
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdRequest
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.PostClientsClientIdChargesRequest
import org.openapitools.client.models.PostClientsClientIdChargesResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientChargesApi {
    /**
     * Add Client Charge
     *  This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param postClientsClientIdChargesRequest
     * @return [PostClientsClientIdChargesResponse]
     */
    @POST("v1/clients/{clientId}/charges")
    suspend fun applyClientCharge(
        @Path("clientId") clientId: Long,
        @Body postClientsClientIdChargesRequest: PostClientsClientIdChargesRequest
    ): PostClientsClientIdChargesResponse

    /**
     * Delete a Client Charge
     * Deletes a Client Charge on which no transactions have taken place (either payments or waivers).
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeId chargeId
     * @return [DeleteClientsClientIdChargesChargeIdResponse]
     */
    @DELETE("v1/clients/{clientId}/charges/{chargeId}")
    suspend fun deleteClientCharge(
        @Path("clientId") clientId: Long,
        @Path("chargeId") chargeId: Long
    ): DeleteClientsClientIdChargesChargeIdResponse

    /**
     * Pay a Client Charge | Waive a Client Charge
     * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeId chargeId
     * @param postClientsClientIdChargesChargeIdRequest
     * @param command command (optional)
     * @return [PostClientsClientIdChargesChargeIdResponse]
     */
    @POST("v1/clients/{clientId}/charges/{chargeId}")
    suspend fun payOrWaiveClientCharge(
        @Path("clientId") clientId: Long,
        @Path("chargeId") chargeId: Long,
        @Body postClientsClientIdChargesChargeIdRequest: PostClientsClientIdChargesChargeIdRequest,
        @Query("command") command: String? = null
    ): PostClientsClientIdChargesChargeIdResponse

    /**
     * List Client Charges
     * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @param pendingPayment pendingPayment (optional)
     * @param limit limit (optional)
     * @param offset offset (optional)
     * @return [GetClientsClientIdChargesResponse]
     */
    @GET("v1/clients/{clientId}/charges")
    suspend fun retrieveAllClientCharges(
        @Path("clientId") clientId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all",
        @Query("pendingPayment") pendingPayment: Boolean? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null
    ): GetClientsClientIdChargesResponse

    /**
     * Retrieve a Client Charge
     * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param chargeId chargeId
     * @return [GetClientsChargesPageItems]
     */
    @GET("v1/clients/{clientId}/charges/{chargeId}")
    suspend fun retrieveClientCharge(
        @Path("clientId") clientId: Long,
        @Path("chargeId") chargeId: Long
    ): GetClientsChargesPageItems

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/charges/template")
    suspend fun retrieveTemplate4(@Path("clientId") clientId: Long): String

}
