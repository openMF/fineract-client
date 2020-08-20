/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
 */

public class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("chargeId")
  private Integer chargeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("chargeTimeType")
  private GetChargesChargeTimeType chargeTimeType = null;

  @SerializedName("chargeCalculationType")
  private GetChargesChargeCalculationType chargeCalculationType = null;

  @SerializedName("percentage")
  private Double percentage = null;

  @SerializedName("amountPercentageAppliedTo")
  private Double amountPercentageAppliedTo = null;

  @SerializedName("currency")
  private GetChargesCurrencyResponse currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("amountPaid")
  private Float amountPaid = null;

  @SerializedName("amountWaived")
  private Float amountWaived = null;

  @SerializedName("amountWrittenOff")
  private Float amountWrittenOff = null;

  @SerializedName("amountOutstanding")
  private Float amountOutstanding = null;

  @SerializedName("amountOrPercentage")
  private Float amountOrPercentage = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeId(Integer chargeId) {
    this.chargeId = chargeId;
    return this;
  }

  /**
   * Get chargeId
   *
   * @return chargeId
   **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getChargeId() {
    return chargeId;
  }

  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(example = "Passbook fee", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeTimeType(GetChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
    return this;
  }

  /**
   * Get chargeTimeType
   *
   * @return chargeTimeType
   **/
  @ApiModelProperty(value = "")
  public GetChargesChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }

  public void setChargeTimeType(GetChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse chargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

  /**
   * Get chargeCalculationType
   *
   * @return chargeCalculationType
   **/
  @ApiModelProperty(value = "")
  public GetChargesChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }

  public void setChargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   *
   * @return percentage
   **/
  @ApiModelProperty(example = "0.0", value = "")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
    return this;
  }

  /**
   * Get amountPercentageAppliedTo
   *
   * @return amountPercentageAppliedTo
   **/
  @ApiModelProperty(example = "0.0", value = "")
  public Double getAmountPercentageAppliedTo() {
    return amountPercentageAppliedTo;
  }

  public void setAmountPercentageAppliedTo(Double amountPercentageAppliedTo) {
    this.amountPercentageAppliedTo = amountPercentageAppliedTo;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse currency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   **/
  @ApiModelProperty(value = "")
  public GetChargesCurrencyResponse getCurrency() {
    return currency;
  }

  public void setCurrency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   **/
  @ApiModelProperty(example = "100.0", value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

  /**
   * Get amountPaid
   *
   * @return amountPaid
   **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
    return this;
  }

  /**
   * Get amountWaived
   *
   * @return amountWaived
   **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountWaived() {
    return amountWaived;
  }

  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

  /**
   * Get amountWrittenOff
   *
   * @return amountWrittenOff
   **/
  @ApiModelProperty(example = "0.0", value = "")
  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }

  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountOutstanding(Float amountOutstanding) {
    this.amountOutstanding = amountOutstanding;
    return this;
  }

  /**
   * Get amountOutstanding
   *
   * @return amountOutstanding
   **/
  @ApiModelProperty(example = "100.0", value = "")
  public Float getAmountOutstanding() {
    return amountOutstanding;
  }

  public void setAmountOutstanding(Float amountOutstanding) {
    this.amountOutstanding = amountOutstanding;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse amountOrPercentage(Float amountOrPercentage) {
    this.amountOrPercentage = amountOrPercentage;
    return this;
  }

  /**
   * Get amountOrPercentage
   *
   * @return amountOrPercentage
   **/
  @ApiModelProperty(example = "100.0", value = "")
  public Float getAmountOrPercentage() {
    return amountOrPercentage;
  }

  public void setAmountOrPercentage(Float amountOrPercentage) {
    this.amountOrPercentage = amountOrPercentage;
  }

  public GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

  /**
   * Get penalty
   *
   * @return penalty
   **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isPenalty() {
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
    GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = (GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse) o;
    return Objects.equals(this.id, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.id) &&
            Objects.equals(this.chargeId, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeId) &&
            Objects.equals(this.name, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.name) &&
            Objects.equals(this.chargeTimeType, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeTimeType) &&
            Objects.equals(this.chargeCalculationType, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.chargeCalculationType) &&
            Objects.equals(this.percentage, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.percentage) &&
            Objects.equals(this.amountPercentageAppliedTo, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountPercentageAppliedTo) &&
            Objects.equals(this.currency, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.currency) &&
            Objects.equals(this.amount, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amount) &&
            Objects.equals(this.amountPaid, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountPaid) &&
            Objects.equals(this.amountWaived, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountWaived) &&
            Objects.equals(this.amountWrittenOff, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountWrittenOff) &&
            Objects.equals(this.amountOutstanding, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountOutstanding) &&
            Objects.equals(this.amountOrPercentage, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.amountOrPercentage) &&
            Objects.equals(this.penalty, getSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, chargeId, name, chargeTimeType, chargeCalculationType, percentage, amountPercentageAppliedTo, currency, amount, amountPaid, amountWaived, amountWrittenOff, amountOutstanding, amountOrPercentage, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountPercentageAppliedTo: ").append(toIndentedString(amountPercentageAppliedTo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
    sb.append("    amountOrPercentage: ").append(toIndentedString(amountOrPercentage)).append("\n");
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

