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

import org.apache.fineract.client.models.GetPasswordPreferencesTemplateResponse;
import org.apache.fineract.client.models.PutPasswordPreferencesTemplateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PasswordPreferencesApi {
  /**
   * 
   * 
   * @return Observable&lt;GetPasswordPreferencesTemplateResponse&gt;
   */
  @GET("passwordpreferences")
  Observable<GetPasswordPreferencesTemplateResponse> retrieve1();
    

  /**
   * List Application Password validation policies
   * ARGUMENTS Example Requests:  passwordpreferences
   * @return Observable&lt;List&lt;GetPasswordPreferencesTemplateResponse&gt;&gt;
   */
  @GET("passwordpreferences/template")
  Observable<List<GetPasswordPreferencesTemplateResponse>> template21();
    

  /**
   * Update password preferences
   * 
   * @param putPasswordPreferencesTemplateRequest  (required)
   * @return Completable
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("passwordpreferences")
  Completable update23(
    @retrofit2.http.Body PutPasswordPreferencesTemplateRequest putPasswordPreferencesTemplateRequest
  );

}
