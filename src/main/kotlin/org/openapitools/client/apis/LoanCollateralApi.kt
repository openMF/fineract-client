package org.openapitools.client.apis

import org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse
import org.openapitools.client.models.GetLoansLoanIdCollateralsResponse
import org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse
import org.openapitools.client.models.PostLoansLoanIdCollateralsRequest
import org.openapitools.client.models.PostLoansLoanIdCollateralsResponse
import org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse
import org.openapitools.client.models.PutLoansLoandIdCollateralsCollateralIdRequest
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface LoanCollateralApi {
    /**
     * Create a Collateral
     * Note: Currently, Collaterals may be added only before a Loan is approved
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdCollateralsRequest
     * @return [PostLoansLoanIdCollateralsResponse]
     */
    @POST("v1/loans/{loanId}/collaterals")
    suspend fun createCollateral(
        @Path("loanId") loanId: Long,
        @Body postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest
    ): PostLoansLoanIdCollateralsResponse

    /**
     * Remove a Collateral
     * Note: A collateral can only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @return [DeleteLoansLoanIdCollateralsCollateralIdResponse]
     */
    @DELETE("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun deleteCollateral(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long
    ): DeleteLoansLoanIdCollateralsCollateralIdResponse

    /**
     * Retrieve Collateral Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [GetLoansLoanIdCollateralsTemplateResponse]
     */
    @GET("v1/loans/{loanId}/collaterals/template")
    suspend fun newCollateralTemplate(@Path("loanId") loanId: Long): GetLoansLoanIdCollateralsTemplateResponse

    /**
     * List Loan Collaterals
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetLoansLoanIdCollateralsResponse]
     */
    @GET("v1/loans/{loanId}/collaterals")
    suspend fun retrieveCollateralDetails(@Path("loanId") loanId: Long): List<GetLoansLoanIdCollateralsResponse>

    /**
     * Retrieve a Collateral
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @return [GetLoansLoanIdCollateralsResponse]
     */
    @GET("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun retrieveCollateralDetails1(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long
    ): GetLoansLoanIdCollateralsResponse

    /**
     * Update a Collateral
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @param putLoansLoandIdCollateralsCollateralIdRequest
     * @return [PutLoansLoanIdCollateralsCollateralIdResponse]
     */
    @PUT("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun updateCollateral(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long,
        @Body putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest
    ): PutLoansLoanIdCollateralsCollateralIdResponse

}
