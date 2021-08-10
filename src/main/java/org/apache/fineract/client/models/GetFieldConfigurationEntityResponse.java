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
 * GetFieldConfigurationEntityResponse
 */
@ApiModel(description = "GetFieldConfigurationEntityResponse")

public class GetFieldConfigurationEntityResponse {
  public static final String SERIALIZED_NAME_FIELD_CONFIGURATION_ID = "fieldConfigurationId";
  @SerializedName(SERIALIZED_NAME_FIELD_CONFIGURATION_ID)
  private Integer fieldConfigurationId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_SUBENTITY = "subentity";
  @SerializedName(SERIALIZED_NAME_SUBENTITY)
  private String subentity;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private String isEnabled;

  public static final String SERIALIZED_NAME_IS_MANDATORY = "is_mandatory";
  @SerializedName(SERIALIZED_NAME_IS_MANDATORY)
  private String isMandatory;

  public static final String SERIALIZED_NAME_VALIDATION_REGEX = "validation_regex";
  @SerializedName(SERIALIZED_NAME_VALIDATION_REGEX)
  private String validationRegex;


  public GetFieldConfigurationEntityResponse fieldConfigurationId(Integer fieldConfigurationId) {
    
    this.fieldConfigurationId = fieldConfigurationId;
    return this;
  }

   /**
   * Get fieldConfigurationId
   * @return fieldConfigurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFieldConfigurationId() {
    return fieldConfigurationId;
  }


  public void setFieldConfigurationId(Integer fieldConfigurationId) {
    this.fieldConfigurationId = fieldConfigurationId;
  }


  public GetFieldConfigurationEntityResponse entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADDRESS", value = "")

  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public GetFieldConfigurationEntityResponse subentity(String subentity) {
    
    this.subentity = subentity;
    return this;
  }

   /**
   * Get subentity
   * @return subentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CLIENT", value = "")

  public String getSubentity() {
    return subentity;
  }


  public void setSubentity(String subentity) {
    this.subentity = subentity;
  }


  public GetFieldConfigurationEntityResponse field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "addressType", value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public GetFieldConfigurationEntityResponse isEnabled(String isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }


  public GetFieldConfigurationEntityResponse isMandatory(String isMandatory) {
    
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Get isMandatory
   * @return isMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getIsMandatory() {
    return isMandatory;
  }


  public void setIsMandatory(String isMandatory) {
    this.isMandatory = isMandatory;
  }


  public GetFieldConfigurationEntityResponse validationRegex(String validationRegex) {
    
    this.validationRegex = validationRegex;
    return this;
  }

   /**
   * Get validationRegex
   * @return validationRegex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidationRegex() {
    return validationRegex;
  }


  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFieldConfigurationEntityResponse getFieldConfigurationEntityResponse = (GetFieldConfigurationEntityResponse) o;
    return Objects.equals(this.fieldConfigurationId, getFieldConfigurationEntityResponse.fieldConfigurationId) &&
        Objects.equals(this.entity, getFieldConfigurationEntityResponse.entity) &&
        Objects.equals(this.subentity, getFieldConfigurationEntityResponse.subentity) &&
        Objects.equals(this.field, getFieldConfigurationEntityResponse.field) &&
        Objects.equals(this.isEnabled, getFieldConfigurationEntityResponse.isEnabled) &&
        Objects.equals(this.isMandatory, getFieldConfigurationEntityResponse.isMandatory) &&
        Objects.equals(this.validationRegex, getFieldConfigurationEntityResponse.validationRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationId, entity, subentity, field, isEnabled, isMandatory, validationRegex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFieldConfigurationEntityResponse {\n");
    sb.append("    fieldConfigurationId: ").append(toIndentedString(fieldConfigurationId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    subentity: ").append(toIndentedString(subentity)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
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

