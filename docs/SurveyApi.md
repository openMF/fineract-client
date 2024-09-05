# SurveyApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDatatableEntry1**](SurveyApi.md#createDatatableEntry1) | **POST** v1/survey/{surveyName}/{apptableId} | Create an entry in the survey table |
| [**deleteDatatableEntries1**](SurveyApi.md#deleteDatatableEntries1) | **DELETE** v1/survey/{surveyName}/{clientId}/{fulfilledId} |  |
| [**getClientSurveyOverview**](SurveyApi.md#getClientSurveyOverview) | **GET** v1/survey/{surveyName}/{clientId} |  |
| [**getSurveyEntry**](SurveyApi.md#getSurveyEntry) | **GET** v1/survey/{surveyName}/{clientId}/{entryId} |  |
| [**register**](SurveyApi.md#register) | **PUT** v1/survey/register/{surveyName}/{apptable} |  |
| [**retrieveSurvey**](SurveyApi.md#retrieveSurvey) | **GET** v1/survey/{surveyName} | Retrieve survey |
| [**retrieveSurveys**](SurveyApi.md#retrieveSurveys) | **GET** v1/survey | Retrieve surveys |



Create an entry in the survey table

Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://fineract.apache.org/legacy-docs/apiLive.htm#survey_create ] 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | surveyName
val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
val postSurveySurveyNameApptableIdRequest : PostSurveySurveyNameApptableIdRequest =  // PostSurveySurveyNameApptableIdRequest | 

launch(Dispatchers.IO) {
    val result : PostSurveySurveyNameApptableIdResponse = webService.createDatatableEntry1(surveyName, apptableId, postSurveySurveyNameApptableIdRequest)
}
```

### Parameters
| **surveyName** | **kotlin.String**| surveyName | |
| **apptableId** | **kotlin.Long**| apptableId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postSurveySurveyNameApptableIdRequest** | [**PostSurveySurveyNameApptableIdRequest**](PostSurveySurveyNameApptableIdRequest.md)|  | |

### Return type

[**PostSurveySurveyNameApptableIdResponse**](PostSurveySurveyNameApptableIdResponse.md)

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
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | 
val clientId : kotlin.Long = 789 // kotlin.Long | 
val fulfilledId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteDatatableEntries1(surveyName, clientId, fulfilledId)
}
```

### Parameters
| **surveyName** | **kotlin.String**|  | |
| **clientId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fulfilledId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | 
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getClientSurveyOverview(surveyName, clientId)
}
```

### Parameters
| **surveyName** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | 
val clientId : kotlin.Long = 789 // kotlin.Long | 
val entryId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getSurveyEntry(surveyName, clientId, entryId)
}
```

### Parameters
| **surveyName** | **kotlin.String**|  | |
| **clientId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entryId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | 
val apptable : kotlin.String = apptable_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.register(surveyName, apptable, body)
}
```

### Parameters
| **surveyName** | **kotlin.String**|  | |
| **apptable** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve survey

Lists a registered survey table details and the Apache Fineract Core application table they are registered to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SurveyApi::class.java)
val surveyName : kotlin.String = surveyName_example // kotlin.String | surveyName

launch(Dispatchers.IO) {
    val result : GetSurveyResponse = webService.retrieveSurvey(surveyName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyName** | **kotlin.String**| surveyName | |

### Return type

[**GetSurveyResponse**](GetSurveyResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve surveys

Retrieve surveys. This allows to retrieve the list of survey tables registered .

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SurveyApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSurveyResponse> = webService.retrieveSurveys()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetSurveyResponse&gt;**](GetSurveyResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

