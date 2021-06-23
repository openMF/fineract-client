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

import org.apache.fineract.client.models.CommandProcessingResult;
import org.apache.fineract.client.models.CommandWrapper;
import org.apache.fineract.client.models.FormDataBodyPart;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.SmsCampaignData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * 
   * 
   * @param resourceId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email/campaign/{resourceId}")
  Observable<String> activate(
    @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param creditBureauId creditBureauId (optional)
   * @param file  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("creditBureauIntegration/addCreditReport")
  Observable<String> addCreditReport(
    @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Part("file") FormDataContentDisposition file
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param contentLength  (optional)
   * @param file  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("{entity}/{entityId}/images")
  Observable<String> addNewClientImage1(
    @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("file") FormDataBodyPart file
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email")
  Observable<String> create1(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email/campaign")
  Observable<String> createCampaign(
    @retrofit2.http.Body String body
  );

  /**
   * Create a SMS Campaign
   * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
   * @param commandWrapper  (required)
   * @return Observable&lt;CommandProcessingResult&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("smscampaigns")
  Observable<CommandProcessingResult> createCampaign1(
    @retrofit2.http.Body CommandWrapper commandWrapper
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("email/{resourceId}")
  Observable<String> delete1(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("email/campaign/{resourceId}")
  Observable<String> delete2(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * Delete a SMS Campaign
   * Note: Only closed SMS Campaigns can be deleted
   * @param campaignId  (required)
   * @return Observable&lt;CommandProcessingResult&gt;
   */
  @DELETE("smscampaigns/{campaignId}")
  Observable<CommandProcessingResult> delete3(
    @retrofit2.http.Path("campaignId") Long campaignId
  );

  /**
   * 
   * 
   * @param transactionId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("officetransactions/{transactionId}")
  Observable<String> delete8(
    @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("{entity}/{entityId}/images")
  Observable<String> deleteClientImage(
    @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * 
   * 
   * @param creditBureauId creditBureauId (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("creditBureauIntegration/deleteCreditReport/{creditBureauId}")
  Observable<String> deleteCreditReport(
    @retrofit2.http.Path("creditBureauId") Long creditBureauId
  );

  /**
   * 
   * 
   * @param requestBody  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("creditBureauIntegration/creditReport")
  Observable<String> fetchCreditReport(
    @retrofit2.http.Body Map<String, Object> requestBody
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("echo")
  Observable<String> get();
    

  /**
   * 
   * 
   * @param creditBureauId creditBureauId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("creditBureauIntegration/creditReport/{creditBureauId}")
  Observable<String> getSavedCreditReport(
    @retrofit2.http.Path("creditBureauId") Long creditBureauId
  );

  /**
   * SMS Campaign
   * Activates | Deactivates | Reactivates
   * @param campaignId  (required)
   * @param command  (optional)
   * @return Observable&lt;CommandProcessingResult&gt;
   */
  @POST("smscampaigns/{campaignId}")
  Observable<CommandProcessingResult> handleCommands(
    @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("command") String command
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("officetransactions/template")
  Observable<String> newOfficeTransactionDetails();
    

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email/campaign/preview")
  Observable<String> preview(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("smscampaigns/preview")
  Observable<String> preview1(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("email/configuration")
  Observable<String> retrieveAll5();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("twofactor/configure")
  Observable<String> retrieveAll9();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("email/campaign")
  Observable<String> retrieveAllCampaign();
    

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param status  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @param fromDate  (optional)
   * @param toDate  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("email/messageByStatus")
  Observable<String> retrieveAllEmailByStatus(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("status") Integer status, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("fromDate") Object fromDate, @retrofit2.http.Query("toDate") Object toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("email")
  Observable<String> retrieveAllEmails();
    

  /**
   * List SMS Campaigns
   * Example Requests:  smscampaigns
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Observable&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns")
  Observable<SmsCampaignData> retrieveAllEmails1(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve a SMS Campaign
   * Example Requests:  smscampaigns/1 
   * @param resourceId  (required)
   * @return Observable&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns/{resourceId}")
  Observable<SmsCampaignData> retrieveCampaign(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("email/failedEmail")
  Observable<String> retrieveFailedEmail(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param maxWidth  (optional)
   * @param maxHeight  (optional)
   * @param output  (optional)
   * @param accept  (optional)
   * @return Completable
   */
  @GET("{entity}/{entityId}/images")
  Completable retrieveImage(
    @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output, @retrofit2.http.Header("Accept") String accept
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("officetransactions")
  Observable<String> retrieveOfficeTransactions();
    

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("email/{resourceId}")
  Observable<String> retrieveOne1(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("email/campaign/{resourceId}")
  Observable<String> retrieveOneCampaign(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("email/campaign/template/{resourceId}")
  Observable<String> retrieveOneTemplate(
    @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("email/pendingEmail")
  Observable<String> retrievePendingEmail(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("email/sentEmail")
  Observable<String> retrieveSentEmail(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * 
   * 
   * @param creditBureauId creditBureauId (optional)
   * @param nationalId nationalId (optional)
   * @return Observable&lt;String&gt;
   */
  @POST("creditBureauIntegration/saveCreditReport")
  Observable<String> saveCreditReport(
    @retrofit2.http.Query("creditBureauId") Long creditBureauId, @retrofit2.http.Query("nationalId") String nationalId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("email/campaign/template")
  Observable<String> template1();
    

  /**
   * Retrieve a SMS Campaign
   * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
   * @return Observable&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns/template")
  Observable<SmsCampaignData> template2();
    

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("officetransactions")
  Observable<String> transferMoneyFrom(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("email/{resourceId}")
  Observable<String> update2(
    @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("email/campaign/{resourceId}")
  Observable<String> updateCampaign(
    @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
  );

  /**
   * Update a Campaign
   * 
   * @param campaignId  (required)
   * @param commandWrapper  (required)
   * @return Observable&lt;CommandProcessingResult&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("smscampaigns/{campaignId}")
  Observable<CommandProcessingResult> updateCampaign1(
    @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Body CommandWrapper commandWrapper
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param contentLength  (optional)
   * @param file  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @PUT("{entity}/{entityId}/images")
  Observable<String> updateClientImage1(
    @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("file") FormDataBodyPart file
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("email/configuration")
  Observable<String> updateConfiguration(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("twofactor/configure")
  Observable<String> updateConfiguration3(
    @retrofit2.http.Body String body
  );

}
