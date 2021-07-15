# GlobalConfigurationApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveConfiguration**](GlobalConfigurationApi.md#retrieveConfiguration) | **GET** configurations | Retrieve Global Configuration | Retrieve Global Configuration for surveys
[**retrieveOne3**](GlobalConfigurationApi.md#retrieveOne3) | **GET** configurations/{configId} | Retrieve Global Configuration
[**updateConfiguration1**](GlobalConfigurationApi.md#updateConfiguration1) | **PUT** configurations/{configId} | Update Global Configuration



## retrieveConfiguration

> List&lt;GetGlobalConfigurationsResponse&gt; retrieveConfiguration(survey)

Retrieve Global Configuration | Retrieve Global Configuration for surveys

Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GlobalConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GlobalConfigurationApi apiInstance = new GlobalConfigurationApi(defaultClient);
        Boolean survey = false; // Boolean | survey
        try {
            List<GetGlobalConfigurationsResponse> result = apiInstance.retrieveConfiguration(survey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalConfigurationApi#retrieveConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey** | **Boolean**| survey | [optional] [default to false]

### Return type

[**List&lt;GetGlobalConfigurationsResponse&gt;**](GetGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of example \\n response \\nsurveys response   \\ngiven below |  -  |


## retrieveOne3

> GetGlobalConfigurationsResponse retrieveOne3(configId)

Retrieve Global Configuration

Returns a global enable/disable configurations.  Example Requests:  configurations/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GlobalConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GlobalConfigurationApi apiInstance = new GlobalConfigurationApi(defaultClient);
        Long configId = 56L; // Long | configId
        try {
            GetGlobalConfigurationsResponse result = apiInstance.retrieveOne3(configId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalConfigurationApi#retrieveOne3");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **Long**| configId |

### Return type

[**GetGlobalConfigurationsResponse**](GetGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateConfiguration1

> PutGlobalConfigurationsResponse updateConfiguration1(configId, putGlobalConfigurationsRequest)

Update Global Configuration

Updates an enable/disable global configuration item.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GlobalConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GlobalConfigurationApi apiInstance = new GlobalConfigurationApi(defaultClient);
        Long configId = 56L; // Long | configId
        PutGlobalConfigurationsRequest putGlobalConfigurationsRequest = new PutGlobalConfigurationsRequest(); // PutGlobalConfigurationsRequest | 
        try {
            PutGlobalConfigurationsResponse result = apiInstance.updateConfiguration1(configId, putGlobalConfigurationsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalConfigurationApi#updateConfiguration1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **Long**| configId |
 **putGlobalConfigurationsRequest** | [**PutGlobalConfigurationsRequest**](PutGlobalConfigurationsRequest.md)|  |

### Return type

[**PutGlobalConfigurationsResponse**](PutGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

