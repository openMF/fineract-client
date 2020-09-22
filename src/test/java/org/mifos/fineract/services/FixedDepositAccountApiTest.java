package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostFixedDepositAccountsAccountIdRequest;
import org.mifos.fineract.models.PostFixedDepositAccountsRequest;
import org.mifos.fineract.models.PutFixedDepositAccountsAccountIdRequest;

import java.io.File;

/**
 * API tests for FixedDepositAccountApi
 */
public class FixedDepositAccountApiTest {

    private FixedDepositAccountApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(FixedDepositAccountApi.class);
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
     * Delete a fixed deposit application
     *
     * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     */
    @Test
    public void deleteTest() {
        Long accountId = null;
        // DeleteFixedDepositAccountsAccountIdResponse response = api.delete(accountId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getFixedDepositTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getFixedDepositTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void getFixedDepositTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getFixedDepositTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }
    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     *
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     */
    @Test
    public void handleCommandsTest() {
        Long accountId = null;
        PostFixedDepositAccountsAccountIdRequest body = null;
        String command = null;
        // PostFixedDepositAccountsAccountIdResponse response = api.handleCommands(accountId, body, command);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void postFixedDepositTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postFixedDepositTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void postFixedDepositTransactionTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postFixedDepositTransactionTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    /**
     * List Fixed deposit applications/accounts
     *
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetFixedDepositAccountsResponse> response = api.retrieveAll(paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    /**
     * Retrieve a fixed deposit application/account
     *
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOneTest() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetFixedDepositAccountsAccountIdResponse response = api.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }
    /**
     * Submit new fixed deposit application
     *
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     */
    @Test
    public void submitApplicationTest() {
        PostFixedDepositAccountsRequest body = null;
        // PostFixedDepositAccountsResponse response = api.submitApplication(body);

        // TODO: test validations
    }
    /**
     * Retrieve Fixed Deposit Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetFixedDepositAccountsTemplateResponse response = api.template(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }
    /**
     * Modify a fixed deposit application
     *
     * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void updateTest() {
        Long accountId = null;
        PutFixedDepositAccountsAccountIdRequest body = null;
        // PutFixedDepositAccountsAccountIdResponse response = api.update(accountId, body);

        // TODO: test validations
    }
}
