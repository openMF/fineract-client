package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for OfficetransactionsApi
 */
public class OfficeTransactionsApiTest {

    private OfficeTransactionsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(OfficeTransactionsApi.class);
    }

    /**
     *
     */
    @Test
    public void deleteTest() {
        Long transactionId = null;
        // String response = api.delete(transactionId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void newOfficeTransactionDetailsTest() {
        // String response = api.newOfficeTransactionDetails();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveOfficeTransactionsTest() {
        // String response = api.retrieveOfficeTransactions();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void transferMoneyFromTest() {
        String body = null;
        // String response = api.transferMoneyFrom(body);

        // TODO: test validations
    }
}
