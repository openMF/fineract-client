package org.openapitools.client.apis

import org.openapitools.client.models.ExecuteJobRequest
import org.openapitools.client.models.GetJobsJobIDJobRunHistoryResponse
import org.openapitools.client.models.GetJobsResponse
import org.openapitools.client.models.PutJobsJobIDRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SCHEDULERJOBApi {
    /**
     * Run a Job
     * Manually Execute Specific Job.
     * Responses:
     *  - 200: POST: jobs/1?command=executeJob
     *
     * @param jobId jobId
     * @param command command (optional)
     * @param executeJobRequest  (optional)
     * @return [Unit]
     */
    @POST("v1/jobs/{jobId}")
    suspend fun executeJob(
        @Path("jobId") jobId: Long,
        @Query("command") command: String? = null,
        @Body executeJobRequest: ExecuteJobRequest? = null
    ): Unit

    /**
     * Retrieve Scheduler Jobs
     * Returns the list of jobs.  Example Requests:  jobs
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetJobsResponse]
     */
    @GET("v1/jobs")
    suspend fun retrieveAll8(): List<GetJobsResponse>

    /**
     * Retrieve Job Run History
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetJobsJobIDJobRunHistoryResponse]
     */
    @GET("v1/jobs/{jobId}/runhistory")
    suspend fun retrieveHistory(
        @Path("jobId") jobId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): GetJobsJobIDJobRunHistoryResponse

    /**
     * Retrieve a Job
     * Returns the details of a Job.  Example Requests:  jobs/5
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @return [GetJobsResponse]
     */
    @GET("v1/jobs/{jobId}")
    suspend fun retrieveOne5(@Path("jobId") jobId: Long): GetJobsResponse

    /**
     * Update a Job
     * Updates the details of a job.
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @param putJobsJobIDRequest
     * @return [Unit]
     */
    @PUT("v1/jobs/{jobId}")
    suspend fun updateJobDetail(
        @Path("jobId") jobId: Long,
        @Body putJobsJobIDRequest: PutJobsJobIDRequest
    ): Unit

}
