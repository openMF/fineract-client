# InterestRateSlabAKAInterestBandsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create9**](InterestRateSlabAKAInterestBandsApi.md#create9) | **POST** v1/interestratecharts/{chartId}/chartslabs | Create a Slab |
| [**delete13**](InterestRateSlabAKAInterestBandsApi.md#delete13) | **DELETE** v1/interestratecharts/{chartId}/chartslabs/{chartSlabId} | Delete a Slab |
| [**retrieveAll25**](InterestRateSlabAKAInterestBandsApi.md#retrieveAll25) | **GET** v1/interestratecharts/{chartId}/chartslabs | Retrieve all Slabs |
| [**retrieveOne16**](InterestRateSlabAKAInterestBandsApi.md#retrieveOne16) | **GET** v1/interestratecharts/{chartId}/chartslabs/{chartSlabId} | Retrieve a Slab |
| [**template8**](InterestRateSlabAKAInterestBandsApi.md#template8) | **GET** v1/interestratecharts/{chartId}/chartslabs/template |  |
| [**update14**](InterestRateSlabAKAInterestBandsApi.md#update14) | **PUT** v1/interestratecharts/{chartId}/chartslabs/{chartSlabId} | Update a Slab |



Create a Slab

Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId
val postInterestRateChartsChartIdChartSlabsRequest : PostInterestRateChartsChartIdChartSlabsRequest =  // PostInterestRateChartsChartIdChartSlabsRequest | 

launch(Dispatchers.IO) {
    val result : PostInterestRateChartsChartIdChartSlabsResponse = webService.create9(chartId, postInterestRateChartsChartIdChartSlabsRequest)
}
```

### Parameters
| **chartId** | **kotlin.Long**| chartId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postInterestRateChartsChartIdChartSlabsRequest** | [**PostInterestRateChartsChartIdChartSlabsRequest**](PostInterestRateChartsChartIdChartSlabsRequest.md)|  | |

### Return type

[**PostInterestRateChartsChartIdChartSlabsResponse**](PostInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Slab

Delete a Slab from a chart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId
val chartSlabId : kotlin.Long = 789 // kotlin.Long | chartSlabId

launch(Dispatchers.IO) {
    val result : DeleteInterestRateChartsChartIdChartSlabsResponse = webService.delete13(chartId, chartSlabId)
}
```

### Parameters
| **chartId** | **kotlin.Long**| chartId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartSlabId** | **kotlin.Long**| chartSlabId | |

### Return type

[**DeleteInterestRateChartsChartIdChartSlabsResponse**](DeleteInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve all Slabs

Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetInterestRateChartsChartIdChartSlabsResponse> = webService.retrieveAll25(chartId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartId** | **kotlin.Long**| chartId | |

### Return type

[**kotlin.collections.List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Slab

Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId
val chartSlabId : kotlin.Long = 789 // kotlin.Long | chartSlabId

launch(Dispatchers.IO) {
    val result : GetInterestRateChartsChartIdChartSlabsResponse = webService.retrieveOne16(chartId, chartSlabId)
}
```

### Parameters
| **chartId** | **kotlin.Long**| chartId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartSlabId** | **kotlin.Long**| chartSlabId | |

### Return type

[**GetInterestRateChartsChartIdChartSlabsResponse**](GetInterestRateChartsChartIdChartSlabsResponse.md)

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
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.template8(chartId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartId** | **kotlin.Long**| chartId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Slab

It updates the Slab from chart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateSlabAKAInterestBandsApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId
val chartSlabId : kotlin.Long = 789 // kotlin.Long | chartSlabId
val putInterestRateChartsChartIdChartSlabsChartSlabIdRequest : PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest =  // PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest | 

launch(Dispatchers.IO) {
    val result : PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse = webService.update14(chartId, chartSlabId, putInterestRateChartsChartIdChartSlabsChartSlabIdRequest)
}
```

### Parameters
| **chartId** | **kotlin.Long**| chartId | |
| **chartSlabId** | **kotlin.Long**| chartSlabId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putInterestRateChartsChartIdChartSlabsChartSlabIdRequest** | [**PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest**](PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest.md)|  | |

### Return type

[**PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse**](PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

