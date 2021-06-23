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

import org.apache.fineract.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;
import org.apache.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SavingsChargesApi {
  /**
   * Create a Savings account Charge
   * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
   * @param savingsAccountId savingsAccountId (required)
   * @param postSavingsAccountsSavingsAccountIdChargesRequest  (required)
   * @return Observable&lt;PostSavingsAccountsSavingsAccountIdChargesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsAccountId}/charges")
  Observable<PostSavingsAccountsSavingsAccountIdChargesResponse> addSavingsAccountCharge(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Body PostSavingsAccountsSavingsAccountIdChargesRequest postSavingsAccountsSavingsAccountIdChargesRequest
  );

  /**
   * Delete a Savings account Charge
   * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
   * @param savingsAccountId savingsAccountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @return Observable&lt;DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @DELETE("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
  Observable<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> deleteSavingsAccountCharge(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
  );

  /**
   * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
   * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;
   * @param savingsAccountId savingsAccountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @param postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
  Observable<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> payOrWaiveSavingsAccountCharge(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId, @retrofit2.http.Body PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * List Savings Charges
   * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
   * @param savingsAccountId savingsAccountId (required)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @return Observable&lt;List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;&gt;
   */
  @GET("savingsaccounts/{savingsAccountId}/charges")
  Observable<List<GetSavingsAccountsSavingsAccountIdChargesResponse>> retrieveAllSavingsAccountCharges(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
  );

  /**
   * Retrieve a Savings account Charge
   * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
   * @param savingsAccountId savingsAccountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @return Observable&lt;GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @GET("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
  Observable<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountCharge(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
  );

  /**
   * Retrieve Savings Charges Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template
   * @param savingsAccountId savingsAccountId (required)
   * @return Observable&lt;GetSavingsAccountsSavingsAccountIdChargesTemplateResponse&gt;
   */
  @GET("savingsaccounts/{savingsAccountId}/charges/template")
  Observable<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> retrieveTemplate17(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId
  );

  /**
   * Update a Savings account Charge
   * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
   * @param savingsAccountId savingsAccountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @param putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest  (required)
   * @return Observable&lt;PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
  Observable<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> updateSavingsAccountCharge(
    @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId, @retrofit2.http.Body PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
  );

}
