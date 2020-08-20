package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PutJobsJobsIDRequest;

/**
 * API tests for MifosxBatchJobsApi
 */
public class MifosxBatchJobsApiTest {

    private MifosxBatchJobsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MifosxBatchJobsApi.class);
    }

    /**
     * Run a Job
     * <p>
     * Manually Execute Specific Job.
     */
    @Test
    public void executeJobTest() {
        Long jobId = null;
        String command = null;
        // api.executeJob(jobId, command);

        // TODO: test validations
    }

    /**
     * Retrieve Scheduler Jobs
     * <p>
     * Returns the list of jobs.  Example Requests:  jobs
     */
    @Test
    public void retrieveAllTest() {
        // List<GetJobsResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * Retrieve Job Run History
     * <p>
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     */
    @Test
    public void retrieveHistoryTest() {
        Long jobId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetJobsJobIDJobRunHistoryResponse response = api.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a Job
     * <p>
     * Returns the details of a Job.  Example Requests:  jobs/5
     */
    @Test
    public void retrieveOneTest() {
        Long jobId = null;
        // GetJobsResponse response = api.retrieveOne(jobId);

        // TODO: test validations
    }

    /**
     * Update a Job
     * <p>
     * Updates the details of a job.
     */
    @Test
    public void updateJobDetailTest() {
        Long jobId = null;
        PutJobsJobsIDRequest body = null;
        // api.updateJobDetail(jobId, body);

        // TODO: test validations
    }
}
