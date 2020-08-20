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
 * PostRecurringDepositProductsChartSlabs
 */

public class PostRecurringDepositProductsChartSlabs {
    @SerializedName("description")
    private String description = null;

    @SerializedName("periodType")
    private Integer periodType = null;

    @SerializedName("fromPeriod")
    private Integer fromPeriod = null;

    @SerializedName("toPeriod")
    private Integer toPeriod = null;

    @SerializedName("annualInterestRate")
    private Double annualInterestRate = null;

    public PostRecurringDepositProductsChartSlabs description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(example = "from 0 to 90 days", value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostRecurringDepositProductsChartSlabs periodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get periodType
     *
     * @return periodType
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public PostRecurringDepositProductsChartSlabs fromPeriod(Integer fromPeriod) {
        this.fromPeriod = fromPeriod;
        return this;
    }

    /**
     * Get fromPeriod
     *
     * @return fromPeriod
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getFromPeriod() {
        return fromPeriod;
    }

    public void setFromPeriod(Integer fromPeriod) {
        this.fromPeriod = fromPeriod;
    }

    public PostRecurringDepositProductsChartSlabs toPeriod(Integer toPeriod) {
        this.toPeriod = toPeriod;
        return this;
    }

    /**
     * Get toPeriod
     *
     * @return toPeriod
     **/
    @ApiModelProperty(example = "90", value = "")
    public Integer getToPeriod() {
        return toPeriod;
    }

    public void setToPeriod(Integer toPeriod) {
        this.toPeriod = toPeriod;
    }

    public PostRecurringDepositProductsChartSlabs annualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return this;
    }

    /**
     * Get annualInterestRate
     *
     * @return annualInterestRate
     **/
    @ApiModelProperty(example = "4.5", value = "")
    public Double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRecurringDepositProductsChartSlabs postRecurringDepositProductsChartSlabs = (PostRecurringDepositProductsChartSlabs) o;
        return Objects.equals(this.description, postRecurringDepositProductsChartSlabs.description) &&
                Objects.equals(this.periodType, postRecurringDepositProductsChartSlabs.periodType) &&
                Objects.equals(this.fromPeriod, postRecurringDepositProductsChartSlabs.fromPeriod) &&
                Objects.equals(this.toPeriod, postRecurringDepositProductsChartSlabs.toPeriod) &&
                Objects.equals(this.annualInterestRate, postRecurringDepositProductsChartSlabs.annualInterestRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, periodType, fromPeriod, toPeriod, annualInterestRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostRecurringDepositProductsChartSlabs {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
        sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
        sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
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

