package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoansLoanIdChargesChargeIdRequest;
import org.mifos.fineract.models.PostLoansLoanIdChargesRequest;
import org.mifos.fineract.models.PutLoansLoanIdChargesChargeIdRequest;

/**
 * API tests for LoanChargesApi
 */
public class LoanChargesApiTest {

    private LoanChargesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoanChargesApi.class);
    }

    /**
     * Delete a Loan Charge
     *
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     */
    @Test
    public void deleteLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        // DeleteLoansLoanIdChargesChargeIdResponse response = api.deleteLoanCharge(loanId, chargeId);

        // TODO: test validations
    }
    /**
     * Pay Loan Charge
     *
     * Loan Charge will be paid if the loan is linked with a savings account
     */
    @Test
    public void executeLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        PostLoansLoanIdChargesChargeIdRequest body = null;
        String command = null;
        // PostLoansLoanIdChargesChargeIdResponse response = api.executeLoanCharge(loanId, chargeId, body, command);

        // TODO: test validations
    }
    /**
     * Create a Loan Charge
     *
     * It Creates a Loan Charge
     */
    @Test
    public void executeLoanCharge_0Test() {
        Long loanId = null;
        PostLoansLoanIdChargesRequest body = null;
        String command = null;
        // PostLoansLoanIdChargesResponse response = api.executeLoanCharge_0(loanId, body, command);

        // TODO: test validations
    }
    /**
     * List Loan Charges
     *
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllLoanChargesTest() {
        Long loanId = null;
        // List<GetLoansLoanIdChargesChargeIdResponse> response = api.retrieveAllLoanCharges(loanId);

        // TODO: test validations
    }
    /**
     * Retrieve a Loan Charge
     *
     * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        // GetLoansLoanIdChargesChargeIdResponse response = api.retrieveLoanCharge(loanId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Charges Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/charges/template
     */
    @Test
    public void retrieveTemplateTest() {
        Long loanId = null;
        // GetLoansLoanIdChargesTemplateResponse response = api.retrieveTemplate(loanId);

        // TODO: test validations
    }
    /**
     * Update a Loan Charge
     *
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     */
    @Test
    public void updateLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        PutLoansLoanIdChargesChargeIdRequest body = null;
        // PutLoansLoanIdChargesChargeIdResponse response = api.updateLoanCharge(loanId, chargeId, body);

        // TODO: test validations
    }
}
