package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostRepostRequest;
import org.mifos.fineract.models.PutReportRequest;

/**
 * API tests for ReportsApi
 */
public class ReportsApiTest {

    private ReportsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ReportsApi.class);
    }

    /**
     * Create a Report
     */
    @Test
    public void createReportTest() {
        PostRepostRequest body = null;
        // PostReportsResponse response = api.createReport(body);

        // TODO: test validations
    }
    /**
     * Delete a Report
     *
     * Only non-core reports can be deleted.
     */
    @Test
    public void deleteReportTest() {
        Long id = null;
        // DeleteReportsResponse response = api.deleteReport(id);

        // TODO: test validations
    }
    /**
     * Retrieve Report Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request :   reports/template
     */
    @Test
    public void retrieveOfficeTemplateTest() {
        // GetReportsTemplateResponse response = api.retrieveOfficeTemplate();

        // TODO: test validations
    }

    /**
     * Retrieve a Report
     * <p>
     * Example Requests:  reports/1   reports/1?template&#x3D;true
     */
    @Test
    public void retrieveReportTest() {
        Long id = null;
        // GetReportsResponse response = api.retrieveReport(id);

        // TODO: test validations
    }
    /**
     * List Reports
     *
     * Lists all reports and their parameters.  Example Request:  reports
     */
    @Test
    public void retrieveReportListTest() {
        // api.retrieveReportList();

        // TODO: test validations
    }
    /**
     * Update a Report
     *
     * Only the useReport value can be updated for core reports.
     */
    @Test
    public void updateReportTest() {
        Long id = null;
        PutReportRequest body = null;
        // PutReportResponse response = api.updateReport(id, body);

        // TODO: test validations
    }
}
