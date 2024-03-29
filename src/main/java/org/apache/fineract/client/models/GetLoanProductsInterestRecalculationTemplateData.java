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
import org.apache.fineract.client.models.GetLoanProductsInterestRecalculationCompoundingType;
import org.apache.fineract.client.models.GetLoanProductsPreClosureInterestCalculationStrategy;
import org.apache.fineract.client.models.GetLoanProductsRescheduleStrategyType;

/**
 * GetLoanProductsInterestRecalculationTemplateData
 */

public class GetLoanProductsInterestRecalculationTemplateData {
  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_TYPE = "interestRecalculationCompoundingType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_TYPE)
  private GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType;

  public static final String SERIALIZED_NAME_RESCHEDULE_STRATEGY_TYPE = "rescheduleStrategyType";
  @SerializedName(SERIALIZED_NAME_RESCHEDULE_STRATEGY_TYPE)
  private GetLoanProductsRescheduleStrategyType rescheduleStrategyType;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_INTEREST_CALCULATION_STRATEGY = "preClosureInterestCalculationStrategy";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_INTEREST_CALCULATION_STRATEGY)
  private GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy;


  public GetLoanProductsInterestRecalculationTemplateData interestRecalculationCompoundingType(GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType) {
    
    this.interestRecalculationCompoundingType = interestRecalculationCompoundingType;
    return this;
  }

   /**
   * Get interestRecalculationCompoundingType
   * @return interestRecalculationCompoundingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRecalculationCompoundingType getInterestRecalculationCompoundingType() {
    return interestRecalculationCompoundingType;
  }


  public void setInterestRecalculationCompoundingType(GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType) {
    this.interestRecalculationCompoundingType = interestRecalculationCompoundingType;
  }


  public GetLoanProductsInterestRecalculationTemplateData rescheduleStrategyType(GetLoanProductsRescheduleStrategyType rescheduleStrategyType) {
    
    this.rescheduleStrategyType = rescheduleStrategyType;
    return this;
  }

   /**
   * Get rescheduleStrategyType
   * @return rescheduleStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsRescheduleStrategyType getRescheduleStrategyType() {
    return rescheduleStrategyType;
  }


  public void setRescheduleStrategyType(GetLoanProductsRescheduleStrategyType rescheduleStrategyType) {
    this.rescheduleStrategyType = rescheduleStrategyType;
  }


  public GetLoanProductsInterestRecalculationTemplateData preClosureInterestCalculationStrategy(GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy) {
    
    this.preClosureInterestCalculationStrategy = preClosureInterestCalculationStrategy;
    return this;
  }

   /**
   * Get preClosureInterestCalculationStrategy
   * @return preClosureInterestCalculationStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsPreClosureInterestCalculationStrategy getPreClosureInterestCalculationStrategy() {
    return preClosureInterestCalculationStrategy;
  }


  public void setPreClosureInterestCalculationStrategy(GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy) {
    this.preClosureInterestCalculationStrategy = preClosureInterestCalculationStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanProductsInterestRecalculationTemplateData getLoanProductsInterestRecalculationTemplateData = (GetLoanProductsInterestRecalculationTemplateData) o;
    return Objects.equals(this.interestRecalculationCompoundingType, getLoanProductsInterestRecalculationTemplateData.interestRecalculationCompoundingType) &&
        Objects.equals(this.rescheduleStrategyType, getLoanProductsInterestRecalculationTemplateData.rescheduleStrategyType) &&
        Objects.equals(this.preClosureInterestCalculationStrategy, getLoanProductsInterestRecalculationTemplateData.preClosureInterestCalculationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRecalculationCompoundingType, rescheduleStrategyType, preClosureInterestCalculationStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanProductsInterestRecalculationTemplateData {\n");
    sb.append("    interestRecalculationCompoundingType: ").append(toIndentedString(interestRecalculationCompoundingType)).append("\n");
    sb.append("    rescheduleStrategyType: ").append(toIndentedString(rescheduleStrategyType)).append("\n");
    sb.append("    preClosureInterestCalculationStrategy: ").append(toIndentedString(preClosureInterestCalculationStrategy)).append("\n");
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

