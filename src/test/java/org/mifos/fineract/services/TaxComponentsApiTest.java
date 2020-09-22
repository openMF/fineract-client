package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostTaxesComponentsRequest;
import org.mifos.fineract.models.PutTaxesComponentsTaxComponentIdRequest;

/**
 * API tests for TaxComponentsApi
 */
public class TaxComponentsApiTest {

    private TaxComponentsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(TaxComponentsApi.class);
    }

    /**
     * Create a new Tax Component
     *
     * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
     */
    @Test
    public void createTaxCompoentTest() {
        PostTaxesComponentsRequest body = null;
        // PostTaxesComponentsResponse response = api.createTaxCompoent(body);

        // TODO: test validations
    }
    /**
     * List Tax Components
     *
     * List Tax Components
     */
    @Test
    public void retrieveAllTaxComponentsTest() {
        // List<GetTaxesComponentsResponse> response = api.retrieveAllTaxComponents();

        // TODO: test validations
    }
    /**
     * Retrieve Tax Component
     *
     * Retrieve Tax Component
     */
    @Test
    public void retrieveTaxComponentTest() {
        Long taxComponentId = null;
        // GetTaxesComponentsResponse response = api.retrieveTaxComponent(taxComponentId);

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
     * Update Tax Component
     *
     * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
     */
    @Test
    public void updateTaxCompoentTest() {
        Long taxComponentId = null;
        PutTaxesComponentsTaxComponentIdRequest body = null;
        // PutTaxesComponentsTaxComponentIdResponse response = api.updateTaxCompoent(taxComponentId, body);

        // TODO: test validations
    }
}
