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
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
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
import java.util.List;

/**
 * GetGroupsTemplateColumnHeaderData
 */

public class GetGroupsTemplateColumnHeaderData {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_COLUMN_TYPE = "columnType";
  @SerializedName(SERIALIZED_NAME_COLUMN_TYPE)
  private String columnType;

  public static final String SERIALIZED_NAME_COLUMN_LENGTH = "columnLength";
  @SerializedName(SERIALIZED_NAME_COLUMN_LENGTH)
  private Integer columnLength;

  public static final String SERIALIZED_NAME_COLUMN_DISPLAY_TYPE = "columnDisplayType";
  @SerializedName(SERIALIZED_NAME_COLUMN_DISPLAY_TYPE)
  private String columnDisplayType;

  public static final String SERIALIZED_NAME_IS_COLUMN_NULLABLE = "isColumnNullable";
  @SerializedName(SERIALIZED_NAME_IS_COLUMN_NULLABLE)
  private Boolean isColumnNullable;

  public static final String SERIALIZED_NAME_IS_COLUMN_PRIMARY_KEY = "isColumnPrimaryKey";
  @SerializedName(SERIALIZED_NAME_IS_COLUMN_PRIMARY_KEY)
  private Boolean isColumnPrimaryKey;

  public static final String SERIALIZED_NAME_COLUMN_VALUES = "columnValues";
  @SerializedName(SERIALIZED_NAME_COLUMN_VALUES)
  private List<Object> columnValues = null;


  public GetGroupsTemplateColumnHeaderData columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group_id", value = "")

  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public GetGroupsTemplateColumnHeaderData columnType(String columnType) {
    
    this.columnType = columnType;
    return this;
  }

   /**
   * Get columnType
   * @return columnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bigint", value = "")

  public String getColumnType() {
    return columnType;
  }


  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }


  public GetGroupsTemplateColumnHeaderData columnLength(Integer columnLength) {
    
    this.columnLength = columnLength;
    return this;
  }

   /**
   * Get columnLength
   * @return columnLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getColumnLength() {
    return columnLength;
  }


  public void setColumnLength(Integer columnLength) {
    this.columnLength = columnLength;
  }


  public GetGroupsTemplateColumnHeaderData columnDisplayType(String columnDisplayType) {
    
    this.columnDisplayType = columnDisplayType;
    return this;
  }

   /**
   * Get columnDisplayType
   * @return columnDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INTEGER", value = "")

  public String getColumnDisplayType() {
    return columnDisplayType;
  }


  public void setColumnDisplayType(String columnDisplayType) {
    this.columnDisplayType = columnDisplayType;
  }


  public GetGroupsTemplateColumnHeaderData isColumnNullable(Boolean isColumnNullable) {
    
    this.isColumnNullable = isColumnNullable;
    return this;
  }

   /**
   * Get isColumnNullable
   * @return isColumnNullable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsColumnNullable() {
    return isColumnNullable;
  }


  public void setIsColumnNullable(Boolean isColumnNullable) {
    this.isColumnNullable = isColumnNullable;
  }


  public GetGroupsTemplateColumnHeaderData isColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    
    this.isColumnPrimaryKey = isColumnPrimaryKey;
    return this;
  }

   /**
   * Get isColumnPrimaryKey
   * @return isColumnPrimaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsColumnPrimaryKey() {
    return isColumnPrimaryKey;
  }


  public void setIsColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    this.isColumnPrimaryKey = isColumnPrimaryKey;
  }


  public GetGroupsTemplateColumnHeaderData columnValues(List<Object> columnValues) {
    
    this.columnValues = columnValues;
    return this;
  }

  public GetGroupsTemplateColumnHeaderData addColumnValuesItem(Object columnValuesItem) {
    if (this.columnValues == null) {
      this.columnValues = new ArrayList<Object>();
    }
    this.columnValues.add(columnValuesItem);
    return this;
  }

   /**
   * Get columnValues
   * @return columnValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getColumnValues() {
    return columnValues;
  }


  public void setColumnValues(List<Object> columnValues) {
    this.columnValues = columnValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsTemplateColumnHeaderData getGroupsTemplateColumnHeaderData = (GetGroupsTemplateColumnHeaderData) o;
    return Objects.equals(this.columnName, getGroupsTemplateColumnHeaderData.columnName) &&
        Objects.equals(this.columnType, getGroupsTemplateColumnHeaderData.columnType) &&
        Objects.equals(this.columnLength, getGroupsTemplateColumnHeaderData.columnLength) &&
        Objects.equals(this.columnDisplayType, getGroupsTemplateColumnHeaderData.columnDisplayType) &&
        Objects.equals(this.isColumnNullable, getGroupsTemplateColumnHeaderData.isColumnNullable) &&
        Objects.equals(this.isColumnPrimaryKey, getGroupsTemplateColumnHeaderData.isColumnPrimaryKey) &&
        Objects.equals(this.columnValues, getGroupsTemplateColumnHeaderData.columnValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, columnLength, columnDisplayType, isColumnNullable, isColumnPrimaryKey, columnValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsTemplateColumnHeaderData {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    columnLength: ").append(toIndentedString(columnLength)).append("\n");
    sb.append("    columnDisplayType: ").append(toIndentedString(columnDisplayType)).append("\n");
    sb.append("    isColumnNullable: ").append(toIndentedString(isColumnNullable)).append("\n");
    sb.append("    isColumnPrimaryKey: ").append(toIndentedString(isColumnPrimaryKey)).append("\n");
    sb.append("    columnValues: ").append(toIndentedString(columnValues)).append("\n");
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

