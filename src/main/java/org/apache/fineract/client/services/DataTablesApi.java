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
package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteDataTablesDatatableAppTableIdDatatableIdResponse;
import org.apache.fineract.client.models.DeleteDataTablesDatatableAppTableIdResponse;
import org.apache.fineract.client.models.DeleteDataTablesResponse;
import org.apache.fineract.client.models.GetDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.GetDataTablesResponse;
import org.apache.fineract.client.models.PostDataTablesAppTableIdRequest;
import org.apache.fineract.client.models.PostDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.PostDataTablesRequest;
import org.apache.fineract.client.models.PostDataTablesResponse;
import org.apache.fineract.client.models.PutDataTablesAppTableIdDatatableIdRequest;
import org.apache.fineract.client.models.PutDataTablesAppTableIdDatatableIdResponse;
import org.apache.fineract.client.models.PutDataTablesAppTableIdRequest;
import org.apache.fineract.client.models.PutDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.PutDataTablesRequest;
import org.apache.fineract.client.models.PutDataTablesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DataTablesApi {
  /**
   * Create Data Table
   * Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code description fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.
   * @param postDataTablesRequest  (required)
   * @return Observable&lt;PostDataTablesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("datatables")
  Observable<PostDataTablesResponse> createDatatable(
    @retrofit2.http.Body PostDataTablesRequest postDataTablesRequest
  );

  /**
   * Create Entry in Data Table
   * Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @param postDataTablesAppTableIdRequest  (required)
   * @return Observable&lt;PostDataTablesAppTableIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("datatables/{datatable}/{apptableId}")
  Observable<PostDataTablesAppTableIdResponse> createDatatableEntry(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PostDataTablesAppTableIdRequest postDataTablesAppTableIdRequest
  );

  /**
   * Delete Data Table
   * Deletes a data table and deregisters it from the Apache Fineract Core application table.
   * @param datatableName datatableName (required)
   * @return Observable&lt;DeleteDataTablesResponse&gt;
   */
  @DELETE("datatables/{datatableName}")
  Observable<DeleteDataTablesResponse> deleteDatatable(
    @retrofit2.http.Path("datatableName") String datatableName
  );

  /**
   * Delete Entry(s) in Data Table
   * Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @return Observable&lt;DeleteDataTablesDatatableAppTableIdResponse&gt;
   */
  @DELETE("datatables/{datatable}/{apptableId}")
  Observable<DeleteDataTablesDatatableAppTableIdResponse> deleteDatatableEntries(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId
  );

  /**
   * Delete Entry in Datatable (One to Many)
   * Deletes the entry (if it exists) for data tables that are one to many with the application table.  
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @param datatableId datatableId (required)
   * @return Observable&lt;DeleteDataTablesDatatableAppTableIdDatatableIdResponse&gt;
   */
  @DELETE("datatables/{datatable}/{apptableId}/{datatableId}")
  Observable<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> deleteDatatableEntries1(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId
  );

  /**
   * Deregister Data Table
   * Deregisters a data table. It will no longer be available through the API.
   * @param datatable datatable (required)
   * @return Observable&lt;PutDataTablesResponse&gt;
   */
  @POST("datatables/deregister/{datatable}")
  Observable<PutDataTablesResponse> deregisterDatatable(
    @retrofit2.http.Path("datatable") String datatable
  );

  /**
   * Retrieve Data Table Details
   * Lists a registered data table details and the Apache Fineract Core application table they are registered to.
   * @param datatable datatable (required)
   * @return Observable&lt;GetDataTablesResponse&gt;
   */
  @GET("datatables/{datatable}")
  Observable<GetDataTablesResponse> getDatatable(
    @retrofit2.http.Path("datatable") String datatable
  );

  /**
   * Retrieve Entry(s) from Data Table
   * Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @param order order (optional)
   * @return Observable&lt;GetDataTablesAppTableIdResponse&gt;
   */
  @GET("datatables/{datatable}/{apptableId}")
  Observable<GetDataTablesAppTableIdResponse> getDatatable1(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Query("order") String order
  );

  /**
   * 
   * 
   * @param datatable  (required)
   * @param apptableId  (required)
   * @param datatableId  (required)
   * @param order  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("datatables/{datatable}/{apptableId}/{datatableId}")
  Observable<String> getDatatableManyEntry(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId, @retrofit2.http.Query("order") String order
  );

  /**
   * List Data Tables
   * Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables
   * @param apptable apptable (optional)
   * @return Observable&lt;List&lt;GetDataTablesResponse&gt;&gt;
   */
  @GET("datatables")
  Observable<List<GetDataTablesResponse>> getDatatables(
    @retrofit2.http.Query("apptable") String apptable
  );

  /**
   * Register Data Table
   * Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)
   * @param datatable datatable (required)
   * @param apptable apptable (required)
   * @param body  (optional)
   * @return Observable&lt;PutDataTablesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("datatables/register/{datatable}/{apptable}")
  Observable<PutDataTablesResponse> registerDatatable(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptable") String apptable, @retrofit2.http.Body Object body
  );

  /**
   * Update Data Table
   * Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.
   * @param datatableName datatableName (required)
   * @param putDataTablesRequest  (required)
   * @return Observable&lt;PutDataTablesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("datatables/{datatableName}")
  Observable<PutDataTablesResponse> updateDatatable(
    @retrofit2.http.Path("datatableName") String datatableName, @retrofit2.http.Body PutDataTablesRequest putDataTablesRequest
  );

  /**
   * Update Entry in Data Table (One to Many)
   * Updates the row (if it exists) of the data table.
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @param datatableId datatableId (required)
   * @param putDataTablesAppTableIdDatatableIdRequest  (required)
   * @return Observable&lt;PutDataTablesAppTableIdDatatableIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("datatables/{datatable}/{apptableId}/{datatableId}")
  Observable<PutDataTablesAppTableIdDatatableIdResponse> updateDatatableEntryOneToMany(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId, @retrofit2.http.Body PutDataTablesAppTableIdDatatableIdRequest putDataTablesAppTableIdDatatableIdRequest
  );

  /**
   * Update Entry in Data Table (One to One)
   * Updates the row (if it exists) of the data table.
   * @param datatable datatable (required)
   * @param apptableId apptableId (required)
   * @param putDataTablesAppTableIdRequest  (required)
   * @return Observable&lt;PutDataTablesAppTableIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("datatables/{datatable}/{apptableId}")
  Observable<PutDataTablesAppTableIdResponse> updateDatatableEntryOnetoOne(
    @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PutDataTablesAppTableIdRequest putDataTablesAppTableIdRequest
  );

}
