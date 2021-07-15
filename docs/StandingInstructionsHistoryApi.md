# StandingInstructionsHistoryApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll20**](StandingInstructionsHistoryApi.md#retrieveAll20) | **GET** standinginstructionrunhistory | Standing Instructions Logged History



## retrieveAll20

> GetStandingInstructionRunHistoryResponse retrieveAll20(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate)

Standing Instructions Logged History

The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsHistoryApi;

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

        StandingInstructionsHistoryApi apiInstance = new StandingInstructionsHistoryApi(defaultClient);
        String sqlSearch = "sqlSearch_example"; // String | sqlSearch
        String externalId = "externalId_example"; // String | externalId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        Integer transferType = 56; // Integer | transferType
        String clientName = "clientName_example"; // String | clientName
        Long clientId = 56L; // Long | clientId
        Long fromAccountId = 56L; // Long | fromAccountId
        Integer fromAccountType = 56; // Integer | fromAccountType
        String locale = "locale_example"; // String | locale
        String dateFormat = "dateFormat_example"; // String | dateFormat
        Object fromDate = null; // Object | fromDate
        Object toDate = null; // Object | toDate
        try {
            GetStandingInstructionRunHistoryResponse result = apiInstance.retrieveAll20(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsHistoryApi#retrieveAll20");
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
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **transferType** | **Integer**| transferType | [optional]
 **clientName** | **String**| clientName | [optional]
 **clientId** | **Long**| clientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **fromDate** | [**Object**](.md)| fromDate | [optional]
 **toDate** | [**Object**](.md)| toDate | [optional]

### Return type

[**GetStandingInstructionRunHistoryResponse**](GetStandingInstructionRunHistoryResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

