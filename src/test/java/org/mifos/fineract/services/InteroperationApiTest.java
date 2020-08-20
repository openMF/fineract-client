package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.InteropIdentifierRequestData;
import org.mifos.fineract.models.InteropQuoteRequestData;
import org.mifos.fineract.models.InteropTransactionRequestData;
import org.mifos.fineract.models.InteropTransferRequestData;

/**
 * API tests for InteroperationApi
 */
public class InteroperationApiTest {

    private InteroperationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InteroperationApi.class);
    }

    /**
     * Calculate Interoperation Quote
     */
    @Test
    public void createQuoteTest() {
        InteropQuoteRequestData body = null;
        // InteropQuoteResponseData response = api.createQuote(body);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Transaction Request
     */
    @Test
    public void createTransactionRequestTest() {
        InteropTransactionRequestData body = null;
        // InteropTransactionRequestResponseData response = api.createTransactionRequest(body);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Identifier registration
     */
    @Test
    public void deleteAccountIdentifierTest() {
        String idType = null;
        String idValue = null;
        InteropIdentifierRequestData body = null;
        // InteropIdentifierAccountResponseData response = api.deleteAccountIdentifier(idType, idValue, body);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Identifier registration
     */
    @Test
    public void deleteAccountIdentifier_0Test() {
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        InteropIdentifierRequestData body = null;
        // InteropIdentifierAccountResponseData response = api.deleteAccountIdentifier_0(idType, idValue, subIdOrType, body);

        // TODO: test validations
    }

    /**
     * Query Interoperation Account by secondary identifier
     */
    @Test
    public void getAccountByIdentifierTest() {
        String idType = null;
        String idValue = null;
        // InteropIdentifierAccountResponseData response = api.getAccountByIdentifier(idType, idValue);

        // TODO: test validations
    }

    /**
     * Query Interoperation Account by secondary identifier
     */
    @Test
    public void getAccountByIdentifier_0Test() {
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        // InteropIdentifierAccountResponseData response = api.getAccountByIdentifier_0(idType, idValue, subIdOrType);

        // TODO: test validations
    }

    /**
     * Query Interoperation Account details
     */
    @Test
    public void getAccountDetailsTest() {
        String accountId = null;
        // InteropAccountData response = api.getAccountDetails(accountId);

        // TODO: test validations
    }

    /**
     * Query Interoperation secondary identifiers by Account Id
     */
    @Test
    public void getAccountIdentifiersTest() {
        String accountId = null;
        // InteropIdentifiersResponseData response = api.getAccountIdentifiers(accountId);

        // TODO: test validations
    }

    /**
     * Query transactions by Account Id
     */
    @Test
    public void getAccountTransactionsTest() {
        String accountId = null;
        Boolean debit = null;
        Boolean credit = null;
        String fromBookingDateTime = null;
        String toBookingDateTime = null;
        // InteropTransactionsData response = api.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime);

        // TODO: test validations
    }

    /**
     * Query Interoperation Quote
     */
    @Test
    public void getQuoteTest() {
        String transactionCode = null;
        String quoteCode = null;
        // InteropQuoteResponseData response = api.getQuote(transactionCode, quoteCode);

        // TODO: test validations
    }

    /**
     * Query Interoperation Transaction Request
     */
    @Test
    public void getTransactionRequestTest() {
        String transactionCode = null;
        String requestCode = null;
        // InteropTransactionRequestResponseData response = api.getTransactionRequest(transactionCode, requestCode);

        // TODO: test validations
    }

    /**
     * Query Interoperation Transfer
     */
    @Test
    public void getTransferTest() {
        String transactionCode = null;
        String transferCode = null;
        // InteropTransferResponseData response = api.getTransfer(transactionCode, transferCode);

        // TODO: test validations
    }

    /**
     * Query Interoperation Health Request
     */
    @Test
    public void healthTest() {
        // api.health();

        // TODO: test validations
    }

    /**
     * Prepare Interoperation Transfer
     */
    @Test
    public void performTransferTest() {
        InteropTransferRequestData body = null;
        String action = null;
        // InteropTransferResponseData response = api.performTransfer(body, action);

        // TODO: test validations
    }

    /**
     * Interoperation Identifier registration
     */
    @Test
    public void registerAccountIdentifierTest() {
        String idType = null;
        String idValue = null;
        InteropIdentifierRequestData body = null;
        // InteropIdentifierAccountResponseData response = api.registerAccountIdentifier(idType, idValue, body);

        // TODO: test validations
    }

    /**
     * Interoperation Identifier registration
     */
    @Test
    public void registerAccountIdentifier_0Test() {
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        InteropIdentifierRequestData body = null;
        // InteropIdentifierAccountResponseData response = api.registerAccountIdentifier_0(idType, idValue, subIdOrType, body);

        // TODO: test validations
    }
}
