# CacheApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

CacheApi apiService = defaultClient.createService(CacheApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetCachesResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetCachesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetCachesResponse&gt;> call, Response<List&lt;GetCachesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetCachesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

CacheApi apiService = defaultClient.createService(CacheApi.class);

// Initialize these parameters earlier.
Call<PutCachesResponse> call = apiService.switchCache(body);
call.enqueue(new Callback<PutCachesResponse>() {
    @Override
    public void onResponse(Call<PutCachesResponse> call, Response<PutCachesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCachesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutCachesRequest**](PutCachesRequest.md)| body |

### Return type

[**PutCachesResponse**](PutCachesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

