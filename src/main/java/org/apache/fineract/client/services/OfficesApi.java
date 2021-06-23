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

import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetOfficesResponse;
import org.apache.fineract.client.models.GetOfficesTemplateResponse;
import org.apache.fineract.client.models.PostOfficesRequest;
import org.apache.fineract.client.models.PostOfficesResponse;
import org.apache.fineract.client.models.PutOfficesOfficeIdRequest;
import org.apache.fineract.client.models.PutOfficesOfficeIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OfficesApi {
  /**
   * Create an Office
   * Mandatory Fields name, openingDate, parentId
   * @param postOfficesRequest  (required)
   * @return Observable&lt;PostOfficesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("offices")
  Observable<PostOfficesResponse> createOffice(
    @retrofit2.http.Body PostOfficesRequest postOfficesRequest
  );

  /**
   * 
   * 
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("offices/downloadtemplate")
  Completable getOfficeTemplate(
    @retrofit2.http.Query("dateFormat") String dateFormat
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
  @POST("offices/uploadtemplate")
  Observable<String> postOfficeTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve an Office
   * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
   * @param officeId officeId (required)
   * @return Observable&lt;GetOfficesResponse&gt;
   */
  @GET("offices/{officeId}")
  Observable<GetOfficesResponse> retreiveOffice(
    @retrofit2.http.Path("officeId") Long officeId
  );

  /**
   * Retrieve Office Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template
   * @return Observable&lt;GetOfficesTemplateResponse&gt;
   */
  @GET("offices/template")
  Observable<GetOfficesTemplateResponse> retrieveOfficeTemplate1();
    

  /**
   * List Offices
   * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
   * @param includeAllOffices includeAllOffices (optional, default to false)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Observable&lt;List&lt;GetOfficesResponse&gt;&gt;
   */
  @GET("offices")
  Observable<List<GetOfficesResponse>> retrieveOffices(
    @retrofit2.http.Query("includeAllOffices") Boolean includeAllOffices, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Update Office
   * 
   * @param officeId officeId (required)
   * @param putOfficesOfficeIdRequest  (required)
   * @return Observable&lt;PutOfficesOfficeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("offices/{officeId}")
  Observable<PutOfficesOfficeIdResponse> updateOffice(
    @retrofit2.http.Path("officeId") Long officeId, @retrofit2.http.Body PutOfficesOfficeIdRequest putOfficesOfficeIdRequest
  );

}
