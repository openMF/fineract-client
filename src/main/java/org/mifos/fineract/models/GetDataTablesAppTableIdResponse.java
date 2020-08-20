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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetDataTablesAppTableIdResponse
 */

public class GetDataTablesAppTableIdResponse {
    @SerializedName("columnHeaders")
    private List<ResultsetColumnHeaderData> columnHeaders = null;

    @SerializedName("data")
    private List<ResultsetRowData> data = null;

    public GetDataTablesAppTableIdResponse columnHeaders(List<ResultsetColumnHeaderData> columnHeaders) {
        this.columnHeaders = columnHeaders;
        return this;
    }

    public GetDataTablesAppTableIdResponse addColumnHeadersItem(ResultsetColumnHeaderData columnHeadersItem) {
        if (this.columnHeaders == null) {
            this.columnHeaders = new ArrayList<ResultsetColumnHeaderData>();
        }
        this.columnHeaders.add(columnHeadersItem);
        return this;
    }

    /**
     * Get columnHeaders
     *
     * @return columnHeaders
     **/
    @ApiModelProperty(value = "")
    public List<ResultsetColumnHeaderData> getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(List<ResultsetColumnHeaderData> columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public GetDataTablesAppTableIdResponse data(List<ResultsetRowData> data) {
        this.data = data;
        return this;
    }

    public GetDataTablesAppTableIdResponse addDataItem(ResultsetRowData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<ResultsetRowData>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<ResultsetRowData> getData() {
        return data;
    }

    public void setData(List<ResultsetRowData> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDataTablesAppTableIdResponse getDataTablesAppTableIdResponse = (GetDataTablesAppTableIdResponse) o;
        return Objects.equals(this.columnHeaders, getDataTablesAppTableIdResponse.columnHeaders) &&
                Objects.equals(this.data, getDataTablesAppTableIdResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnHeaders, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDataTablesAppTableIdResponse {\n");

        sb.append("    columnHeaders: ").append(toIndentedString(columnHeaders)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

