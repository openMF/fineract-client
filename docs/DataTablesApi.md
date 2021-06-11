# DataTablesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatatable**](DataTablesApi.md#createDatatable) | **POST** datatables | Create Data Table
[**createDatatableEntry**](DataTablesApi.md#createDatatableEntry) | **POST** datatables/{datatable}/{apptableId} | Create Entry in Data Table
[**deleteDatatable**](DataTablesApi.md#deleteDatatable) | **DELETE** datatables/{datatableName} | Delete Data Table
[**deleteDatatableEntries**](DataTablesApi.md#deleteDatatableEntries) | **DELETE** datatables/{datatable}/{apptableId} | Delete Entry(s) in Data Table
[**deleteDatatableEntries1**](DataTablesApi.md#deleteDatatableEntries1) | **DELETE** datatables/{datatable}/{apptableId}/{datatableId} | Delete Entry in Datatable (One to Many)
[**deregisterDatatable**](DataTablesApi.md#deregisterDatatable) | **POST** datatables/deregister/{datatable} | Deregister Data Table
[**getDatatable**](DataTablesApi.md#getDatatable) | **GET** datatables/{datatable} | Retrieve Data Table Details
[**getDatatable1**](DataTablesApi.md#getDatatable1) | **GET** datatables/{datatable}/{apptableId} | Retrieve Entry(s) from Data Table
[**getDatatableManyEntry**](DataTablesApi.md#getDatatableManyEntry) | **GET** datatables/{datatable}/{apptableId}/{datatableId} | 
[**getDatatables**](DataTablesApi.md#getDatatables) | **GET** datatables | List Data Tables
[**registerDatatable**](DataTablesApi.md#registerDatatable) | **POST** datatables/register/{datatable}/{apptable} | Register Data Table
[**updateDatatable**](DataTablesApi.md#updateDatatable) | **PUT** datatables/{datatableName} | Update Data Table
[**updateDatatableEntryOneToMany**](DataTablesApi.md#updateDatatableEntryOneToMany) | **PUT** datatables/{datatable}/{apptableId}/{datatableId} | Update Entry in Data Table (One to Many)
[**updateDatatableEntryOnetoOne**](DataTablesApi.md#updateDatatableEntryOnetoOne) | **PUT** datatables/{datatable}/{apptableId} | Update Entry in Data Table (One to One)



## createDatatable

> PostDataTablesResponse createDatatable(postDataTablesRequest)

Create Data Table

Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code description fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        PostDataTablesRequest postDataTablesRequest = new PostDataTablesRequest(); // PostDataTablesRequest | 
        try {
            PostDataTablesResponse result = apiInstance.createDatatable(postDataTablesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#createDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDataTablesRequest** | [**PostDataTablesRequest**](PostDataTablesRequest.md)|  |

### Return type

[**PostDataTablesResponse**](PostDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createDatatableEntry

> PostDataTablesAppTableIdResponse createDatatableEntry(datatable, apptableId, postDataTablesAppTableIdRequest)

Create Entry in Data Table

Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        PostDataTablesAppTableIdRequest postDataTablesAppTableIdRequest = new PostDataTablesAppTableIdRequest(); // PostDataTablesAppTableIdRequest | 
        try {
            PostDataTablesAppTableIdResponse result = apiInstance.createDatatableEntry(datatable, apptableId, postDataTablesAppTableIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#createDatatableEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **postDataTablesAppTableIdRequest** | [**PostDataTablesAppTableIdRequest**](PostDataTablesAppTableIdRequest.md)|  |

### Return type

[**PostDataTablesAppTableIdResponse**](PostDataTablesAppTableIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteDatatable

> DeleteDataTablesResponse deleteDatatable(datatableName)

Delete Data Table

Deletes a data table and deregisters it from the Apache Fineract Core application table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatableName = "datatableName_example"; // String | datatableName
        try {
            DeleteDataTablesResponse result = apiInstance.deleteDatatable(datatableName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#deleteDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatableName** | **String**| datatableName |

### Return type

[**DeleteDataTablesResponse**](DeleteDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteDatatableEntries

> DeleteDataTablesDatatableAppTableIdResponse deleteDatatableEntries(datatable, apptableId)

Delete Entry(s) in Data Table

Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        try {
            DeleteDataTablesDatatableAppTableIdResponse result = apiInstance.deleteDatatableEntries(datatable, apptableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#deleteDatatableEntries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteDatatableEntries1

> DeleteDataTablesDatatableAppTableIdDatatableIdResponse deleteDatatableEntries1(datatable, apptableId, datatableId)

Delete Entry in Datatable (One to Many)

Deletes the entry (if it exists) for data tables that are one to many with the application table.  

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = {}; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        Long datatableId = 56L; // Long | datatableId
        try {
            DeleteDataTablesDatatableAppTableIdDatatableIdResponse result = apiInstance.deleteDatatableEntries1(datatable, apptableId, datatableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#deleteDatatableEntries1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **datatableId** | **Long**| datatableId |

### Return type

[**DeleteDataTablesDatatableAppTableIdDatatableIdResponse**](DeleteDataTablesDatatableAppTableIdDatatableIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deregisterDatatable

> PutDataTablesResponse deregisterDatatable(datatable)

Deregister Data Table

Deregisters a data table. It will no longer be available through the API.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        try {
            PutDataTablesResponse result = apiInstance.deregisterDatatable(datatable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#deregisterDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getDatatable

> GetDataTablesResponse getDatatable(datatable)

Retrieve Data Table Details

Lists a registered data table details and the Apache Fineract Core application table they are registered to.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        try {
            GetDataTablesResponse result = apiInstance.getDatatable(datatable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#getDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |

### Return type

[**GetDataTablesResponse**](GetDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getDatatable1

> GetDataTablesAppTableIdResponse getDatatable1(datatable, apptableId, order)

Retrieve Entry(s) from Data Table

Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        String order = "order_example"; // String | order
        try {
            GetDataTablesAppTableIdResponse result = apiInstance.getDatatable1(datatable, apptableId, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#getDatatable1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getDatatableManyEntry

> String getDatatableManyEntry(datatable, apptableId, datatableId, order)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | 
        Long apptableId = 56L; // Long | 
        Long datatableId = 56L; // Long | 
        String order = "order_example"; // String | 
        try {
            String result = apiInstance.getDatatableManyEntry(datatable, apptableId, datatableId, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#getDatatableManyEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## getDatatables

> List&lt;GetDataTablesResponse&gt; getDatatables(apptable)

List Data Tables

Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String apptable = "apptable_example"; // String | apptable
        try {
            List<GetDataTablesResponse> result = apiInstance.getDatatables(apptable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#getDatatables");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apptable** | **String**| apptable | [optional]

### Return type

[**List&lt;GetDataTablesResponse&gt;**](GetDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## registerDatatable

> PutDataTablesResponse registerDatatable(datatable, apptable, body)

Register Data Table

Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        String apptable = "apptable_example"; // String | apptable
        Object body = null; // Object | 
        try {
            PutDataTablesResponse result = apiInstance.registerDatatable(datatable, apptable, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#registerDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |
 **apptable** | **String**| apptable |
 **body** | **Object**|  | [optional]

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateDatatable

> PutDataTablesResponse updateDatatable(datatableName, putDataTablesRequest)

Update Data Table

Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatableName = "datatableName_example"; // String | datatableName
        PutDataTablesRequest putDataTablesRequest = new PutDataTablesRequest(); // PutDataTablesRequest | 
        try {
            PutDataTablesResponse result = apiInstance.updateDatatable(datatableName, putDataTablesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#updateDatatable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatableName** | **String**| datatableName |
 **putDataTablesRequest** | [**PutDataTablesRequest**](PutDataTablesRequest.md)|  |

### Return type

[**PutDataTablesResponse**](PutDataTablesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateDatatableEntryOneToMany

> PutDataTablesAppTableIdDatatableIdResponse updateDatatableEntryOneToMany(datatable, apptableId, datatableId, putDataTablesAppTableIdDatatableIdRequest)

Update Entry in Data Table (One to Many)

Updates the row (if it exists) of the data table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        Long datatableId = 56L; // Long | datatableId
        PutDataTablesAppTableIdDatatableIdRequest putDataTablesAppTableIdDatatableIdRequest = new PutDataTablesAppTableIdDatatableIdRequest(); // PutDataTablesAppTableIdDatatableIdRequest | 
        try {
            PutDataTablesAppTableIdDatatableIdResponse result = apiInstance.updateDatatableEntryOneToMany(datatable, apptableId, datatableId, putDataTablesAppTableIdDatatableIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#updateDatatableEntryOneToMany");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **datatableId** | **Long**| datatableId |
 **putDataTablesAppTableIdDatatableIdRequest** | [**PutDataTablesAppTableIdDatatableIdRequest**](PutDataTablesAppTableIdDatatableIdRequest.md)|  |

### Return type

[**PutDataTablesAppTableIdDatatableIdResponse**](PutDataTablesAppTableIdDatatableIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateDatatableEntryOnetoOne

> PutDataTablesAppTableIdResponse updateDatatableEntryOnetoOne(datatable, apptableId, putDataTablesAppTableIdRequest)

Update Entry in Data Table (One to One)

Updates the row (if it exists) of the data table.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DataTablesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        DataTablesApi apiInstance = new DataTablesApi(defaultClient);
        String datatable = "datatable_example"; // String | datatable
        Long apptableId = 56L; // Long | apptableId
        PutDataTablesAppTableIdRequest putDataTablesAppTableIdRequest = new PutDataTablesAppTableIdRequest(); // PutDataTablesAppTableIdRequest | 
        try {
            PutDataTablesAppTableIdResponse result = apiInstance.updateDatatableEntryOnetoOne(datatable, apptableId, putDataTablesAppTableIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTablesApi#updateDatatableEntryOnetoOne");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datatable** | **String**| datatable |
 **apptableId** | **Long**| apptableId |
 **putDataTablesAppTableIdRequest** | [**PutDataTablesAppTableIdRequest**](PutDataTablesAppTableIdRequest.md)|  |

### Return type

[**PutDataTablesAppTableIdResponse**](PutDataTablesAppTableIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

