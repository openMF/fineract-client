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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CalendarApi {
  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/calendars")
  Call<String> createCalendar(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> deleteCalendar(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId
  );

  /**
   * 
   * 
   * @param calendarId  (required)
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> retrieveCalendar(
    @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarType  (optional, default to &quot;all&quot;)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars")
  Call<String> retrieveCalendarsByEntity(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarType") String calendarType
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars/template")
  Call<String> retrieveNewCalendarDetails(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> updateCalendar(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("calendarId") Long calendarId, @retrofit2.http.Body String body
  );

}
