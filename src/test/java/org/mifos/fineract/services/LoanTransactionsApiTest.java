package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoansLoanIdTransactionsRequest;
import org.mifos.fineract.models.PostLoansLoanIdTransactionsTransactionIdRequest;

/**
 * API tests for LoanTransactionsApi
 */
public class LoanTransactionsApiTest {

    private LoanTransactionsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoanTransactionsApi.class);
    }

    /**
     * Adjust a Transaction
     * <p>
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     */
    @Test
    public void adjustLoanTransactionTest() {
        Long loanId = null;
        Long transactionId = null;
        PostLoansLoanIdTransactionsTransactionIdRequest body = null;
        // PostLoansLoanIdTransactionsTransactionIdResponse response = api.adjustLoanTransaction(loanId, transactionId, body);

        // TODO: test validations
    }

    /**
     * Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction
     * <p>
     * Make Recovery Payment:  This API allows collecting recovery payments for written-off loans
     */
    @Test
    public void executeLoanTransactionTest() {
        Long loanId = null;
        PostLoansLoanIdTransactionsRequest body = null;
        String command = null;
        // PostLoansLoanIdTransactionsResponse response = api.executeLoanTransaction(loanId, body, command);

        // TODO: test validations
    }

    /**
     * Retrieve a Transaction Details
     * <p>
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
     */
    @Test
    public void retrieveTransactionTest() {
        Long loanId = null;
        Long transactionId = null;
        // GetLoansLoanIdTransactionsTransactionIdResponse response = api.retrieveTransaction(loanId, transactionId);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Transaction Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  loans/1/transactions/template?command&#x3D;repayment
     */
    @Test
    public void retrieveTransactionTemplateTest() {
        Long loanId = null;
        String command = null;
        String dateFormat = null;
        String transactionDate = null;
        String locale = null;
        // GetLoansLoanIdTransactionsTemplateResponse response = api.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale);

        // TODO: test validations
    }
}
