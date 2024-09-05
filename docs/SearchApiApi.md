# SearchAPIApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advancedSearch**](SearchAPIApi.md#advancedSearch) | **POST** v1/search/advance | Adhoc query search |
| [**retrieveAdHocSearchQueryTemplate**](SearchAPIApi.md#retrieveAdHocSearchQueryTemplate) | **GET** v1/search/template | Retrive Adhoc Search query template |
| [**searchData**](SearchAPIApi.md#searchData) | **GET** v1/search | Search Resources |



Adhoc query search

AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SearchAPIApi::class.java)
val postAdhocQuerySearchRequest : PostAdhocQuerySearchRequest =  // PostAdhocQuerySearchRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<PostAdhocQuerySearchResponse> = webService.advancedSearch(postAdhocQuerySearchRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAdhocQuerySearchRequest** | [**PostAdhocQuerySearchRequest**](PostAdhocQuerySearchRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;PostAdhocQuerySearchResponse&gt;**](PostAdhocQuerySearchResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrive Adhoc Search query template

Mandatory Fields  search?query&#x3D;000000001 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SearchAPIApi::class.java)

launch(Dispatchers.IO) {
    val result : GetSearchResponse = webService.retrieveAdHocSearchQueryTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSearchResponse**](GetSearchResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Search Resources

Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SearchAPIApi::class.java)
val query : kotlin.String = query_example // kotlin.String | query
val resource : kotlin.String = resource_example // kotlin.String | resource
val exactMatch : kotlin.Boolean = true // kotlin.Boolean | exactMatch

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSearchResponse> = webService.searchData(query, resource, exactMatch)
}
```

### Parameters
| **query** | **kotlin.String**| query | [optional] |
| **resource** | **kotlin.String**| resource | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exactMatch** | **kotlin.Boolean**| exactMatch | [optional] [default to false] |

### Return type

[**kotlin.collections.List&lt;GetSearchResponse&gt;**](GetSearchResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

