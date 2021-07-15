# ExternalServicesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveOne2**](ExternalServicesApi.md#retrieveOne2) | **GET** externalservice/{servicename} | Retrieve External Services Configuration
[**updateExternalServiceProperties**](ExternalServicesApi.md#updateExternalServiceProperties) | **PUT** externalservice/{servicename} | Update External Service



## retrieveOne2

> ExternalServicesPropertiesData retrieveOne2(servicename)

Retrieve External Services Configuration

Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ExternalServicesApi;

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

        ExternalServicesApi apiInstance = new ExternalServicesApi(defaultClient);
        String servicename = "servicename_example"; // String | servicename
        try {
            ExternalServicesPropertiesData result = apiInstance.retrieveOne2(servicename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalServicesApi#retrieveOne2");
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
 **servicename** | **String**| servicename |

### Return type

[**ExternalServicesPropertiesData**](ExternalServicesPropertiesData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateExternalServiceProperties

> updateExternalServiceProperties(servicename, putExternalServiceRequest)

Update External Service

Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ExternalServicesApi;

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

        ExternalServicesApi apiInstance = new ExternalServicesApi(defaultClient);
        String servicename = "servicename_example"; // String | servicename
        PutExternalServiceRequest putExternalServiceRequest = new PutExternalServiceRequest(); // PutExternalServiceRequest | 
        try {
            apiInstance.updateExternalServiceProperties(servicename, putExternalServiceRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalServicesApi#updateExternalServiceProperties");
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
 **servicename** | **String**| servicename |
 **putExternalServiceRequest** | [**PutExternalServiceRequest**](PutExternalServiceRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

