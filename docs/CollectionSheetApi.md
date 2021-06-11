# CollectionSheetApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateCollectionSheet**](CollectionSheetApi.md#generateCollectionSheet) | **POST** collectionsheet | Generate Individual Collection Sheet | Save Collection Sheet



## generateCollectionSheet

> PostCollectionSheetResponse generateCollectionSheet(postCollectionSheetRequest, command)

Generate Individual Collection Sheet | Save Collection Sheet

Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CollectionSheetApi;

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

        CollectionSheetApi apiInstance = new CollectionSheetApi(defaultClient);
        PostCollectionSheetRequest postCollectionSheetRequest = new PostCollectionSheetRequest(); // PostCollectionSheetRequest | 
        String command = "command_example"; // String | command
        try {
            PostCollectionSheetResponse result = apiInstance.generateCollectionSheet(postCollectionSheetRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollectionSheetApi#generateCollectionSheet");
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
 **postCollectionSheetRequest** | [**PostCollectionSheetRequest**](PostCollectionSheetRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostCollectionSheetResponse**](PostCollectionSheetResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

