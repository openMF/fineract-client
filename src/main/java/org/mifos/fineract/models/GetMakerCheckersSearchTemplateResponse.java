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
 * GetMakerCheckersSearchTemplateResponse
 */

public class GetMakerCheckersSearchTemplateResponse {
    @SerializedName("appUsers")
    private List<AppUserData> appUsers = null;

    @SerializedName("actionNames")
    private List<String> actionNames = null;

    @SerializedName("entityNames")
    private List<String> entityNames = null;

    @SerializedName("processingResults")
    private List<ProcessingResultLookup> processingResults = null;

    public GetMakerCheckersSearchTemplateResponse appUsers(List<AppUserData> appUsers) {
        this.appUsers = appUsers;
        return this;
    }

    public GetMakerCheckersSearchTemplateResponse addAppUsersItem(AppUserData appUsersItem) {
        if (this.appUsers == null) {
            this.appUsers = new ArrayList<AppUserData>();
        }
        this.appUsers.add(appUsersItem);
        return this;
    }

    /**
     * Get appUsers
     *
     * @return appUsers
     **/
    @ApiModelProperty(value = "")
    public List<AppUserData> getAppUsers() {
        return appUsers;
    }

    public void setAppUsers(List<AppUserData> appUsers) {
        this.appUsers = appUsers;
    }

    public GetMakerCheckersSearchTemplateResponse actionNames(List<String> actionNames) {
        this.actionNames = actionNames;
        return this;
    }

    public GetMakerCheckersSearchTemplateResponse addActionNamesItem(String actionNamesItem) {
        if (this.actionNames == null) {
            this.actionNames = new ArrayList<String>();
        }
        this.actionNames.add(actionNamesItem);
        return this;
    }

    /**
     * Get actionNames
     *
     * @return actionNames
     **/
    @ApiModelProperty(value = "")
    public List<String> getActionNames() {
        return actionNames;
    }

    public void setActionNames(List<String> actionNames) {
        this.actionNames = actionNames;
    }

    public GetMakerCheckersSearchTemplateResponse entityNames(List<String> entityNames) {
        this.entityNames = entityNames;
        return this;
    }

    public GetMakerCheckersSearchTemplateResponse addEntityNamesItem(String entityNamesItem) {
        if (this.entityNames == null) {
            this.entityNames = new ArrayList<String>();
        }
        this.entityNames.add(entityNamesItem);
        return this;
    }

    /**
     * Get entityNames
     *
     * @return entityNames
     **/
    @ApiModelProperty(value = "")
    public List<String> getEntityNames() {
        return entityNames;
    }

    public void setEntityNames(List<String> entityNames) {
        this.entityNames = entityNames;
    }

    public GetMakerCheckersSearchTemplateResponse processingResults(List<ProcessingResultLookup> processingResults) {
        this.processingResults = processingResults;
        return this;
    }

    public GetMakerCheckersSearchTemplateResponse addProcessingResultsItem(ProcessingResultLookup processingResultsItem) {
        if (this.processingResults == null) {
            this.processingResults = new ArrayList<ProcessingResultLookup>();
        }
        this.processingResults.add(processingResultsItem);
        return this;
    }

    /**
     * Get processingResults
     *
     * @return processingResults
     **/
    @ApiModelProperty(value = "")
    public List<ProcessingResultLookup> getProcessingResults() {
        return processingResults;
    }

    public void setProcessingResults(List<ProcessingResultLookup> processingResults) {
        this.processingResults = processingResults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMakerCheckersSearchTemplateResponse getMakerCheckersSearchTemplateResponse = (GetMakerCheckersSearchTemplateResponse) o;
        return Objects.equals(this.appUsers, getMakerCheckersSearchTemplateResponse.appUsers) &&
                Objects.equals(this.actionNames, getMakerCheckersSearchTemplateResponse.actionNames) &&
                Objects.equals(this.entityNames, getMakerCheckersSearchTemplateResponse.entityNames) &&
                Objects.equals(this.processingResults, getMakerCheckersSearchTemplateResponse.processingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUsers, actionNames, entityNames, processingResults);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMakerCheckersSearchTemplateResponse {\n");

        sb.append("    appUsers: ").append(toIndentedString(appUsers)).append("\n");
        sb.append("    actionNames: ").append(toIndentedString(actionNames)).append("\n");
        sb.append("    entityNames: ").append(toIndentedString(entityNames)).append("\n");
        sb.append("    processingResults: ").append(toIndentedString(processingResults)).append("\n");
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

