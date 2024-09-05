package org.openapitools.client.apis

import org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SavingsChargesApi {
    /**
     * Create a Savings account Charge
     * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param postSavingsAccountsSavingsAccountIdChargesRequest
     * @return [PostSavingsAccountsSavingsAccountIdChargesResponse]
     */
    @POST("v1/savingsaccounts/{savingsAccountId}/charges")
    suspend fun addSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Body postSavingsAccountsSavingsAccountIdChargesRequest: PostSavingsAccountsSavingsAccountIdChargesRequest
    ): PostSavingsAccountsSavingsAccountIdChargesResponse

    /**
     * Delete a Savings account Charge
     * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @DELETE("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun deleteSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long
    ): DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
     * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @param postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
     * @param command command (optional)
     * @return [PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @POST("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun payOrWaiveSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
        @Body postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest,
        @Query("command") command: String? = null
    ): PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [kotlin.collections.List<GetSavingsAccountsSavingsAccountIdChargesResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges")
    suspend fun retrieveAllSavingsAccountCharges(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): List<GetSavingsAccountsSavingsAccountIdChargesResponse>

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun retrieveSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long
    ): GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

    /**
     * Retrieve Savings Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @return [GetSavingsAccountsSavingsAccountIdChargesTemplateResponse]
     */
    @GET("v1/savingsaccounts/{savingsAccountId}/charges/template")
    suspend fun retrieveTemplate18(@Path("savingsAccountId") savingsAccountId: Long): GetSavingsAccountsSavingsAccountIdChargesTemplateResponse

    /**
     * Update a Savings account Charge
     * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param savingsAccountId savingsAccountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @param putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
     * @return [PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @PUT("v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    suspend fun updateSavingsAccountCharge(
        @Path("savingsAccountId") savingsAccountId: Long,
        @Path("savingsAccountChargeId") savingsAccountChargeId: Long,
        @Body putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
    ): PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

}
