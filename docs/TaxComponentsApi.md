# TaxComponentsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTaxCompoent**](TaxComponentsApi.md#createTaxCompoent) | **POST** v1/taxes/component | Create a new Tax Component |
| [**retrieveAllTaxComponents**](TaxComponentsApi.md#retrieveAllTaxComponents) | **GET** v1/taxes/component | List Tax Components |
| [**retrieveTaxComponent**](TaxComponentsApi.md#retrieveTaxComponent) | **GET** v1/taxes/component/{taxComponentId} | Retrieve Tax Component |
| [**retrieveTemplate21**](TaxComponentsApi.md#retrieveTemplate21) | **GET** v1/taxes/component/template |  |
| [**updateTaxCompoent**](TaxComponentsApi.md#updateTaxCompoent) | **PUT** v1/taxes/component/{taxComponentId} | Update Tax Component |



Create a new Tax Component

Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxComponentsApi::class.java)
val postTaxesComponentsRequest : PostTaxesComponentsRequest =  // PostTaxesComponentsRequest | 

launch(Dispatchers.IO) {
    val result : PostTaxesComponentsResponse = webService.createTaxCompoent(postTaxesComponentsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTaxesComponentsRequest** | [**PostTaxesComponentsRequest**](PostTaxesComponentsRequest.md)|  | |

### Return type

[**PostTaxesComponentsResponse**](PostTaxesComponentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Tax Components

List Tax Components

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxComponentsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetTaxesComponentsResponse> = webService.retrieveAllTaxComponents()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetTaxesComponentsResponse&gt;**](GetTaxesComponentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Tax Component

Retrieve Tax Component

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxComponentsApi::class.java)
val taxComponentId : kotlin.Long = 789 // kotlin.Long | taxComponentId

launch(Dispatchers.IO) {
    val result : GetTaxesComponentsResponse = webService.retrieveTaxComponent(taxComponentId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxComponentId** | **kotlin.Long**| taxComponentId | |

### Return type

[**GetTaxesComponentsResponse**](GetTaxesComponentsResponse.md)

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
val webService = apiClient.createWebservice(TaxComponentsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate21()
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


Update Tax Component

Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxComponentsApi::class.java)
val taxComponentId : kotlin.Long = 789 // kotlin.Long | taxComponentId
val putTaxesComponentsTaxComponentIdRequest : PutTaxesComponentsTaxComponentIdRequest =  // PutTaxesComponentsTaxComponentIdRequest | 

launch(Dispatchers.IO) {
    val result : PutTaxesComponentsTaxComponentIdResponse = webService.updateTaxCompoent(taxComponentId, putTaxesComponentsTaxComponentIdRequest)
}
```

### Parameters
| **taxComponentId** | **kotlin.Long**| taxComponentId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putTaxesComponentsTaxComponentIdRequest** | [**PutTaxesComponentsTaxComponentIdRequest**](PutTaxesComponentsTaxComponentIdRequest.md)|  | |

### Return type

[**PutTaxesComponentsTaxComponentIdResponse**](PutTaxesComponentsTaxComponentIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

