package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DataTablesApi {
    /**
     * Create Data Table
     * Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.
     *
     * @param body body (required)
     * @return Call&lt;PostDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("datatables")
    Call<PostDataTablesResponse> createDatatable(
            @retrofit2.http.Body PostDataTablesRequest body
    );

    /**
     * Create Entry in Data Table
     * Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.
     *
     * @param datatable  datatable (required)
     * @param apptableId apptableId (required)
     * @param body       body (required)
     * @return Call&lt;PostDataTablesAppTableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("datatables/{datatable}/{apptableId}")
    Call<PostDataTablesAppTableIdResponse> createDatatableEntry(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PostDataTablesAppTableIdRequest body
    );

    /**
     * Delete Data Table
     * Deletes a data table and deregisters it from the Apache Fineract Core application table.
     *
     * @param datatableName datatableName (required)
     * @return Call&lt;DeleteDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("datatables/{datatableName}")
    Call<DeleteDataTablesResponse> deleteDatatable(
            @retrofit2.http.Path("datatableName") String datatableName
    );

    /**
     * Delete Entry in Datatable (One to Many)
     * Deletes the entry (if it exists) for data tables that are one to many with the application table.
     *
     * @param datatable   datatable (required)
     * @param apptableId  apptableId (required)
     * @param datatableId datatableId (required)
     * @return Call&lt;DeleteDataTablesDatatableAppTableIdDatatableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("datatables/{datatable}/{apptableId}/{datatableId}")
    Call<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> deleteDatatableEntries(
            @retrofit2.http.Path("datatable") Object datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId
    );

    /**
     * Delete Entry(s) in Data Table
     * Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.
     *
     * @param datatable  datatable (required)
     * @param apptableId apptableId (required)
     * @return Call&lt;DeleteDataTablesDatatableAppTableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("datatables/{datatable}/{apptableId}")
    Call<DeleteDataTablesDatatableAppTableIdResponse> deleteDatatableEntries_0(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId
    );

    /**
     * Deregister Data Table
     * Deregisters a data table. It will no longer be available through the API.
     *
     * @param datatable datatable (required)
     * @return Call&lt;PutDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("datatables/deregister/{datatable}")
    Call<PutDataTablesResponse> deregisterDatatable(
            @retrofit2.http.Path("datatable") String datatable
    );

    /**
     * Retrieve Entry(s) from Data Table
     * Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true
     *
     * @param datatable  datatable (required)
     * @param apptableId apptableId (required)
     * @param order      order (optional)
     * @return Call&lt;GetDataTablesAppTableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("datatables/{datatable}/{apptableId}")
    Call<GetDataTablesAppTableIdResponse> getDatatable(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Query("order") String order
    );

    /**
     * @param datatable   (required)
     * @param apptableId  (required)
     * @param datatableId (required)
     * @param order       (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("datatables/{datatable}/{apptableId}/{datatableId}")
    Call<String> getDatatableManyEntry(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId, @retrofit2.http.Query("order") String order
    );

    /**
     * Retrieve Data Table Details
     * Lists a registered data table details and the Apache Fineract Core application table they are registered to.
     *
     * @param datatable datatable (required)
     * @return Call&lt;GetDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("datatables/{datatable}")
    Call<GetDataTablesResponse> getDatatable_0(
            @retrofit2.http.Path("datatable") String datatable
    );

    /**
     * List Data Tables
     * Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables
     *
     * @param apptable apptable (optional)
     * @return Call&lt;List&lt;GetDataTablesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("datatables")
    Call<List<GetDataTablesResponse>> getDatatables(
            @retrofit2.http.Query("apptable") String apptable
    );

    /**
     * Register Data Table
     * Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)
     *
     * @param datatable datatable (required)
     * @param apptable  apptable (required)
     * @param body      body (optional)
     * @return Call&lt;PutDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("datatables/register/{datatable}/{apptable}")
    Call<PutDataTablesResponse> registerDatatable(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptable") String apptable, @retrofit2.http.Body PostDataTablesRegisterDatatableAppTable body
    );

    /**
     * Update Data Table
     * Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.
     *
     * @param datatableName datatableName (required)
     * @param body          body (required)
     * @return Call&lt;PutDataTablesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("datatables/{datatableName}")
    Call<PutDataTablesResponse> updateDatatable(
            @retrofit2.http.Path("datatableName") String datatableName, @retrofit2.http.Body PutDataTablesRequest body
    );

    /**
     * Update Entry in Data Table (One to Many)
     * Updates the row (if it exists) of the data table.
     *
     * @param datatable   datatable (required)
     * @param apptableId  apptableId (required)
     * @param datatableId datatableId (required)
     * @param body        body (required)
     * @return Call&lt;PutDataTablesAppTableIdDatatableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("datatables/{datatable}/{apptableId}/{datatableId}")
    Call<PutDataTablesAppTableIdDatatableIdResponse> updateDatatableEntryOneToMany(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Path("datatableId") Long datatableId, @retrofit2.http.Body PutDataTablesAppTableIdDatatableIdRequest body
    );

    /**
     * Update Entry in Data Table (One to One)
     * Updates the row (if it exists) of the data table.
     *
     * @param datatable  datatable (required)
     * @param apptableId apptableId (required)
     * @param body       body (required)
     * @return Call&lt;PutDataTablesAppTableIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("datatables/{datatable}/{apptableId}")
    Call<PutDataTablesAppTableIdResponse> updateDatatableEntryOnetoOne(
            @retrofit2.http.Path("datatable") String datatable, @retrofit2.http.Path("apptableId") Long apptableId, @retrofit2.http.Body PutDataTablesAppTableIdRequest body
    );

}
