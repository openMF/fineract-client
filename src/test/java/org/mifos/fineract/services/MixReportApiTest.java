package org.mifos.fineract.services;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for MixReportApi
 */
public class MixReportApiTest {

    private MixReportApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(MixReportApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveXBRLReportTest() {
        DateTime startDate = null;
        DateTime endDate = null;
        String currency = null;
        // String response = api.retrieveXBRLReport(startDate, endDate, currency);

        // TODO: test validations
    }
}
