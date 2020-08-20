package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PutCurrenciesRequest;

/**
 * API tests for CurrencyApi
 */
public class CurrencyApiTest {

    private CurrencyApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(CurrencyApi.class);
    }

    /**
     * Retrieve Currency Configuration
     * <p>
     * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
     */
    @Test
    public void retrieveCurrenciesTest() {
        // GetCurrenciesResponse response = api.retrieveCurrencies();

        // TODO: test validations
    }

    /**
     * Update Currency Configuration
     * <p>
     * Updates the list of currencies permitted for use.
     */
    @Test
    public void updateCurrenciesTest() {
        PutCurrenciesRequest body = null;
        // PutCurrenciesResponse response = api.updateCurrencies(body);

        // TODO: test validations
    }
}
