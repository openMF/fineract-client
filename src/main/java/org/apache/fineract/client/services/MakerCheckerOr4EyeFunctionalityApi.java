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

import org.apache.fineract.client.models.GetMakerCheckerResponse;
import org.apache.fineract.client.models.GetMakerCheckersSearchTemplateResponse;
import org.apache.fineract.client.models.PostMakerCheckersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MakerCheckerOr4EyeFunctionalityApi {
  /**
   * Approve Maker Checker Entry | Reject Maker Checker Entry
   * 
   * @param auditId auditId (required)
   * @param command command (optional)
   * @return Observable&lt;PostMakerCheckersResponse&gt;
   */
  @POST("makercheckers/{auditId}")
  Observable<PostMakerCheckersResponse> approveMakerCheckerEntry(
    @retrofit2.http.Path("auditId") Long auditId, @retrofit2.http.Query("command") String command
  );

  /**
   * Delete Maker Checker Entry
   * 
   * @param auditId auditId (required)
   * @return Observable&lt;PostMakerCheckersResponse&gt;
   */
  @DELETE("makercheckers/{auditId}")
  Observable<PostMakerCheckersResponse> deleteMakerCheckerEntry(
    @retrofit2.http.Path("auditId") Long auditId
  );

  /**
   * Maker Checker Search Template
   * This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames
   * @return Observable&lt;GetMakerCheckersSearchTemplateResponse&gt;
   */
  @GET("makercheckers/searchtemplate")
  Observable<GetMakerCheckersSearchTemplateResponse> retrieveAuditSearchTemplate1();
    

  /**
   * List Maker Checker Entries
   * Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true
   * @param actionName actionName (optional)
   * @param entityName entityName (optional)
   * @param resourceId resourceId (optional)
   * @param makerId makerId (optional)
   * @param makerDateTimeFrom makerDateTimeFrom (optional)
   * @param makerDateTimeTo makerDateTimeTo (optional)
   * @param officeId officeId (optional)
   * @param groupId groupId (optional)
   * @param clientId clientId (optional)
   * @param loanid loanid (optional)
   * @param savingsAccountId savingsAccountId (optional)
   * @return Observable&lt;List&lt;GetMakerCheckerResponse&gt;&gt;
   */
  @GET("makercheckers")
  Observable<List<GetMakerCheckerResponse>> retrieveCommands(
    @retrofit2.http.Query("actionName") String actionName, @retrofit2.http.Query("entityName") String entityName, @retrofit2.http.Query("resourceId") Long resourceId, @retrofit2.http.Query("makerId") Long makerId, @retrofit2.http.Query("makerDateTimeFrom") String makerDateTimeFrom, @retrofit2.http.Query("makerDateTimeTo") String makerDateTimeTo, @retrofit2.http.Query("officeId") Integer officeId, @retrofit2.http.Query("groupId") Integer groupId, @retrofit2.http.Query("clientId") Integer clientId, @retrofit2.http.Query("loanid") Integer loanid, @retrofit2.http.Query("savingsAccountId") Integer savingsAccountId
  );

}
