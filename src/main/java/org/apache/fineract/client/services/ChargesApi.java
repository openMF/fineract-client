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

import org.apache.fineract.client.models.DeleteChargesChargeIdResponse;
import org.apache.fineract.client.models.GetChargesResponse;
import org.apache.fineract.client.models.GetChargesTemplateResponse;
import org.apache.fineract.client.models.PostChargesRequest;
import org.apache.fineract.client.models.PostChargesResponse;
import org.apache.fineract.client.models.PutChargesChargeIdRequest;
import org.apache.fineract.client.models.PutChargesChargeIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ChargesApi {
  /**
   * Create/Define a Charge
   * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
   * @param postChargesRequest  (required)
   * @return Observable&lt;PostChargesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("charges")
  Observable<PostChargesResponse> createCharge(
    @retrofit2.http.Body PostChargesRequest postChargesRequest
  );

  /**
   * Delete a Charge
   * Deletes a Charge.
   * @param chargeId chargeId (required)
   * @return Observable&lt;DeleteChargesChargeIdResponse&gt;
   */
  @DELETE("charges/{chargeId}")
  Observable<DeleteChargesChargeIdResponse> deleteCharge(
    @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * Retrieve Charges
   * Returns the list of defined charges.  Example Requests:  charges
   * @return Observable&lt;List&lt;GetChargesResponse&gt;&gt;
   */
  @GET("charges")
  Observable<List<GetChargesResponse>> retrieveAllCharges();
    

  /**
   * Retrieve a Charge
   * Returns the details of a defined Charge.  Example Requests:  charges/1
   * @param chargeId chargeId (required)
   * @return Observable&lt;GetChargesResponse&gt;
   */
  @GET("charges/{chargeId}")
  Observable<GetChargesResponse> retrieveCharge(
    @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * Retrieve Charge Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 
   * @return Observable&lt;GetChargesTemplateResponse&gt;
   */
  @GET("charges/template")
  Observable<GetChargesTemplateResponse> retrieveNewChargeDetails();
    

  /**
   * Update a Charge
   * Updates the details of a Charge.
   * @param chargeId chargeId (required)
   * @param putChargesChargeIdRequest  (required)
   * @return Observable&lt;PutChargesChargeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("charges/{chargeId}")
  Observable<PutChargesChargeIdResponse> updateCharge(
    @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutChargesChargeIdRequest putChargesChargeIdRequest
  );

}
