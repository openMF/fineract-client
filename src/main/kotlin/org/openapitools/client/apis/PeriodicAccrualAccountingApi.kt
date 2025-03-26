package org.openapitools.client.apis

import org.openapitools.client.models.PostRunaccrualsRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface PeriodicAccrualAccountingApi {
    /**
     * Executes Periodic Accrual Accounting
     * Mandatory Fields  tillDate
     * Responses:
     *  - 200: OK
     *
     * @param postRunaccrualsRequest
     * @return [Unit]
     */
    @POST("v1/runaccruals")
    suspend fun executePeriodicAccrualAccounting(@Body postRunaccrualsRequest: PostRunaccrualsRequest)

}
