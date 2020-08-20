package org.mifos.fineract.services;

import org.mifos.fineract.models.ScorecardData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface SelfScoreCardApi {
    /**
     * @param surveyId (required)
     * @param body     (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/surveys/scorecards/{surveyId}")
    Call<Void> createScorecard(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body ScorecardData body
    );

    /**
     * @param clientId (required)
     * @return Call&lt;List&lt;ScorecardData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/surveys/scorecards/clients/{clientId}")
    Call<List<ScorecardData>> findByClient(
            @retrofit2.http.Path("clientId") Long clientId
    );

}
