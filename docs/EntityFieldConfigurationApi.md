# EntityFieldConfigurationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddresses**](EntityFieldConfigurationApi.md#getAddresses) | **GET** fieldconfiguration/{entity} | Retrieves the Entity Field Configuration


<a name="getAddresses"></a>
# **getAddresses**
> List&lt;GetFieldConfigurationEntityResponse&gt; getAddresses(entity)

Retrieves the Entity Field Configuration

It retrieves all the Entity Field Configuration

### Example
```java

EntityFieldConfigurationApi apiService = defaultClient.createService(EntityFieldConfigurationApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call = apiService.getAddresses(entity);
call.enqueue(new Callback<List&lt;GetFieldConfigurationEntityResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call, Response<List&lt;GetFieldConfigurationEntityResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entity** | **String**| entity |

### Return type

[**List&lt;GetFieldConfigurationEntityResponse&gt;**](GetFieldConfigurationEntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

