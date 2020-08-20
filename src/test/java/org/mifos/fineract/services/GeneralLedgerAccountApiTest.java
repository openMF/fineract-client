package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostGLAccountsRequest;
import org.mifos.fineract.models.PutGLAccountsRequest;

import java.io.File;

/**
 * API tests for GeneralLedgerAccountApi
 */
public class GeneralLedgerAccountApiTest {

    private GeneralLedgerAccountApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(GeneralLedgerAccountApi.class);
    }

    /**
     * Create a General Ledger Account
     * <p>
     * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
     */
    @Test
    public void createGLAccountTest() {
        PostGLAccountsRequest body = null;
        // PostGLAccountsResponse response = api.createGLAccount(body);

        // TODO: test validations
    }

    /**
     * Delete an accounting closure
     * <p>
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     */
    @Test
    public void deleteGLAccountTest() {
        Long glAccountId = null;
        // DeleteGLAccountsRequest response = api.deleteGLAccount(glAccountId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getGlAccountsTemplateTest() {
        String dateFormat = null;
        // api.getGlAccountsTemplate(dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postGlAccountsTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postGlAccountsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a General Ledger Account
     * <p>
     * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
     */
    @Test
    public void retreiveAccountTest() {
        Long glAccountId = null;
        Boolean fetchRunningBalance = null;
        // GetGLAccountsResponse response = api.retreiveAccount(glAccountId, fetchRunningBalance);

        // TODO: test validations
    }

    /**
     * List General Ledger Accounts
     * <p>
     * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
     */
    @Test
    public void retrieveAllAccountsTest() {
        Integer type = null;
        String searchParam = null;
        Integer usage = null;
        Boolean manualEntriesAllowed = null;
        Boolean disabled = null;
        Boolean fetchRunningBalance = null;
        // List<GetGLAccountsResponse> response = api.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);

        // TODO: test validations
    }

    /**
     * Retrieve GL Accounts Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
     */
    @Test
    public void retrieveNewAccountDetailsTest() {
        Integer type = null;
        // GetGLAccountsTemplateResponse response = api.retrieveNewAccountDetails(type);

        // TODO: test validations
    }

    /**
     * Update an Accounting closure
     * <p>
     * Once an accounting closure is created, only the comments associated with it may be edited
     */
    @Test
    public void updateGLAccountTest() {
        Long glAccountId = null;
        PutGLAccountsRequest body = null;
        // PutGLAccountsResponse response = api.updateGLAccount(glAccountId, body);

        // TODO: test validations
    }
}
