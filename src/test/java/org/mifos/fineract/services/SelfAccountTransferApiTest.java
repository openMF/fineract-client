package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfAccountTransferApi
 */
public class SelfAccountTransferApiTest {

    private SelfAccountTransferApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfAccountTransferApi.class);
    }

    /**
     * Create new Transfer
     * <p>
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/
     */
    @Test
    public void createTest() {
        String type = null;
        String body = null;
        // List<PostNewTransferResponse> response = api.create(type, body);

        // TODO: test validations
    }

    /**
     * Retrieve Account Transfer Template
     * <p>
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template
     */
    @Test
    public void templateTest() {
        String type = null;
        // List<GetAccountTransferTemplateResponse> response = api.template(type);

        // TODO: test validations
    }
}
