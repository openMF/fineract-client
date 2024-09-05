package org.openapitools.client.apis

import org.openapitools.client.models.PostLoansLoanIdScheduleResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface LoanReschedulingApi {
    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param body
     * @param command command (optional)
     * @return [PostLoansLoanIdScheduleResponse]
     */
    @POST("v1/loans/{loanId}/schedule")
    suspend fun calculateLoanScheduleOrSubmitVariableSchedule(
        @Path("loanId") loanId: Long,
        @Body body: Any,
        @Query("command") command: String? = null
    ): PostLoansLoanIdScheduleResponse

}
