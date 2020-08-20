# DataTablesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
PostDataTablesRequest body = new PostDataTablesRequest(); // PostDataTablesRequest | body
try {
    PostDataTablesResponse result = apiInstance.createDatatable(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#createDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
Long apptableId = 789L; // Long | apptableId
PostDataTablesAppTableIdRequest body = new PostDataTablesAppTableIdRequest(); // PostDataTablesAppTableIdRequest | body
try {
    PostDataTablesAppTableIdResponse result = apiInstance.createDatatableEntry(datatable, apptableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#createDatatableEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatableName = "datatableName_example"; // String | datatableName
try {
    DeleteDataTablesResponse result = apiInstance.deleteDatatable(datatableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#deleteDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
Object datatable = "{}"; // Object | datatable
Long apptableId = 789L; // Long | apptableId
Long datatableId = 789L; // Long | datatableId
try {
    DeleteDataTablesDatatableAppTableIdDatatableIdResponse result = apiInstance.deleteDatatableEntries(datatable, apptableId, datatableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#deleteDatatableEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
Long apptableId = 789L; // Long | apptableId
try {
    DeleteDataTablesDatatableAppTableIdResponse result = apiInstance.deleteDatatableEntries_0(datatable, apptableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#deleteDatatableEntries_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
try {
    PutDataTablesResponse result = apiInstance.deregisterDatatable(datatable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#deregisterDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
Long apptableId = 789L; // Long | apptableId
String order = "order_example"; // String | order
try {
    GetDataTablesAppTableIdResponse result = apiInstance.getDatatable(datatable, apptableId, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#getDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | 
Long apptableId = 789L; // Long | 
Long datatableId = 789L; // Long | 
String order = "order_example"; // String | 
try {
    String result = apiInstance.getDatatableManyEntry(datatable, apptableId, datatableId, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#getDatatableManyEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
try {
    GetDataTablesResponse result = apiInstance.getDatatable_0(datatable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#getDatatable_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String apptable = "apptable_example"; // String | apptable
try {
    List<GetDataTablesResponse> result = apiInstance.getDatatables(apptable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#getDatatables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
String apptable = "apptable_example"; // String | apptable
PostDataTablesRegisterDatatableAppTable body = new PostDataTablesRegisterDatatableAppTable(); // PostDataTablesRegisterDatatableAppTable | body
try {
    PutDataTablesResponse result = apiInstance.registerDatatable(datatable, apptable, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#registerDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatableName = "datatableName_example"; // String | datatableName
PutDataTablesRequest body = new PutDataTablesRequest(); // PutDataTablesRequest | body
try {
    PutDataTablesResponse result = apiInstance.updateDatatable(datatableName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#updateDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
Long apptableId = 789L; // Long | apptableId
Long datatableId = 789L; // Long | datatableId
PutDataTablesAppTableIdDatatableIdRequest body = new PutDataTablesAppTableIdDatatableIdRequest(); // PutDataTablesAppTableIdDatatableIdRequest | body
try {
    PutDataTablesAppTableIdDatatableIdResponse result = apiInstance.updateDatatableEntryOneToMany(datatable, apptableId, datatableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#updateDatatableEntryOneToMany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DataTablesApi;


DataTablesApi apiInstance = new DataTablesApi();
String datatable = "datatable_example"; // String | datatable
Long apptableId = 789L; // Long | apptableId
PutDataTablesAppTableIdRequest body = new PutDataTablesAppTableIdRequest(); // PutDataTablesAppTableIdRequest | body
try {
    PutDataTablesAppTableIdResponse result = apiInstance.updateDatatableEntryOnetoOne(datatable, apptableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTablesApi#updateDatatableEntryOnetoOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

