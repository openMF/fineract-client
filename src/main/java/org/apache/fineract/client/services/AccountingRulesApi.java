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

import org.apache.fineract.client.models.AccountingRuleData;
import org.apache.fineract.client.models.DeleteAccountingRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesTemplateResponse;
import org.apache.fineract.client.models.PostAccountingRulesRequest;
import org.apache.fineract.client.models.PostAccountingRulesResponse;
import org.apache.fineract.client.models.PutAccountingRulesRequest;
import org.apache.fineract.client.models.PutAccountingRulesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountingRulesApi {
  /**
   * Create/Define a Accounting rule
   * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
   * @param postAccountingRulesRequest  (optional)
   * @return Observable&lt;PostAccountingRulesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accountingrules")
  Observable<PostAccountingRulesResponse> createAccountingRule(
    @retrofit2.http.Body PostAccountingRulesRequest postAccountingRulesRequest
  );

  /**
   * Delete a Accounting Rule
   * Deletes a Accounting rule.
   * @param accountingRuleId accountingRuleId (required)
   * @return Observable&lt;DeleteAccountingRulesResponse&gt;
   */
  @DELETE("accountingrules/{accountingRuleId}")
  Observable<DeleteAccountingRulesResponse> deleteAccountingRule(
    @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
  );

  /**
   * Retrieve a Accounting rule
   * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
   * @param accountingRuleId accountingRuleId (required)
   * @return Observable&lt;AccountingRuleData&gt;
   */
  @GET("accountingrules/{accountingRuleId}")
  Observable<AccountingRuleData> retreiveAccountingRule(
    @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
  );

  /**
   * Retrieve Accounting Rules
   * Returns the list of defined accounting rules.  Example Requests:  accountingrules
   * @return Observable&lt;List&lt;GetAccountRulesResponse&gt;&gt;
   */
  @GET("accountingrules")
  Observable<List<GetAccountRulesResponse>> retrieveAllAccountingRules();
    

  /**
   * Retrieve Accounting Rule Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
   * @return Observable&lt;GetAccountRulesTemplateResponse&gt;
   */
  @GET("accountingrules/template")
  Observable<GetAccountRulesTemplateResponse> retrieveTemplate1();
    

  /**
   * Update a Accounting Rule
   * Updates the details of a Accounting rule.
   * @param accountingRuleId accountingRuleId (required)
   * @param putAccountingRulesRequest  (optional)
   * @return Observable&lt;PutAccountingRulesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("accountingrules/{accountingRuleId}")
  Observable<PutAccountingRulesResponse> updateAccountingRule(
    @retrofit2.http.Path("accountingRuleId") Long accountingRuleId, @retrofit2.http.Body PutAccountingRulesRequest putAccountingRulesRequest
  );

}
