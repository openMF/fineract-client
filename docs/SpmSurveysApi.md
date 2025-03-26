# SpmSurveysApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activateOrDeactivateSurvey**](SpmSurveysApi.md#activateOrDeactivateSurvey) | **POST** v1/surveys/{id} | Deactivate Survey |
| [**createSurvey**](SpmSurveysApi.md#createSurvey) | **POST** v1/surveys | Create a Survey |
| [**editSurvey**](SpmSurveysApi.md#editSurvey) | **PUT** v1/surveys/{id} |  |
| [**fetchAllSurveys1**](SpmSurveysApi.md#fetchAllSurveys1) | **GET** v1/surveys | List all Surveys |
| [**findSurvey**](SpmSurveysApi.md#findSurvey) | **GET** v1/surveys/{id} | Retrieve a Survey |



Deactivate Survey

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SpmSurveysApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.activateOrDeactivateSurvey(id, command)
}
```

### Parameters
| **id** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Create a Survey

Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SpmSurveysApi::class.java)
val surveyData : SurveyData =  // SurveyData | Create survey

launch(Dispatchers.IO) {
    webService.createSurvey(surveyData)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyData** | [**SurveyData**](SurveyData.md)| Create survey | [optional] |

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
val webService = apiClient.createWebservice(SpmSurveysApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val surveyData : SurveyData =  // SurveyData | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.editSurvey(id, surveyData)
}
```

### Parameters
| **id** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyData** | [**SurveyData**](SurveyData.md)|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List all Surveys

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SpmSurveysApi::class.java)
val isActive : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<SurveyData> = webService.fetchAllSurveys1(isActive)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isActive** | **kotlin.Boolean**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;SurveyData&gt;**](SurveyData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Survey

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SpmSurveysApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | Enter id

launch(Dispatchers.IO) {
    val result : SurveyData = webService.findSurvey(id)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long**| Enter id | |

### Return type

[**SurveyData**](SurveyData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

