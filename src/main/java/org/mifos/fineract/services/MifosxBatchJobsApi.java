package org.mifos.fineract.services;

import org.mifos.fineract.models.GetJobsJobIDJobRunHistoryResponse;
import org.mifos.fineract.models.GetJobsResponse;
import org.mifos.fineract.models.PutJobsJobsIDRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface MifosxBatchJobsApi {
    /**
     * Run a Job
     * Manually Execute Specific Job.
     *
     * @param jobId   jobId (required)
     * @param command command (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("jobs/{jobId}")
    Call<Void> executeJob(
            @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Scheduler Jobs
     * Returns the list of jobs.  Example Requests:  jobs
     *
     * @return Call&lt;List&lt;GetJobsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("jobs")
    Call<List<GetJobsResponse>> retrieveAll();


    /**
     * Retrieve Job Run History
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     *
     * @param jobId     jobId (required)
     * @param offset    offset (optional)
     * @param limit     limit (optional)
     * @param orderBy   orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return Call&lt;GetJobsJobIDJobRunHistoryResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("jobs/{jobId}/runhistory")
    Call<GetJobsJobIDJobRunHistoryResponse> retrieveHistory(
            @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Retrieve a Job
     * Returns the details of a Job.  Example Requests:  jobs/5
     *
     * @param jobId jobId (required)
     * @return Call&lt;GetJobsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("jobs/{jobId}")
    Call<GetJobsResponse> retrieveOne(
            @retrofit2.http.Path("jobId") Long jobId
    );

    /**
     * Update a Job
     * Updates the details of a job.
     *
     * @param jobId jobId (required)
     * @param body  body (required)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("jobs/{jobId}")
    Call<Void> updateJobDetail(
            @retrofit2.http.Path("jobId") Long jobId, @retrofit2.http.Body PutJobsJobsIDRequest body
    );

}
