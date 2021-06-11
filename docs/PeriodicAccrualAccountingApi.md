# PeriodicAccrualAccountingApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executePeriodicAccrualAccounting**](PeriodicAccrualAccountingApi.md#executePeriodicAccrualAccounting) | **POST** runaccruals | Executes Periodic Accrual Accounting



## executePeriodicAccrualAccounting

> executePeriodicAccrualAccounting(postRunaccrualsRequest)

Executes Periodic Accrual Accounting

Mandatory Fields  tillDate 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PeriodicAccrualAccountingApi;

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

        PeriodicAccrualAccountingApi apiInstance = new PeriodicAccrualAccountingApi(defaultClient);
        PostRunaccrualsRequest postRunaccrualsRequest = new PostRunaccrualsRequest(); // PostRunaccrualsRequest | 
        try {
            apiInstance.executePeriodicAccrualAccounting(postRunaccrualsRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PeriodicAccrualAccountingApi#executePeriodicAccrualAccounting");
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
 **postRunaccrualsRequest** | [**PostRunaccrualsRequest**](PostRunaccrualsRequest.md)|  |

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

