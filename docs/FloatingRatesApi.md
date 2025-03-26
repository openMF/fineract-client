# FloatingRatesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFloatingRate**](FloatingRatesApi.md#createFloatingRate) | **POST** v1/floatingrates | Create a new Floating Rate |
| [**retrieveAll22**](FloatingRatesApi.md#retrieveAll22) | **GET** v1/floatingrates | List Floating Rates |
| [**retrieveOne13**](FloatingRatesApi.md#retrieveOne13) | **GET** v1/floatingrates/{floatingRateId} | Retrieve Floating Rate |
| [**updateFloatingRate**](FloatingRatesApi.md#updateFloatingRate) | **PUT** v1/floatingrates/{floatingRateId} | Update Floating Rate |



Create a new Floating Rate

Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FloatingRatesApi::class.java)
val postFloatingRatesRequest : PostFloatingRatesRequest =  // PostFloatingRatesRequest | 

launch(Dispatchers.IO) {
    val result : PostFloatingRatesResponse = webService.createFloatingRate(postFloatingRatesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFloatingRatesRequest** | [**PostFloatingRatesRequest**](PostFloatingRatesRequest.md)|  | |

### Return type

[**PostFloatingRatesResponse**](PostFloatingRatesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Floating Rates

Lists Floating Rates

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FloatingRatesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFloatingRatesResponse> = webService.retrieveAll22()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetFloatingRatesResponse&gt;**](GetFloatingRatesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Floating Rate

Retrieves Floating Rate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FloatingRatesApi::class.java)
val floatingRateId : kotlin.Long = 789 // kotlin.Long | floatingRateId

launch(Dispatchers.IO) {
    val result : GetFloatingRatesFloatingRateIdResponse = webService.retrieveOne13(floatingRateId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **floatingRateId** | **kotlin.Long**| floatingRateId | |

### Return type

[**GetFloatingRatesFloatingRateIdResponse**](GetFloatingRatesFloatingRateIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Floating Rate

Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FloatingRatesApi::class.java)
val floatingRateId : kotlin.Long = 789 // kotlin.Long | floatingRateId
val putFloatingRatesFloatingRateIdRequest : PutFloatingRatesFloatingRateIdRequest =  // PutFloatingRatesFloatingRateIdRequest | 

launch(Dispatchers.IO) {
    val result : PutFloatingRatesFloatingRateIdResponse = webService.updateFloatingRate(floatingRateId, putFloatingRatesFloatingRateIdRequest)
}
```

### Parameters
| **floatingRateId** | **kotlin.Long**| floatingRateId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putFloatingRatesFloatingRateIdRequest** | [**PutFloatingRatesFloatingRateIdRequest**](PutFloatingRatesFloatingRateIdRequest.md)|  | |

### Return type

[**PutFloatingRatesFloatingRateIdResponse**](PutFloatingRatesFloatingRateIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

