package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for CreditBureauConfigurationApi
 */
public class CreditBureauConfigurationApiTest {

    private CreditBureauConfigurationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CreditBureauConfigurationApi.class);
    }

    /**
     *
     */
    @Test
    public void addOrganisationCreditBureauTest() {
        Long organisationCreditBureauId = null;
        String body = null;
        // String response = api.addOrganisationCreditBureau(organisationCreditBureauId, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void createCreditBureauLoanProductMappingTest() {
        Long creditBureauId = null;
        String body = null;
        // String response = api.createCreditBureauLoanProductMapping(creditBureauId, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void fetchLoanProductsTest() {
        // String response = api.fetchLoanProducts();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getConfigurationTest() {
        Long organisationCreditBureauId = null;
        // String response = api.getConfiguration(organisationCreditBureauId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getCreditBureauTest() {
        // String response = api.getCreditBureau();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getCreditBureauLoanProductMappingTest() {
        // String response = api.getCreditBureauLoanProductMapping();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getOrganisationCreditBureauTest() {
        // String response = api.getOrganisationCreditBureau();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateCreditBureauTest() {
        String body = null;
        // String response = api.updateCreditBureau(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateCreditBureauLoanProductMappingTest() {
        String body = null;
        // String response = api.updateCreditBureauLoanProductMapping(body);

        // TODO: test validations
    }
}
