# SelfScoreCardApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createScorecard**](SelfScoreCardApi.md#createScorecard) | **POST** v1/self/surveys/scorecards/{surveyId} |  |
| [**findByClient**](SelfScoreCardApi.md#findByClient) | **GET** v1/self/surveys/scorecards/clients/{clientId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfScoreCardApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | 
val scorecardData : ScorecardData =  // ScorecardData | 

launch(Dispatchers.IO) {
    webService.createScorecard(surveyId, scorecardData)
}
```

### Parameters
| **surveyId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scorecardData** | [**ScorecardData**](ScorecardData.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfScoreCardApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ScorecardData> = webService.findByClient(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

[**kotlin.collections.List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

