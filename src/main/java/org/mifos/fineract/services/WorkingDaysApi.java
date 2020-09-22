package org.mifos.fineract.services;

import org.mifos.fineract.models.GetWorkingDaysResponse;
import org.mifos.fineract.models.GetWorkingDaysTemplateResponse;
import org.mifos.fineract.models.PutWorkingDaysRequest;
import org.mifos.fineract.models.PutWorkingDaysResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface WorkingDaysApi {
    /**
     * List Working days
     * Example Requests:  workingdays
     *
     * @return Observable&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("workingdays")
    Observable<List<GetWorkingDaysResponse>> retrieveAll();


    /**
     * Working Days Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     *
     * @return Observable&lt;GetWorkingDaysTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("workingdays/template")
    Observable<GetWorkingDaysTemplateResponse> template();


    /**
     * Update a Working Day
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     *
     * @param body body (required)
     * @return Observable&lt;PutWorkingDaysResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("workingdays")
    Observable<PutWorkingDaysResponse> update(
            @retrofit2.http.Body PutWorkingDaysRequest body
    );

}
