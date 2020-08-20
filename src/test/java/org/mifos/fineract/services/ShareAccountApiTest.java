package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostAccountsTypeAccountIdRequest;
import org.mifos.fineract.models.PostAccountsTypeRequest;
import org.mifos.fineract.models.PutAccountsTypeAccountIdRequest;

import java.io.File;

/**
 * API tests for ShareAccountApi
 */
public class ShareAccountApiTest {

    private ShareAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ShareAccountApi.class);
    }

    /**
     * Submit new share application
     * <p>
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     */
    @Test
    public void createAccountTest() {
        String type = null;
        PostAccountsTypeRequest body = null;
        // PostAccountsTypeResponse response = api.createAccount(type, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getSharedAccountsTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getSharedAccountsTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     * <p>
     * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#shareaccounts
     */
    @Test
    public void handleCommandsTest() {
        String type = null;
        Long accountId = null;
        PostAccountsTypeAccountIdRequest body = null;
        String command = null;
        // PostAccountsTypeAccountIdResponse response = api.handleCommands(type, accountId, body, command);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postSharedAccountsTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSharedAccountsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a share application/account
     * <p>
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     */
    @Test
    public void retrieveAccountTest() {
        Long accountId = null;
        String type = null;
        // GetAccountsTypeAccountIdResponse response = api.retrieveAccount(accountId, type);

        // TODO: test validations
    }

    /**
     * List share applications/accounts
     * <p>
     * Lists share applications/accounts  Example Requests:  shareaccount
     */
    @Test
    public void retrieveAllAccountsTest() {
        String type = null;
        Integer offset = null;
        Integer limit = null;
        // GetAccountsTypeResponse response = api.retrieveAllAccounts(type, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve Share Account Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void templateTest() {
        String type = null;
        Long clientId = null;
        Long productId = null;
        // GetAccountsTypeTemplateResponse response = api.template(type, clientId, productId);

        // TODO: test validations
    }

    /**
     * Modify a share application
     * <p>
     * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void updateAccountTest() {
        String type = null;
        Long accountId = null;
        PutAccountsTypeAccountIdRequest body = null;
        // PutAccountsTypeAccountIdResponse response = api.updateAccount(type, accountId, body);

        // TODO: test validations
    }
}
