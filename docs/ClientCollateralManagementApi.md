# ClientCollateralManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addCollateral**](ClientCollateralManagementApi.md#addCollateral) | **POST** v1/clients/{clientId}/collaterals | Add New Collateral For a Client |
| [**deleteCollateral1**](ClientCollateralManagementApi.md#deleteCollateral1) | **DELETE** v1/clients/{clientId}/collaterals/{collateralId} | Delete Client Collateral |
| [**getClientCollateral**](ClientCollateralManagementApi.md#getClientCollateral) | **GET** v1/clients/{clientId}/collaterals | Get Clients Collateral Products |
| [**getClientCollateralData**](ClientCollateralManagementApi.md#getClientCollateralData) | **GET** v1/clients/{clientId}/collaterals/{clientCollateralId} | Get Client Collateral Data |
| [**getClientCollateralTemplate**](ClientCollateralManagementApi.md#getClientCollateralTemplate) | **GET** v1/clients/{clientId}/collaterals/template | Get Client Collateral Template |
| [**updateCollateral1**](ClientCollateralManagementApi.md#updateCollateral1) | **PUT** v1/clients/{clientId}/collaterals/{collateralId} | Update New Collateral of a Client |



Add New Collateral For a Client

Add New Collateral For a Client

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val postClientCollateralRequest : PostClientCollateralRequest =  // PostClientCollateralRequest | 

launch(Dispatchers.IO) {
    val result : PostClientCollateralResponse = webService.addCollateral(clientId, postClientCollateralRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postClientCollateralRequest** | [**PostClientCollateralRequest**](PostClientCollateralRequest.md)|  | |

### Return type

[**PostClientCollateralResponse**](PostClientCollateralResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Client Collateral

Delete Client Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : DeleteClientCollateralResponse = webService.deleteCollateral1(clientId, collateralId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

[**DeleteClientCollateralResponse**](DeleteClientCollateralResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Clients Collateral Products

Get Collateral Product of a Client

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val prodId : kotlin.Long = 789 // kotlin.Long | prodId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<kotlin.Any> = webService.getClientCollateral(clientId, prodId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **prodId** | **kotlin.Long**| prodId | [optional] |

### Return type

[**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Client Collateral Data

Get Client Collateral Data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val clientCollateralId : kotlin.Long = 789 // kotlin.Long | clientCollateralId

launch(Dispatchers.IO) {
    val result : kotlin.Any = webService.getClientCollateralData(clientId, clientCollateralId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientCollateralId** | **kotlin.Long**| clientCollateralId | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Client Collateral Template

Get Client Collateral Template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoanCollateralManagementTemplate> = webService.getClientCollateralTemplate(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**kotlin.collections.List&lt;GetLoanCollateralManagementTemplate&gt;**](GetLoanCollateralManagementTemplate.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update New Collateral of a Client

Update New Collateral of a Client

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientCollateralManagementApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId
val putClientCollateralRequest : PutClientCollateralRequest =  // PutClientCollateralRequest | 

launch(Dispatchers.IO) {
    val result : PutClientCollateralResponse = webService.updateCollateral1(clientId, collateralId, putClientCollateralRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **collateralId** | **kotlin.Long**| collateralId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putClientCollateralRequest** | [**PutClientCollateralRequest**](PutClientCollateralRequest.md)|  | |

### Return type

[**PutClientCollateralResponse**](PutClientCollateralResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

