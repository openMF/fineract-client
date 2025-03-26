# GeneralLedgerAccountApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGLAccount1**](GeneralLedgerAccountApi.md#createGLAccount1) | **POST** v1/glaccounts | Create a General Ledger Account |
| [**deleteGLAccount1**](GeneralLedgerAccountApi.md#deleteGLAccount1) | **DELETE** v1/glaccounts/{glAccountId} | Delete a GL Account |
| [**getGlAccountsTemplate**](GeneralLedgerAccountApi.md#getGlAccountsTemplate) | **GET** v1/glaccounts/downloadtemplate |  |
| [**postGlAccountsTemplate**](GeneralLedgerAccountApi.md#postGlAccountsTemplate) | **POST** v1/glaccounts/uploadtemplate |  |
| [**retreiveAccount**](GeneralLedgerAccountApi.md#retreiveAccount) | **GET** v1/glaccounts/{glAccountId} | Retrieve a General Ledger Account |
| [**retrieveAllAccounts**](GeneralLedgerAccountApi.md#retrieveAllAccounts) | **GET** v1/glaccounts | List General Ledger Accounts |
| [**retrieveNewAccountDetails**](GeneralLedgerAccountApi.md#retrieveNewAccountDetails) | **GET** v1/glaccounts/template | Retrieve GL Accounts Template |
| [**updateGLAccount1**](GeneralLedgerAccountApi.md#updateGLAccount1) | **PUT** v1/glaccounts/{glAccountId} | Update a GL Account |



Create a General Ledger Account

Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val postGLAccountsRequest : PostGLAccountsRequest =  // PostGLAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PostGLAccountsResponse = webService.createGLAccount1(postGLAccountsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postGLAccountsRequest** | [**PostGLAccountsRequest**](PostGLAccountsRequest.md)|  | [optional] |

### Return type

[**PostGLAccountsResponse**](PostGLAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a GL Account

Deletes a GL Account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val glAccountId : kotlin.Long = 789 // kotlin.Long | glAccountId

launch(Dispatchers.IO) {
    val result : DeleteGLAccountsRequest = webService.deleteGLAccount1(glAccountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **glAccountId** | **kotlin.Long**| glAccountId | |

### Return type

[**DeleteGLAccountsRequest**](DeleteGLAccountsRequest.md)

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
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getGlAccountsTemplate(dateFormat)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postGlAccountsTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*


Retrieve a General Ledger Account

Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val glAccountId : kotlin.Long = 789 // kotlin.Long | glAccountId
val fetchRunningBalance : kotlin.Boolean = true // kotlin.Boolean | fetchRunningBalance

launch(Dispatchers.IO) {
    val result : GetGLAccountsResponse = webService.retreiveAccount(glAccountId, fetchRunningBalance)
}
```

### Parameters
| **glAccountId** | **kotlin.Long**| glAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fetchRunningBalance** | **kotlin.Boolean**| fetchRunningBalance | [optional] |

### Return type

[**GetGLAccountsResponse**](GetGLAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List General Ledger Accounts

ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val type : kotlin.Int = 56 // kotlin.Int | type
val searchParam : kotlin.String = searchParam_example // kotlin.String | searchParam
val usage : kotlin.Int = 56 // kotlin.Int | usage
val manualEntriesAllowed : kotlin.Boolean = true // kotlin.Boolean | manualEntriesAllowed
val disabled : kotlin.Boolean = true // kotlin.Boolean | disabled
val fetchRunningBalance : kotlin.Boolean = true // kotlin.Boolean | fetchRunningBalance

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetGLAccountsResponse> = webService.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance)
}
```

### Parameters
| **type** | **kotlin.Int**| type | [optional] |
| **searchParam** | **kotlin.String**| searchParam | [optional] |
| **usage** | **kotlin.Int**| usage | [optional] |
| **manualEntriesAllowed** | **kotlin.Boolean**| manualEntriesAllowed | [optional] |
| **disabled** | **kotlin.Boolean**| disabled | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fetchRunningBalance** | **kotlin.Boolean**| fetchRunningBalance | [optional] |

### Return type

[**kotlin.collections.List&lt;GetGLAccountsResponse&gt;**](GetGLAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve GL Accounts Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val type : kotlin.Int = 56 // kotlin.Int | type

launch(Dispatchers.IO) {
    val result : GetGLAccountsTemplateResponse = webService.retrieveNewAccountDetails(type)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.Int**| type | [optional] |

### Return type

[**GetGLAccountsTemplateResponse**](GetGLAccountsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a GL Account

Updates a GL Account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GeneralLedgerAccountApi::class.java)
val glAccountId : kotlin.Long = 789 // kotlin.Long | glAccountId
val putGLAccountsRequest : PutGLAccountsRequest =  // PutGLAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PutGLAccountsResponse = webService.updateGLAccount1(glAccountId, putGLAccountsRequest)
}
```

### Parameters
| **glAccountId** | **kotlin.Long**| glAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putGLAccountsRequest** | [**PutGLAccountsRequest**](PutGLAccountsRequest.md)|  | [optional] |

### Return type

[**PutGLAccountsResponse**](PutGLAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

