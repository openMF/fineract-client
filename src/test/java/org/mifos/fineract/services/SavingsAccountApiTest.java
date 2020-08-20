package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSavingsAccountsAccountIdRequest;
import org.mifos.fineract.models.PostSavingsAccountsRequest;
import org.mifos.fineract.models.PutSavingsAccountsAccountIdRequest;

import java.io.File;

/**
 * API tests for SavingsAccountApi
 */
public class SavingsAccountApiTest {

    private SavingsAccountApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SavingsAccountApi.class);
    }

    /**
     * Delete a savings application
     * <p>
     * At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.
     */
    @Test
    public void deleteTest() {
        Long accountId = null;
        // DeleteSavingsAccountsAccountIdResponse response = api.delete(accountId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getSavingsTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getSavingsTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getSavingsTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getSavingsTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
     * <p>
     * Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean value, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;
     */
    @Test
    public void handleCommandsTest() {
        Long accountId = null;
        PostSavingsAccountsAccountIdRequest body = null;
        String command = null;
        // PostSavingsAccountsAccountIdResponse response = api.handleCommands(accountId, body, command);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postSavingsTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSavingsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postSavingsTransactionTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSavingsTransactionTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List savings applications/accounts
     * <p>
     * Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetSavingsAccountsResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a savings application/account
     * <p>
     * Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOneTest() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetSavingsAccountsAccountIdResponse response = api.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }

    /**
     * Submit new savings application
     * <p>
     * Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables
     */
    @Test
    public void submitApplicationTest() {
        PostSavingsAccountsRequest body = null;
        // PostSavingsAccountsResponse response = api.submitApplication(body);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Account Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetSavingsAccountsTemplateResponse response = api.template(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Modify a savings application | Modify savings account withhold tax applicability
     * <p>
     * Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;
     */
    @Test
    public void updateTest() {
        Long accountId = null;
        PutSavingsAccountsAccountIdRequest body = null;
        String command = null;
        // PutSavingsAccountsAccountIdResponse response = api.update(accountId, body, command);

        // TODO: test validations
    }
}
