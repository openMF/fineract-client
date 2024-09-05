# SPMAPILookUpTableApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLookupTable**](SPMAPILookUpTableApi.md#createLookupTable) | **POST** v1/surveys/{surveyId}/lookuptables | Create a Lookup Table entry |
| [**fetchLookupTables**](SPMAPILookUpTableApi.md#fetchLookupTables) | **GET** v1/surveys/{surveyId}/lookuptables | List all Lookup Table entries |
| [**findLookupTable**](SPMAPILookUpTableApi.md#findLookupTable) | **GET** v1/surveys/{surveyId}/lookuptables/{key} | Retrieve a Lookup Table entry |



Create a Lookup Table entry

Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SPMAPILookUpTableApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId
val lookupTableData : LookupTableData =  // LookupTableData | 

launch(Dispatchers.IO) {
    webService.createLookupTable(surveyId, lookupTableData)
}
```

### Parameters
| **surveyId** | **kotlin.Long**| Enter surveyId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lookupTableData** | [**LookupTableData**](LookupTableData.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


List all Lookup Table entries

List all Lookup Table entries for a survey.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SPMAPILookUpTableApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<LookupTableData> = webService.fetchLookupTables(surveyId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **surveyId** | **kotlin.Long**| Enter surveyId | |

### Return type

[**kotlin.collections.List&lt;LookupTableData&gt;**](LookupTableData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Lookup Table entry

Retrieve a Lookup Table entry for a survey.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SPMAPILookUpTableApi::class.java)
val surveyId : kotlin.Long = 789 // kotlin.Long | Enter surveyId
val key : kotlin.String = key_example // kotlin.String | Enter key

launch(Dispatchers.IO) {
    val result : LookupTableData = webService.findLookupTable(surveyId, key)
}
```

### Parameters
| **surveyId** | **kotlin.Long**| Enter surveyId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**| Enter key | |

### Return type

[**LookupTableData**](LookupTableData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

