# ClientSearchV2Api

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**searchByText**](ClientSearchV2Api.md#searchByText) | **POST** v2/clients/search | Search Clients by text |



Search Clients by text

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientSearchV2Api::class.java)
val pagedRequestClientTextSearch : PagedRequestClientTextSearch =  // PagedRequestClientTextSearch | 

launch(Dispatchers.IO) {
    val result : PageClientSearchData = webService.searchByText(pagedRequestClientTextSearch)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pagedRequestClientTextSearch** | [**PagedRequestClientTextSearch**](PagedRequestClientTextSearch.md)|  | [optional] |

### Return type

[**PageClientSearchData**](PageClientSearchData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

