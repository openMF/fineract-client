# ExternalServicesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveOne**](ExternalServicesApi.md#retrieveOne) | **GET** externalservice/{servicename} | Retrieve External Services Configuration
[**updateExternalServiceProperties**](ExternalServicesApi.md#updateExternalServiceProperties) | **PUT** externalservice/{servicename} | Update External Service


<a name="retrieveOne"></a>
# **retrieveOne**
> ExternalServicesPropertiesData retrieveOne(servicename)

Retrieve External Services Configuration

Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP

### Example
```java

ExternalServicesApi apiService = defaultClient.createService(ExternalServicesApi.class);

// Initialize these parameters earlier.
Call<ExternalServicesPropertiesData> call = apiService.retrieveOne(servicename);
call.enqueue(new Callback<ExternalServicesPropertiesData>() {
    @Override
    public void onResponse(Call<ExternalServicesPropertiesData> call, Response<ExternalServicesPropertiesData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<ExternalServicesPropertiesData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **servicename** | **String**| servicename |

### Return type

[**ExternalServicesPropertiesData**](ExternalServicesPropertiesData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExternalServiceProperties"></a>
# **updateExternalServiceProperties**
> updateExternalServiceProperties(servicename, body)

Update External Service

Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3

### Example
```java

ExternalServicesApi apiService = defaultClient.createService(ExternalServicesApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.updateExternalServiceProperties(servicename, body);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **servicename** | **String**| servicename |
 **body** | [**PutExternalServiceRequest**](PutExternalServiceRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

