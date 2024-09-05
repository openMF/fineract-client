# MappingFinancialActivitiesToAccountsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGLAccount**](MappingFinancialActivitiesToAccountsApi.md#createGLAccount) | **POST** v1/financialactivityaccounts | Create a new Financial Activity to Accounts Mapping |
| [**deleteGLAccount**](MappingFinancialActivitiesToAccountsApi.md#deleteGLAccount) | **DELETE** v1/financialactivityaccounts/{mappingId} | Delete a Financial Activity to Account Mapping |
| [**retreive**](MappingFinancialActivitiesToAccountsApi.md#retreive) | **GET** v1/financialactivityaccounts/{mappingId} | Retrieve a Financial Activity to Account Mapping  |
| [**retrieveAll**](MappingFinancialActivitiesToAccountsApi.md#retrieveAll) | **GET** v1/financialactivityaccounts | List Financial Activities to Accounts Mappings |
| [**retrieveTemplate**](MappingFinancialActivitiesToAccountsApi.md#retrieveTemplate) | **GET** v1/financialactivityaccounts/template |  |
| [**updateGLAccount**](MappingFinancialActivitiesToAccountsApi.md#updateGLAccount) | **PUT** v1/financialactivityaccounts/{mappingId} | Update a Financial Activity to Account Mapping |



Create a new Financial Activity to Accounts Mapping

Mandatory Fields financialActivityId, glAccountId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)
val postFinancialActivityAccountsRequest : PostFinancialActivityAccountsRequest =  // PostFinancialActivityAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PostFinancialActivityAccountsResponse = webService.createGLAccount(postFinancialActivityAccountsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFinancialActivityAccountsRequest** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional] |

### Return type

[**PostFinancialActivityAccountsResponse**](PostFinancialActivityAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Financial Activity to Account Mapping

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)
val mappingId : kotlin.Long = 789 // kotlin.Long | mappingId

launch(Dispatchers.IO) {
    val result : DeleteFinancialActivityAccountsResponse = webService.deleteGLAccount(mappingId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mappingId** | **kotlin.Long**| mappingId | |

### Return type

[**DeleteFinancialActivityAccountsResponse**](DeleteFinancialActivityAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Financial Activity to Account Mapping 

Example Requests:  financialactivityaccounts/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)
val mappingId : kotlin.Long = 789 // kotlin.Long | mappingId

launch(Dispatchers.IO) {
    val result : GetFinancialActivityAccountsResponse = webService.retreive(mappingId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mappingId** | **kotlin.Long**| mappingId | |

### Return type

[**GetFinancialActivityAccountsResponse**](GetFinancialActivityAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Financial Activities to Accounts Mappings

Example Requests:  financialactivityaccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFinancialActivityAccountsResponse> = webService.retrieveAll()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetFinancialActivityAccountsResponse&gt;**](GetFinancialActivityAccountsResponse.md)

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
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Financial Activity to Account Mapping

the API updates the Ledger account linked to a Financial Activity  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MappingFinancialActivitiesToAccountsApi::class.java)
val mappingId : kotlin.Long = 789 // kotlin.Long | mappingId
val postFinancialActivityAccountsRequest : PostFinancialActivityAccountsRequest =  // PostFinancialActivityAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PutFinancialActivityAccountsResponse = webService.updateGLAccount(mappingId, postFinancialActivityAccountsRequest)
}
```

### Parameters
| **mappingId** | **kotlin.Long**| mappingId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFinancialActivityAccountsRequest** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional] |

### Return type

[**PutFinancialActivityAccountsResponse**](PutFinancialActivityAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

