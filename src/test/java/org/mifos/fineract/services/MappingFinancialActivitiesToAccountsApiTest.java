package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostFinancialActivityAccountsRequest;

/**
 * API tests for MappingFinancialActivitiesToAccountsApi
 */
public class MappingFinancialActivitiesToAccountsApiTest {

    private MappingFinancialActivitiesToAccountsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(MappingFinancialActivitiesToAccountsApi.class);
    }

    /**
     * Create a new Financial Activity to Accounts Mapping
     * <p>
     * Mandatory Fields financialActivityId, glAccountId
     */
    @Test
    public void createGLAccountTest() {
        PostFinancialActivityAccountsRequest body = null;
        // PostFinancialActivityAccountsResponse response = api.createGLAccount(body);

        // TODO: test validations
    }

    /**
     * Delete a Financial Activity to Account Mapping
     */
    @Test
    public void deleteGLAccountTest() {
        Long mappingId = null;
        // DeleteFinancialActivityAccountsResponse response = api.deleteGLAccount(mappingId);

        // TODO: test validations
    }

    /**
     * Retrieve a Financial Activity to Account Mapping
     * <p>
     * Example Requests:  financialactivityaccounts/1
     */
    @Test
    public void retreiveTest() {
        Long mappingId = null;
        // GetFinancialActivityAccountsResponse response = api.retreive(mappingId);

        // TODO: test validations
    }

    /**
     * List Financial Activities to Accounts Mappings
     * <p>
     * Example Requests:  financialactivityaccounts
     */
    @Test
    public void retrieveAllTest() {
        // List<GetFinancialActivityAccountsResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveTemplateTest() {
        // String response = api.retrieveTemplate();

        // TODO: test validations
    }

    /**
     * Update a Financial Activity to Account Mapping
     * <p>
     * the API updates the Ledger account linked to a Financial Activity
     */
    @Test
    public void updateGLAccountTest() {
        Long mappingId = null;
        PostFinancialActivityAccountsRequest body = null;
        // PutFinancialActivityAccountsResponse response = api.updateGLAccount(mappingId, body);

        // TODO: test validations
    }
}
