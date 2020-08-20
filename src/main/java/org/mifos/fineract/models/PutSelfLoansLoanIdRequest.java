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
 * PutSelfLoansLoanIdRequest
 */

public class PutSelfLoansLoanIdRequest {
    @SerializedName("locale")
    private String locale = null;

    @SerializedName("dateFormat")
    private String dateFormat = null;

    @SerializedName("productId")
    private Integer productId = null;

    @SerializedName("principal")
    private Long principal = null;

    @SerializedName("loanTermFrequency")
    private Integer loanTermFrequency = null;

    @SerializedName("loanTermFrequencyType")
    private Integer loanTermFrequencyType = null;

    @SerializedName("numberOfRepayments")
    private Integer numberOfRepayments = null;

    @SerializedName("repaymentEvery")
    private Integer repaymentEvery = null;

    @SerializedName("repaymentFrequencyType")
    private Integer repaymentFrequencyType = null;

    @SerializedName("interestRatePerPeriod")
    private Integer interestRatePerPeriod = null;

    @SerializedName("interestType")
    private Integer interestType = null;

    @SerializedName("interestCalculationPeriodType")
    private Integer interestCalculationPeriodType = null;

    @SerializedName("amortizationType")
    private Integer amortizationType = null;

    @SerializedName("expectedDisbursementDate")
    private String expectedDisbursementDate = null;

    @SerializedName("transactionProcessingStrategyId")
    private Integer transactionProcessingStrategyId = null;

    public PutSelfLoansLoanIdRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     **/
    @ApiModelProperty(example = "en", value = "")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PutSelfLoansLoanIdRequest dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get dateFormat
     *
     * @return dateFormat
     **/
    @ApiModelProperty(example = "dd MMMM yyyy", value = "")
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public PutSelfLoansLoanIdRequest productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public PutSelfLoansLoanIdRequest principal(Long principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Get principal
     *
     * @return principal
     **/
    @ApiModelProperty(example = "5000", value = "")
    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public PutSelfLoansLoanIdRequest loanTermFrequency(Integer loanTermFrequency) {
        this.loanTermFrequency = loanTermFrequency;
        return this;
    }

    /**
     * Get loanTermFrequency
     *
     * @return loanTermFrequency
     **/
    @ApiModelProperty(example = "10", value = "")
    public Integer getLoanTermFrequency() {
        return loanTermFrequency;
    }

    public void setLoanTermFrequency(Integer loanTermFrequency) {
        this.loanTermFrequency = loanTermFrequency;
    }

    public PutSelfLoansLoanIdRequest loanTermFrequencyType(Integer loanTermFrequencyType) {
        this.loanTermFrequencyType = loanTermFrequencyType;
        return this;
    }

    /**
     * Get loanTermFrequencyType
     *
     * @return loanTermFrequencyType
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getLoanTermFrequencyType() {
        return loanTermFrequencyType;
    }

    public void setLoanTermFrequencyType(Integer loanTermFrequencyType) {
        this.loanTermFrequencyType = loanTermFrequencyType;
    }

    public PutSelfLoansLoanIdRequest numberOfRepayments(Integer numberOfRepayments) {
        this.numberOfRepayments = numberOfRepayments;
        return this;
    }

    /**
     * Get numberOfRepayments
     *
     * @return numberOfRepayments
     **/
    @ApiModelProperty(example = "10", value = "")
    public Integer getNumberOfRepayments() {
        return numberOfRepayments;
    }

    public void setNumberOfRepayments(Integer numberOfRepayments) {
        this.numberOfRepayments = numberOfRepayments;
    }

    public PutSelfLoansLoanIdRequest repaymentEvery(Integer repaymentEvery) {
        this.repaymentEvery = repaymentEvery;
        return this;
    }

    /**
     * Get repaymentEvery
     *
     * @return repaymentEvery
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getRepaymentEvery() {
        return repaymentEvery;
    }

    public void setRepaymentEvery(Integer repaymentEvery) {
        this.repaymentEvery = repaymentEvery;
    }

    public PutSelfLoansLoanIdRequest repaymentFrequencyType(Integer repaymentFrequencyType) {
        this.repaymentFrequencyType = repaymentFrequencyType;
        return this;
    }

    /**
     * Get repaymentFrequencyType
     *
     * @return repaymentFrequencyType
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getRepaymentFrequencyType() {
        return repaymentFrequencyType;
    }

    public void setRepaymentFrequencyType(Integer repaymentFrequencyType) {
        this.repaymentFrequencyType = repaymentFrequencyType;
    }

    public PutSelfLoansLoanIdRequest interestRatePerPeriod(Integer interestRatePerPeriod) {
        this.interestRatePerPeriod = interestRatePerPeriod;
        return this;
    }

    /**
     * Get interestRatePerPeriod
     *
     * @return interestRatePerPeriod
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getInterestRatePerPeriod() {
        return interestRatePerPeriod;
    }

    public void setInterestRatePerPeriod(Integer interestRatePerPeriod) {
        this.interestRatePerPeriod = interestRatePerPeriod;
    }

    public PutSelfLoansLoanIdRequest interestType(Integer interestType) {
        this.interestType = interestType;
        return this;
    }

    /**
     * Get interestType
     *
     * @return interestType
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    public PutSelfLoansLoanIdRequest interestCalculationPeriodType(Integer interestCalculationPeriodType) {
        this.interestCalculationPeriodType = interestCalculationPeriodType;
        return this;
    }

    /**
     * Get interestCalculationPeriodType
     *
     * @return interestCalculationPeriodType
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getInterestCalculationPeriodType() {
        return interestCalculationPeriodType;
    }

    public void setInterestCalculationPeriodType(Integer interestCalculationPeriodType) {
        this.interestCalculationPeriodType = interestCalculationPeriodType;
    }

    public PutSelfLoansLoanIdRequest amortizationType(Integer amortizationType) {
        this.amortizationType = amortizationType;
        return this;
    }

    /**
     * Get amortizationType
     *
     * @return amortizationType
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getAmortizationType() {
        return amortizationType;
    }

    public void setAmortizationType(Integer amortizationType) {
        this.amortizationType = amortizationType;
    }

    public PutSelfLoansLoanIdRequest expectedDisbursementDate(String expectedDisbursementDate) {
        this.expectedDisbursementDate = expectedDisbursementDate;
        return this;
    }

    /**
     * Get expectedDisbursementDate
     *
     * @return expectedDisbursementDate
     **/
    @ApiModelProperty(example = "04 March 2014", value = "")
    public String getExpectedDisbursementDate() {
        return expectedDisbursementDate;
    }

    public void setExpectedDisbursementDate(String expectedDisbursementDate) {
        this.expectedDisbursementDate = expectedDisbursementDate;
    }

    public PutSelfLoansLoanIdRequest transactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
        this.transactionProcessingStrategyId = transactionProcessingStrategyId;
        return this;
    }

