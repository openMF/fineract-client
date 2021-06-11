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
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetClientClientIdAddressesResponse;
import org.apache.fineract.client.models.PostClientClientIdAddressesRequest;
import org.apache.fineract.client.models.PostClientClientIdAddressesResponse;
import org.apache.fineract.client.models.PutClientClientIdAddressesRequest;
import org.apache.fineract.client.models.PutClientClientIdAddressesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientsAddressApi {
  /**
   * Create an address for a Client
   * Mandatory Fields :  type and clientId
   * @param clientid clientId (required)
   * @param postClientClientIdAddressesRequest  (required)
   * @param type type (optional)
   * @return Call&lt;PostClientClientIdAddressesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("client/{clientid}/addresses")
  Call<PostClientClientIdAddressesResponse> addClientAddress(
    @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Body PostClientClientIdAddressesRequest postClientClientIdAddressesRequest, @retrofit2.http.Query("type") Long type
  );

  /**
   * List all addresses for a Client
   * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
   * @param clientid clientId (required)
   * @param status status (optional)
   * @param type type (optional)
   * @return Call&lt;List&lt;GetClientClientIdAddressesResponse&gt;&gt;
   */
  @GET("client/{clientid}/addresses")
  Call<List<GetClientClientIdAddressesResponse>> getAddresses1(
    @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("type") Long type
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("client/addresses/template")
  Call<String> getAddressesTemplate();
    

  /**
   * Update an address for a Client
   * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
   * @param clientid clientId (required)
   * @param putClientClientIdAddressesRequest  (required)
   * @return Call&lt;PutClientClientIdAddressesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("client/{clientid}/addresses")
  Call<PutClientClientIdAddressesResponse> updateClientAddress(
    @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Body PutClientClientIdAddressesRequest putClientClientIdAddressesRequest
  );

}
