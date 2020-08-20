package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfShareAccountsApi
 */
public class SelfShareAccountsApiTest {

    private SelfShareAccountsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfShareAccountsApi.class);
    }

    /**
     * Submit new share application
     * <p>
     * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
     */
    @Test
    public void createAccountTest() {
        String body = null;
        // List<PostNewShareApplicationResponse> response = api.createAccount(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveShareAccountTest() {
        Long accountId = null;
        // String response = api.retrieveShareAccount(accountId);

        // TODO: test validations
    }

    /**
     * Retrieve Share Account Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long productId = null;
        // List<GetShareAccountsClientIdProductIdResponse> response = api.template(clientId, productId);

        // TODO: test validations
    }
}
