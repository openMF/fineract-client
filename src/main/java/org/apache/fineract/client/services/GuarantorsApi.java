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

import org.apache.fineract.client.models.FormDataContentDisposition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GuarantorsApi {
  /**
   * 
   * 
   * @param loanId  (required)
   * @param clientId  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/accounts/template")
  Observable<String> accountsTemplate(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/guarantors")
  Observable<String> createGuarantor(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @param guarantorFundingId  (optional)
   * @return Observable&lt;String&gt;
   */
  @DELETE("loans/{loanId}/guarantors/{guarantorId}")
  Observable<String> deleteGuarantor(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;Void&gt;
   */
  @GET("loans/{loanId}/guarantors/downloadtemplate")
  Observable<Void> getGuarantorTemplate(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/template")
  Observable<String> newGuarantorTemplate(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("loans/{loanId}/guarantors/uploadtemplate")
  Observable<String> postGuarantorTemplate(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors")
  Observable<String> retrieveGuarantorDetails(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/{guarantorId}")
  Observable<String> retrieveGuarantorDetails1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}/guarantors/{guarantorId}")
  Observable<String> updateGuarantor(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("guarantorId") Long guarantorId, @retrofit2.http.Body String body
  );

}
