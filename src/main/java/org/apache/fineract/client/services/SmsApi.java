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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SmsApi {
  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("sms")
  Observable<String> create2(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("sms/{resourceId}")
  Observable<String> delete6(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("sms")
  Observable<String> retrieveAll10();
    

  /**
   * 
   * 
   * @param campaignId  (required)
   * @param status  (optional)
   * @param fromDate  (optional)
   * @param toDate  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("sms/{campaignId}/messageByStatus")
  Observable<String> retrieveAllSmsByStatus(
    @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("status") Long status, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("sms/{resourceId}")
  Observable<String> retrieveOne6(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("sms/{resourceId}")
  Observable<String> update3(
    @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
  );

}
