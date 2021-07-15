# SelfUserApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update22**](SelfUserApi.md#update22) | **PUT** self/user | Update User



## update22

> PutSelfUserResponse update22(putSelfUserRequest)

Update User

This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfUserApi;

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

        SelfUserApi apiInstance = new SelfUserApi(defaultClient);
        PutSelfUserRequest putSelfUserRequest = new PutSelfUserRequest(); // PutSelfUserRequest | 
        try {
            PutSelfUserResponse result = apiInstance.update22(putSelfUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfUserApi#update22");
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
 **putSelfUserRequest** | [**PutSelfUserRequest**](PutSelfUserRequest.md)|  |

### Return type

[**PutSelfUserResponse**](PutSelfUserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

