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

import org.apache.fineract.client.models.DeleteClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetClientsChargesPageItems;
import org.apache.fineract.client.models.GetClientsClientIdChargesResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientChargesApi {
  /**
   * Add Client Charge
   *  This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
   * @param clientId clientId (required)
   * @param postClientsClientIdChargesRequest  (required)
   * @return Observable&lt;PostClientsClientIdChargesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/charges")
  Observable<PostClientsClientIdChargesResponse> applyClientCharge(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientsClientIdChargesRequest postClientsClientIdChargesRequest
  );

  /**
   * Delete a Client Charge
   * Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @return Observable&lt;DeleteClientsClientIdChargesChargeIdResponse&gt;
   */
  @DELETE("clients/{clientId}/charges/{chargeId}")
  Observable<DeleteClientsClientIdChargesChargeIdResponse> deleteClientCharge(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * Pay a Client Charge | Waive a Client Charge
   * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @param postClientsClientIdChargesChargeIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostClientsClientIdChargesChargeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/charges/{chargeId}")
  Observable<PostClientsClientIdChargesChargeIdResponse> payOrWaiveClientCharge(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PostClientsClientIdChargesChargeIdRequest postClientsClientIdChargesChargeIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * List Client Charges
   * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
   * @param clientId clientId (required)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @param pendingPayment pendingPayment (optional)
   * @param limit limit (optional)
   * @param offset offset (optional)
   * @return Observable&lt;GetClientsClientIdChargesResponse&gt;
   */
  @GET("clients/{clientId}/charges")
  Observable<GetClientsClientIdChargesResponse> retrieveAllClientCharges(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("chargeStatus") String chargeStatus, @retrofit2.http.Query("pendingPayment") Boolean pendingPayment, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Retrieve a Client Charge
   * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @return Observable&lt;GetClientsChargesPageItems&gt;
   */
  @GET("clients/{clientId}/charges/{chargeId}")
  Observable<GetClientsChargesPageItems> retrieveClientCharge(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * 
   * 
   * @param clientId clientId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/charges/template")
  Observable<String> retrieveTemplate4(
    @retrofit2.http.Path("clientId") Long clientId
  );

}
