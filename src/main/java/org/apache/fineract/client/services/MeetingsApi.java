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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MeetingsApi {
  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/meetings")
  Observable<String> createMeeting(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("{entityType}/{entityId}/meetings/{meetingId}")
  Observable<String> deleteMeeting(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/meetings/{meetingId}")
  Observable<String> performMeetingCommands(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param meetingId  (required)
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings/{meetingId}")
  Observable<String> retrieveMeeting(
    @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param limit  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings")
  Observable<String> retrieveMeetings(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings/template")
  Observable<String> template11(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("calendarId") Long calendarId
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("{entityType}/{entityId}/meetings/{meetingId}")
  Observable<String> updateMeeting(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("meetingId") Long meetingId, @retrofit2.http.Body String body
  );

}
