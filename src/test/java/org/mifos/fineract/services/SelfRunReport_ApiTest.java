package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for SelfRunReport_Api
 */
public class SelfRunReport_ApiTest {

    private SelfRunReport_Api api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfRunReport_Api.class);
    }

    /**
     * Running A Report
     * <p>
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     */
    @Test
    public void runReportTest() {
        String reportName = null;
        // GetRunReportResponse response = api.runReport(reportName);

        // TODO: test validations
    }
}
