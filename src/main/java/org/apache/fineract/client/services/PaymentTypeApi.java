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

import org.apache.fineract.client.models.DeletePaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesResponse;
import org.apache.fineract.client.models.PostPaymentTypesRequest;
import org.apache.fineract.client.models.PostPaymentTypesResponse;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdRequest;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PaymentTypeApi {
  /**
   * Create a Payment Type
   * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
   * @param postPaymentTypesRequest  (required)
   * @return Observable&lt;PostPaymentTypesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("paymenttypes")
  Observable<PostPaymentTypesResponse> createPaymentType(
    @retrofit2.http.Body PostPaymentTypesRequest postPaymentTypesRequest
  );

  /**
   * Delete a Payment Type
   * Deletes payment type
   * @param paymentTypeId paymentTypeId (required)
   * @return Observable&lt;DeletePaymentTypesPaymentTypeIdResponse&gt;
   */
  @DELETE("paymenttypes/{paymentTypeId}")
  Observable<DeletePaymentTypesPaymentTypeIdResponse> deleteCode1(
    @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
  );

  /**
   * Retrieve all Payment Types
   * Retrieve list of payment types
   * @return Observable&lt;List&lt;GetPaymentTypesResponse&gt;&gt;
   */
  @GET("paymenttypes")
  Observable<List<GetPaymentTypesResponse>> getAllPaymentTypes();
    

  /**
   * Retrieve a Payment Type
   * Retrieves a payment type
   * @param paymentTypeId paymentTypeId (required)
   * @return Observable&lt;GetPaymentTypesPaymentTypeIdResponse&gt;
   */
  @GET("paymenttypes/{paymentTypeId}")
  Observable<GetPaymentTypesPaymentTypeIdResponse> retrieveOnePaymentType(
    @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
  );

  /**
   * Update a Payment Type
   * Updates a Payment Type
   * @param paymentTypeId paymentTypeId (required)
   * @param putPaymentTypesPaymentTypeIdRequest  (required)
   * @return Observable&lt;PutPaymentTypesPaymentTypeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("paymenttypes/{paymentTypeId}")
  Observable<PutPaymentTypesPaymentTypeIdResponse> updatePaymentType(
    @retrofit2.http.Path("paymentTypeId") Long paymentTypeId, @retrofit2.http.Body PutPaymentTypesPaymentTypeIdRequest putPaymentTypesPaymentTypeIdRequest
  );

}
