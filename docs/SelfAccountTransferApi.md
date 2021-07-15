# SelfAccountTransferApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create14**](SelfAccountTransferApi.md#create14) | **POST** self/accounttransfers | Create new Transfer
[**template15**](SelfAccountTransferApi.md#template15) | **GET** self/accounttransfers/template | Retrieve Account Transfer Template



## create14

> List&lt;PostNewTransferResponse&gt; create14(type, body)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfAccountTransferApi;

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

        SelfAccountTransferApi apiInstance = new SelfAccountTransferApi(defaultClient);
        String type = "\"\""; // String | 
        String body = "body_example"; // String | 
        try {
            List<PostNewTransferResponse> result = apiInstance.create14(type, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfAccountTransferApi#create14");
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
 **type** | **String**|  | [optional] [default to &quot;&quot;]
 **body** | **String**|  | [optional]

### Return type

[**List&lt;PostNewTransferResponse&gt;**](PostNewTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template15

> List&lt;GetAccountTransferTemplateResponse&gt; template15(type)

Retrieve Account Transfer Template

Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfAccountTransferApi;

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

        SelfAccountTransferApi apiInstance = new SelfAccountTransferApi(defaultClient);
        String type = "\"\""; // String | 
        try {
            List<GetAccountTransferTemplateResponse> result = apiInstance.template15(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfAccountTransferApi#template15");
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
 **type** | **String**|  | [optional] [default to &quot;&quot;]

### Return type

[**List&lt;GetAccountTransferTemplateResponse&gt;**](GetAccountTransferTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

