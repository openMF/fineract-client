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
   * @return Observable&lt;PostTellersTellerIdCashiersCashierIdAllocateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers/{cashierId}/allocate")
  Observable<PostTellersTellerIdCashiersCashierIdAllocateResponse> allocateCashToCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdAllocateRequest postTellersTellerIdCashiersCashierIdAllocateRequest
  );

  /**
   * Create Cashiers
   * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
   * @param tellerId tellerId (required)
   * @param postTellersTellerIdCashiersRequest  (required)
   * @return Observable&lt;PostTellersTellerIdCashiersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers")
  Observable<PostTellersTellerIdCashiersResponse> createCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PostTellersTellerIdCashiersRequest postTellersTellerIdCashiersRequest
  );

  /**
   * Create teller
   * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
   * @param postTellersRequest  (required)
   * @return Observable&lt;PostTellersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers")
  Observable<PostTellersResponse> createTeller(
    @retrofit2.http.Body PostTellersRequest postTellersRequest
  );

  /**
   * Delete Cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Observable&lt;DeleteTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @DELETE("tellers/{tellerId}/cashiers/{cashierId}")
  Observable<DeleteTellersTellerIdCashiersCashierIdResponse> deleteCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("tellers/{tellerId}")
  Observable<String> deleteTeller(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * Retrieve a cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Observable&lt;GetTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}")
  Observable<GetTellersTellerIdCashiersCashierIdResponse> findCashierData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * Retrieve tellers
   * 
   * @param tellerId tellerId (required)
   * @return Observable&lt;GetTellersResponse&gt;
   */
  @GET("tellers/{tellerId}")
  Observable<GetTellersResponse> findTeller(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param transactionId transactionId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("tellers/{tellerId}/transactions/{transactionId}")
  Observable<String> findTransactionData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * List Cashiers
   * 
   * @param tellerId tellerId (required)
   * @param fromdate fromdate (optional)
   * @param todate todate (optional)
   * @return Observable&lt;GetTellersTellerIdCashiersResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers")
  Observable<GetTellersTellerIdCashiersResponse> getCashierData1(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("fromdate") String fromdate, @retrofit2.http.Query("todate") String todate
  );

  /**
   * Find Cashiers
   * 
   * @param tellerId tellerId (required)
   * @return Observable&lt;GetTellersTellerIdCashiersTemplateResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/template")
  Observable<GetTellersTellerIdCashiersTemplateResponse> getCashierTemplate(
    @retrofit2.http.Path("tellerId") Long tellerId
  );

  /**
   * Retrieve Cashier Transaction Template
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @return Observable&lt;GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions/template")
  Observable<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> getCashierTxnTemplate(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (optional)
   * @param dateRange dateRange (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("tellers/{tellerId}/journals")
  Observable<String> getJournalData(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("cashierId") Long cashierId, @retrofit2.http.Query("dateRange") String dateRange
  );

  /**
   * List all tellers
   * Retrieves list tellers
   * @param officeId officeId (optional)
   * @return Observable&lt;List&lt;GetTellersResponse&gt;&gt;
   */
  @GET("tellers")
  Observable<List<GetTellersResponse>> getTellerData(
    @retrofit2.http.Query("officeId") Long officeId
  );

  /**
   * 
   * 
   * @param tellerId tellerId (required)
   * @param dateRange dateRange (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("tellers/{tellerId}/transactions")
  Observable<String> getTransactionData(
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
   * @return Observable&lt;List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions")
  Observable<List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse>> getTransactionsForCashier(
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
   * @return Observable&lt;GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse&gt;
   */
  @GET("tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions")
  Observable<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> getTransactionsWtihSummaryForCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Settle Cash From Cashier
   * Mandatory Fields Date, Amount, Currency, Notes/Comments
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param postTellersTellerIdCashiersCashierIdSettleRequest  (required)
   * @return Observable&lt;PostTellersTellerIdCashiersCashierIdSettleResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tellers/{tellerId}/cashiers/{cashierId}/settle")
  Observable<PostTellersTellerIdCashiersCashierIdSettleResponse> settleCashFromCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdSettleRequest postTellersTellerIdCashiersCashierIdSettleRequest
  );

  /**
   * Update Cashier
   * 
   * @param tellerId tellerId (required)
   * @param cashierId cashierId (required)
   * @param putTellersTellerIdCashiersCashierIdRequest  (required)
   * @return Observable&lt;PutTellersTellerIdCashiersCashierIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tellers/{tellerId}/cashiers/{cashierId}")
  Observable<PutTellersTellerIdCashiersCashierIdResponse> updateCashier(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PutTellersTellerIdCashiersCashierIdRequest putTellersTellerIdCashiersCashierIdRequest
  );

  /**
   * Update teller
   * 
   * @param tellerId tellerId (required)
   * @param putTellersRequest  (required)
   * @return Observable&lt;PutTellersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("tellers/{tellerId}")
  Observable<PutTellersResponse> updateTeller(
    @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PutTellersRequest putTellersRequest
  );

}
