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
 * GetFixedDepositAccountsChartSlabs
 */

public class GetFixedDepositAccountsChartSlabs {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("periodType")
    private GetFixedDepositAccountsPeriodType periodType = null;

    @SerializedName("fromPeriod")
    private Integer fromPeriod = null;

    @SerializedName("toPeriod")
    private Integer toPeriod = null;

    @SerializedName("annualInterestRate")
    private Double annualInterestRate = null;

    @SerializedName("currency")
    private GetFixedDepositAccountsAccountChartCurrency currency = null;

    public GetFixedDepositAccountsChartSlabs id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "13", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetFixedDepositAccountsChartSlabs periodType(GetFixedDepositAccountsPeriodType periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get periodType
     *
     * @return periodType
     **/
    @ApiModelProperty(value = "")
    public GetFixedDepositAccountsPeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(GetFixedDepositAccountsPeriodType periodType) {
        this.periodType = periodType;
    }

    public GetFixedDepositAccountsChartSlabs fromPeriod(Integer fromPeriod) {
        this.fromPeriod = fromPeriod;
        return this;
    }

    /**
     * Get fromPeriod
     *
     * @return fromPeriod
     **/
    @ApiModelProperty(example = "181", value = "")
    public Integer getFromPeriod() {
        return fromPeriod;
    }

    public void setFromPeriod(Integer fromPeriod) {
        this.fromPeriod = fromPeriod;
    }

    public GetFixedDepositAccountsChartSlabs toPeriod(Integer toPeriod) {
        this.toPeriod = toPeriod;
        return this;
    }

    /**
     * Get toPeriod
     *
     * @return toPeriod
     **/
    @ApiModelProperty(example = "365", value = "")
    public Integer getToPeriod() {
        return toPeriod;
    }

    public void setToPeriod(Integer toPeriod) {
        this.toPeriod = toPeriod;
    }

    public GetFixedDepositAccountsChartSlabs annualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return this;
    }

    /**
     * Get annualInterestRate
     *
     * @return annualInterestRate
     **/
    @ApiModelProperty(example = "5.5", value = "")
    public Double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public GetFixedDepositAccountsChartSlabs currency(GetFixedDepositAccountsAccountChartCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetFixedDepositAccountsAccountChartCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetFixedDepositAccountsAccountChartCurrency currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFixedDepositAccountsChartSlabs getFixedDepositAccountsChartSlabs = (GetFixedDepositAccountsChartSlabs) o;
        return Objects.equals(this.id, getFixedDepositAccountsChartSlabs.id) &&
                Objects.equals(this.periodType, getFixedDepositAccountsChartSlabs.periodType) &&
                Objects.equals(this.fromPeriod, getFixedDepositAccountsChartSlabs.fromPeriod) &&
                Objects.equals(this.toPeriod, getFixedDepositAccountsChartSlabs.toPeriod) &&
                Objects.equals(this.annualInterestRate, getFixedDepositAccountsChartSlabs.annualInterestRate) &&
                Objects.equals(this.currency, getFixedDepositAccountsChartSlabs.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, periodType, fromPeriod, toPeriod, annualInterestRate, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFixedDepositAccountsChartSlabs {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
        sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
        sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

