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

import org.apache.fineract.client.models.GetWorkingDaysResponse;
import org.apache.fineract.client.models.GetWorkingDaysTemplateResponse;
import org.apache.fineract.client.models.PutWorkingDaysRequest;
import org.apache.fineract.client.models.PutWorkingDaysResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WorkingDaysApi {
  /**
   * List Working days
   * Example Requests:  workingdays
   * @return Observable&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
   */
  @GET("workingdays")
  Observable<List<GetWorkingDaysResponse>> retrieveAll17();
    

  /**
   * Working Days Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
   * @return Observable&lt;GetWorkingDaysTemplateResponse&gt;
   */
  @GET("workingdays/template")
  Observable<GetWorkingDaysTemplateResponse> template4();
    

  /**
   * Update a Working Day
   * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
   * @param putWorkingDaysRequest  (required)
   * @return Observable&lt;PutWorkingDaysResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("workingdays")
  Observable<PutWorkingDaysResponse> update8(
    @retrofit2.http.Body PutWorkingDaysRequest putWorkingDaysRequest
  );

}
