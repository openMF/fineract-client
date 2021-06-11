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

import org.apache.fineract.client.models.CommandProcessingResult;
import org.apache.fineract.client.models.GetPermissionsResponse;
import org.apache.fineract.client.models.PutPermissionsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PermissionsApi {
  /**
   * List Application Permissions
   * ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code
   * @return Call&lt;List&lt;GetPermissionsResponse&gt;&gt;
   */
  @GET("permissions")
  Call<List<GetPermissionsResponse>> retrieveAllPermissions();
    

  /**
   * Enable/Disable Permissions for Maker Checker
   * 
   * @param putPermissionsRequest  (required)
   * @return Call&lt;CommandProcessingResult&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("permissions")
  Call<CommandProcessingResult> updatePermissionsDetails(
    @retrofit2.http.Body PutPermissionsRequest putPermissionsRequest
  );

}
