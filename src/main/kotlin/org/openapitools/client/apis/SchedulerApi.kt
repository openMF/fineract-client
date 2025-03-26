package org.openapitools.client.apis

import org.openapitools.client.models.GetSchedulerResponse
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SchedulerApi {
    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * Activates the scheduler job service. | Suspends the scheduler job service.
     * Responses:
     *  - 200: POST :  scheduler?command=start   POST : scheduler?command=stop
     *
     * @param command command (optional)
     * @return [Unit]
     */
    @POST("v1/scheduler")
    suspend fun changeSchedulerStatus(@Query("command") command: String? = null): Unit

    /**
     * Retrieve Scheduler Status
     * Returns the scheduler status.  Example Requests:  scheduler
     * Responses:
     *  - 200: OK
     *
     * @return [GetSchedulerResponse]
     */
    @GET("v1/scheduler")
    suspend fun retrieveStatus(): GetSchedulerResponse

}
