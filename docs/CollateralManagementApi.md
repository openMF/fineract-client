# CollateralManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCollateral1**](CollateralManagementApi.md#createCollateral1) | **POST** v1/collateral-management | Create a new collateral |
| [**deleteCollateral2**](CollateralManagementApi.md#deleteCollateral2) | **DELETE** v1/collateral-management/{collateralId} | Delete a Collateral |
| [**getAllCollaterals**](CollateralManagementApi.md#getAllCollaterals) | **GET** v1/collateral-management | Get All Collaterals |
| [**getCollateral**](CollateralManagementApi.md#getCollateral) | **GET** v1/collateral-management/{collateralId} | Get Collateral |
| [**getCollateralTemplate**](CollateralManagementApi.md#getCollateralTemplate) | **GET** v1/collateral-management/template | Get Collateral Template |
| [**updateCollateral2**](CollateralManagementApi.md#updateCollateral2) | **PUT** v1/collateral-management/{collateralId} | Update Collateral |



Create a new collateral

Collateral Creation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)
val postCollateralManagementProductRequest : PostCollateralManagementProductRequest =  // PostCollateralManagementProductRequest | 

launch(Dispatchers.IO) {
    val result : PostCollateralManagementProductResponse = webService.createCollateral1(postCollateralManagementProductRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postCollateralManagementProductRequest** | [**PostCollateralManagementProductRequest**](PostCollateralManagementProductRequest.md)|  | |

### Return type

[**PostCollateralManagementProductResponse**](PostCollateralManagementProductResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Collateral

Delete Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : DeleteCollateralProductResponse = webService.deleteCollateral2(collateralId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

[**DeleteCollateralProductResponse**](DeleteCollateralProductResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All Collaterals

Fetch all Collateral Products

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetCollateralManagementsResponse> = webService.getAllCollaterals()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetCollateralManagementsResponse&gt;**](GetCollateralManagementsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Collateral

Fetch Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : GetCollateralManagementsResponse = webService.getCollateral(collateralId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

[**GetCollateralManagementsResponse**](GetCollateralManagementsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Collateral Template

Get Collateral Template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetCollateralProductTemplate> = webService.getCollateralTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetCollateralProductTemplate&gt;**](GetCollateralProductTemplate.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Collateral

Update Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollateralManagementApi::class.java)
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId
val putCollateralProductRequest : PutCollateralProductRequest =  // PutCollateralProductRequest | 

launch(Dispatchers.IO) {
    val result : PutCollateralProductResponse = webService.updateCollateral2(collateralId, putCollateralProductRequest)
}
```

### Parameters
| **collateralId** | **kotlin.Long**| collateralId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCollateralProductRequest** | [**PutCollateralProductRequest**](PutCollateralProductRequest.md)|  | |

### Return type

[**PutCollateralProductResponse**](PutCollateralProductResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

