package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSchedulerResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface SchedulerApi {
    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * Activates the scheduler job service. | Suspends the scheduler job service.
     *
     * @param command command (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("scheduler")
    Observable<Void> changeSchedulerStatus(
            @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Scheduler Status
     * Returns the scheduler status.  Example Requests:  scheduler
     *
     * @return Observable&lt;GetSchedulerResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("scheduler")
    Observable<GetSchedulerResponse> retrieveStatus();


}
