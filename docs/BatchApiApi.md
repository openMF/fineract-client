# BatchApiApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleBatchRequests**](BatchApiApi.md#handleBatchRequests) | **POST** batches | Batch requests in a single transaction



## handleBatchRequests

> BatchResponse handleBatchRequests(postBatchesRequest, enclosingTransaction)

Batch requests in a single transaction

The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.BatchApiApi;

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

        BatchApiApi apiInstance = new BatchApiApi(defaultClient);
        PostBatchesRequest postBatchesRequest = new PostBatchesRequest(); // PostBatchesRequest | 
        Boolean enclosingTransaction = false; // Boolean | enclosingTransaction
        try {
            BatchResponse result = apiInstance.handleBatchRequests(postBatchesRequest, enclosingTransaction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApiApi#handleBatchRequests");
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
 **postBatchesRequest** | [**PostBatchesRequest**](PostBatchesRequest.md)|  |
 **enclosingTransaction** | **Boolean**| enclosingTransaction | [optional] [default to false]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

