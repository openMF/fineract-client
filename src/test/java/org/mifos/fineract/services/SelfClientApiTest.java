package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

import java.io.File;

/**
 * API tests for SelfClientApi
 */
public class SelfClientApiTest {

    private SelfClientApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfClientApi.class);
    }

    /**
     *
     */
    @Test
    public void addNewClientImageTest() {
        Long clientId = null;
        Long contentLength = null;
        File file = null;
        // String response = api.addNewClientImage(clientId, contentLength, file);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteClientImageTest() {
        Long clientId = null;
        // String response = api.deleteClientImage(clientId);

        // TODO: test validations
    }

    /**
     * List Clients associated to the user
     * <p>
     * The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAllTest() {
        String displayName = null;
        String firstName = null;
        String lastName = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetSelfClientsResponse response = api.retrieveAll(displayName, firstName, lastName, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * List Client Charges
     * <p>
     * The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     */
    @Test
    public void retrieveAllClientChargesTest() {
        Long clientId = null;
        String chargeStatus = null;
        Boolean pendingPayment = null;
        Integer limit = null;
        Integer offset = null;
        // GetSelfClientsClientIdChargesResponse response = api.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);

        // TODO: test validations
    }

    /**
     * List Client Transactions
     * <p>
     * The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     */
    @Test
    public void retrieveAllClientTransactionsTest() {
        Long clientId = null;
        Integer offset = null;
        Integer limit = null;
        // GetSelfClientsClientIdTransactionsResponse response = api.retrieveAllClientTransactions(clientId, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve client accounts overview
     * <p>
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     */
    @Test
    public void retrieveAssociatedAccountsTest() {
        Long clientId = null;
        // GetSelfClientsClientIdAccountsResponse response = api.retrieveAssociatedAccounts(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Charge
     * <p>
     * Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id
     */
    @Test
    public void retrieveClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        // GetSelfClientsClientIdChargesChargeIdResponse response = api.retrieveClientCharge(clientId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Transaction
     * <p>
     * Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName
     */
    @Test
    public void retrieveClientTransactionTest() {
        Long clientId = null;
        Long transactionId = null;
        // GetSelfClientsClientIdTransactionsTransactionIdResponse response = api.retrieveClientTransaction(clientId, transactionId);

        // TODO: test validations
    }

    /**
     * Retrieve Client Image
     * <p>
     * Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images
     */
    @Test
    public void retrieveImageTest() {
        Long clientId = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String output = null;
        // api.retrieveImage(clientId, maxWidth, maxHeight, output);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveObligeeDetailsTest() {
        Long clientId = null;
        // String response = api.retrieveObligeeDetails(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client
     * <p>
     * Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName
     */
    @Test
    public void retrieveOneTest() {
        Long clientId = null;
        // GetSelfClientsClientIdResponse response = api.retrieveOne(clientId);

        // TODO: test validations
    }
}
