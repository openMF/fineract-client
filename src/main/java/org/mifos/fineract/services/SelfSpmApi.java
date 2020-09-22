package org.mifos.fineract.services;

import org.mifos.fineract.models.SurveyData;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

import java.util.List;

public interface SelfSpmApi {
    /**
     * @return Observable&lt;List&lt;SurveyData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/surveys")
    Observable<List<SurveyData>> fetchAllSurveys();


}
