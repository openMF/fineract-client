package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface DepositAccountOnHoldFundTransactionsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @param guarantorFundingId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/onholdtransactions")
    suspend fun retrieveAll28(
        @Path("savingsId") savingsId: Long,
        @Query("guarantorFundingId") guarantorFundingId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): String

}
