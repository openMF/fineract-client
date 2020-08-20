package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for CashierJournalsApi
 */
public class CashierJournalsApiTest {

    private CashierJournalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CashierJournalsApi.class);
    }

    /**
     *
     */
    @Test
    public void getJournalDataTest() {
        Long officeId = null;
        Long tellerId = null;
        Long cashierId = null;
        String dateRange = null;
        // String response = api.getJournalData(officeId, tellerId, cashierId, dateRange);

        // TODO: test validations
    }
}
