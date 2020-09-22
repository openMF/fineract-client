package org.mifos.fineract.services;

import org.mifos.fineract.models.SurveyData;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface SpmSurveysApi {
    /**
     * Deactivate Survey
     *
     * @param id      (required)
     * @param command (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys/{id}")
    Observable<Void> activateOrDeactivateSurvey(
            @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("command") String command
    );

    /**
     * Create a Survey
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, value
     *
     * @param body Create survey (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys")
    Observable<Void> createSurvey(
            @retrofit2.http.Body SurveyData body
    );

    /**
     * @param id   (required)
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("surveys/{id}")
    Observable<String> editSurvey(
            @retrofit2.http.Path("id") Long id, @retrofit2.http.Body SurveyData body
    );

    /**
     * List all Surveys
     *
     * @param isActive (optional)
     * @return Observable&lt;List&lt;SurveyData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys")
    Observable<List<SurveyData>> fetchAllSurveys(
            @retrofit2.http.Query("isActive") Boolean isActive
    );

    /**
     * Retrieve a Survey
     *
     * @param id Enter id (required)
     * @return Observable&lt;SurveyData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{id}")
    Observable<SurveyData> findSurvey(
            @retrofit2.http.Path("id") Long id
    );

}
