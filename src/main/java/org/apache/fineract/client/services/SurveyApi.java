/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetSurveyResponse;
import org.apache.fineract.client.models.PostSurveySurveyNameApptableIdRequest;
import org.apache.fineract.client.models.PostSurveySurveyNameApptableIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SurveyApi {
  /**
   * Create an entry in the survey table
   * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#survey_create ] 
   * @param surveyName surveyName (required)
   * @param apptableId apptableId (required)
   * @param postSurveySurveyNameApptableIdRequest  (required)
   * @return Call&lt;PostSurveySurveyNameApptableIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("survey/{surveyName}/{apptableId}")
  Call<PostSurveySurveyNameApptableIdResponse> createDatatableEntry1(
    @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PostSurveySurveyNameApptableIdRequest postSurveySurveyNameApptableIdRequest
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @param fulfilledId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("survey/{surveyName}/{clientId}/{fulfilledId}")
  Call<String> deleteDatatableEntries2(
    @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("fulfilledId") Long fulfilledId
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("survey/{surveyName}/{clientId}")
  Call<String> getClientSurveyOverview(
    @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @param entryId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("survey/{surveyName}/{clientId}/{entryId}")
  Call<String> getSurveyEntry(
    @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("entryId") Long entryId
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param apptable  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("survey/register/{surveyName}/{apptable}")
  Call<String> register(
    @retrofit2.http.Path("surveyName") String surveyName, @retrofit2.http.Path("apptable") String apptable, @retrofit2.http.Body String body
  );

  /**
   * Retrieve survey
   * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
   * @param surveyName surveyName (required)
   * @return Call&lt;GetSurveyResponse&gt;
   */
  @GET("survey/{surveyName}")
  Call<GetSurveyResponse> retrieveSurvey(
    @retrofit2.http.Path("surveyName") String surveyName
  );

  /**
   * Retrieve surveys
   * Retrieve surveys. This allows to retrieve the list of survey tables registered .
   * @return Call&lt;List&lt;GetSurveyResponse&gt;&gt;
   */
  @GET("survey")
  Call<List<GetSurveyResponse>> retrieveSurveys();
    

}
