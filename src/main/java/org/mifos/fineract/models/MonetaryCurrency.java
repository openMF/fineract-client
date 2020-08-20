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
 * MonetaryCurrency
 */

public class MonetaryCurrency {
    @SerializedName("code")
    private String code = null;

    @SerializedName("digitsAfterDecimal")
    private Integer digitsAfterDecimal = null;

    @SerializedName("currencyInMultiplesOf")
    private Integer currencyInMultiplesOf = null;

    public MonetaryCurrency code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @ApiModelProperty(value = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MonetaryCurrency digitsAfterDecimal(Integer digitsAfterDecimal) {
        this.digitsAfterDecimal = digitsAfterDecimal;
        return this;
    }

    /**
     * Get digitsAfterDecimal
     *
     * @return digitsAfterDecimal
     **/
    @ApiModelProperty(value = "")
    public Integer getDigitsAfterDecimal() {
        return digitsAfterDecimal;
    }

    public void setDigitsAfterDecimal(Integer digitsAfterDecimal) {
        this.digitsAfterDecimal = digitsAfterDecimal;
    }

    public MonetaryCurrency currencyInMultiplesOf(Integer currencyInMultiplesOf) {
        this.currencyInMultiplesOf = currencyInMultiplesOf;
        return this;
    }

    /**
     * Get currencyInMultiplesOf
     *
     * @return currencyInMultiplesOf
     **/
    @ApiModelProperty(value = "")
    public Integer getCurrencyInMultiplesOf() {
        return currencyInMultiplesOf;
    }

    public void setCurrencyInMultiplesOf(Integer currencyInMultiplesOf) {
        this.currencyInMultiplesOf = currencyInMultiplesOf;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonetaryCurrency monetaryCurrency = (MonetaryCurrency) o;
        return Objects.equals(this.code, monetaryCurrency.code) &&
                Objects.equals(this.digitsAfterDecimal, monetaryCurrency.digitsAfterDecimal) &&
                Objects.equals(this.currencyInMultiplesOf, monetaryCurrency.currencyInMultiplesOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, digitsAfterDecimal, currencyInMultiplesOf);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonetaryCurrency {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
        sb.append("    currencyInMultiplesOf: ").append(toIndentedString(currencyInMultiplesOf)).append("\n");
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

