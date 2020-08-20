package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoansLoanIdScheduleRequest;

/**
 * API tests for LoanReschedulingApi
 */
public class LoanReschedulingApiTest {

    private LoanReschedulingApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoanReschedulingApi.class);
    }

    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * <p>
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     */
    @Test
    public void calculateLoanScheduleOrSubmitVariableScheduleTest() {
        Long loanId = null;
        PostLoansLoanIdScheduleRequest body = null;
        String command = null;
        // PostLoansLoanIdScheduleResponse response = api.calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command);

        // TODO: test validations
    }
}
