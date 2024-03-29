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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.Grouping;
import org.apache.fineract.client.models.HookTemplateData;

/**
 * GetHookTemplateResponse
 */
@ApiModel(description = "GetHookTemplateResponse")

public class GetHookTemplateResponse {
  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<HookTemplateData> templates = null;

  public static final String SERIALIZED_NAME_GROUPINGS = "groupings";
  @SerializedName(SERIALIZED_NAME_GROUPINGS)
  private List<Grouping> groupings = null;


  public GetHookTemplateResponse templates(List<HookTemplateData> templates) {
    
    this.templates = templates;
    return this;
  }

  public GetHookTemplateResponse addTemplatesItem(HookTemplateData templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<HookTemplateData>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HookTemplateData> getTemplates() {
    return templates;
  }


  public void setTemplates(List<HookTemplateData> templates) {
    this.templates = templates;
  }


  public GetHookTemplateResponse groupings(List<Grouping> groupings) {
    
    this.groupings = groupings;
    return this;
  }

  public GetHookTemplateResponse addGroupingsItem(Grouping groupingsItem) {
    if (this.groupings == null) {
      this.groupings = new ArrayList<Grouping>();
    }
    this.groupings.add(groupingsItem);
    return this;
  }

   /**
   * Get groupings
   * @return groupings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Grouping> getGroupings() {
    return groupings;
  }


  public void setGroupings(List<Grouping> groupings) {
    this.groupings = groupings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHookTemplateResponse getHookTemplateResponse = (GetHookTemplateResponse) o;
    return Objects.equals(this.templates, getHookTemplateResponse.templates) &&
        Objects.equals(this.groupings, getHookTemplateResponse.groupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, groupings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHookTemplateResponse {\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    groupings: ").append(toIndentedString(groupings)).append("\n");
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

