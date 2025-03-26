# FundsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFund**](FundsApi.md#createFund) | **POST** v1/funds | Create a Fund |
| [**retrieveFund**](FundsApi.md#retrieveFund) | **GET** v1/funds/{fundId} | Retrieve a Fund |
| [**retrieveFunds**](FundsApi.md#retrieveFunds) | **GET** v1/funds | Retrieve Funds |
| [**updateFund**](FundsApi.md#updateFund) | **PUT** v1/funds/{fundId} | Update a Fund |



Create a Fund

Creates a Fund

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FundsApi::class.java)
val postFundsRequest : PostFundsRequest =  // PostFundsRequest | 

launch(Dispatchers.IO) {
    val result : PostFundsResponse = webService.createFund(postFundsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFundsRequest** | [**PostFundsRequest**](PostFundsRequest.md)|  | |

### Return type

[**PostFundsResponse**](PostFundsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve a Fund

Returns the details of a Fund.  Example Requests:  funds/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FundsApi::class.java)
val fundId : kotlin.Long = 789 // kotlin.Long | fundId

launch(Dispatchers.IO) {
    val result : GetFundsResponse = webService.retrieveFund(fundId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fundId** | **kotlin.Long**| fundId | |

### Return type

[**GetFundsResponse**](GetFundsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Funds

Returns the list of funds.  Example Requests:  funds

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FundsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFundsResponse> = webService.retrieveFunds()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetFundsResponse&gt;**](GetFundsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Fund

Updates the details of a fund.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FundsApi::class.java)
val fundId : kotlin.Long = 789 // kotlin.Long | fundId
val putFundsFundIdRequest : PutFundsFundIdRequest =  // PutFundsFundIdRequest | 

launch(Dispatchers.IO) {
    val result : PutFundsFundIdResponse = webService.updateFund(fundId, putFundsFundIdRequest)
}
```

### Parameters
| **fundId** | **kotlin.Long**| fundId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putFundsFundIdRequest** | [**PutFundsFundIdRequest**](PutFundsFundIdRequest.md)|  | |

### Return type

[**PutFundsFundIdResponse**](PutFundsFundIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

