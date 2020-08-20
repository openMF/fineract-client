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
 * GetAccountTransfersPageItemsFromAccount
 */

public class GetAccountTransfersPageItemsFromAccount {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("accountNo")
    private Long accountNo = null;

    public GetAccountTransfersPageItemsFromAccount id(Integer id) {
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

    public GetAccountTransfersPageItemsFromAccount accountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }

    /**
     * Get accountNo
     *
     * @return accountNo
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountTransfersPageItemsFromAccount getAccountTransfersPageItemsFromAccount = (GetAccountTransfersPageItemsFromAccount) o;
        return Objects.equals(this.id, getAccountTransfersPageItemsFromAccount.id) &&
                Objects.equals(this.accountNo, getAccountTransfersPageItemsFromAccount.accountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountTransfersPageItemsFromAccount {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
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

