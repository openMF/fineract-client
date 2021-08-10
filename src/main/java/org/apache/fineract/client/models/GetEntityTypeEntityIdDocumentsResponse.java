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

/**
 * GetEntityTypeEntityIdDocumentsResponse
 */
@ApiModel(description = "GetEntityTypeEntityIdDocumentsResponse")

public class GetEntityTypeEntityIdDocumentsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PARENT_ENTITY_TYPE = "parentEntityType";
  @SerializedName(SERIALIZED_NAME_PARENT_ENTITY_TYPE)
  private String parentEntityType;

  public static final String SERIALIZED_NAME_PARENT_ENTITY_ID = "parentEntityId";
  @SerializedName(SERIALIZED_NAME_PARENT_ENTITY_ID)
  private Long parentEntityId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private Integer storageType;


  public GetEntityTypeEntityIdDocumentsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetEntityTypeEntityIdDocumentsResponse parentEntityType(String parentEntityType) {
    
    this.parentEntityType = parentEntityType;
    return this;
  }

   /**
   * Get parentEntityType
   * @return parentEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "clients", value = "")

  public String getParentEntityType() {
    return parentEntityType;
  }


  public void setParentEntityType(String parentEntityType) {
    this.parentEntityType = parentEntityType;
  }


  public GetEntityTypeEntityIdDocumentsResponse parentEntityId(Long parentEntityId) {
    
    this.parentEntityId = parentEntityId;
    return this;
  }

   /**
   * Get parentEntityId
   * @return parentEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getParentEntityId() {
    return parentEntityId;
  }


  public void setParentEntityId(Long parentEntityId) {
    this.parentEntityId = parentEntityId;
  }


  public GetEntityTypeEntityIdDocumentsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Details Form", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetEntityTypeEntityIdDocumentsResponse fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CGAP.pdf", value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public GetEntityTypeEntityIdDocumentsResponse size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5246719", value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public GetEntityTypeEntityIdDocumentsResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/pdf", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetEntityTypeEntityIdDocumentsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A signed form signed by new member", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetEntityTypeEntityIdDocumentsResponse location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public GetEntityTypeEntityIdDocumentsResponse storageType(Integer storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStorageType() {
    return storageType;
  }


  public void setStorageType(Integer storageType) {
    this.storageType = storageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEntityTypeEntityIdDocumentsResponse getEntityTypeEntityIdDocumentsResponse = (GetEntityTypeEntityIdDocumentsResponse) o;
    return Objects.equals(this.id, getEntityTypeEntityIdDocumentsResponse.id) &&
        Objects.equals(this.parentEntityType, getEntityTypeEntityIdDocumentsResponse.parentEntityType) &&
        Objects.equals(this.parentEntityId, getEntityTypeEntityIdDocumentsResponse.parentEntityId) &&
        Objects.equals(this.name, getEntityTypeEntityIdDocumentsResponse.name) &&
        Objects.equals(this.fileName, getEntityTypeEntityIdDocumentsResponse.fileName) &&
        Objects.equals(this.size, getEntityTypeEntityIdDocumentsResponse.size) &&
        Objects.equals(this.type, getEntityTypeEntityIdDocumentsResponse.type) &&
        Objects.equals(this.description, getEntityTypeEntityIdDocumentsResponse.description) &&
        Objects.equals(this.location, getEntityTypeEntityIdDocumentsResponse.location) &&
        Objects.equals(this.storageType, getEntityTypeEntityIdDocumentsResponse.storageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentEntityType, parentEntityId, name, fileName, size, type, description, location, storageType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEntityTypeEntityIdDocumentsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentEntityType: ").append(toIndentedString(parentEntityType)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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

