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
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.SurveyData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SpmSurveysApi {
  /**
   * Deactivate Survey
   * 
   * @param id  (required)
   * @param command  (optional)
   * @return Completable
   */
  @POST("surveys/{id}")
  Completable activateOrDeactivateSurvey(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("command") String command
  );

  /**
   * Create a Survey
   * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
   * @param surveyData Create survey (optional)
   * @return Completable
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("surveys")
  Completable createSurvey(
    @retrofit2.http.Body SurveyData surveyData
  );

  /**
   * 
   * 
   * @param id  (required)
   * @param surveyData  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("surveys/{id}")
  Observable<String> editSurvey(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body SurveyData surveyData
  );

  /**
   * List all Surveys
   * 
   * @param isActive  (optional)
   * @return Observable&lt;List&lt;SurveyData&gt;&gt;
   */
  @GET("surveys")
  Observable<List<SurveyData>> fetchAllSurveys1(
    @retrofit2.http.Query("isActive") Boolean isActive
  );

  /**
   * Retrieve a Survey
   * 
   * @param id Enter id (required)
   * @return Observable&lt;SurveyData&gt;
   */
  @GET("surveys/{id}")
  Observable<SurveyData> findSurvey(
    @retrofit2.http.Path("id") Long id
  );

}
