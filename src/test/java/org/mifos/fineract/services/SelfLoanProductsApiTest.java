package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfLoanProductsApi
 */
public class SelfLoanProductsApiTest {

    private SelfLoanProductsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfLoanProductsApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveAllLoanProductsTest() {
        Long clientId = null;
        // String response = api.retrieveAllLoanProducts(clientId);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void retrieveLoanProductDetailsTest() {
        Long productId = null;
        Long clientId = null;
        // String response = api.retrieveLoanProductDetails(productId, clientId);

        // TODO: test validations
    }
}
