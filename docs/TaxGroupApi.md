# TaxGroupApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTaxGroup**](TaxGroupApi.md#createTaxGroup) | **POST** v1/taxes/group | Create a new Tax Group |
| [**retrieveAllTaxGroups**](TaxGroupApi.md#retrieveAllTaxGroups) | **GET** v1/taxes/group | List Tax Group |
| [**retrieveTaxGroup**](TaxGroupApi.md#retrieveTaxGroup) | **GET** v1/taxes/group/{taxGroupId} | Retrieve Tax Group |
| [**retrieveTemplate22**](TaxGroupApi.md#retrieveTemplate22) | **GET** v1/taxes/group/template |  |
| [**updateTaxGroup**](TaxGroupApi.md#updateTaxGroup) | **PUT** v1/taxes/group/{taxGroupId} | Update Tax Group |



Create a new Tax Group

Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxGroupApi::class.java)
val postTaxesGroupRequest : PostTaxesGroupRequest =  // PostTaxesGroupRequest | 

launch(Dispatchers.IO) {
    val result : PostTaxesGroupResponse = webService.createTaxGroup(postTaxesGroupRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTaxesGroupRequest** | [**PostTaxesGroupRequest**](PostTaxesGroupRequest.md)|  | |

### Return type

[**PostTaxesGroupResponse**](PostTaxesGroupResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Tax Group

List Tax Group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxGroupApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetTaxesGroupResponse> = webService.retrieveAllTaxGroups()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetTaxesGroupResponse&gt;**](GetTaxesGroupResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Tax Group

Retrieve Tax Group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxGroupApi::class.java)
val taxGroupId : kotlin.Long = 789 // kotlin.Long | taxGroupId

launch(Dispatchers.IO) {
    val result : GetTaxesGroupResponse = webService.retrieveTaxGroup(taxGroupId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxGroupId** | **kotlin.Long**| taxGroupId | |

### Return type

[**GetTaxesGroupResponse**](GetTaxesGroupResponse.md)

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
val webService = apiClient.createWebservice(TaxGroupApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate22()
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


Update Tax Group

Updates Tax Group. Only end date can be up-datable and can insert new tax components.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TaxGroupApi::class.java)
val taxGroupId : kotlin.Long = 789 // kotlin.Long | taxGroupId
val putTaxesGroupTaxGroupIdRequest : PutTaxesGroupTaxGroupIdRequest =  // PutTaxesGroupTaxGroupIdRequest | 

launch(Dispatchers.IO) {
    val result : PutTaxesGroupTaxGroupIdResponse = webService.updateTaxGroup(taxGroupId, putTaxesGroupTaxGroupIdRequest)
}
```

### Parameters
| **taxGroupId** | **kotlin.Long**| taxGroupId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putTaxesGroupTaxGroupIdRequest** | [**PutTaxesGroupTaxGroupIdRequest**](PutTaxesGroupTaxGroupIdRequest.md)|  | |

### Return type

[**PutTaxesGroupTaxGroupIdResponse**](PutTaxesGroupTaxGroupIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

