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

import org.apache.fineract.client.models.PostSelfAuthenticationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfAuthenticationApi {
  /**
   * Verify authentication
   * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfbasicauth
   * @param body  (optional)
   * @return Observable&lt;PostSelfAuthenticationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/authentication")
  Observable<PostSelfAuthenticationResponse> authenticate1(
    @retrofit2.http.Body String body
  );

}
