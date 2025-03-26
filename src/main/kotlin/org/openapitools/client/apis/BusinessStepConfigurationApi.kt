package org.openapitools.client.apis

import org.openapitools.client.models.GetBusinessJobConfigResponse
import org.openapitools.client.models.GetBusinessStepConfigResponse
import org.openapitools.client.models.UpdateBusinessStepConfigRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface BusinessStepConfigurationApi {
    /**
     * List Business Step Configurations for a Job
     * Returns the available Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/available-steps")
    suspend fun retrieveAllAvailableBusinessStep(@Path("jobName") jobName: String): GetBusinessStepConfigResponse

    /**
     * List Business Jobs
     * Returns the configured Business Jobs
     * Responses:
     *  - 200: OK
     *
     * @return [GetBusinessJobConfigResponse]
     */
    @GET("v1/jobs/names")
    suspend fun retrieveAllConfiguredBusinessJobs(): GetBusinessJobConfigResponse

    /**
     * List Business Step Configurations for a Job
     * Returns the configured Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/steps")
    suspend fun retrieveAllConfiguredBusinessStep(@Path("jobName") jobName: String): GetBusinessStepConfigResponse

    /**
     * List Business Step Configurations for a Job
     * Updates the Business steps execution order for a job
     * Responses:
     *  - 204: NO_CONTENT
     *
     * @param jobName jobName
     * @param updateBusinessStepConfigRequest  (optional)
     * @return [Unit]
     */
    @PUT("v1/jobs/{jobName}/steps")
    suspend fun updateJobBusinessStepConfig(
        @Path("jobName") jobName: String,
        @Body updateBusinessStepConfigRequest: UpdateBusinessStepConfigRequest? = null
    )

}
