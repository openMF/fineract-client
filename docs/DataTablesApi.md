# DataTablesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advancedQuery**](DataTablesApi.md#advancedQuery) | **POST** v1/datatables/{datatable}/query | Query Data Table values |
| [**createDatatable**](DataTablesApi.md#createDatatable) | **POST** v1/datatables | Create Data Table |
| [**createDatatableEntry**](DataTablesApi.md#createDatatableEntry) | **POST** v1/datatables/{datatable}/{apptableId} | Create Entry in Data Table |
| [**deleteDatatable**](DataTablesApi.md#deleteDatatable) | **DELETE** v1/datatables/{datatableName} | Delete Data Table |
| [**deleteDatatableEntries**](DataTablesApi.md#deleteDatatableEntries) | **DELETE** v1/datatables/{datatable}/{apptableId} | Delete Entry(s) in Data Table |
| [**deleteDatatableEntry**](DataTablesApi.md#deleteDatatableEntry) | **DELETE** v1/datatables/{datatable}/{apptableId}/{datatableId} | Delete Entry in Datatable (One to Many) |
| [**deregisterDatatable**](DataTablesApi.md#deregisterDatatable) | **POST** v1/datatables/deregister/{datatable} | Deregister Data Table |
| [**getDatatable**](DataTablesApi.md#getDatatable) | **GET** v1/datatables/{datatable} | Retrieve Data Table Details |
| [**getDatatable1**](DataTablesApi.md#getDatatable1) | **GET** v1/datatables/{datatable}/{apptableId} | Retrieve Entry(s) from Data Table |
| [**getDatatableManyEntry**](DataTablesApi.md#getDatatableManyEntry) | **GET** v1/datatables/{datatable}/{apptableId}/{datatableId} |  |
| [**getDatatables**](DataTablesApi.md#getDatatables) | **GET** v1/datatables | List Data Tables |
| [**queryValues**](DataTablesApi.md#queryValues) | **GET** v1/datatables/{datatable}/query | Query Data Table values |
| [**registerDatatable**](DataTablesApi.md#registerDatatable) | **POST** v1/datatables/register/{datatable}/{apptable} | Register Data Table |
| [**updateDatatable**](DataTablesApi.md#updateDatatable) | **PUT** v1/datatables/{datatableName} | Update Data Table |
| [**updateDatatableEntryOneToMany**](DataTablesApi.md#updateDatatableEntryOneToMany) | **PUT** v1/datatables/{datatable}/{apptableId}/{datatableId} | Update Entry in Data Table (One to Many) |
| [**updateDatatableEntryOnetoOne**](DataTablesApi.md#updateDatatableEntryOnetoOne) | **PUT** v1/datatables/{datatable}/{apptableId} | Update Entry in Data Table (One to One) |



Query Data Table values

Query values from a registered data table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val pagedLocalRequestAdvancedQueryData : PagedLocalRequestAdvancedQueryData =  // PagedLocalRequestAdvancedQueryData | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.advancedQuery(datatable, pagedLocalRequestAdvancedQueryData)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pagedLocalRequestAdvancedQueryData** | [**PagedLocalRequestAdvancedQueryData**](PagedLocalRequestAdvancedQueryData.md)|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create Data Table

Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code description fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val postDataTablesRequest : PostDataTablesRequest =  // PostDataTablesRequest | 

launch(Dispatchers.IO) {
    val result : PostDataTablesResponse = webService.createDatatable(postDataTablesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDataTablesRequest** | [**PostDataTablesRequest**](PostDataTablesRequest.md)|  | |

### Return type

[**PostDataTablesResponse**](PostDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create Entry in Data Table

Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val body : kotlin.String = body_example // kotlin.String | {   \"BusinessDescription\": \"Livestock sales\",   \"Comment\": \"First comment made\",   \"Education_cv\": \"Primary\",   \"Gender_cd\": 6,   \"HighestRatePaid\": 8.5,   \"NextVisit\": \"01 October 2012\",   \"YearsinBusiness\": 5,   \"dateFormat\": \"dd MMMM yyyy\",   \"locale\": \"en\" }

launch(Dispatchers.IO) {
    val result : PostDataTablesAppTableIdResponse = webService.createDatatableEntry(datatable, apptableId, body)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptableId** | **kotlin.Long**| apptableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| {   \&quot;BusinessDescription\&quot;: \&quot;Livestock sales\&quot;,   \&quot;Comment\&quot;: \&quot;First comment made\&quot;,   \&quot;Education_cv\&quot;: \&quot;Primary\&quot;,   \&quot;Gender_cd\&quot;: 6,   \&quot;HighestRatePaid\&quot;: 8.5,   \&quot;NextVisit\&quot;: \&quot;01 October 2012\&quot;,   \&quot;YearsinBusiness\&quot;: 5,   \&quot;dateFormat\&quot;: \&quot;dd MMMM yyyy\&quot;,   \&quot;locale\&quot;: \&quot;en\&quot; } | |

### Return type

[**PostDataTablesAppTableIdResponse**](PostDataTablesAppTableIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Data Table

Deletes a data table and deregisters it from the Apache Fineract Core application table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatableName : kotlin.String = datatableName_example // kotlin.String | datatableName

launch(Dispatchers.IO) {
    val result : DeleteDataTablesResponse = webService.deleteDatatable(datatableName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableName** | **kotlin.String**| datatableName | |

### Return type

[**DeleteDataTablesResponse**](DeleteDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete Entry(s) in Data Table

Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId

launch(Dispatchers.IO) {
    val result : DeleteDataTablesDatatableAppTableIdResponse = webService.deleteDatatableEntries(datatable, apptableId)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apptableId** | **kotlin.Long**| apptableId | |

### Return type

[**DeleteDataTablesDatatableAppTableIdResponse**](DeleteDataTablesDatatableAppTableIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete Entry in Datatable (One to Many)

Deletes the entry (if it exists) for data tables that are one to many with the application table.  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = {} // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val datatableId : kotlin.Long = 789 // kotlin.Long | datatableId

launch(Dispatchers.IO) {
    val result : DeleteDataTablesDatatableAppTableIdDatatableIdResponse = webService.deleteDatatableEntry(datatable, apptableId, datatableId)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptableId** | **kotlin.Long**| apptableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatableId** | **kotlin.Long**| datatableId | |

### Return type

[**DeleteDataTablesDatatableAppTableIdDatatableIdResponse**](DeleteDataTablesDatatableAppTableIdDatatableIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Deregister Data Table

Deregisters a data table. It will no longer be available through the API.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable

launch(Dispatchers.IO) {
    val result : PutDataTablesResponse = webService.deregisterDatatable(datatable)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatable** | **kotlin.String**| datatable | |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Data Table Details

Lists a registered data table details and the Apache Fineract Core application table they are registered to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable

launch(Dispatchers.IO) {
    val result : GetDataTablesResponse = webService.getDatatable(datatable)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datatable** | **kotlin.String**| datatable | |

### Return type

[**GetDataTablesResponse**](GetDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Entry(s) from Data Table

Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val order : kotlin.String = order_example // kotlin.String | order

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getDatatable1(datatable, apptableId, order)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptableId** | **kotlin.Long**| apptableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| order | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | 
val apptableId : kotlin.Long = 789 // kotlin.Long | 
val datatableId : kotlin.Long = 789 // kotlin.Long | 
val order : kotlin.String = order_example // kotlin.String | 
val genericResultSet : kotlin.Boolean = true // kotlin.Boolean | Optional flag to format the response

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getDatatableManyEntry(datatable, apptableId, datatableId, order, genericResultSet)
}
```

### Parameters
| **datatable** | **kotlin.String**|  | |
| **apptableId** | **kotlin.Long**|  | |
| **datatableId** | **kotlin.Long**|  | |
| **order** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **genericResultSet** | **kotlin.Boolean**| Optional flag to format the response | [optional] [default to false] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Data Tables

Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val apptable : kotlin.String = apptable_example // kotlin.String | apptable

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDataTablesResponse> = webService.getDatatables(apptable)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apptable** | **kotlin.String**| apptable | [optional] |

### Return type

[**kotlin.collections.List&lt;GetDataTablesResponse&gt;**](GetDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Data Table values

Query values from a registered data table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val columnFilter : kotlin.String = columnFilter_example // kotlin.String | columnFilter
val valueFilter : kotlin.String = valueFilter_example // kotlin.String | valueFilter
val resultColumns : kotlin.String = resultColumns_example // kotlin.String | resultColumns

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.queryValues(datatable, columnFilter, valueFilter, resultColumns)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **columnFilter** | **kotlin.String**| columnFilter | [optional] |
| **valueFilter** | **kotlin.String**| valueFilter | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resultColumns** | **kotlin.String**| resultColumns | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Register Data Table

Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptable : kotlin.String = apptable_example // kotlin.String | apptable
val body : kotlin.Any = Object // kotlin.Any | 

launch(Dispatchers.IO) {
    val result : PutDataTablesResponse = webService.registerDatatable(datatable, apptable, body)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptable** | **kotlin.String**| apptable | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Data Table

Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatableName : kotlin.String = datatableName_example // kotlin.String | datatableName
val putDataTablesRequest : PutDataTablesRequest =  // PutDataTablesRequest | 

launch(Dispatchers.IO) {
    val result : PutDataTablesResponse = webService.updateDatatable(datatableName, putDataTablesRequest)
}
```

### Parameters
| **datatableName** | **kotlin.String**| datatableName | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putDataTablesRequest** | [**PutDataTablesRequest**](PutDataTablesRequest.md)|  | |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Entry in Data Table (One to Many)

Updates the row (if it exists) of the data table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val datatableId : kotlin.Long = 789 // kotlin.Long | datatableId
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PutDataTablesAppTableIdDatatableIdResponse = webService.updateDatatableEntryOneToMany(datatable, apptableId, datatableId, body)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptableId** | **kotlin.Long**| apptableId | |
| **datatableId** | **kotlin.Long**| datatableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**PutDataTablesAppTableIdDatatableIdResponse**](PutDataTablesAppTableIdDatatableIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Entry in Data Table (One to One)

Updates the row (if it exists) of the data table.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DataTablesApi::class.java)
val datatable : kotlin.String = datatable_example // kotlin.String | datatable
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PutDataTablesAppTableIdResponse = webService.updateDatatableEntryOnetoOne(datatable, apptableId, body)
}
```

### Parameters
| **datatable** | **kotlin.String**| datatable | |
| **apptableId** | **kotlin.Long**| apptableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**PutDataTablesAppTableIdResponse**](PutDataTablesAppTableIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

