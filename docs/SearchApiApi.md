# SearchApiApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedSearch**](SearchApiApi.md#advancedSearch) | **POST** search/advance | Adhoc query search
[**retrieveAdHocSearchQueryTemplate**](SearchApiApi.md#retrieveAdHocSearchQueryTemplate) | **GET** search/template | Retrive Adhoc Search query template
[**searchData**](SearchApiApi.md#searchData) | **GET** search | Search Resources


<a name="advancedSearch"></a>
# **advancedSearch**
> PostAdhocQuerySearchResponse advancedSearch(body2, body)

Adhoc query search

AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SearchApi;


SearchApiApi apiInstance = new SearchApiApi();
PostAdhocQuerySearchRequest body2 = new PostAdhocQuerySearchRequest(); // PostAdhocQuerySearchRequest | body
String body = "body_example"; // String | 
try {
    PostAdhocQuerySearchResponse result = apiInstance.advancedSearch(body2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApiApi#advancedSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body2** | [**PostAdhocQuerySearchRequest**](PostAdhocQuerySearchRequest.md)| body |
 **body** | **String**|  | [optional]

### Return type

[**PostAdhocQuerySearchResponse**](PostAdhocQuerySearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAdHocSearchQueryTemplate"></a>
# **retrieveAdHocSearchQueryTemplate**
> GetSearchResponse retrieveAdHocSearchQueryTemplate()

Retrive Adhoc Search query template

Mandatory Fields  search?query&#x3D;000000001 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SearchApi;


SearchApiApi apiInstance = new SearchApiApi();
try {
    GetSearchResponse result = apiInstance.retrieveAdHocSearchQueryTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApiApi#retrieveAdHocSearchQueryTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSearchResponse**](GetSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchData"></a>
# **searchData**
> GetSearchResponse searchData(query, resource, exactMatch)

Search Resources

Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SearchApi;


SearchApiApi apiInstance = new SearchApiApi();
String query = "query_example"; // String | query
String resource = "resource_example"; // String | resource
Boolean exactMatch = false; // Boolean | exactMatch
try {
    GetSearchResponse result = apiInstance.searchData(query, resource, exactMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApiApi#searchData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query | [optional]
 **resource** | **String**| resource | [optional]
 **exactMatch** | **Boolean**| exactMatch | [optional] [default to false]

### Return type

[**GetSearchResponse**](GetSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

