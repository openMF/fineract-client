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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FineractEntityApi {
  /**
   * 
   * 
   * @param relId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("entitytoentitymapping/{relId}")
  Call<String> createMap(
    @retrofit2.http.Path("relId") Long relId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("entitytoentitymapping/{mapId}")
  Call<String> delete4(
    @retrofit2.http.Path("mapId") Long mapId
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @param fromId  (required)
   * @param toId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
  Call<String> getEntityToEntityMappings(
    @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Path("fromId") Long fromId, @retrofit2.http.Path("toId") Long toId
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping")
  Call<String> retrieveAll7();
    

  /**
   * 
   * 
   * @param mapId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping/{mapId}")
  Call<String> retrieveOne4(
    @retrofit2.http.Path("mapId") Long mapId
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("entitytoentitymapping/{mapId}")
  Call<String> updateMap(
    @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Body String body
  );

}
