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
import java.util.Date;

/**
 * JobDetailHistoryDataSwagger
 */

public class JobDetailHistoryDataSwagger {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Long version;

  public static final String SERIALIZED_NAME_JOB_RUN_START_TIME = "jobRunStartTime";
  @SerializedName(SERIALIZED_NAME_JOB_RUN_START_TIME)
  private Date jobRunStartTime;

  public static final String SERIALIZED_NAME_JOB_RUN_END_TIME = "jobRunEndTime";
  @SerializedName(SERIALIZED_NAME_JOB_RUN_END_TIME)
  private Date jobRunEndTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRIGGER_TYPE = "triggerType";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TYPE)
  private String triggerType;


  public JobDetailHistoryDataSwagger version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public JobDetailHistoryDataSwagger jobRunStartTime(Date jobRunStartTime) {
    
    this.jobRunStartTime = jobRunStartTime;
    return this;
  }

   /**
   * Get jobRunStartTime
   * @return jobRunStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getJobRunStartTime() {
    return jobRunStartTime;
  }


  public void setJobRunStartTime(Date jobRunStartTime) {
    this.jobRunStartTime = jobRunStartTime;
  }


  public JobDetailHistoryDataSwagger jobRunEndTime(Date jobRunEndTime) {
    
    this.jobRunEndTime = jobRunEndTime;
    return this;
  }

   /**
   * Get jobRunEndTime
   * @return jobRunEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getJobRunEndTime() {
    return jobRunEndTime;
  }


  public void setJobRunEndTime(Date jobRunEndTime) {
    this.jobRunEndTime = jobRunEndTime;
  }


  public JobDetailHistoryDataSwagger status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public JobDetailHistoryDataSwagger triggerType(String triggerType) {
    
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cron", value = "")

  public String getTriggerType() {
    return triggerType;
  }


  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailHistoryDataSwagger jobDetailHistoryDataSwagger = (JobDetailHistoryDataSwagger) o;
    return Objects.equals(this.version, jobDetailHistoryDataSwagger.version) &&
        Objects.equals(this.jobRunStartTime, jobDetailHistoryDataSwagger.jobRunStartTime) &&
        Objects.equals(this.jobRunEndTime, jobDetailHistoryDataSwagger.jobRunEndTime) &&
        Objects.equals(this.status, jobDetailHistoryDataSwagger.status) &&
        Objects.equals(this.triggerType, jobDetailHistoryDataSwagger.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, jobRunStartTime, jobRunEndTime, status, triggerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailHistoryDataSwagger {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    jobRunStartTime: ").append(toIndentedString(jobRunStartTime)).append("\n");
    sb.append("    jobRunEndTime: ").append(toIndentedString(jobRunEndTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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

