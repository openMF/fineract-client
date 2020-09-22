package org.mifos.fineract.services;

import org.mifos.fineract.models.Scorecard;
import org.mifos.fineract.models.ScorecardData;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;

public interface ScoreCardApi {
    /**
     * Create a Scorecard entry
     * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
     *
     * @param surveyId Enter surveyId (required)
     * @param body     (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys/scorecards/{surveyId}")
    Observable<Void> createScorecard(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body ScorecardData body
    );

    /**
     * @param clientId (required)
     * @return Observable&lt;List&lt;ScorecardData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/scorecards/clients/{clientId}")
    Observable<List<ScorecardData>> findByClient(
            @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * List all Scorecard entries
     * List all Scorecard entries for a survey.
     *
     * @param surveyId Enter surveyId (required)
     * @return Observable&lt;List&lt;Scorecard&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/scorecards/{surveyId}")
    Observable<List<Scorecard>> findBySurvey(
            @retrofit2.http.Path("surveyId") Long surveyId
    );

    /**
     * @param surveyId Enter surveyId (required)
     * @param clientId Enter clientId (required)
     * @return Observable&lt;List&lt;ScorecardData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/scorecards/{surveyId}/clients/{clientId}")
    Observable<List<ScorecardData>> findBySurveyAndClient(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Path("clientId") Long clientId
    );

}
