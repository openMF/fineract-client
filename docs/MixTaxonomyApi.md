# MixTaxonomyApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](MixTaxonomyApi.md#retrieveAll) | **GET** mixtaxonomy | 


<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll()



### Example
```java

MixTaxonomyApi apiService = defaultClient.createService(MixTaxonomyApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll();
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

