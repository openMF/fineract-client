package org.openapitools.client.apis

import org.openapitools.client.models.GetLoanAccountLockResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LoanAccountLockApi {
    /**
     * List locked loan accounts
     * Returns the locked loan IDs
     * Responses:
     *  - 200: OK
     *
     * @param page  (optional)
     * @param limit  (optional)
     * @return [GetLoanAccountLockResponse]
     */
    @GET("v1/loans/locked")
    suspend fun retrieveLockedAccounts(
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetLoanAccountLockResponse

}
