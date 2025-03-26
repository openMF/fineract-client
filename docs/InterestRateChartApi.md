# InterestRateChartApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create10**](InterestRateChartApi.md#create10) | **POST** v1/interestratecharts | Create a Chart |
| [**delete14**](InterestRateChartApi.md#delete14) | **DELETE** v1/interestratecharts/{chartId} | Delete a Chart |
| [**retrieveAll26**](InterestRateChartApi.md#retrieveAll26) | **GET** v1/interestratecharts | Retrieve all Charts |
| [**retrieveOne17**](InterestRateChartApi.md#retrieveOne17) | **GET** v1/interestratecharts/{chartId} | Retrieve a Chart |
| [**template9**](InterestRateChartApi.md#template9) | **GET** v1/interestratecharts/template | Retrieve Chart Details Template |
| [**update15**](InterestRateChartApi.md#update15) | **PUT** v1/interestratecharts/{chartId} | Update a Chart |



Create a Chart

Creates a new chart which can be attached to a term deposit products (FD or RD).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)
val postInterestRateChartsRequest : PostInterestRateChartsRequest =  // PostInterestRateChartsRequest | 

launch(Dispatchers.IO) {
    val result : PostInterestRateChartsResponse = webService.create10(postInterestRateChartsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postInterestRateChartsRequest** | [**PostInterestRateChartsRequest**](PostInterestRateChartsRequest.md)|  | |

### Return type

[**PostInterestRateChartsResponse**](PostInterestRateChartsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Chart

It deletes the chart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId

launch(Dispatchers.IO) {
    val result : DeleteInterestRateChartsChartIdResponse = webService.delete14(chartId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartId** | **kotlin.Long**| chartId | |

### Return type

[**DeleteInterestRateChartsChartIdResponse**](DeleteInterestRateChartsChartIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve all Charts

Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetInterestRateChartsResponse> = webService.retrieveAll26(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | [optional] |

### Return type

[**kotlin.collections.List&lt;GetInterestRateChartsResponse&gt;**](GetInterestRateChartsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Chart

It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId

launch(Dispatchers.IO) {
    val result : GetInterestRateChartsResponse = webService.retrieveOne17(chartId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chartId** | **kotlin.Long**| chartId | |

### Return type

[**GetInterestRateChartsResponse**](GetInterestRateChartsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Chart Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)

launch(Dispatchers.IO) {
    val result : GetInterestRateChartsTemplateResponse = webService.template9()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInterestRateChartsTemplateResponse**](GetInterestRateChartsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Chart

It updates the chart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterestRateChartApi::class.java)
val chartId : kotlin.Long = 789 // kotlin.Long | chartId
val putInterestRateChartsChartIdRequest : PutInterestRateChartsChartIdRequest =  // PutInterestRateChartsChartIdRequest | 

launch(Dispatchers.IO) {
    val result : PutInterestRateChartsChartIdResponse = webService.update15(chartId, putInterestRateChartsChartIdRequest)
}
```

### Parameters
| **chartId** | **kotlin.Long**| chartId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putInterestRateChartsChartIdRequest** | [**PutInterestRateChartsChartIdRequest**](PutInterestRateChartsChartIdRequest.md)|  | |

### Return type

[**PutInterestRateChartsChartIdResponse**](PutInterestRateChartsChartIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

