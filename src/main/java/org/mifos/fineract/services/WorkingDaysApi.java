package org.mifos.fineract.services;

import org.mifos.fineract.models.GetWorkingDaysResponse;
import org.mifos.fineract.models.GetWorkingDaysTemplateResponse;
import org.mifos.fineract.models.PutWorkingDaysRequest;
import org.mifos.fineract.models.PutWorkingDaysResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

import java.util.List;

public interface WorkingDaysApi {
    /**
     * List Working days
     * Example Requests:  workingdays
     *
     * @return Call&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("workingdays")
    Call<List<GetWorkingDaysResponse>> retrieveAll();


    /**
     * Working Days Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     *
     * @return Call&lt;GetWorkingDaysTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("workingdays/template")
    Call<GetWorkingDaysTemplateResponse> template();


    /**
     * Update a Working Day
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     *
     * @param body body (required)
     * @return Call&lt;PutWorkingDaysResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("workingdays")
    Call<PutWorkingDaysResponse> update(
            @retrofit2.http.Body PutWorkingDaysRequest body
    );

}
