package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.*;

/**
 * API tests for TellerCashManagementApi
 */
public class TellerCashManagementApiTest {

    private TellerCashManagementApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TellerCashManagementApi.class);
    }

    /**
     * Allocate Cash To Cashier
     * <p>
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     */
    @Test
    public void allocateCashToCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        PostTellersTellerIdCashiersCashierIdAllocateRequest body = null;
        // PostTellersTellerIdCashiersCashierIdAllocateResponse response = api.allocateCashToCashier(tellerId, cashierId, body);

        // TODO: test validations
    }

    /**
     * Create Cashiers
     * <p>
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     */
    @Test
    public void createCashierTest() {
        Long tellerId = null;
        PostTellersTellerIdCashiersRequest body = null;
        // PostTellersTellerIdCashiersResponse response = api.createCashier(tellerId, body);

        // TODO: test validations
    }

    /**
     * Create teller
     * <p>
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     */
    @Test
    public void createTellerTest() {
        PostTellersRequest body = null;
        // PostTellersResponse response = api.createTeller(body);

        // TODO: test validations
    }

    /**
     * Delete Cashier
     */
    @Test
    public void deleteCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        // DeleteTellersTellerIdCashiersCashierIdResponse response = api.deleteCashier(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteTellerTest() {
        Long tellerId = null;
        // String response = api.deleteTeller(tellerId);

        // TODO: test validations
    }

    /**
     * Retrieve a cashier
     */
    @Test
    public void findCashierDataTest() {
        Long tellerId = null;
        Long cashierId = null;
        // GetTellersTellerIdCashiersCashierIdResponse response = api.findCashierData(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * Retrieve tellers
     */
    @Test
    public void findTellerTest() {
        Long tellerId = null;
        // GetTellersResponse response = api.findTeller(tellerId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void findTransactionDataTest() {
        Long tellerId = null;
        Long transactionId = null;
        // String response = api.findTransactionData(tellerId, transactionId);

        // TODO: test validations
    }

    /**
     * List Cashiers
     */
    @Test
    public void getCashierDataTest() {
        Long tellerId = null;
        String fromdate = null;
        String todate = null;
        // GetTellersTellerIdCashiersResponse response = api.getCashierData(tellerId, fromdate, todate);

        // TODO: test validations
    }

    /**
     * Find Cashiers
     */
    @Test
    public void getCashierTemplateTest() {
        Long tellerId = null;
        // GetTellersTellerIdCashiersTemplateResponse response = api.getCashierTemplate(tellerId);

        // TODO: test validations
    }

    /**
     * Retrieve Cashier Transaction Template
     */
    @Test
    public void getCashierTxnTemplateTest() {
        Long tellerId = null;
        Long cashierId = null;
        // GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse response = api.getCashierTxnTemplate(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getJournalDataTest() {
        Long tellerId = null;
        Long cashierId = null;
        String dateRange = null;
        // String response = api.getJournalData(tellerId, cashierId, dateRange);

        // TODO: test validations
    }

    /**
     * List all tellers
     * <p>
     * Retrieves list tellers
     */
    @Test
    public void getTellerDataTest() {
        Long officeId = null;
        // List<GetTellersResponse> response = api.getTellerData(officeId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getTransactionDataTest() {
        Long tellerId = null;
        String dateRange = null;
        // String response = api.getTransactionData(tellerId, dateRange);

        // TODO: test validations
    }

    /**
     * Retrieve Cashier Transaction
     */
    @Test
    public void getTransactionsForCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse> response = api.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Transactions Wtih Summary For Cashier
     */
    @Test
    public void getTransactionsWtihSummaryForCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse response = api.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Settle Cash From Cashier
     * <p>
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     */
    @Test
    public void settleCashFromCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        PostTellersTellerIdCashiersCashierIdSettleRequest body = null;
        // PostTellersTellerIdCashiersCashierIdSettleResponse response = api.settleCashFromCashier(tellerId, cashierId, body);

        // TODO: test validations
    }

    /**
     * Update Cashier
     */
    @Test
    public void updateCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        PutTellersTellerIdCashiersCashierIdRequest body = null;
        // PutTellersTellerIdCashiersCashierIdResponse response = api.updateCashier(tellerId, cashierId, body);

        // TODO: test validations
    }

    /**
     * Update teller
     */
    @Test
    public void updateTellerTest() {
        Long tellerId = null;
        PutTellersRequest body = null;
        // PutTellersResponse response = api.updateTeller(tellerId, body);

        // TODO: test validations
    }
}
