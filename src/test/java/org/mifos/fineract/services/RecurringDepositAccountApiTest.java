package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostRecurringDepositAccountsAccountIdRequest;
import org.mifos.fineract.models.PostRecurringDepositAccountsRequest;
import org.mifos.fineract.models.PutRecurringDepositAccountsAccountIdRequest;

import java.io.File;

/**
 * API tests for RecurringDepositAccountApi
 */
public class RecurringDepositAccountApiTest {

    private RecurringDepositAccountApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(RecurringDepositAccountApi.class);
    }

    /**
     *
     */
    @Test
    public void accountClosureTemplateTest() {
        Long accountId = null;
        String command = null;
        // String response = api.accountClosureTemplate(accountId, command);

        // TODO: test validations
    }

    /**
     * Delete a recurring deposit application
     * <p>
     * At present we support hard delete of recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
     */
    @Test
    public void deleteTest() {
        Long accountId = null;
        // DeleteRecurringDepositAccountsResponse response = api.delete(accountId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getRecurringDepositTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getRecurringDepositTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getRecurringDepositTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getRecurringDepositTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
     * <p>
     * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval recurring deposit application:  Will move &#39;approved&#39; recurring deposit application back to &#39;Submitted and pending approval&#39; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#39;active&#39; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#39;closed&#39; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#39;Premature Closed&#39; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#39;Post Interest on recurring Deposit Account&#39;
     */
    @Test
    public void handleCommandsTest() {
        Long accountId = null;
        PostRecurringDepositAccountsAccountIdRequest body = null;
        String command = null;
        // PostRecurringDepositAccountsAccountIdResponse response = api.handleCommands(accountId, body, command);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postRecurringDepositTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postRecurringDepositTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postRecurringDepositTransactionsTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postRecurringDepositTransactionsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Recurring deposit applications/accounts
     * <p>
     * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetRecurringDepositAccountsResponse> response = api.retrieveAll(paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a recurring deposit application/account
     * <p>
     * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOneTest() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetRecurringDepositAccountsAccountIdResponse response = api.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }

    /**
     * Submit new recurring deposit application
     * <p>
     * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
     */
    @Test
    public void submitApplicationTest() {
        PostRecurringDepositAccountsRequest body = null;
        // PostRecurringDepositAccountsResponse response = api.submitApplication(body);

        // TODO: test validations
    }

    /**
     * Retrieve recurring Deposit Account Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetRecurringDepositAccountsTemplateResponse response = api.template(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Modify a recurring deposit application
     * <p>
     * Recurring deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void updateTest() {
        Long accountId = null;
        PutRecurringDepositAccountsAccountIdRequest body = null;
        // PutRecurringDepositAccountsAccountIdResponse response = api.update(accountId, body);

        // TODO: test validations
    }
}
