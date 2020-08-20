package org.mifos.fineract.services;

import org.mifos.fineract.models.SurveyData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface SpmSurveysApi {
    /**
     * Deactivate Survey
     *
     * @param id      (required)
     * @param command (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys/{id}")
    Call<Void> activateOrDeactivateSurvey(
            @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("command") String command
    );

    /**
     * Create a Survey
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, value
     *
     * @param body Create survey (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys")
    Call<Void> createSurvey(
            @retrofit2.http.Body SurveyData body
    );

    /**
     * @param id   (required)
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("surveys/{id}")
    Call<String> editSurvey(
            @retrofit2.http.Path("id") Long id, @retrofit2.http.Body SurveyData body
    );

    /**
     * List all Surveys
     *
     * @param isActive (optional)
     * @return Call&lt;List&lt;SurveyData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys")
    Call<List<SurveyData>> fetchAllSurveys(
            @retrofit2.http.Query("isActive") Boolean isActive
    );

    /**
     * Retrieve a Survey
     *
     * @param id Enter id (required)
     * @return Call&lt;SurveyData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{id}")
    Call<SurveyData> findSurvey(
            @retrofit2.http.Path("id") Long id
    );

}
