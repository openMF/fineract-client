package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path


interface LoanDisbursementDetailsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/disbursements/editDisbursements")
    suspend fun addAndDeleteDisbursementDetail(
        @Path("loanId") loanId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param disbursementId
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/disbursements/{disbursementId}")
    suspend fun retriveDetail(
        @Path("loanId") loanId: Long,
        @Path("disbursementId") disbursementId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param disbursementId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/disbursements/{disbursementId}")
    suspend fun updateDisbursementDate(
        @Path("loanId") loanId: Long,
        @Path("disbursementId") disbursementId: Long,
        @Body body: String? = null
    ): String

}
