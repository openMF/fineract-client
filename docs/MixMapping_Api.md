# MixMapping_Api

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveTaxonomyMapping**](MixMapping_Api.md#retrieveTaxonomyMapping) | **GET** mixmapping | 
[**updateTaxonomyMapping**](MixMapping_Api.md#updateTaxonomyMapping) | **PUT** mixmapping | 


<a name="retrieveTaxonomyMapping"></a>
# **retrieveTaxonomyMapping**
> String retrieveTaxonomyMapping()



### Example
```java

MixMapping_Api apiService = defaultClient.createService(MixMapping_Api.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTaxonomyMapping();
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

<a name="updateTaxonomyMapping"></a>
# **updateTaxonomyMapping**
> String updateTaxonomyMapping(body)



### Example
```java

MixMapping_Api apiService = defaultClient.createService(MixMapping_Api.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateTaxonomyMapping(body);
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

 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

