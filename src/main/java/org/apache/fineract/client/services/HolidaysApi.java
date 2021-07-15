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

import rx.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.GetHolidaysResponse;
import org.apache.fineract.client.models.PostHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.PostHolidaysRequest;
import org.apache.fineract.client.models.PostHolidaysResponse;
import org.apache.fineract.client.models.PutHolidaysHolidayIdRequest;
import org.apache.fineract.client.models.PutHolidaysHolidayIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HolidaysApi {
  /**
   * Create a Holiday
   * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
   * @param postHolidaysRequest  (required)
   * @return Observable&lt;PostHolidaysResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("holidays")
  Observable<PostHolidaysResponse> createNewHoliday(
    @retrofit2.http.Body PostHolidaysRequest postHolidaysRequest
  );

  /**
   * Delete a Holiday
   * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
   * @param holidayId holidayId (required)
   * @return Observable&lt;DeleteHolidaysHolidayIdResponse&gt;
   */
  @DELETE("holidays/{holidayId}")
  Observable<DeleteHolidaysHolidayIdResponse> delete7(
    @retrofit2.http.Path("holidayId") Long holidayId
  );

  /**
   * Activate a Holiday
   * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
   * @param holidayId holidayId (required)
   * @param body  (required)
   * @param command command (optional)
   * @return Observable&lt;PostHolidaysHolidayIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("holidays/{holidayId}")
  Observable<PostHolidaysHolidayIdResponse> handleCommands1(
    @retrofit2.http.Path("holidayId") Long holidayId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
  );

  /**
   * List Holidays
   * Example Requests:  holidays?officeId&#x3D;1
   * @param officeId officeId (optional)
   * @param fromDate fromDate (optional)
   * @param toDate toDate (optional)
   * @param locale locale (optional)
   * @param dateFormat dateFormat (optional)
   * @return Observable&lt;List&lt;GetHolidaysResponse&gt;&gt;
   */
  @GET("holidays")
  Observable<List<GetHolidaysResponse>> retrieveAllHolidays(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * Retrieve a Holiday
   * Example Requests:  holidays/1
   * @param holidayId holidayId (required)
   * @return Observable&lt;GetHolidaysResponse&gt;
   */
  @GET("holidays/{holidayId}")
  Observable<GetHolidaysResponse> retrieveOne7(
    @retrofit2.http.Path("holidayId") Long holidayId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("holidays/template")
  Observable<String> retrieveRepaymentScheduleUpdationTyeOptions();
    

  /**
   * Update a Holiday
   * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
   * @param holidayId holidayId (required)
   * @param putHolidaysHolidayIdRequest  (required)
   * @return Observable&lt;PutHolidaysHolidayIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("holidays/{holidayId}")
  Observable<PutHolidaysHolidayIdResponse> update6(
    @retrofit2.http.Path("holidayId") Long holidayId, @retrofit2.http.Body PutHolidaysHolidayIdRequest putHolidaysHolidayIdRequest
  );

}
