package org.openapitools.client.apis

import org.openapitools.client.models.DeleteLoansLoanIdChargesChargeIdResponse
import org.openapitools.client.models.GetLoansLoanIdChargesChargeIdResponse
import org.openapitools.client.models.GetLoansLoanIdChargesTemplateResponse
import org.openapitools.client.models.PostLoansLoanIdChargesChargeIdRequest
import org.openapitools.client.models.PostLoansLoanIdChargesChargeIdResponse
import org.openapitools.client.models.PostLoansLoanIdChargesRequest
import org.openapitools.client.models.PostLoansLoanIdChargesResponse
import org.openapitools.client.models.PutLoansLoanIdChargesChargeIdRequest
import org.openapitools.client.models.PutLoansLoanIdChargesChargeIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface LoanChargesApi {
    /**
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeId loanChargeId
     * @return [DeleteLoansLoanIdChargesChargeIdResponse]
     */
    @DELETE("v1/loans/{loanId}/charges/{loanChargeId}")
    suspend fun deleteLoanCharge(
        @Path("loanId") loanId: Long,
        @Path("loanChargeId") loanChargeId: Long
    ): DeleteLoansLoanIdChargesChargeIdResponse

    /**
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeExternalId loanChargeExternalId
     * @return [DeleteLoansLoanIdChargesChargeIdResponse]
     */
    @DELETE("v1/loans/{loanId}/charges/external-id/{loanChargeExternalId}")
    suspend fun deleteLoanCharge1(
        @Path("loanId") loanId: Long,
        @Path("loanChargeExternalId") loanChargeExternalId: String
    ): DeleteLoansLoanIdChargesChargeIdResponse

    /**
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeId loanChargeId
     * @return [DeleteLoansLoanIdChargesChargeIdResponse]
     */
    @DELETE("v1/loans/external-id/{loanExternalId}/charges/{loanChargeId}")
    suspend fun deleteLoanCharge2(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeId") loanChargeId: Long
    ): DeleteLoansLoanIdChargesChargeIdResponse

    /**
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeExternalId loanChargeExternalId
     * @return [DeleteLoansLoanIdChargesChargeIdResponse]
     */
    @DELETE("v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId}")
    suspend fun deleteLoanCharge3(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeExternalId") loanChargeExternalId: String
    ): DeleteLoansLoanIdChargesChargeIdResponse

    /**
     * Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay)
     * Creates a Loan Charge | Pay a Loan Charge
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdChargesRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesResponse]
     */
    @POST("v1/loans/{loanId}/charges")
    suspend fun executeLoanCharge(
        @Path("loanId") loanId: Long,
        @Body postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesResponse

    /**
     * Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay)
     * Creates a Loan Charge | Pay a Loan Charge
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansLoanIdChargesRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/charges")
    suspend fun executeLoanCharge1(
        @Path("loanExternalId") loanExternalId: String,
        @Body postLoansLoanIdChargesRequest: PostLoansLoanIdChargesRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesResponse

    /**
     * Pay / Waive / Adjustment for Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeId loanChargeId
     * @param postLoansLoanIdChargesChargeIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesChargeIdResponse]
     */
    @POST("v1/loans/{loanId}/charges/{loanChargeId}")
    suspend fun executeLoanCharge2(
        @Path("loanId") loanId: Long,
        @Path("loanChargeId") loanChargeId: Long,
        @Body postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesChargeIdResponse

    /**
     * Pay / Waive / Adjustment for Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeExternalId loanChargeExternalId
     * @param postLoansLoanIdChargesChargeIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesChargeIdResponse]
     */
    @POST("v1/loans/{loanId}/charges/external-id/{loanChargeExternalId}")
    suspend fun executeLoanCharge3(
        @Path("loanId") loanId: Long,
        @Path("loanChargeExternalId") loanChargeExternalId: String,
        @Body postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesChargeIdResponse

    /**
     * Pay / Waive / Adjustment for Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeId loanChargeId
     * @param postLoansLoanIdChargesChargeIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesChargeIdResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/charges/{loanChargeId}")
    suspend fun executeLoanCharge4(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeId") loanChargeId: Long,
        @Body postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesChargeIdResponse

    /**
     * Pay / Waive / Adjustment for Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeExternalId loanChargeExternalId
     * @param postLoansLoanIdChargesChargeIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdChargesChargeIdResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId}")
    suspend fun executeLoanCharge5(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeExternalId") loanChargeExternalId: String,
        @Body postLoansLoanIdChargesChargeIdRequest: PostLoansLoanIdChargesChargeIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdChargesChargeIdResponse

    /**
     * List Loan Charges
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/{loanId}/charges")
    suspend fun retrieveAllLoanCharges(@Path("loanId") loanId: Long): List<GetLoansLoanIdChargesChargeIdResponse>

    /**
     * List Loan Charges
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [kotlin.collections.List<GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/charges")
    suspend fun retrieveAllLoanCharges1(@Path("loanExternalId") loanExternalId: String): List<GetLoansLoanIdChargesChargeIdResponse>

    /**
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan ID and Loan Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeId loanChargeId
     * @return [GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/{loanId}/charges/{loanChargeId}")
    suspend fun retrieveLoanCharge(
        @Path("loanId") loanId: Long,
        @Path("loanChargeId") loanChargeId: Long
    ): GetLoansLoanIdChargesChargeIdResponse

    /**
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan ID and Loan Charge External IDExample Requests:  /loans/1/charges/1   /loans/1/charges/external-id/1?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeExternalId loanChargeExternalId
     * @return [GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/{loanId}/charges/external-id/{loanChargeExternalId}")
    suspend fun retrieveLoanCharge1(
        @Path("loanId") loanId: Long,
        @Path("loanChargeExternalId") loanChargeExternalId: String
    ): GetLoansLoanIdChargesChargeIdResponse

    /**
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan external ID and Loan Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeId loanChargeId
     * @return [GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/charges/{loanChargeId}")
    suspend fun retrieveLoanCharge2(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeId") loanChargeId: Long
    ): GetLoansLoanIdChargesChargeIdResponse

    /**
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan External ID and Loan Charge External IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeExternalId loanChargeExternalId
     * @return [GetLoansLoanIdChargesChargeIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId}")
    suspend fun retrieveLoanCharge3(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeExternalId") loanChargeExternalId: String
    ): GetLoansLoanIdChargesChargeIdResponse

    /**
     * Retrieve Loan Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [GetLoansLoanIdChargesTemplateResponse]
     */
    @GET("v1/loans/{loanId}/charges/template")
    suspend fun retrieveTemplate8(@Path("loanId") loanId: Long): GetLoansLoanIdChargesTemplateResponse

    /**
     * Retrieve Loan Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [GetLoansLoanIdChargesTemplateResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/charges/template")
    suspend fun retrieveTemplate9(@Path("loanExternalId") loanExternalId: String): GetLoansLoanIdChargesTemplateResponse

    /**
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeId loanChargeId
     * @param putLoansLoanIdChargesChargeIdRequest
     * @return [PutLoansLoanIdChargesChargeIdResponse]
     */
    @PUT("v1/loans/{loanId}/charges/{loanChargeId}")
    suspend fun updateLoanCharge(
        @Path("loanId") loanId: Long,
        @Path("loanChargeId") loanChargeId: Long,
        @Body putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest
    ): PutLoansLoanIdChargesChargeIdResponse

    /**
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param loanChargeExternalId loanChargeExternalId
     * @param putLoansLoanIdChargesChargeIdRequest
     * @return [PutLoansLoanIdChargesChargeIdResponse]
     */
    @PUT("v1/loans/{loanId}/charges/external-id/{loanChargeExternalId}")
    suspend fun updateLoanCharge1(
        @Path("loanId") loanId: Long,
        @Path("loanChargeExternalId") loanChargeExternalId: String,
        @Body putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest
    ): PutLoansLoanIdChargesChargeIdResponse

    /**
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeId loanChargeId
     * @param putLoansLoanIdChargesChargeIdRequest
     * @return [PutLoansLoanIdChargesChargeIdResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}/charges/{loanChargeId}")
    suspend fun updateLoanCharge2(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeId") loanChargeId: Long,
        @Body putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest
    ): PutLoansLoanIdChargesChargeIdResponse

    /**
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param loanChargeExternalId loanChargeExternalId
     * @param putLoansLoanIdChargesChargeIdRequest
     * @return [PutLoansLoanIdChargesChargeIdResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId}")
    suspend fun updateLoanCharge3(
        @Path("loanExternalId") loanExternalId: String,
        @Path("loanChargeExternalId") loanChargeExternalId: String,
        @Body putLoansLoanIdChargesChargeIdRequest: PutLoansLoanIdChargesChargeIdRequest
    ): PutLoansLoanIdChargesChargeIdResponse

}
