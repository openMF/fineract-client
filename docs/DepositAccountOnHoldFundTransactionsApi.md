# DepositAccountOnHoldFundTransactionsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll28**](DepositAccountOnHoldFundTransactionsApi.md#retrieveAll28) | **GET** savingsaccounts/{savingsId}/onholdtransactions | 



## retrieveAll28

> String retrieveAll28(savingsId, guarantorFundingId, offset, limit, orderBy, sortOrder)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DepositAccountOnHoldFundTransactionsApi;

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

        DepositAccountOnHoldFundTransactionsApi apiInstance = new DepositAccountOnHoldFundTransactionsApi(defaultClient);
        Long savingsId = 56L; // Long | 
        Long guarantorFundingId = 56L; // Long | 
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        String orderBy = "orderBy_example"; // String | 
        String sortOrder = "sortOrder_example"; // String | 
        try {
            String result = apiInstance.retrieveAll28(savingsId, guarantorFundingId, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositAccountOnHoldFundTransactionsApi#retrieveAll28");
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
 **savingsId** | **Long**|  |
 **guarantorFundingId** | **Long**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

