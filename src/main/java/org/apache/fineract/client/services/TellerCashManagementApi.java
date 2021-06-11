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

import org.apache.fineract.client.models.DeleteTellersTellerIdCashiersCashierIdResponse;
import org.apache.fineract.client.models.GetTellersResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashierIdResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersTemplateResponse;
import org.apache.fineract.client.models.PostTellersRequest;
import org.apache.fineract.client.models.PostTellersResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdAllocateRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdAllocateResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdSettleRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdSettleResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersResponse;
import org.apache.fineract.client.models.PutTellersRequest;
import org.apache.fineract.client.models.PutTellersResponse;
import org.apache.fineract.client.models.PutTellersTellerIdCashiersCashierIdRequest;
import org.apache.fineract.client.models.PutTellersTellerIdCashiersCashierIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TellerCashManagementApi {
  /**
   * Allocate Cash To Cashier
   * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param postTellersTellerIdCashiersCashierIdAllocateRequest  (required)
   * @return Call&lt;PostTellersTellerIdCashiersCashierIdAllocateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers/{cashierId}/allocate")
  Call<PostTellersTellerIdCashiersCashierIdAllocateResponse> allocateCashToCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdAllocateRequest postTellersTellerIdCashiersCashierIdAllocateRequest
  );

  /**
   * Create Cashiers
   * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
   * @param tellerId tellerId (required)
   * @param postTellersTellerIdCashiersRequest  (required)
   * @return Call&lt;PostTellersTellerIdCashiersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers")
  Call<PostTellersTellerIdCashiersResponse> createCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PostTellersTellerIdCashiersRequest postTellersTellerIdCashiersRequest
  );

  /**
   * Create teller
   * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
   * @param postTellersRequest  (required)
   * @return Call&lt;PostTellersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers")
  Call<PostTellersResponse> createTeller(
    @retrofit2.http.Body PostTellersRequest postTellersRequest
  );

  /**
   * Delete Cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Call&lt;DeleteTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @DELETE("tellers/{tellerId}/cashiers/{cashierId}")
  Call<DeleteTellersTellerIdCashiersCashierIdResponse> deleteCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("tellers/{tellerId}")
  Call<String> deleteTeller(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * Retrieve a cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Call&lt;GetTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}")
  Call<GetTellersTellerIdCashiersCashierIdResponse> findCashierData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * Retrieve tellers
   * 
   * @param tellerId tellerId (required)
   * @return Call&lt;GetTellersResponse&gt;
   */
  @GET("tellers/{tellerId}")
  Call<GetTellersResponse> findTeller(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param transactionId transactionId (required)
   * @return Call&lt;String&gt;
   */
  @GET("tellers/{tellerId}/transactions/{transactionId}")
  Call<String> findTransactionData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * List Cashiers
   * 
   * @param tellerId tellerId (required)
   * @param fromdate fromdate (optional)
   * @param todate todate (optional)
   * @return Call&lt;GetTellersTellerIdCashiersResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers")
  Call<GetTellersTellerIdCashiersResponse> getCashierData1(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("fromdate") String fromdate, @retrofit2.http.Query("todate") String todate
  );

  /**
   * Find Cashiers
   * 
   * @param tellerId tellerId (required)
   * @return Call&lt;GetTellersTellerIdCashiersTemplateResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/template")
  Call<GetTellersTellerIdCashiersTemplateResponse> getCashierTemplate(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * Retrieve Cashier Transaction Template
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Call&lt;GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions/template")
  Call<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> getCashierTxnTemplate(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (optional)
   * @param dateRange dateRange (optional)
   * @return Call&lt;String&gt;
   */
  @GET("tellers/{tellerId}/journals")
  Call<String> getJournalData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("cashierId") Long cashierId, @retrofit2.http.Query("dateRange") String dateRange
  );

  /**
   * List all tellers
   * Retrieves list tellers
   * @param officeId officeId (optional)
   * @return Call&lt;List&lt;GetTellersResponse&gt;&gt;
   */
  @GET("tellers")
  Call<List<GetTellersResponse>> getTellerData(
    @retrofit2.http.Query("officeId") Long officeId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param dateRange dateRange (optional)
   * @return Call&lt;String&gt;
   */
  @GET("tellers/{tellerId}/transactions")
  Call<String> getTransactionData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("dateRange") String dateRange
  );

  /**
   * Retrieve Cashier Transaction
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param currencyCode currencyCode (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions")
  Call<List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse>> getTransactionsForCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Transactions Wtih Summary For Cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param currencyCode currencyCode (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions")
  Call<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> getTransactionsWtihSummaryForCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Settle Cash From Cashier
   * Mandatory Fields Date, Amount, Currency, Notes/Comments
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param postTellersTellerIdCashiersCashierIdSettleRequest  (required)
   * @return Call&lt;PostTellersTellerIdCashiersCashierIdSettleResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers/{cashierId}/settle")
  Call<PostTellersTellerIdCashiersCashierIdSettleResponse> settleCashFromCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdSettleRequest postTellersTellerIdCashiersCashierIdSettleRequest
  );

  /**
   * Update Cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param putTellersTellerIdCashiersCashierIdRequest  (required)
   * @return Call&lt;PutTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tellers/{tellerId}/cashiers/{cashierId}")
  Call<PutTellersTellerIdCashiersCashierIdResponse> updateCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PutTellersTellerIdCashiersCashierIdRequest putTellersTellerIdCashiersCashierIdRequest
  );

  /**
   * Update teller
   * 
   * @param tellerId tellerId (required)
   * @param putTellersRequest  (required)
   * @return Call&lt;PutTellersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tellers/{tellerId}")
  Call<PutTellersResponse> updateTeller(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PutTellersRequest putTellersRequest
  );

}
