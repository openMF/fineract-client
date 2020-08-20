package org.mifos.fineract.services;

import org.mifos.fineract.models.SurveyData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.util.List;

public interface SelfSpmApi {
    /**
     * @return Call&lt;List&lt;SurveyData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/surveys")
    Call<List<SurveyData>> fetchAllSurveys();


}
