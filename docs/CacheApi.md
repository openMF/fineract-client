# CacheApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](CacheApi.md#retrieveAll) | **GET** caches | Retrieve Cache Types
[**switchCache**](CacheApi.md#switchCache) | **PUT** caches | Switch Cache


<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetCachesResponse&gt; retrieveAll()

Retrieve Cache Types

Returns the list of caches.  Example Requests:  caches

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CacheApi;


CacheApi apiInstance = new CacheApi();
try {
    List<GetCachesResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CacheApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetCachesResponse&gt;**](GetCachesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="switchCache"></a>
# **switchCache**
> PutCachesResponse switchCache(body)

Switch Cache

Switches the cache to chosen one.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CacheApi;


CacheApi apiInstance = new CacheApi();
PutCachesRequest body = new PutCachesRequest(); // PutCachesRequest | body
try {
    PutCachesResponse result = apiInstance.switchCache(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CacheApi#switchCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCachesRequest**](PutCachesRequest.md)| body |

### Return type

[**PutCachesResponse**](PutCachesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

