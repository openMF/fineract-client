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

/**
 * ResultsetColumnHeaderData
 */

public class ResultsetColumnHeaderData {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_COLUMN_TYPE = "columnType";
  @SerializedName(SERIALIZED_NAME_COLUMN_TYPE)
  private String columnType;

  public static final String SERIALIZED_NAME_COLUMN_LENGTH = "columnLength";
  @SerializedName(SERIALIZED_NAME_COLUMN_LENGTH)
  private Long columnLength;

  public static final String SERIALIZED_NAME_COLUMN_DISPLAY_TYPE = "columnDisplayType";
  @SerializedName(SERIALIZED_NAME_COLUMN_DISPLAY_TYPE)
  private String columnDisplayType;

  public static final String SERIALIZED_NAME_IS_COLUMN_NULLABLE = "isColumnNullable";
  @SerializedName(SERIALIZED_NAME_IS_COLUMN_NULLABLE)
  private Boolean isColumnNullable;

  public static final String SERIALIZED_NAME_IS_COLUMN_PRIMARY_KEY = "isColumnPrimaryKey";
  @SerializedName(SERIALIZED_NAME_IS_COLUMN_PRIMARY_KEY)
  private Boolean isColumnPrimaryKey;

  public static final String SERIALIZED_NAME_COLUMN_CODE = "columnCode";
  @SerializedName(SERIALIZED_NAME_COLUMN_CODE)
  private String columnCode;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private Boolean string;

  public static final String SERIALIZED_NAME_DATE_DISPLAY_TYPE = "dateDisplayType";
  @SerializedName(SERIALIZED_NAME_DATE_DISPLAY_TYPE)
  private Boolean dateDisplayType;

