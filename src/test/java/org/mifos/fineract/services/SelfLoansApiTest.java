package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSelfLoansLoanIdRequest;
import org.mifos.fineract.models.PostSelfLoansRequest;
import org.mifos.fineract.models.PutSelfLoansLoanIdRequest;

/**
 * API tests for SelfLoansApi
 */
public class SelfLoansApiTest {

    private SelfLoansApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfLoansApi.class);
    }

    /**
     * Calculate Loan Repayment Schedule | Submit a new Loan Application
     * <p>
     * Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;
     */
    @Test
    public void calculateLoanScheduleOrSubmitLoanApplicationTest() {
        PostSelfLoansRequest body = null;
        String command = null;
        // PostSelfLoansResponse response = api.calculateLoanScheduleOrSubmitLoanApplication(body, command);

        // TODO: test validations
    }

    /**
     * Update a Loan Application
     * <p>
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     */
    @Test
    public void modifyLoanApplicationTest() {
        Long loanId = null;
        PutSelfLoansLoanIdRequest body = null;
        // PutSelfLoansLoanIdResponse response = api.modifyLoanApplication(loanId, body);

        // TODO: test validations
    }

    /**
     * List Loan Charges
     * <p>
     * Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllLoanChargesTest() {
        Long loanId = null;
        // List<GetSelfLoansLoanIdChargesResponse> response = api.retrieveAllLoanCharges(loanId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveGuarantorDetailsTest() {
        Long loanId = null;
        // String response = api.retrieveGuarantorDetails(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan
     * <p>
     * Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     */
    @Test
    public void retrieveLoanTest() {
        Long loanId = null;
        // GetSelfLoansLoanIdResponse response = api.retrieveLoan(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Charge
     * <p>
     * Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        // GetSelfLoansLoanIdChargesResponse response = api.retrieveLoanCharge(loanId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Transaction Details
     * <p>
     * Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3
     */
    @Test
    public void retrieveTransactionTest() {
        Long loanId = null;
        Long transactionId = null;
        // GetSelfLoansLoanIdTransactionsTransactionIdResponse response = api.retrieveTransaction(loanId, transactionId);

        // TODO: test validations
    }

    /**
     * Applicant Withdraws from Loan Application
     * <p>
     * Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate
     */
    @Test
    public void stateTransitionsTest() {
        Long loanId = null;
        PostSelfLoansLoanIdRequest body = null;
        String command = null;
        // PostSelfLoansLoanIdResponse response = api.stateTransitions(loanId, body, command);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Details Template
     * <p>
     * Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long productId = null;
        String templateType = null;
        // GetSelfLoansTemplateResponse response = api.template(clientId, productId, templateType);

        // TODO: test validations
    }
}
