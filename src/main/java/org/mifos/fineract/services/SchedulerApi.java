package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSchedulerResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface SchedulerApi {
    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * Activates the scheduler job service. | Suspends the scheduler job service.
     *
     * @param command command (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("scheduler")
    Call<Void> changeSchedulerStatus(
            @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Scheduler Status
     * Returns the scheduler status.  Example Requests:  scheduler
     *
     * @return Call&lt;GetSchedulerResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("scheduler")
    Call<GetSchedulerResponse> retrieveStatus();


}
