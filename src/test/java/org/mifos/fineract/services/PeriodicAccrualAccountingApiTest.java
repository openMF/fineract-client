package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.RunaccrualsRequest;

/**
 * API tests for PeriodicAccrualAccountingApi
 */
public class PeriodicAccrualAccountingApiTest {

    private PeriodicAccrualAccountingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PeriodicAccrualAccountingApi.class);
    }

    /**
     * Executes Periodic Accrual Accounting
     * <p>
     * Mandatory Fields  tillDate
     */
    @Test
    public void executePeriodicAccrualAccountingTest() {
        RunaccrualsRequest body = null;
        // api.executePeriodicAccrualAccounting(body);

        // TODO: test validations
    }
}
