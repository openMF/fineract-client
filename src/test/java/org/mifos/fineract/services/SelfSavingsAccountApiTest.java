package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for SelfSavingsAccountApi
 */
public class SelfSavingsAccountApiTest {

    private SelfSavingsAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfSavingsAccountApi.class);
    }

    /**
     *
     */
    @Test
    public void modifySavingsAccountApplicationTest() {
        Long accountId = null;
        String command = null;
        String body = null;
        // String response = api.modifySavingsAccountApplication(accountId, command, body);

        // TODO: test validations
    }

    /**
     * List Savings Charges
     * <p>
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllSavingsAccountChargesTest() {
        Long accountId = null;
        String chargeStatus = null;
        // List<GetSelfSavingsAccountsAccountIdChargesResponse> response = api.retrieveAllSavingsAccountCharges(accountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a savings account
     * <p>
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     */
    @Test
    public void retrieveSavingsTest() {
        Long accountId = null;
        String chargeStatus = null;
        // GetSelfSavingsAccountsResponse response = api.retrieveSavings(accountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a Savings account Charge
     * <p>
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveSavingsAccountChargeTest() {
        Long accountId = null;
        Long savingsAccountChargeId = null;
        // GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse response = api.retrieveSavingsAccountCharge(accountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Account Transaction
     * <p>
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     */
    @Test
    public void retrieveSavingsTransactionTest() {
        Long accountId = null;
        Long transactionId = null;
        // GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse response = api.retrieveSavingsTransaction(accountId, transactionId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void submitSavingsAccountApplicationTest() {
        String command = null;
        String body = null;
        // String response = api.submitSavingsAccountApplication(command, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void templateTest() {
        Long clientId = null;
        Long productId = null;
        String body = null;
        // String response = api.template(clientId, productId, body);

        // TODO: test validations
    }
}
