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

import org.apache.fineract.client.models.GetMakerCheckerResponse;
import org.apache.fineract.client.models.GetMakerCheckersSearchTemplateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuditsApi {
  /**
   * List Audits
   * Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true
   * @param actionName actionName (optional)
   * @param entityName entityName (optional)
   * @param resourceId resourceId (optional)
   * @param makerId makerId (optional)
   * @param makerDateTimeFrom makerDateTimeFrom (optional)
   * @param makerDateTimeTo makerDateTimeTo (optional)
   * @param checkerId checkerId (optional)
   * @param checkerDateTimeFrom checkerDateTimeFrom (optional)
   * @param checkerDateTimeTo checkerDateTimeTo (optional)
   * @param processingResult processingResult (optional)
   * @param officeId officeId (optional)
   * @param groupId groupId (optional)
   * @param clientId clientId (optional)
   * @param loanid loanid (optional)
   * @param savingsAccountId savingsAccountId (optional)
   * @param paged paged (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Observable&lt;List&lt;GetMakerCheckerResponse&gt;&gt;
   */
  @GET("audits")
  Observable<List<GetMakerCheckerResponse>> retrieveAuditEntries(
    @retrofit2.http.Query("actionName") String actionName, @retrofit2.http.Query("entityName") String entityName, @retrofit2.http.Query("resourceId") Long resourceId, @retrofit2.http.Query("makerId") Long makerId, @retrofit2.http.Query("makerDateTimeFrom") String makerDateTimeFrom, @retrofit2.http.Query("makerDateTimeTo") String makerDateTimeTo, @retrofit2.http.Query("checkerId") Long checkerId, @retrofit2.http.Query("checkerDateTimeFrom") String checkerDateTimeFrom, @retrofit2.http.Query("checkerDateTimeTo") String checkerDateTimeTo, @retrofit2.http.Query("processingResult") Integer processingResult, @retrofit2.http.Query("officeId") Integer officeId, @retrofit2.http.Query("groupId") Integer groupId, @retrofit2.http.Query("clientId") Integer clientId, @retrofit2.http.Query("loanid") Integer loanid, @retrofit2.http.Query("savingsAccountId") Integer savingsAccountId, @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve an Audit Entry
   * Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult
   * @param auditId auditId (required)
   * @return Observable&lt;GetMakerCheckerResponse&gt;
   */
  @GET("audits/{auditId}")
  Observable<GetMakerCheckerResponse> retrieveAuditEntry(
    @retrofit2.http.Path("auditId") Long auditId
  );

  /**
   * Audit Search Template
   * This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames
   * @return Observable&lt;GetMakerCheckersSearchTemplateResponse&gt;
   */
  @GET("audits/searchtemplate")
  Observable<GetMakerCheckersSearchTemplateResponse> retrieveAuditSearchTemplate();
    

}
