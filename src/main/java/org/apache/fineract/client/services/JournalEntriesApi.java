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

import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.JournalEntryCommand;
import org.apache.fineract.client.models.JournalEntryData;
import org.apache.fineract.client.models.PostJournalEntriesResponse;
import org.apache.fineract.client.models.PostJournalEntriesTransactionIdRequest;
import org.apache.fineract.client.models.PostJournalEntriesTransactionIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JournalEntriesApi {
  /**
   * Create \&quot;Balanced\&quot; Journal Entries
   * Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber
   * @param command command (optional)
   * @param journalEntryCommand  (optional)
   * @return Observable&lt;PostJournalEntriesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("journalentries")
  Observable<PostJournalEntriesResponse> createGLJournalEntry(
    @retrofit2.http.Query("command") String command, @retrofit2.http.Body JournalEntryCommand journalEntryCommand
  );

  /**
   * Update Running balances for Journal Entries
   * This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId
   * @param transactionId transactionId (required)
   * @param command command (optional)
   * @param postJournalEntriesTransactionIdRequest  (optional)
   * @return Observable&lt;PostJournalEntriesTransactionIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("journalentries/{transactionId}")
  Observable<PostJournalEntriesTransactionIdResponse> createReversalJournalEntry(
    @retrofit2.http.Path("transactionId") String transactionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body PostJournalEntriesTransactionIdRequest postJournalEntriesTransactionIdRequest
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;Void&gt;
   */
  @GET("journalentries/downloadtemplate")
  Observable<Void> getJournalEntriesTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("journalentries/uploadtemplate")
  Observable<String> postJournalEntriesTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve a single Entry
   * Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true
   * @param journalEntryId journalEntryId (required)
   * @param runningBalance runningBalance (optional)
   * @param transactionDetails transactionDetails (optional)
   * @return Observable&lt;JournalEntryData&gt;
   */
  @GET("journalentries/{journalEntryId}")
  Observable<JournalEntryData> retreiveJournalEntryById(
    @retrofit2.http.Path("journalEntryId") Long journalEntryId, @retrofit2.http.Query("runningBalance") Boolean runningBalance, @retrofit2.http.Query("transactionDetails") Boolean transactionDetails
  );

  /**
   * List Journal Entries
   * The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24
   * @param officeId officeId (optional)
   * @param glAccountId glAccountId (optional)
   * @param manualEntriesOnly manualEntriesOnly (optional)
   * @param fromDate fromDate (optional)
   * @param toDate toDate (optional)
   * @param transactionId transactionId (optional)
   * @param entityType entityType (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @param locale locale (optional)
   * @param dateFormat dateFormat (optional)
   * @param loanId loanId (optional)
   * @param savingsId savingsId (optional)
   * @param runningBalance runningBalance (optional)
   * @param transactionDetails transactionDetails (optional)
   * @return Observable&lt;List&lt;JournalEntryData&gt;&gt;
   */
  @GET("journalentries")
  Observable<List<JournalEntryData>> retrieveAll1(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("glAccountId") Long glAccountId, @retrofit2.http.Query("manualEntriesOnly") Boolean manualEntriesOnly, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("transactionId") String transactionId, @retrofit2.http.Query("entityType") Integer entityType, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("loanId") Long loanId, @retrofit2.http.Query("savingsId") Long savingsId, @retrofit2.http.Query("runningBalance") Boolean runningBalance, @retrofit2.http.Query("transactionDetails") Boolean transactionDetails
  );

  /**
   * 
   * 
   * @param offset  (optional)
   * @param limit  (optional)
   * @param entryId  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("journalentries/provisioning")
  Observable<String> retrieveJournalEntries(
    @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("entryId") Long entryId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param currencyCode  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("journalentries/openingbalance")
  Observable<String> retrieveOpeningBalance(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("currencyCode") String currencyCode
  );

}
