# GlobalConfigurationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveConfiguration**](GlobalConfigurationApi.md#retrieveConfiguration) | **GET** configurations | Retrieve Global Configuration | Retrieve Global Configuration for surveys
[**retrieveOne**](GlobalConfigurationApi.md#retrieveOne) | **GET** configurations/{configId} | Retrieve Global Configuration
[**updateConfiguration**](GlobalConfigurationApi.md#updateConfiguration) | **PUT** configurations/{configId} | Update Global Configuration


<a name="retrieveConfiguration"></a>
# **retrieveConfiguration**
> List&lt;GetGlobalConfigurationsResponse&gt; retrieveConfiguration(survey)

Retrieve Global Configuration | Retrieve Global Configuration for surveys

Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey

### Example
```java

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGlobalConfigurationsResponse&gt;> call = apiService.retrieveConfiguration(survey);
call.enqueue(new Callback<List&lt;GetGlobalConfigurationsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGlobalConfigurationsResponse&gt;> call, Response<List&lt;GetGlobalConfigurationsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGlobalConfigurationsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **survey** | **Boolean**| survey | [optional] [default to false]

### Return type

[**List&lt;GetGlobalConfigurationsResponse&gt;**](GetGlobalConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetGlobalConfigurationsResponse retrieveOne(configId)

Retrieve Global Configuration

Returns a global enable/disable configurations.  Example Requests:  configurations/1

### Example
```java

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<GetGlobalConfigurationsResponse> call = apiService.retrieveOne(configId);
call.enqueue(new Callback<GetGlobalConfigurationsResponse>() {
    @Override
    public void onResponse(Call<GetGlobalConfigurationsResponse> call, Response<GetGlobalConfigurationsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGlobalConfigurationsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **configId** | **Long**| configId |

### Return type

[**GetGlobalConfigurationsResponse**](GetGlobalConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConfiguration"></a>
# **updateConfiguration**
> PutGlobalConfigurationsResponse updateConfiguration(configId, body)

Update Global Configuration

Updates an enable/disable global configuration item.

### Example
```java

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<PutGlobalConfigurationsResponse> call = apiService.updateConfiguration(configId, body);
call.enqueue(new Callback<PutGlobalConfigurationsResponse>() {
    @Override
    public void onResponse(Call<PutGlobalConfigurationsResponse> call, Response<PutGlobalConfigurationsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGlobalConfigurationsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **configId** | **Long**| configId |
 **body** | [**PutGlobalConfigurationsRequest**](PutGlobalConfigurationsRequest.md)| body |

### Return type

[**PutGlobalConfigurationsResponse**](PutGlobalConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

