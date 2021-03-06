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

public interface ClientFamilyMemberApi {
  /**
   * 
   * 
   * @param clientId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/familymembers")
  Observable<String> addClientFamilyMembers(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("clients/{clientId}/familymembers/{familyMemberId}")
  Observable<String> deleteClientFamilyMembers(
    @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers/{familyMemberId}")
  Observable<String> getFamilyMember(
    @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers")
  Observable<String> getFamilyMembers(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers/template")
  Observable<String> getTemplate2(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("clients/{clientId}/familymembers/{familyMemberId}")
  Observable<String> updateClientFamilyMembers(
    @retrofit2.http.Path("familyMemberId") Long familyMemberId, @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body String body
  );

}
