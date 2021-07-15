# MappingFinancialActivitiesToAccountsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount**](MappingFinancialActivitiesToAccountsApi.md#createGLAccount) | **POST** financialactivityaccounts | Create a new Financial Activity to Accounts Mapping
[**deleteGLAccount**](MappingFinancialActivitiesToAccountsApi.md#deleteGLAccount) | **DELETE** financialactivityaccounts/{mappingId} | Delete a Financial Activity to Account Mapping
[**retreive**](MappingFinancialActivitiesToAccountsApi.md#retreive) | **GET** financialactivityaccounts/{mappingId} | Retrieve a Financial Activity to Account Mapping 
[**retrieveAll**](MappingFinancialActivitiesToAccountsApi.md#retrieveAll) | **GET** financialactivityaccounts | List Financial Activities to Accounts Mappings
[**retrieveTemplate**](MappingFinancialActivitiesToAccountsApi.md#retrieveTemplate) | **GET** financialactivityaccounts/template | 
[**updateGLAccount**](MappingFinancialActivitiesToAccountsApi.md#updateGLAccount) | **PUT** financialactivityaccounts/{mappingId} | Update a Financial Activity to Account Mapping



## createGLAccount

> PostFinancialActivityAccountsResponse createGLAccount(postFinancialActivityAccountsRequest)

Create a new Financial Activity to Accounts Mapping

Mandatory Fields financialActivityId, glAccountId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest = new PostFinancialActivityAccountsRequest(); // PostFinancialActivityAccountsRequest | 
        try {
            PostFinancialActivityAccountsResponse result = apiInstance.createGLAccount(postFinancialActivityAccountsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#createGLAccount");
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
 **postFinancialActivityAccountsRequest** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional]

### Return type

[**PostFinancialActivityAccountsResponse**](PostFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteGLAccount

> DeleteFinancialActivityAccountsResponse deleteGLAccount(mappingId)

Delete a Financial Activity to Account Mapping

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        Long mappingId = 56L; // Long | mappingId
        try {
            DeleteFinancialActivityAccountsResponse result = apiInstance.deleteGLAccount(mappingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#deleteGLAccount");
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
 **mappingId** | **Long**| mappingId |

### Return type

[**DeleteFinancialActivityAccountsResponse**](DeleteFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retreive

> GetFinancialActivityAccountsResponse retreive(mappingId)

Retrieve a Financial Activity to Account Mapping 

Example Requests:  financialactivityaccounts/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        Long mappingId = 56L; // Long | mappingId
        try {
            GetFinancialActivityAccountsResponse result = apiInstance.retreive(mappingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retreive");
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
 **mappingId** | **Long**| mappingId |

### Return type

[**GetFinancialActivityAccountsResponse**](GetFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll

> List&lt;GetFinancialActivityAccountsResponse&gt; retrieveAll()

List Financial Activities to Accounts Mappings

Example Requests:  financialactivityaccounts

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        try {
            List<GetFinancialActivityAccountsResponse> result = apiInstance.retrieveAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retrieveAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetFinancialActivityAccountsResponse&gt;**](GetFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate

> String retrieveTemplate()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        try {
            String result = apiInstance.retrieveTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retrieveTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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


## updateGLAccount

> PutFinancialActivityAccountsResponse updateGLAccount(mappingId, postFinancialActivityAccountsRequest)

Update a Financial Activity to Account Mapping

the API updates the Ledger account linked to a Financial Activity  

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MappingFinancialActivitiesToAccountsApi;

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

        MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi(defaultClient);
        Long mappingId = 56L; // Long | mappingId
        PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest = new PostFinancialActivityAccountsRequest(); // PostFinancialActivityAccountsRequest | 
        try {
            PutFinancialActivityAccountsResponse result = apiInstance.updateGLAccount(mappingId, postFinancialActivityAccountsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#updateGLAccount");
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
 **mappingId** | **Long**| mappingId |
 **postFinancialActivityAccountsRequest** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional]

### Return type

[**PutFinancialActivityAccountsResponse**](PutFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

