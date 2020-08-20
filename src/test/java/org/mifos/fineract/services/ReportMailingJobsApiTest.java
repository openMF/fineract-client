package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.DeleteReportMailingJobsRequest;
import org.mifos.fineract.models.PostReportMailingJobsRequest;
import org.mifos.fineract.models.PutReportMailingJobsRequest;

/**
 * API tests for ReportMailingJobsApi
 */
public class ReportMailingJobsApiTest {

    private ReportMailingJobsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportMailingJobsApi.class);
    }

    /**
     * Create a Report Mailing Job
     * <p>
     * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
     */
    @Test
    public void createReportMailingJobTest() {
        PostReportMailingJobsRequest body = null;
        // PostReportMailingJobsResponse response = api.createReportMailingJob(body);

        // TODO: test validations
    }

    /**
     * Delete a Report Mailing Job
     */
    @Test
    public void deleteReportMailingJobTest() {
        Long entityId = null;
        DeleteReportMailingJobsRequest body = null;
        // DeleteReportMailingJobsResponse response = api.deleteReportMailingJob(entityId, body);

        // TODO: test validations
    }

    /**
     * List Report Mailing Jobs
     * <p>
     * Example Requests:  reportmailingjobs
     */
    @Test
    public void retrieveAllReportMailingJobsTest() {
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetReportMailingJobsResponse> response = api.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a Report Mailing Job
     * <p>
     * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
     */
    @Test
    public void retrieveReportMailingJobTest() {
        Long entityId = null;
        // GetReportMailingJobsResponse response = api.retrieveReportMailingJob(entityId);

        // TODO: test validations
    }

    /**
     * Retrieve Report Mailing Job Details Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  reportmailingjobs/template
     */
    @Test
    public void retrieveReportMailingJobTemplateTest() {
        // GetReportMailingJobsTemplate response = api.retrieveReportMailingJobTemplate();

        // TODO: test validations
    }

    /**
     * Update a Report Mailing Job
     */
    @Test
    public void updateReportMailingJobTest() {
        Long entityId = null;
        PutReportMailingJobsRequest body = null;
        // PutReportMailingJobsResponse response = api.updateReportMailingJob(entityId, body);

        // TODO: test validations
    }
}
