# DataTablesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatatable**](DataTablesApi.md#createDatatable) | **POST** datatables | Create Data Table
[**createDatatableEntry**](DataTablesApi.md#createDatatableEntry) | **POST** datatables/{datatable}/{apptableId} | Create Entry in Data Table
[**deleteDatatable**](DataTablesApi.md#deleteDatatable) | **DELETE** datatables/{datatableName} | Delete Data Table
[**deleteDatatableEntries**](DataTablesApi.md#deleteDatatableEntries) | **DELETE** datatables/{datatable}/{apptableId}/{datatableId} | Delete Entry in Datatable (One to Many)
[**deleteDatatableEntries_0**](DataTablesApi.md#deleteDatatableEntries_0) | **DELETE** datatables/{datatable}/{apptableId} | Delete Entry(s) in Data Table
[**deregisterDatatable**](DataTablesApi.md#deregisterDatatable) | **POST** datatables/deregister/{datatable} | Deregister Data Table
[**getDatatable**](DataTablesApi.md#getDatatable) | **GET** datatables/{datatable}/{apptableId} | Retrieve Entry(s) from Data Table
[**getDatatableManyEntry**](DataTablesApi.md#getDatatableManyEntry) | **GET** datatables/{datatable}/{apptableId}/{datatableId} | 
[**getDatatable_0**](DataTablesApi.md#getDatatable_0) | **GET** datatables/{datatable} | Retrieve Data Table Details
[**getDatatables**](DataTablesApi.md#getDatatables) | **GET** datatables | List Data Tables
[**registerDatatable**](DataTablesApi.md#registerDatatable) | **POST** datatables/register/{datatable}/{apptable} | Register Data Table
[**updateDatatable**](DataTablesApi.md#updateDatatable) | **PUT** datatables/{datatableName} | Update Data Table
[**updateDatatableEntryOneToMany**](DataTablesApi.md#updateDatatableEntryOneToMany) | **PUT** datatables/{datatable}/{apptableId}/{datatableId} | Update Entry in Data Table (One to Many)
[**updateDatatableEntryOnetoOne**](DataTablesApi.md#updateDatatableEntryOnetoOne) | **PUT** datatables/{datatable}/{apptableId} | Update Entry in Data Table (One to One)


<a name="createDatatable"></a>
# **createDatatable**
> PostDataTablesResponse createDatatable(body)

Create Data Table

Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PostDataTablesResponse> call = apiService.createDatatable(body);
call.enqueue(new Callback<PostDataTablesResponse>() {
    @Override
    public void onResponse(Call<PostDataTablesResponse> call, Response<PostDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostDataTablesRequest**](PostDataTablesRequest.md)| body |

### Return type

[**PostDataTablesResponse**](PostDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDatatableEntry"></a>
# **createDatatableEntry**
> PostDataTablesAppTableIdResponse createDatatableEntry(datatable, apptableId, body)

Create Entry in Data Table

Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PostDataTablesAppTableIdResponse> call = apiService.createDatatableEntry(datatable, apptableId, body);
call.enqueue(new Callback<PostDataTablesAppTableIdResponse>() {
    @Override
    public void onResponse(Call<PostDataTablesAppTableIdResponse> call, Response<PostDataTablesAppTableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostDataTablesAppTableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **body** | [**PostDataTablesAppTableIdRequest**](PostDataTablesAppTableIdRequest.md)| body |

### Return type

[**PostDataTablesAppTableIdResponse**](PostDataTablesAppTableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatable"></a>
# **deleteDatatable**
> DeleteDataTablesResponse deleteDatatable(datatableName)

Delete Data Table

Deletes a data table and deregisters it from the Apache Fineract Core application table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<DeleteDataTablesResponse> call = apiService.deleteDatatable(datatableName);
call.enqueue(new Callback<DeleteDataTablesResponse>() {
    @Override
    public void onResponse(Call<DeleteDataTablesResponse> call, Response<DeleteDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatableName** | **String**| datatableName |

### Return type

[**DeleteDataTablesResponse**](DeleteDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatableEntries"></a>
# **deleteDatatableEntries**
> DeleteDataTablesDatatableAppTableIdDatatableIdResponse deleteDatatableEntries(datatable, apptableId, datatableId)

Delete Entry in Datatable (One to Many)

Deletes the entry (if it exists) for data tables that are one to many with the application table.  

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> call = apiService.deleteDatatableEntries(datatable, apptableId, datatableId);
call.enqueue(new Callback<DeleteDataTablesDatatableAppTableIdDatatableIdResponse>() {
    @Override
    public void onResponse(Call<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> call, Response<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteDataTablesDatatableAppTableIdDatatableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | [**Object**](.md)| datatable |
 **apptableId** | **Long**| apptableId |
 **datatableId** | **Long**| datatableId |

### Return type

[**DeleteDataTablesDatatableAppTableIdDatatableIdResponse**](DeleteDataTablesDatatableAppTableIdDatatableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatableEntries_0"></a>
# **deleteDatatableEntries_0**
> DeleteDataTablesDatatableAppTableIdResponse deleteDatatableEntries_0(datatable, apptableId)

Delete Entry(s) in Data Table

Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<DeleteDataTablesDatatableAppTableIdResponse> call = apiService.deleteDatatableEntries_0(datatable, apptableId);
call.enqueue(new Callback<DeleteDataTablesDatatableAppTableIdResponse>() {
    @Override
    public void onResponse(Call<DeleteDataTablesDatatableAppTableIdResponse> call, Response<DeleteDataTablesDatatableAppTableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteDataTablesDatatableAppTableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |

### Return type

[**DeleteDataTablesDatatableAppTableIdResponse**](DeleteDataTablesDatatableAppTableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deregisterDatatable"></a>
# **deregisterDatatable**
> PutDataTablesResponse deregisterDatatable(datatable)

Deregister Data Table

Deregisters a data table. It will no longer be available through the API.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PutDataTablesResponse> call = apiService.deregisterDatatable(datatable);
call.enqueue(new Callback<PutDataTablesResponse>() {
    @Override
    public void onResponse(Call<PutDataTablesResponse> call, Response<PutDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDatatable"></a>
# **getDatatable**
> GetDataTablesAppTableIdResponse getDatatable(datatable, apptableId, order)

Retrieve Entry(s) from Data Table

Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<GetDataTablesAppTableIdResponse> call = apiService.getDatatable(datatable, apptableId, order);
call.enqueue(new Callback<GetDataTablesAppTableIdResponse>() {
    @Override
    public void onResponse(Call<GetDataTablesAppTableIdResponse> call, Response<GetDataTablesAppTableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetDataTablesAppTableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **order** | **String**| order | [optional]

### Return type

[**GetDataTablesAppTableIdResponse**](GetDataTablesAppTableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDatatableManyEntry"></a>
# **getDatatableManyEntry**
> String getDatatableManyEntry(datatable, apptableId, datatableId, order)



### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getDatatableManyEntry(datatable, apptableId, datatableId, order);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**|  |
 **apptableId** | **Long**|  |
 **datatableId** | **Long**|  |
 **order** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDatatable_0"></a>
# **getDatatable_0**
> GetDataTablesResponse getDatatable_0(datatable)

Retrieve Data Table Details

Lists a registered data table details and the Apache Fineract Core application table they are registered to.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<GetDataTablesResponse> call = apiService.getDatatable_0(datatable);
call.enqueue(new Callback<GetDataTablesResponse>() {
    @Override
    public void onResponse(Call<GetDataTablesResponse> call, Response<GetDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |

### Return type

[**GetDataTablesResponse**](GetDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDatatables"></a>
# **getDatatables**
> List&lt;GetDataTablesResponse&gt; getDatatables(apptable)

List Data Tables

Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetDataTablesResponse&gt;> call = apiService.getDatatables(apptable);
call.enqueue(new Callback<List&lt;GetDataTablesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetDataTablesResponse&gt;> call, Response<List&lt;GetDataTablesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetDataTablesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **apptable** | **String**| apptable | [optional]

### Return type

[**List&lt;GetDataTablesResponse&gt;**](GetDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerDatatable"></a>
# **registerDatatable**
> PutDataTablesResponse registerDatatable(datatable, apptable, body)

Register Data Table

Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PutDataTablesResponse> call = apiService.registerDatatable(datatable, apptable, body);
call.enqueue(new Callback<PutDataTablesResponse>() {
    @Override
    public void onResponse(Call<PutDataTablesResponse> call, Response<PutDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptable** | **String**| apptable |
 **body** | [**PostDataTablesRegisterDatatableAppTable**](PostDataTablesRegisterDatatableAppTable.md)| body | [optional]

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDatatable"></a>
# **updateDatatable**
> PutDataTablesResponse updateDatatable(datatableName, body)

Update Data Table

Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PutDataTablesResponse> call = apiService.updateDatatable(datatableName, body);
call.enqueue(new Callback<PutDataTablesResponse>() {
    @Override
    public void onResponse(Call<PutDataTablesResponse> call, Response<PutDataTablesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutDataTablesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatableName** | **String**| datatableName |
 **body** | [**PutDataTablesRequest**](PutDataTablesRequest.md)| body |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDatatableEntryOneToMany"></a>
# **updateDatatableEntryOneToMany**
> PutDataTablesAppTableIdDatatableIdResponse updateDatatableEntryOneToMany(datatable, apptableId, datatableId, body)

Update Entry in Data Table (One to Many)

Updates the row (if it exists) of the data table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PutDataTablesAppTableIdDatatableIdResponse> call = apiService.updateDatatableEntryOneToMany(datatable, apptableId, datatableId, body);
call.enqueue(new Callback<PutDataTablesAppTableIdDatatableIdResponse>() {
    @Override
    public void onResponse(Call<PutDataTablesAppTableIdDatatableIdResponse> call, Response<PutDataTablesAppTableIdDatatableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutDataTablesAppTableIdDatatableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **datatableId** | **Long**| datatableId |
 **body** | [**PutDataTablesAppTableIdDatatableIdRequest**](PutDataTablesAppTableIdDatatableIdRequest.md)| body |

### Return type

[**PutDataTablesAppTableIdDatatableIdResponse**](PutDataTablesAppTableIdDatatableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDatatableEntryOnetoOne"></a>
# **updateDatatableEntryOnetoOne**
> PutDataTablesAppTableIdResponse updateDatatableEntryOnetoOne(datatable, apptableId, body)

Update Entry in Data Table (One to One)

Updates the row (if it exists) of the data table.

### Example
```java

DataTablesApi apiService = defaultClient.createService(DataTablesApi.class);

// Initialize these parameters earlier.
Call<PutDataTablesAppTableIdResponse> call = apiService.updateDatatableEntryOnetoOne(datatable, apptableId, body);
call.enqueue(new Callback<PutDataTablesAppTableIdResponse>() {
    @Override
    public void onResponse(Call<PutDataTablesAppTableIdResponse> call, Response<PutDataTablesAppTableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutDataTablesAppTableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **body** | [**PutDataTablesAppTableIdRequest**](PutDataTablesAppTableIdRequest.md)| body |

### Return type

[**PutDataTablesAppTableIdResponse**](PutDataTablesAppTableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