  public static final String SERIALIZED_NAME_DATE_TIME_DISPLAY_TYPE = "dateTimeDisplayType";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_DISPLAY_TYPE)
  private Boolean dateTimeDisplayType;

  public static final String SERIALIZED_NAME_INTEGER_DISPLAY_TYPE = "integerDisplayType";
  @SerializedName(SERIALIZED_NAME_INTEGER_DISPLAY_TYPE)
  private Boolean integerDisplayType;

  public static final String SERIALIZED_NAME_DECIMAL_DISPLAY_TYPE = "decimalDisplayType";
  @SerializedName(SERIALIZED_NAME_DECIMAL_DISPLAY_TYPE)
  private Boolean decimalDisplayType;

  public static final String SERIALIZED_NAME_BOOLEAN_DISPLAY_TYPE = "booleanDisplayType";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_DISPLAY_TYPE)
  private Boolean booleanDisplayType;

  public static final String SERIALIZED_NAME_CODE_VALUE_DISPLAY_TYPE = "codeValueDisplayType";
  @SerializedName(SERIALIZED_NAME_CODE_VALUE_DISPLAY_TYPE)
  private Boolean codeValueDisplayType;

  public static final String SERIALIZED_NAME_CODE_LOOKUP_DISPLAY_TYPE = "codeLookupDisplayType";
  @SerializedName(SERIALIZED_NAME_CODE_LOOKUP_DISPLAY_TYPE)
  private Boolean codeLookupDisplayType;


  public ResultsetColumnHeaderData columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public ResultsetColumnHeaderData columnType(String columnType) {
    
    this.columnType = columnType;
    return this;
  }

   /**
   * Get columnType
   * @return columnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnType() {
    return columnType;
  }


  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }


  public ResultsetColumnHeaderData columnLength(Long columnLength) {
    
    this.columnLength = columnLength;
    return this;
  }

   /**
   * Get columnLength
   * @return columnLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getColumnLength() {
    return columnLength;
  }


  public void setColumnLength(Long columnLength) {
    this.columnLength = columnLength;
  }


  public ResultsetColumnHeaderData columnDisplayType(String columnDisplayType) {
    
    this.columnDisplayType = columnDisplayType;
    return this;
  }

   /**
   * Get columnDisplayType
   * @return columnDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnDisplayType() {
    return columnDisplayType;
  }


  public void setColumnDisplayType(String columnDisplayType) {
    this.columnDisplayType = columnDisplayType;
  }


  public ResultsetColumnHeaderData isColumnNullable(Boolean isColumnNullable) {
    
    this.isColumnNullable = isColumnNullable;
    return this;
  }

   /**
   * Get isColumnNullable
   * @return isColumnNullable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsColumnNullable() {
    return isColumnNullable;
  }


  public void setIsColumnNullable(Boolean isColumnNullable) {
    this.isColumnNullable = isColumnNullable;
  }


  public ResultsetColumnHeaderData isColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    
    this.isColumnPrimaryKey = isColumnPrimaryKey;
    return this;
  }

   /**
   * Get isColumnPrimaryKey
   * @return isColumnPrimaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsColumnPrimaryKey() {
    return isColumnPrimaryKey;
  }


  public void setIsColumnPrimaryKey(Boolean isColumnPrimaryKey) {
    this.isColumnPrimaryKey = isColumnPrimaryKey;
  }


  public ResultsetColumnHeaderData columnCode(String columnCode) {
    
    this.columnCode = columnCode;
    return this;
  }

   /**
   * Get columnCode
   * @return columnCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnCode() {
    return columnCode;
  }


  public void setColumnCode(String columnCode) {
    this.columnCode = columnCode;
  }


  public ResultsetColumnHeaderData mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMandatory() {
    return mandatory;
  }


  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public ResultsetColumnHeaderData optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public ResultsetColumnHeaderData string(Boolean string) {
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getString() {
    return string;
  }


  public void setString(Boolean string) {
    this.string = string;
  }


  public ResultsetColumnHeaderData dateDisplayType(Boolean dateDisplayType) {
    
    this.dateDisplayType = dateDisplayType;
    return this;
  }

   /**
   * Get dateDisplayType
   * @return dateDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDateDisplayType() {
    return dateDisplayType;
  }


  public void setDateDisplayType(Boolean dateDisplayType) {
    this.dateDisplayType = dateDisplayType;
  }


  public ResultsetColumnHeaderData dateTimeDisplayType(Boolean dateTimeDisplayType) {
    
    this.dateTimeDisplayType = dateTimeDisplayType;
    return this;
  }

   /**
   * Get dateTimeDisplayType
   * @return dateTimeDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDateTimeDisplayType() {
    return dateTimeDisplayType;
  }


  public void setDateTimeDisplayType(Boolean dateTimeDisplayType) {
    this.dateTimeDisplayType = dateTimeDisplayType;
  }


  public ResultsetColumnHeaderData integerDisplayType(Boolean integerDisplayType) {
    
    this.integerDisplayType = integerDisplayType;
    return this;
  }

   /**
   * Get integerDisplayType
   * @return integerDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIntegerDisplayType() {
    return integerDisplayType;
  }


  public void setIntegerDisplayType(Boolean integerDisplayType) {
    this.integerDisplayType = integerDisplayType;
  }


  public ResultsetColumnHeaderData decimalDisplayType(Boolean decimalDisplayType) {
    
    this.decimalDisplayType = decimalDisplayType;
    return this;
  }

   /**
   * Get decimalDisplayType
   * @return decimalDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDecimalDisplayType() {
    return decimalDisplayType;
  }


  public void setDecimalDisplayType(Boolean decimalDisplayType) {
    this.decimalDisplayType = decimalDisplayType;
  }


  public ResultsetColumnHeaderData booleanDisplayType(Boolean booleanDisplayType) {
    
    this.booleanDisplayType = booleanDisplayType;
    return this;
  }

   /**
   * Get booleanDisplayType
   * @return booleanDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBooleanDisplayType() {
    return booleanDisplayType;
  }


  public void setBooleanDisplayType(Boolean booleanDisplayType) {
    this.booleanDisplayType = booleanDisplayType;
  }


  public ResultsetColumnHeaderData codeValueDisplayType(Boolean codeValueDisplayType) {
    
    this.codeValueDisplayType = codeValueDisplayType;
    return this;
  }

   /**
   * Get codeValueDisplayType
   * @return codeValueDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCodeValueDisplayType() {
    return codeValueDisplayType;
  }


  public void setCodeValueDisplayType(Boolean codeValueDisplayType) {
    this.codeValueDisplayType = codeValueDisplayType;
  }


  public ResultsetColumnHeaderData codeLookupDisplayType(Boolean codeLookupDisplayType) {
    
    this.codeLookupDisplayType = codeLookupDisplayType;
    return this;
  }

   /**
   * Get codeLookupDisplayType
   * @return codeLookupDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCodeLookupDisplayType() {
    return codeLookupDisplayType;
  }


  public void setCodeLookupDisplayType(Boolean codeLookupDisplayType) {
    this.codeLookupDisplayType = codeLookupDisplayType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsetColumnHeaderData resultsetColumnHeaderData = (ResultsetColumnHeaderData) o;
    return Objects.equals(this.columnName, resultsetColumnHeaderData.columnName) &&
        Objects.equals(this.columnType, resultsetColumnHeaderData.columnType) &&
        Objects.equals(this.columnLength, resultsetColumnHeaderData.columnLength) &&
        Objects.equals(this.columnDisplayType, resultsetColumnHeaderData.columnDisplayType) &&
        Objects.equals(this.isColumnNullable, resultsetColumnHeaderData.isColumnNullable) &&
        Objects.equals(this.isColumnPrimaryKey, resultsetColumnHeaderData.isColumnPrimaryKey) &&
        Objects.equals(this.columnCode, resultsetColumnHeaderData.columnCode) &&
        Objects.equals(this.mandatory, resultsetColumnHeaderData.mandatory) &&
        Objects.equals(this.optional, resultsetColumnHeaderData.optional) &&
        Objects.equals(this.string, resultsetColumnHeaderData.string) &&
        Objects.equals(this.dateDisplayType, resultsetColumnHeaderData.dateDisplayType) &&
        Objects.equals(this.dateTimeDisplayType, resultsetColumnHeaderData.dateTimeDisplayType) &&
        Objects.equals(this.integerDisplayType, resultsetColumnHeaderData.integerDisplayType) &&
        Objects.equals(this.decimalDisplayType, resultsetColumnHeaderData.decimalDisplayType) &&
        Objects.equals(this.booleanDisplayType, resultsetColumnHeaderData.booleanDisplayType) &&
        Objects.equals(this.codeValueDisplayType, resultsetColumnHeaderData.codeValueDisplayType) &&
        Objects.equals(this.codeLookupDisplayType, resultsetColumnHeaderData.codeLookupDisplayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, columnLength, columnDisplayType, isColumnNullable, isColumnPrimaryKey, columnCode, mandatory, optional, string, dateDisplayType, dateTimeDisplayType, integerDisplayType, decimalDisplayType, booleanDisplayType, codeValueDisplayType, codeLookupDisplayType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsetColumnHeaderData {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    columnLength: ").append(toIndentedString(columnLength)).append("\n");
    sb.append("    columnDisplayType: ").append(toIndentedString(columnDisplayType)).append("\n");
    sb.append("    isColumnNullable: ").append(toIndentedString(isColumnNullable)).append("\n");
    sb.append("    isColumnPrimaryKey: ").append(toIndentedString(isColumnPrimaryKey)).append("\n");
    sb.append("    columnCode: ").append(toIndentedString(columnCode)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    dateDisplayType: ").append(toIndentedString(dateDisplayType)).append("\n");
    sb.append("    dateTimeDisplayType: ").append(toIndentedString(dateTimeDisplayType)).append("\n");
    sb.append("    integerDisplayType: ").append(toIndentedString(integerDisplayType)).append("\n");
    sb.append("    decimalDisplayType: ").append(toIndentedString(decimalDisplayType)).append("\n");
    sb.append("    booleanDisplayType: ").append(toIndentedString(booleanDisplayType)).append("\n");
    sb.append("    codeValueDisplayType: ").append(toIndentedString(codeValueDisplayType)).append("\n");
    sb.append("    codeLookupDisplayType: ").append(toIndentedString(codeLookupDisplayType)).append("\n");
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

