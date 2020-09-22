package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSurveyResponse;
import org.mifos.fineract.models.PostSurveySurveyNameApptableIdRequest;
import org.mifos.fineract.models.PostSurveySurveyNameApptableIdResponse;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface SurveyApi {
    /**
     * Create an entry in the survey table
     * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.openmf.org/api-docs/apiLive.htm#survey_create ]
     *
     * @param surveyName surveyName (required)
     * @param apptableId apptableId (required)
     * @param body2      body (required)
     * @param body       (optional)
     * @return Observable&lt;PostSurveySurveyNameApptableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("survey/{surveyName}/{apptableId}")
    Observable<PostSurveySurveyNameApptableIdResponse> createDatatableEntry(
            @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PostSurveySurveyNameApptableIdRequest body2, @retrofit2.http.Body String body
    );

    /**
     * @param surveyName  (required)
     * @param clientId    (required)
     * @param fulfilledId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("survey/{surveyName}/{clientId}/{fulfilledId}")
    Observable<String> deleteDatatableEntries(
            @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("fulfilledId") Long fulfilledId
    );

    /**
     * @param surveyName (required)
     * @param clientId   (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("survey/{surveyName}/{clientId}")
    Observable<String> getClientSurveyOverview(
            @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * @param surveyName (required)
     * @param clientId   (required)
     * @param entryId    (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("survey/{surveyName}/{clientId}/{entryId}")
    Observable<String> getSurveyEntry(
            @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("entryId") Long entryId
    );

    /**
     * @param surveyName (required)
     * @param apptable   (required)
     * @param body       (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("survey/register/{surveyName}/{apptable}")
    Observable<String> register(
            @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("apptable") String apptable, @retrofit2.http.Body String body
    );

    /**
     * Retrieve survey
     * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
     *
     * @param surveyName surveyName (required)
     * @return Observable&lt;GetSurveyResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("survey/{surveyName}")
    Observable<GetSurveyResponse> retrieveSurvey(
            @retrofit2.http.Path("surveyName") String surveyName
    );

    /**
     * Retrieve surveys
     * Retrieve surveys. This allows to retrieve the list of survey tables registered .
     *
     * @return Observable&lt;List&lt;GetSurveyResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("survey")
    Observable<List<GetSurveyResponse>> retrieveSurveys();


}
