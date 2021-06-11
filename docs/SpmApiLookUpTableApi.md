# SpmApiLookUpTableApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLookupTable**](SpmApiLookUpTableApi.md#createLookupTable) | **POST** surveys/{surveyId}/lookuptables | Create a Lookup Table entry
[**fetchLookupTables**](SpmApiLookUpTableApi.md#fetchLookupTables) | **GET** surveys/{surveyId}/lookuptables | List all Lookup Table entries
[**findLookupTable**](SpmApiLookUpTableApi.md#findLookupTable) | **GET** surveys/{surveyId}/lookuptables/{key} | Retrieve a Lookup Table entry



## createLookupTable

> createLookupTable(surveyId, lookupTableData)

Create a Lookup Table entry

Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SpmApiLookUpTableApi;

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

        SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi(defaultClient);
        Long surveyId = 56L; // Long | Enter surveyId
        LookupTableData lookupTableData = new LookupTableData(); // LookupTableData | 
        try {
            apiInstance.createLookupTable(surveyId, lookupTableData);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpmApiLookUpTableApi#createLookupTable");
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
 **surveyId** | **Long**| Enter surveyId |
 **lookupTableData** | [**LookupTableData**](LookupTableData.md)|  | [optional]

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


## fetchLookupTables

> List&lt;LookupTableData&gt; fetchLookupTables(surveyId)

List all Lookup Table entries

List all Lookup Table entries for a survey.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SpmApiLookUpTableApi;

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

        SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi(defaultClient);
        Long surveyId = 56L; // Long | Enter surveyId
        try {
            List<LookupTableData> result = apiInstance.fetchLookupTables(surveyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpmApiLookUpTableApi#fetchLookupTables");
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
 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;LookupTableData&gt;**](LookupTableData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## findLookupTable

> LookupTableData findLookupTable(surveyId, key)

Retrieve a Lookup Table entry

Retrieve a Lookup Table entry for a survey.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SpmApiLookUpTableApi;

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

        SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi(defaultClient);
        Long surveyId = 56L; // Long | Enter surveyId
        String key = "key_example"; // String | Enter key
        try {
            LookupTableData result = apiInstance.findLookupTable(surveyId, key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpmApiLookUpTableApi#findLookupTable");
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
 **surveyId** | **Long**| Enter surveyId |
 **key** | **String**| Enter key |

### Return type

[**LookupTableData**](LookupTableData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

