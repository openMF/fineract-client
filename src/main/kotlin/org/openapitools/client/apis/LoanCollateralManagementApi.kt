package org.openapitools.client.apis

import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path


interface LoanCollateralManagementApi {
    /**
     * Delete Loan Collateral
     * Delete Loan Collateral
     * Responses:
     *  - 0: default response
     *
     * @param loanId loanId
     * @param id loan collateral id
     * @return [kotlin.String]
     */
    @DELETE("v1/loan-collateral-management/{id}")
    suspend fun deleteLoanCollateral(
        @Path("loanId") loanId: Long,
        @Path("id") id: Long
    ): String

    /**
     * Get Loan Collateral Details
     * Get Loan Collateral Details
     * Responses:
     *  - 0: default response
     *
     * @param collateralId collateralId
     * @return [kotlin.String]
     */
    @GET("v1/loan-collateral-management/{collateralId}")
    suspend fun getLoanCollateral(@Path("collateralId") collateralId: Long): String

}
