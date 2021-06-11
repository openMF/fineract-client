# ProvisioningEntriesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningEntries**](ProvisioningEntriesApi.md#createProvisioningEntries) | **POST** provisioningentries | Create new Provisioning Entries
[**modifyProvisioningEntry**](ProvisioningEntriesApi.md#modifyProvisioningEntry) | **POST** provisioningentries/{entryId} | Recreates Provisioning Entry
[**retrieveAllProvisioningEntries**](ProvisioningEntriesApi.md#retrieveAllProvisioningEntries) | **GET** provisioningentries | List all Provisioning Entries
[**retrieveProviioningEntries**](ProvisioningEntriesApi.md#retrieveProviioningEntries) | **GET** provisioningentries/entries | 
[**retrieveProvisioningEntry**](ProvisioningEntriesApi.md#retrieveProvisioningEntry) | **GET** provisioningentries/{entryId} | Retrieves a Provisioning Entry



## createProvisioningEntries

> PostProvisioningEntriesResponse createProvisioningEntries(postProvisioningEntriesRequest)

Create new Provisioning Entries

Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningEntriesApi;

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

        ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi(defaultClient);
        PostProvisioningEntriesRequest postProvisioningEntriesRequest = new PostProvisioningEntriesRequest(); // PostProvisioningEntriesRequest | 
        try {
            PostProvisioningEntriesResponse result = apiInstance.createProvisioningEntries(postProvisioningEntriesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningEntriesApi#createProvisioningEntries");
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
 **postProvisioningEntriesRequest** | [**PostProvisioningEntriesRequest**](PostProvisioningEntriesRequest.md)|  | [optional]

### Return type

[**PostProvisioningEntriesResponse**](PostProvisioningEntriesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## modifyProvisioningEntry

> PutProvisioningEntriesResponse modifyProvisioningEntry(entryId, command, putProvisioningEntriesRequest)

Recreates Provisioning Entry

Recreates Provisioning Entry | createjournalentry.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningEntriesApi;

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

        ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi(defaultClient);
        Long entryId = 56L; // Long | entryId
        String command = "command_example"; // String | command=createjournalentry command=recreateprovisioningentry
        PutProvisioningEntriesRequest putProvisioningEntriesRequest = new PutProvisioningEntriesRequest(); // PutProvisioningEntriesRequest | 
        try {
            PutProvisioningEntriesResponse result = apiInstance.modifyProvisioningEntry(entryId, command, putProvisioningEntriesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningEntriesApi#modifyProvisioningEntry");
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
 **entryId** | **Long**| entryId |
 **command** | **String**| command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry | [optional]
 **putProvisioningEntriesRequest** | [**PutProvisioningEntriesRequest**](PutProvisioningEntriesRequest.md)|  | [optional]

### Return type

[**PutProvisioningEntriesResponse**](PutProvisioningEntriesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllProvisioningEntries

> List&lt;ProvisioningEntryData&gt; retrieveAllProvisioningEntries(offset, limit)

List all Provisioning Entries

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningEntriesApi;

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

        ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi(defaultClient);
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        try {
            List<ProvisioningEntryData> result = apiInstance.retrieveAllProvisioningEntries(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningEntriesApi#retrieveAllProvisioningEntries");
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
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;ProvisioningEntryData&gt;**](ProvisioningEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveProviioningEntries

> LoanProductProvisioningEntryData retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningEntriesApi;

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

        ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi(defaultClient);
        Long entryId = 56L; // Long | 
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        Long officeId = 56L; // Long | 
        Long productId = 56L; // Long | 
        Long categoryId = 56L; // Long | 
        try {
            LoanProductProvisioningEntryData result = apiInstance.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningEntriesApi#retrieveProviioningEntries");
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
 **entryId** | **Long**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **officeId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]
 **categoryId** | **Long**|  | [optional]

### Return type

[**LoanProductProvisioningEntryData**](LoanProductProvisioningEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveProvisioningEntry

> ProvisioningEntryData retrieveProvisioningEntry(entryId)

Retrieves a Provisioning Entry

Returns the details of a generated Provisioning Entry.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningEntriesApi;

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

        ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi(defaultClient);
        Long entryId = 56L; // Long | entryId
        try {
            ProvisioningEntryData result = apiInstance.retrieveProvisioningEntry(entryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningEntriesApi#retrieveProvisioningEntry");
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
 **entryId** | **Long**| entryId |

### Return type

[**ProvisioningEntryData**](ProvisioningEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

