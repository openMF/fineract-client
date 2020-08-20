package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoansLoanIdRequest;
import org.mifos.fineract.models.PostLoansRequest;
import org.mifos.fineract.models.PutLoansLoanIdRequest;

import java.io.File;

/**
 * API tests for LoansApi
 */
public class LoansApiTest {

    private LoansApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoansApi.class);
    }

    /**
     * Calculate loan repayment schedule | Submit a new Loan Application
     * <p>
     * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
     */
    @Test
    public void calculateLoanScheduleOrSubmitLoanApplicationTest() {
        PostLoansRequest body = null;
        String command = null;
        // PostLoansResponse response = api.calculateLoanScheduleOrSubmitLoanApplication(body, command);

        // TODO: test validations
    }

    /**
     * Delete a Loan Application
     * <p>
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     */
    @Test
    public void deleteLoanApplicationTest() {
        Long loanId = null;
        // DeleteLoansLoanIdResponse response = api.deleteLoanApplication(loanId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getLoanRepaymentTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getLoanRepaymentTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getLoansTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getLoansTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * Modify a loan application
     * <p>
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     */
    @Test
    public void modifyLoanApplicationTest() {
        Long loanId = null;
        PutLoansLoanIdRequest body = null;
        // PutLoansLoanIdResponse response = api.modifyLoanApplication(loanId, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postLoanRepaymentTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postLoanRepaymentTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postLoanTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postLoanTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Loans
     * <p>
     * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String accountNo = null;
        // GetLoansResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountNo);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveApprovalTemplateTest() {
        Long loanId = null;
        String templateType = null;
        // String response = api.retrieveApprovalTemplate(loanId, templateType);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan
     * <p>
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     */
    @Test
    public void retrieveLoanTest() {
        Long loanId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetLoansLoanIdResponse response = api.retrieveLoan(loanId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * <p>
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     */
    @Test
    public void stateTransitionsTest() {
        Long loanId = null;
        PostLoansLoanIdRequest body = null;
        String command = null;
        // PostLoansLoanIdResponse response = api.stateTransitions(loanId, body, command);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Details Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        String templateType = null;
        Boolean staffInSelectedOfficeOnly = null;
        Boolean activeOnly = null;
        // GetLoansTemplateResponse response = api.template(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly);

        // TODO: test validations
    }
}
