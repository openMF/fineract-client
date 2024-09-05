# CollectionSheetApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generateCollectionSheet**](CollectionSheetApi.md#generateCollectionSheet) | **POST** v1/collectionsheet | Generate Individual Collection Sheet | Save Collection Sheet |



Generate Individual Collection Sheet | Save Collection Sheet

Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CollectionSheetApi::class.java)
val postCollectionSheetRequest : PostCollectionSheetRequest =  // PostCollectionSheetRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostCollectionSheetResponse = webService.generateCollectionSheet(postCollectionSheetRequest, command)
}
```

### Parameters
| **postCollectionSheetRequest** | [**PostCollectionSheetRequest**](PostCollectionSheetRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostCollectionSheetResponse**](PostCollectionSheetResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

