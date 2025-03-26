# ScoreCardApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createScorecard1**](ScoreCardApi.md#createScorecard1) | **POST** v1/surveys/scorecards/{surveyId} | Create a Scorecard entry |
| [**findByClient1**](ScoreCardApi.md#findByClient1) | **GET** v1/surveys/scorecards/clients/{clientId} |  |
| [**findBySurvey**](ScoreCardApi.md#findBySurvey) | **GET** v1/surveys/scorecards/{surveyId} | List all Scorecard entries |
| [**findBySurveyAndClient**](ScoreCardApi.md#findBySurveyAndClient) | **GET** v1/surveys/scorecards/{surveyId}/clients/{clientId} |  |



Create a Scorecard entry

Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ScoreCardApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId
val scorecardData : ScorecardData =  // ScorecardData | scorecardData

launch(Dispatchers.IO) {
    webService.createScorecard1(surveyId, scorecardData)
}
```

### Parameters
| **surveyId** | **kotlin.Long**| Enter surveyId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scorecardData** | [**ScorecardData**](ScorecardData.md)| scorecardData | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ScoreCardApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ScorecardData> = webService.findByClient1(clientId)
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


List all Scorecard entries

List all Scorecard entries for a survey.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ScoreCardApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<Scorecard> = webService.findBySurvey(surveyId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyId** | **kotlin.Long**| Enter surveyId | |

### Return type

[**kotlin.collections.List&lt;Scorecard&gt;**](Scorecard.md)

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
val webService = apiClient.createWebservice(ScoreCardApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId
val clientId : kotlin.Long = 789 // kotlin.Long | Enter clientId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ScorecardData> = webService.findBySurveyAndClient(surveyId, clientId)
}
```

### Parameters
| **surveyId** | **kotlin.Long**| Enter surveyId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| Enter clientId | |

### Return type

[**kotlin.collections.List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

