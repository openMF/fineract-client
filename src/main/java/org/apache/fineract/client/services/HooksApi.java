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

import org.apache.fineract.client.models.DeleteHookResponse;
import org.apache.fineract.client.models.GetHookResponse;
import org.apache.fineract.client.models.GetHookTemplateResponse;
import org.apache.fineract.client.models.PostHookRequest;
import org.apache.fineract.client.models.PostHookResponse;
import org.apache.fineract.client.models.PutHookRequest;
import org.apache.fineract.client.models.PutHookResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HooksApi {
  /**
   * Create a Hook
   * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
   * @param postHookRequest  (required)
   * @return Observable&lt;PostHookResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("hooks")
  Observable<PostHookResponse> createHook(
    @retrofit2.http.Body PostHookRequest postHookRequest
  );

  /**
   * Delete a Hook
   * Deletes a hook.
   * @param hookId hookId (required)
   * @return Observable&lt;DeleteHookResponse&gt;
   */
  @DELETE("hooks/{hookId}")
  Observable<DeleteHookResponse> deleteHook(
    @retrofit2.http.Path("hookId") Long hookId
  );

  /**
   * Retrieve a Hook
   * Returns the details of a Hook.  Example Requests:  hooks/1
   * @param hookId hookId (required)
   * @return Observable&lt;GetHookResponse&gt;
   */
  @GET("hooks/{hookId}")
  Observable<GetHookResponse> retrieveHook(
    @retrofit2.http.Path("hookId") Long hookId
  );

  /**
   * Retrieve Hooks
   * Returns the list of hooks.  Example Requests:  hooks
   * @return Observable&lt;List&lt;GetHookResponse&gt;&gt;
   */
  @GET("hooks")
  Observable<List<GetHookResponse>> retrieveHooks();
    

  /**
   * Retrieve Hooks Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template
   * @return Observable&lt;GetHookTemplateResponse&gt;
   */
  @GET("hooks/template")
  Observable<GetHookTemplateResponse> template3();
    

  /**
   * Update a Hook
   * Updates the details of a hook.
   * @param hookId hookId (required)
   * @param putHookRequest  (required)
   * @return Observable&lt;PutHookResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("hooks/{hookId}")
  Observable<PutHookResponse> updateHook(
    @retrofit2.http.Path("hookId") Long hookId, @retrofit2.http.Body PutHookRequest putHookRequest
  );

}
