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
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.client.models.BodyPart;
import org.apache.fineract.client.models.BodyPartMediaType;
import org.apache.fineract.client.models.ContentDisposition;
import org.apache.fineract.client.models.ParameterizedHeader;

/**
 * MultiPart
 */

public class MultiPart {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Object entity;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, List<String>> headers = null;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private BodyPartMediaType mediaType;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private MultiPart parent;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private Object providers;

  public static final String SERIALIZED_NAME_BODY_PARTS = "bodyParts";
  @SerializedName(SERIALIZED_NAME_BODY_PARTS)
  private List<BodyPart> bodyParts = null;

  public static final String SERIALIZED_NAME_PARAMETERIZED_HEADERS = "parameterizedHeaders";
  @SerializedName(SERIALIZED_NAME_PARAMETERIZED_HEADERS)
  private Map<String, List<ParameterizedHeader>> parameterizedHeaders = null;

  public static final String SERIALIZED_NAME_CONTENT_DISPOSITION = "contentDisposition";
  @SerializedName(SERIALIZED_NAME_CONTENT_DISPOSITION)
  private ContentDisposition contentDisposition;


  public MultiPart entity(Object entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEntity() {
    return entity;
  }


  public void setEntity(Object entity) {
    this.entity = entity;
  }


  public MultiPart headers(Map<String, List<String>> headers) {
    
    this.headers = headers;
    return this;
  }

  public MultiPart putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, List<String>>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }


  public MultiPart mediaType(BodyPartMediaType mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BodyPartMediaType getMediaType() {
    return mediaType;
  }


  public void setMediaType(BodyPartMediaType mediaType) {
    this.mediaType = mediaType;
  }


  public MultiPart parent(MultiPart parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiPart getParent() {
    return parent;
  }


  public void setParent(MultiPart parent) {
    this.parent = parent;
  }


  public MultiPart providers(Object providers) {
    
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getProviders() {
    return providers;
  }


  public void setProviders(Object providers) {
    this.providers = providers;
  }


  public MultiPart bodyParts(List<BodyPart> bodyParts) {
    
    this.bodyParts = bodyParts;
    return this;
  }

  public MultiPart addBodyPartsItem(BodyPart bodyPartsItem) {
    if (this.bodyParts == null) {
      this.bodyParts = new ArrayList<BodyPart>();
    }
    this.bodyParts.add(bodyPartsItem);
    return this;
  }

   /**
   * Get bodyParts
   * @return bodyParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BodyPart> getBodyParts() {
    return bodyParts;
  }


  public void setBodyParts(List<BodyPart> bodyParts) {
    this.bodyParts = bodyParts;
  }


  public MultiPart parameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    
    this.parameterizedHeaders = parameterizedHeaders;
    return this;
  }

  public MultiPart putParameterizedHeadersItem(String key, List<ParameterizedHeader> parameterizedHeadersItem) {
    if (this.parameterizedHeaders == null) {
      this.parameterizedHeaders = new HashMap<String, List<ParameterizedHeader>>();
    }
    this.parameterizedHeaders.put(key, parameterizedHeadersItem);
    return this;
  }

   /**
   * Get parameterizedHeaders
   * @return parameterizedHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<ParameterizedHeader>> getParameterizedHeaders() {
    return parameterizedHeaders;
  }


  public void setParameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
  }


  public MultiPart contentDisposition(ContentDisposition contentDisposition) {
    
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentDisposition getContentDisposition() {
    return contentDisposition;
  }


  public void setContentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPart multiPart = (MultiPart) o;
    return Objects.equals(this.entity, multiPart.entity) &&
        Objects.equals(this.headers, multiPart.headers) &&
        Objects.equals(this.mediaType, multiPart.mediaType) &&
        Objects.equals(this.parent, multiPart.parent) &&
        Objects.equals(this.providers, multiPart.providers) &&
        Objects.equals(this.bodyParts, multiPart.bodyParts) &&
        Objects.equals(this.parameterizedHeaders, multiPart.parameterizedHeaders) &&
        Objects.equals(this.contentDisposition, multiPart.contentDisposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, headers, mediaType, parent, providers, bodyParts, parameterizedHeaders, contentDisposition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPart {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    bodyParts: ").append(toIndentedString(bodyParts)).append("\n");
    sb.append("    parameterizedHeaders: ").append(toIndentedString(parameterizedHeaders)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

