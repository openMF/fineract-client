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

import org.apache.fineract.client.models.DeleteAccountNumberFormatsResponse;
import org.apache.fineract.client.models.GetAccountNumberFormatsIdResponse;
import org.apache.fineract.client.models.GetAccountNumberFormatsResponseTemplate;
import org.apache.fineract.client.models.PostAccountNumberFormatsRequest;
import org.apache.fineract.client.models.PostAccountNumberFormatsResponse;
import org.apache.fineract.client.models.PutAccountNumberFormatsRequest;
import org.apache.fineract.client.models.PutAccountNumberFormatsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountNumberFormatApi {
  /**
   * Create an Account number format
   * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
   * @param postAccountNumberFormatsRequest  (optional)
   * @return Observable&lt;PostAccountNumberFormatsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accountnumberformats")
  Observable<PostAccountNumberFormatsResponse> create(
    @retrofit2.http.Body PostAccountNumberFormatsRequest postAccountNumberFormatsRequest
  );

  /**
   * Delete an Account number format
   * Note: Account numbers created while this format was active would remain unchanged.
   * @param accountNumberFormatId accountNumberFormatId (required)
   * @return Observable&lt;DeleteAccountNumberFormatsResponse&gt;
   */
  @DELETE("accountnumberformats/{accountNumberFormatId}")
  Observable<DeleteAccountNumberFormatsResponse> delete(
    @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
  );

  /**
   * List Account number formats
   * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
   * @return Observable&lt;List&lt;GetAccountNumberFormatsIdResponse&gt;&gt;
   */
  @GET("accountnumberformats")
  Observable<List<GetAccountNumberFormatsIdResponse>> retrieveAll3();
    

  /**
   * Retrieve an Account number format
   * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
   * @param accountNumberFormatId accountNumberFormatId (required)
   * @return Observable&lt;GetAccountNumberFormatsIdResponse&gt;
   */
  @GET("accountnumberformats/{accountNumberFormatId}")
  Observable<GetAccountNumberFormatsIdResponse> retrieveOne(
    @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
  );

  /**
   * Retrieve Account number format Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
   * @return Observable&lt;GetAccountNumberFormatsResponseTemplate&gt;
   */
  @GET("accountnumberformats/template")
  Observable<GetAccountNumberFormatsResponseTemplate> retrieveTemplate2();
    

  /**
   * Update an Account number format
   * 
   * @param accountNumberFormatId accountNumberFormatId (required)
   * @param putAccountNumberFormatsRequest  (required)
   * @return Observable&lt;PutAccountNumberFormatsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("accountnumberformats/{accountNumberFormatId}")
  Observable<PutAccountNumberFormatsResponse> update1(
    @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId, @retrofit2.http.Body PutAccountNumberFormatsRequest putAccountNumberFormatsRequest
  );

}
