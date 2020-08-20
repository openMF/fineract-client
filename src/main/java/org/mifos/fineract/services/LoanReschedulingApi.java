package org.mifos.fineract.services;

import org.mifos.fineract.models.PostLoansLoanIdScheduleRequest;
import org.mifos.fineract.models.PostLoansLoanIdScheduleResponse;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LoanReschedulingApi {
    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     *
     * @param loanId  loanId (required)
     * @param body    body (required)
     * @param command command (optional)
     * @return Call&lt;PostLoansLoanIdScheduleResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/schedule")
    Call<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableSchedule(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdScheduleRequest body, @retrofit2.http.Query("command") String command
    );

}
