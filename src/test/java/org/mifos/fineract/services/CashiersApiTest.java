package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for CashiersApi
 */
public class CashiersApiTest {

    private CashiersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CashiersApi.class);
    }

    /**
     *
     */
    @Test
    public void getCashierDataTest() {
        Long officeId = null;
        Long tellerId = null;
        Long staffId = null;
        String date = null;
        // String response = api.getCashierData(officeId, tellerId, staffId, date);

        // TODO: test validations
    }
}
