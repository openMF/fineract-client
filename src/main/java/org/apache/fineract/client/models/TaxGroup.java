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
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.AppUser;
import org.apache.fineract.client.models.TaxGroupMappings;

/**
 * TaxGroup
 */

public class TaxGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private AppUser createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private AppUser lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private Date lastModifiedDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAX_GROUP_MAPPINGS = "taxGroupMappings";
  @SerializedName(SERIALIZED_NAME_TAX_GROUP_MAPPINGS)
  private List<TaxGroupMappings> taxGroupMappings = null;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public TaxGroup id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public TaxGroup createdBy(AppUser createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppUser getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(AppUser createdBy) {
    this.createdBy = createdBy;
  }


  public TaxGroup createdDate(Date createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public TaxGroup lastModifiedBy(AppUser lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppUser getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public TaxGroup lastModifiedDate(Date lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(Date lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public TaxGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaxGroup taxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    
    this.taxGroupMappings = taxGroupMappings;
    return this;
  }

  public TaxGroup addTaxGroupMappingsItem(TaxGroupMappings taxGroupMappingsItem) {
    if (this.taxGroupMappings == null) {
      this.taxGroupMappings = new ArrayList<TaxGroupMappings>();
    }
    this.taxGroupMappings.add(taxGroupMappingsItem);
    return this;
  }

   /**
   * Get taxGroupMappings
   * @return taxGroupMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxGroupMappings> getTaxGroupMappings() {
    return taxGroupMappings;
  }


  public void setTaxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    this.taxGroupMappings = taxGroupMappings;
  }


  public TaxGroup _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxGroup taxGroup = (TaxGroup) o;
    return Objects.equals(this.id, taxGroup.id) &&
        Objects.equals(this.createdBy, taxGroup.createdBy) &&
        Objects.equals(this.createdDate, taxGroup.createdDate) &&
        Objects.equals(this.lastModifiedBy, taxGroup.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, taxGroup.lastModifiedDate) &&
        Objects.equals(this.name, taxGroup.name) &&
        Objects.equals(this.taxGroupMappings, taxGroup.taxGroupMappings) &&
        Objects.equals(this._new, taxGroup._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, name, taxGroupMappings, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxGroupMappings: ").append(toIndentedString(taxGroupMappings)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

