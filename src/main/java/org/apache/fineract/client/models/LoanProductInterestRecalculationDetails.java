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
 * LoanProductInterestRecalculationDetails
 */

public class LoanProductInterestRecalculationDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_METHOD = "interestRecalculationCompoundingMethod";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_METHOD)
  private Integer interestRecalculationCompoundingMethod;

  public static final String SERIALIZED_NAME_RESCHEDULE_STRATEGY_METHOD = "rescheduleStrategyMethod";
  @SerializedName(SERIALIZED_NAME_RESCHEDULE_STRATEGY_METHOD)
  private Integer rescheduleStrategyMethod;

  /**
   * Gets or Sets restFrequencyType
   */
  @JsonAdapter(RestFrequencyTypeEnum.Adapter.class)
  public enum RestFrequencyTypeEnum {
    INVALID("INVALID"),
    
    SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    RestFrequencyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestFrequencyTypeEnum fromValue(String value) {
      for (RestFrequencyTypeEnum b : RestFrequencyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestFrequencyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestFrequencyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestFrequencyTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REST_FREQUENCY_TYPE = "restFrequencyType";
  @SerializedName(SERIALIZED_NAME_REST_FREQUENCY_TYPE)
  private RestFrequencyTypeEnum restFrequencyType;

  public static final String SERIALIZED_NAME_REST_INTERVAL = "restInterval";
  @SerializedName(SERIALIZED_NAME_REST_INTERVAL)
  private Integer restInterval;

  public static final String SERIALIZED_NAME_REST_FREQUENCY_NTH_DAY = "restFrequencyNthDay";
  @SerializedName(SERIALIZED_NAME_REST_FREQUENCY_NTH_DAY)
  private Integer restFrequencyNthDay;

  public static final String SERIALIZED_NAME_REST_FREQUENCY_WEEKDAY = "restFrequencyWeekday";
  @SerializedName(SERIALIZED_NAME_REST_FREQUENCY_WEEKDAY)
  private Integer restFrequencyWeekday;

  public static final String SERIALIZED_NAME_REST_FREQUENCY_ON_DAY = "restFrequencyOnDay";
  @SerializedName(SERIALIZED_NAME_REST_FREQUENCY_ON_DAY)
  private Integer restFrequencyOnDay;

  /**
   * Gets or Sets compoundingFrequencyType
   */
  @JsonAdapter(CompoundingFrequencyTypeEnum.Adapter.class)
  public enum CompoundingFrequencyTypeEnum {
    INVALID("INVALID"),
    
    SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    CompoundingFrequencyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompoundingFrequencyTypeEnum fromValue(String value) {
      for (CompoundingFrequencyTypeEnum b : CompoundingFrequencyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompoundingFrequencyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompoundingFrequencyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompoundingFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CompoundingFrequencyTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPOUNDING_FREQUENCY_TYPE = "compoundingFrequencyType";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_FREQUENCY_TYPE)
  private CompoundingFrequencyTypeEnum compoundingFrequencyType;

  public static final String SERIALIZED_NAME_COMPOUNDING_INTERVAL = "compoundingInterval";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_INTERVAL)
  private Integer compoundingInterval;

  public static final String SERIALIZED_NAME_COMPOUNDING_FREQUENCY_NTH_DAY = "compoundingFrequencyNthDay";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_FREQUENCY_NTH_DAY)
  private Integer compoundingFrequencyNthDay;

  public static final String SERIALIZED_NAME_COMPOUNDING_FREQUENCY_WEEKDAY = "compoundingFrequencyWeekday";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_FREQUENCY_WEEKDAY)
  private Integer compoundingFrequencyWeekday;

  public static final String SERIALIZED_NAME_COMPOUNDING_FREQUENCY_ON_DAY = "compoundingFrequencyOnDay";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_FREQUENCY_ON_DAY)
  private Integer compoundingFrequencyOnDay;

  public static final String SERIALIZED_NAME_IS_COMPOUNDING_TO_BE_POSTED_AS_TRANSACTION = "isCompoundingToBePostedAsTransaction";
  @SerializedName(SERIALIZED_NAME_IS_COMPOUNDING_TO_BE_POSTED_AS_TRANSACTION)
  private Boolean isCompoundingToBePostedAsTransaction;

  public static final String SERIALIZED_NAME_ARREARS_BASED_ON_ORIGINAL_SCHEDULE = "arrearsBasedOnOriginalSchedule";
  @SerializedName(SERIALIZED_NAME_ARREARS_BASED_ON_ORIGINAL_SCHEDULE)
  private Boolean arrearsBasedOnOriginalSchedule;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public LoanProductInterestRecalculationDetails id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public LoanProductInterestRecalculationDetails interestRecalculationCompoundingMethod(Integer interestRecalculationCompoundingMethod) {
    
    this.interestRecalculationCompoundingMethod = interestRecalculationCompoundingMethod;
    return this;
  }

   /**
   * Get interestRecalculationCompoundingMethod
   * @return interestRecalculationCompoundingMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInterestRecalculationCompoundingMethod() {
    return interestRecalculationCompoundingMethod;
  }


  public void setInterestRecalculationCompoundingMethod(Integer interestRecalculationCompoundingMethod) {
    this.interestRecalculationCompoundingMethod = interestRecalculationCompoundingMethod;
  }


  public LoanProductInterestRecalculationDetails rescheduleStrategyMethod(Integer rescheduleStrategyMethod) {
    
    this.rescheduleStrategyMethod = rescheduleStrategyMethod;
    return this;
  }

   /**
   * Get rescheduleStrategyMethod
   * @return rescheduleStrategyMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRescheduleStrategyMethod() {
    return rescheduleStrategyMethod;
  }


  public void setRescheduleStrategyMethod(Integer rescheduleStrategyMethod) {
    this.rescheduleStrategyMethod = rescheduleStrategyMethod;
  }


  public LoanProductInterestRecalculationDetails restFrequencyType(RestFrequencyTypeEnum restFrequencyType) {
    
    this.restFrequencyType = restFrequencyType;
    return this;
  }

   /**
   * Get restFrequencyType
   * @return restFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RestFrequencyTypeEnum getRestFrequencyType() {
    return restFrequencyType;
  }


  public void setRestFrequencyType(RestFrequencyTypeEnum restFrequencyType) {
    this.restFrequencyType = restFrequencyType;
  }


  public LoanProductInterestRecalculationDetails restInterval(Integer restInterval) {
    
    this.restInterval = restInterval;
    return this;
  }

   /**
   * Get restInterval
   * @return restInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestInterval() {
    return restInterval;
  }


  public void setRestInterval(Integer restInterval) {
    this.restInterval = restInterval;
  }


  public LoanProductInterestRecalculationDetails restFrequencyNthDay(Integer restFrequencyNthDay) {
    
    this.restFrequencyNthDay = restFrequencyNthDay;
    return this;
  }

   /**
   * Get restFrequencyNthDay
   * @return restFrequencyNthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestFrequencyNthDay() {
    return restFrequencyNthDay;
  }


  public void setRestFrequencyNthDay(Integer restFrequencyNthDay) {
    this.restFrequencyNthDay = restFrequencyNthDay;
  }


  public LoanProductInterestRecalculationDetails restFrequencyWeekday(Integer restFrequencyWeekday) {
    
    this.restFrequencyWeekday = restFrequencyWeekday;
    return this;
  }

   /**
   * Get restFrequencyWeekday
   * @return restFrequencyWeekday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestFrequencyWeekday() {
    return restFrequencyWeekday;
  }


  public void setRestFrequencyWeekday(Integer restFrequencyWeekday) {
    this.restFrequencyWeekday = restFrequencyWeekday;
  }


  public LoanProductInterestRecalculationDetails restFrequencyOnDay(Integer restFrequencyOnDay) {
    
    this.restFrequencyOnDay = restFrequencyOnDay;
    return this;
  }

   /**
   * Get restFrequencyOnDay
   * @return restFrequencyOnDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRestFrequencyOnDay() {
    return restFrequencyOnDay;
  }


  public void setRestFrequencyOnDay(Integer restFrequencyOnDay) {
    this.restFrequencyOnDay = restFrequencyOnDay;
  }


  public LoanProductInterestRecalculationDetails compoundingFrequencyType(CompoundingFrequencyTypeEnum compoundingFrequencyType) {
    
    this.compoundingFrequencyType = compoundingFrequencyType;
    return this;
  }

   /**
   * Get compoundingFrequencyType
   * @return compoundingFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompoundingFrequencyTypeEnum getCompoundingFrequencyType() {
    return compoundingFrequencyType;
  }


  public void setCompoundingFrequencyType(CompoundingFrequencyTypeEnum compoundingFrequencyType) {
    this.compoundingFrequencyType = compoundingFrequencyType;
  }


  public LoanProductInterestRecalculationDetails compoundingInterval(Integer compoundingInterval) {
    
    this.compoundingInterval = compoundingInterval;
    return this;
  }

   /**
   * Get compoundingInterval
   * @return compoundingInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundingInterval() {
    return compoundingInterval;
  }


  public void setCompoundingInterval(Integer compoundingInterval) {
    this.compoundingInterval = compoundingInterval;
  }


  public LoanProductInterestRecalculationDetails compoundingFrequencyNthDay(Integer compoundingFrequencyNthDay) {
    
    this.compoundingFrequencyNthDay = compoundingFrequencyNthDay;
    return this;
  }

   /**
   * Get compoundingFrequencyNthDay
   * @return compoundingFrequencyNthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundingFrequencyNthDay() {
    return compoundingFrequencyNthDay;
  }


  public void setCompoundingFrequencyNthDay(Integer compoundingFrequencyNthDay) {
    this.compoundingFrequencyNthDay = compoundingFrequencyNthDay;
  }


  public LoanProductInterestRecalculationDetails compoundingFrequencyWeekday(Integer compoundingFrequencyWeekday) {
    
    this.compoundingFrequencyWeekday = compoundingFrequencyWeekday;
    return this;
  }

   /**
   * Get compoundingFrequencyWeekday
   * @return compoundingFrequencyWeekday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundingFrequencyWeekday() {
    return compoundingFrequencyWeekday;
  }


  public void setCompoundingFrequencyWeekday(Integer compoundingFrequencyWeekday) {
    this.compoundingFrequencyWeekday = compoundingFrequencyWeekday;
  }


  public LoanProductInterestRecalculationDetails compoundingFrequencyOnDay(Integer compoundingFrequencyOnDay) {
    
    this.compoundingFrequencyOnDay = compoundingFrequencyOnDay;
    return this;
  }

   /**
   * Get compoundingFrequencyOnDay
   * @return compoundingFrequencyOnDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompoundingFrequencyOnDay() {
    return compoundingFrequencyOnDay;
  }


  public void setCompoundingFrequencyOnDay(Integer compoundingFrequencyOnDay) {
    this.compoundingFrequencyOnDay = compoundingFrequencyOnDay;
  }


  public LoanProductInterestRecalculationDetails isCompoundingToBePostedAsTransaction(Boolean isCompoundingToBePostedAsTransaction) {
    
    this.isCompoundingToBePostedAsTransaction = isCompoundingToBePostedAsTransaction;
    return this;
  }

   /**
   * Get isCompoundingToBePostedAsTransaction
   * @return isCompoundingToBePostedAsTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCompoundingToBePostedAsTransaction() {
    return isCompoundingToBePostedAsTransaction;
  }


  public void setIsCompoundingToBePostedAsTransaction(Boolean isCompoundingToBePostedAsTransaction) {
    this.isCompoundingToBePostedAsTransaction = isCompoundingToBePostedAsTransaction;
  }


  public LoanProductInterestRecalculationDetails arrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
    
    this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
    return this;
  }

   /**
   * Get arrearsBasedOnOriginalSchedule
   * @return arrearsBasedOnOriginalSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArrearsBasedOnOriginalSchedule() {
    return arrearsBasedOnOriginalSchedule;
  }


  public void setArrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
    this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
  }


  public LoanProductInterestRecalculationDetails _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProductInterestRecalculationDetails loanProductInterestRecalculationDetails = (LoanProductInterestRecalculationDetails) o;
    return Objects.equals(this.id, loanProductInterestRecalculationDetails.id) &&
        Objects.equals(this.interestRecalculationCompoundingMethod, loanProductInterestRecalculationDetails.interestRecalculationCompoundingMethod) &&
        Objects.equals(this.rescheduleStrategyMethod, loanProductInterestRecalculationDetails.rescheduleStrategyMethod) &&
        Objects.equals(this.restFrequencyType, loanProductInterestRecalculationDetails.restFrequencyType) &&
        Objects.equals(this.restInterval, loanProductInterestRecalculationDetails.restInterval) &&
        Objects.equals(this.restFrequencyNthDay, loanProductInterestRecalculationDetails.restFrequencyNthDay) &&
        Objects.equals(this.restFrequencyWeekday, loanProductInterestRecalculationDetails.restFrequencyWeekday) &&
        Objects.equals(this.restFrequencyOnDay, loanProductInterestRecalculationDetails.restFrequencyOnDay) &&
        Objects.equals(this.compoundingFrequencyType, loanProductInterestRecalculationDetails.compoundingFrequencyType) &&
        Objects.equals(this.compoundingInterval, loanProductInterestRecalculationDetails.compoundingInterval) &&
        Objects.equals(this.compoundingFrequencyNthDay, loanProductInterestRecalculationDetails.compoundingFrequencyNthDay) &&
        Objects.equals(this.compoundingFrequencyWeekday, loanProductInterestRecalculationDetails.compoundingFrequencyWeekday) &&
        Objects.equals(this.compoundingFrequencyOnDay, loanProductInterestRecalculationDetails.compoundingFrequencyOnDay) &&
        Objects.equals(this.isCompoundingToBePostedAsTransaction, loanProductInterestRecalculationDetails.isCompoundingToBePostedAsTransaction) &&
        Objects.equals(this.arrearsBasedOnOriginalSchedule, loanProductInterestRecalculationDetails.arrearsBasedOnOriginalSchedule) &&
        Objects.equals(this._new, loanProductInterestRecalculationDetails._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, interestRecalculationCompoundingMethod, rescheduleStrategyMethod, restFrequencyType, restInterval, restFrequencyNthDay, restFrequencyWeekday, restFrequencyOnDay, compoundingFrequencyType, compoundingInterval, compoundingFrequencyNthDay, compoundingFrequencyWeekday, compoundingFrequencyOnDay, isCompoundingToBePostedAsTransaction, arrearsBasedOnOriginalSchedule, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProductInterestRecalculationDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interestRecalculationCompoundingMethod: ").append(toIndentedString(interestRecalculationCompoundingMethod)).append("\n");
    sb.append("    rescheduleStrategyMethod: ").append(toIndentedString(rescheduleStrategyMethod)).append("\n");
    sb.append("    restFrequencyType: ").append(toIndentedString(restFrequencyType)).append("\n");
    sb.append("    restInterval: ").append(toIndentedString(restInterval)).append("\n");
    sb.append("    restFrequencyNthDay: ").append(toIndentedString(restFrequencyNthDay)).append("\n");
    sb.append("    restFrequencyWeekday: ").append(toIndentedString(restFrequencyWeekday)).append("\n");
    sb.append("    restFrequencyOnDay: ").append(toIndentedString(restFrequencyOnDay)).append("\n");
    sb.append("    compoundingFrequencyType: ").append(toIndentedString(compoundingFrequencyType)).append("\n");
    sb.append("    compoundingInterval: ").append(toIndentedString(compoundingInterval)).append("\n");
    sb.append("    compoundingFrequencyNthDay: ").append(toIndentedString(compoundingFrequencyNthDay)).append("\n");
    sb.append("    compoundingFrequencyWeekday: ").append(toIndentedString(compoundingFrequencyWeekday)).append("\n");
    sb.append("    compoundingFrequencyOnDay: ").append(toIndentedString(compoundingFrequencyOnDay)).append("\n");
    sb.append("    isCompoundingToBePostedAsTransaction: ").append(toIndentedString(isCompoundingToBePostedAsTransaction)).append("\n");
    sb.append("    arrearsBasedOnOriginalSchedule: ").append(toIndentedString(arrearsBasedOnOriginalSchedule)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

