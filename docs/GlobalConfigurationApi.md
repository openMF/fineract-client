# GlobalConfigurationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GlobalConfigurationApi;


GlobalConfigurationApi apiInstance = new GlobalConfigurationApi();
Boolean survey = false; // Boolean | survey
try {
    List<GetGlobalConfigurationsResponse> result = apiInstance.retrieveConfiguration(survey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigurationApi#retrieveConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GlobalConfigurationApi;


GlobalConfigurationApi apiInstance = new GlobalConfigurationApi();
Long configId = 789L; // Long | configId
try {
    GetGlobalConfigurationsResponse result = apiInstance.retrieveOne(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigurationApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GlobalConfigurationApi;


GlobalConfigurationApi apiInstance = new GlobalConfigurationApi();
Long configId = 789L; // Long | configId
PutGlobalConfigurationsRequest body = new PutGlobalConfigurationsRequest(); // PutGlobalConfigurationsRequest | body
try {
    PutGlobalConfigurationsResponse result = apiInstance.updateConfiguration(configId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigurationApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **Long**| configId |
 **body** | [**PutGlobalConfigurationsRequest**](PutGlobalConfigurationsRequest.md)| body |

### Return type

[**PutGlobalConfigurationsResponse**](PutGlobalConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

