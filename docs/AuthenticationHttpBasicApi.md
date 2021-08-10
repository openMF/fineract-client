# AuthenticationHttpBasicApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationHttpBasicApi.md#authenticate) | **POST** authentication | Verify authentication



## authenticate

> PostAuthenticationResponse authenticate(postAuthenticationRequest, returnClientList)

Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AuthenticationHttpBasicApi;

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

        AuthenticationHttpBasicApi apiInstance = new AuthenticationHttpBasicApi(defaultClient);
        PostAuthenticationRequest postAuthenticationRequest = new PostAuthenticationRequest(); // PostAuthenticationRequest | 
        Boolean returnClientList = false; // Boolean | 
        try {
            PostAuthenticationResponse result = apiInstance.authenticate(postAuthenticationRequest, returnClientList);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationHttpBasicApi#authenticate");
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
 **postAuthenticationRequest** | [**PostAuthenticationRequest**](PostAuthenticationRequest.md)|  |
 **returnClientList** | **Boolean**|  | [optional] [default to false]

### Return type

[**PostAuthenticationResponse**](PostAuthenticationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Unauthenticated. Please login |  -  |