    /**
     * Get transactionProcessingStrategyId
     *
     * @return transactionProcessingStrategyId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getTransactionProcessingStrategyId() {
        return transactionProcessingStrategyId;
    }

    public void setTransactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
        this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutSelfLoansLoanIdRequest putSelfLoansLoanIdRequest = (PutSelfLoansLoanIdRequest) o;
        return Objects.equals(this.locale, putSelfLoansLoanIdRequest.locale) &&
                Objects.equals(this.dateFormat, putSelfLoansLoanIdRequest.dateFormat) &&
                Objects.equals(this.productId, putSelfLoansLoanIdRequest.productId) &&
                Objects.equals(this.principal, putSelfLoansLoanIdRequest.principal) &&
                Objects.equals(this.loanTermFrequency, putSelfLoansLoanIdRequest.loanTermFrequency) &&
                Objects.equals(this.loanTermFrequencyType, putSelfLoansLoanIdRequest.loanTermFrequencyType) &&
                Objects.equals(this.numberOfRepayments, putSelfLoansLoanIdRequest.numberOfRepayments) &&
                Objects.equals(this.repaymentEvery, putSelfLoansLoanIdRequest.repaymentEvery) &&
                Objects.equals(this.repaymentFrequencyType, putSelfLoansLoanIdRequest.repaymentFrequencyType) &&
                Objects.equals(this.interestRatePerPeriod, putSelfLoansLoanIdRequest.interestRatePerPeriod) &&
                Objects.equals(this.interestType, putSelfLoansLoanIdRequest.interestType) &&
                Objects.equals(this.interestCalculationPeriodType, putSelfLoansLoanIdRequest.interestCalculationPeriodType) &&
                Objects.equals(this.amortizationType, putSelfLoansLoanIdRequest.amortizationType) &&
                Objects.equals(this.expectedDisbursementDate, putSelfLoansLoanIdRequest.expectedDisbursementDate) &&
                Objects.equals(this.transactionProcessingStrategyId, putSelfLoansLoanIdRequest.transactionProcessingStrategyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, dateFormat, productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestType, interestCalculationPeriodType, amortizationType, expectedDisbursementDate, transactionProcessingStrategyId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSelfLoansLoanIdRequest {\n");

        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    loanTermFrequency: ").append(toIndentedString(loanTermFrequency)).append("\n");
        sb.append("    loanTermFrequencyType: ").append(toIndentedString(loanTermFrequencyType)).append("\n");
        sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
        sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
        sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
        sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
        sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
        sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
        sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
        sb.append("    expectedDisbursementDate: ").append(toIndentedString(expectedDisbursementDate)).append("\n");
        sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
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

