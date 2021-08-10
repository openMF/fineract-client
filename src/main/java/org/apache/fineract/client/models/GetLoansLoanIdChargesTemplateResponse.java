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
import org.apache.fineract.client.models.GetLoanChargeTemplateChargeOptions;

/**
 * GetLoansLoanIdChargesTemplateResponse
 */
@ApiModel(description = "GetLoansLoanIdChargesTemplateResponse")

public class GetLoansLoanIdChargesTemplateResponse {
  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Float amountPaid;

  public static final String SERIALIZED_NAME_AMOUNT_WAIVED = "amountWaived";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WAIVED)
  private Float amountWaived;

  public static final String SERIALIZED_NAME_AMOUNT_WRITTEN_OFF = "amountWrittenOff";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WRITTEN_OFF)
  private Float amountWrittenOff;

  public static final String SERIALIZED_NAME_CHARGE_OPTIONS = "chargeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_OPTIONS)
  private List<GetLoanChargeTemplateChargeOptions> chargeOptions = null;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;


  public GetLoansLoanIdChargesTemplateResponse amountPaid(Float amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }


  public GetLoansLoanIdChargesTemplateResponse amountWaived(Float amountWaived) {
    
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountWaived() {
    return amountWaived;
  }


  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }


  public GetLoansLoanIdChargesTemplateResponse amountWrittenOff(Float amountWrittenOff) {
    
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }


  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }


  public GetLoansLoanIdChargesTemplateResponse chargeOptions(List<GetLoanChargeTemplateChargeOptions> chargeOptions) {
    
    this.chargeOptions = chargeOptions;
    return this;
  }

  public GetLoansLoanIdChargesTemplateResponse addChargeOptionsItem(GetLoanChargeTemplateChargeOptions chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new ArrayList<GetLoanChargeTemplateChargeOptions>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetLoanChargeTemplateChargeOptions> getChargeOptions() {
    return chargeOptions;
  }


  public void setChargeOptions(List<GetLoanChargeTemplateChargeOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }


  public GetLoansLoanIdChargesTemplateResponse penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPenalty() {
    return penalty;
  }


  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdChargesTemplateResponse getLoansLoanIdChargesTemplateResponse = (GetLoansLoanIdChargesTemplateResponse) o;
    return Objects.equals(this.amountPaid, getLoansLoanIdChargesTemplateResponse.amountPaid) &&
        Objects.equals(this.amountWaived, getLoansLoanIdChargesTemplateResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getLoansLoanIdChargesTemplateResponse.amountWrittenOff) &&
        Objects.equals(this.chargeOptions, getLoansLoanIdChargesTemplateResponse.chargeOptions) &&
        Objects.equals(this.penalty, getLoansLoanIdChargesTemplateResponse.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPaid, amountWaived, amountWrittenOff, chargeOptions, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdChargesTemplateResponse {\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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

