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
import java.util.List;

/**
 * PostRepostRequest
 */
@ApiModel(description = "PostRepostRequest")

public class PostRepostRequest {
  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public static final String SERIALIZED_NAME_REPORT_SUB_TYPE = "reportSubType";
  @SerializedName(SERIALIZED_NAME_REPORT_SUB_TYPE)
  private String reportSubType;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "reportCategory";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPORT_SQL = "reportSql";
  @SerializedName(SERIALIZED_NAME_REPORT_SQL)
  private String reportSql;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "reportParameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private List<Object> reportParameters = null;


  public PostRepostRequest reportName(String reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Completely New Report", value = "")

  public String getReportName() {
    return reportName;
  }


  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public PostRepostRequest reportType(String reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Table", value = "")

  public String getReportType() {
    return reportType;
  }


  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public PostRepostRequest reportSubType(String reportSubType) {
    
    this.reportSubType = reportSubType;
    return this;
  }

   /**
   * Get reportSubType
   * @return reportSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportSubType() {
    return reportSubType;
  }


  public void setReportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
  }


  public PostRepostRequest reportCategory(String reportCategory) {
    
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Loan", value = "")

  public String getReportCategory() {
    return reportCategory;
  }


  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public PostRepostRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Just An Example", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostRepostRequest reportSql(String reportSql) {
    
    this.reportSql = reportSql;
    return this;
  }

   /**
   * Get reportSql
   * @return reportSql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "select 'very good sql' as AComment", value = "")

  public String getReportSql() {
    return reportSql;
  }


  public void setReportSql(String reportSql) {
    this.reportSql = reportSql;
  }


  public PostRepostRequest reportParameters(List<Object> reportParameters) {
    
    this.reportParameters = reportParameters;
    return this;
  }

  public PostRepostRequest addReportParametersItem(Object reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<Object>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getReportParameters() {
    return reportParameters;
  }


  public void setReportParameters(List<Object> reportParameters) {
    this.reportParameters = reportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRepostRequest postRepostRequest = (PostRepostRequest) o;
    return Objects.equals(this.reportName, postRepostRequest.reportName) &&
        Objects.equals(this.reportType, postRepostRequest.reportType) &&
        Objects.equals(this.reportSubType, postRepostRequest.reportSubType) &&
        Objects.equals(this.reportCategory, postRepostRequest.reportCategory) &&
        Objects.equals(this.description, postRepostRequest.description) &&
        Objects.equals(this.reportSql, postRepostRequest.reportSql) &&
        Objects.equals(this.reportParameters, postRepostRequest.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportName, reportType, reportSubType, reportCategory, description, reportSql, reportParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRepostRequest {\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportSubType: ").append(toIndentedString(reportSubType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportSql: ").append(toIndentedString(reportSql)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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

