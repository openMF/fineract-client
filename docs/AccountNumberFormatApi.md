# AccountNumberFormatApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccountNumberFormatApi.md#create) | **POST** accountnumberformats | Create an Account number format
[**delete**](AccountNumberFormatApi.md#delete) | **DELETE** accountnumberformats/{accountNumberFormatId} | Delete an Account number format
[**retrieveAll3**](AccountNumberFormatApi.md#retrieveAll3) | **GET** accountnumberformats | List Account number formats
[**retrieveOne**](AccountNumberFormatApi.md#retrieveOne) | **GET** accountnumberformats/{accountNumberFormatId} | Retrieve an Account number format
[**retrieveTemplate2**](AccountNumberFormatApi.md#retrieveTemplate2) | **GET** accountnumberformats/template | Retrieve Account number format Template
[**update1**](AccountNumberFormatApi.md#update1) | **PUT** accountnumberformats/{accountNumberFormatId} | Update an Account number format



## create

> PostAccountNumberFormatsResponse create(postAccountNumberFormatsRequest)

Create an Account number format

Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        PostAccountNumberFormatsRequest postAccountNumberFormatsRequest = new PostAccountNumberFormatsRequest(); // PostAccountNumberFormatsRequest | 
        try {
            PostAccountNumberFormatsResponse result = apiInstance.create(postAccountNumberFormatsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#create");
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
 **postAccountNumberFormatsRequest** | [**PostAccountNumberFormatsRequest**](PostAccountNumberFormatsRequest.md)|  | [optional]

### Return type

[**PostAccountNumberFormatsResponse**](PostAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete

> DeleteAccountNumberFormatsResponse delete(accountNumberFormatId)

Delete an Account number format

Note: Account numbers created while this format was active would remain unchanged.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        Long accountNumberFormatId = 56L; // Long | accountNumberFormatId
        try {
            DeleteAccountNumberFormatsResponse result = apiInstance.delete(accountNumberFormatId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#delete");
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
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**DeleteAccountNumberFormatsResponse**](DeleteAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll3

> List&lt;GetAccountNumberFormatsIdResponse&gt; retrieveAll3()

List Account number formats

Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        try {
            List<GetAccountNumberFormatsIdResponse> result = apiInstance.retrieveAll3();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#retrieveAll3");
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

[**List&lt;GetAccountNumberFormatsIdResponse&gt;**](GetAccountNumberFormatsIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne

> GetAccountNumberFormatsIdResponse retrieveOne(accountNumberFormatId)

Retrieve an Account number format

Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        Long accountNumberFormatId = 56L; // Long | accountNumberFormatId
        try {
            GetAccountNumberFormatsIdResponse result = apiInstance.retrieveOne(accountNumberFormatId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#retrieveOne");
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
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**GetAccountNumberFormatsIdResponse**](GetAccountNumberFormatsIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate2

> GetAccountNumberFormatsResponseTemplate retrieveTemplate2()

Retrieve Account number format Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        try {
            GetAccountNumberFormatsResponseTemplate result = apiInstance.retrieveTemplate2();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#retrieveTemplate2");
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

[**GetAccountNumberFormatsResponseTemplate**](GetAccountNumberFormatsResponseTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update1

> PutAccountNumberFormatsResponse update1(accountNumberFormatId, putAccountNumberFormatsRequest)

Update an Account number format

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountNumberFormatApi;

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

        AccountNumberFormatApi apiInstance = new AccountNumberFormatApi(defaultClient);
        Long accountNumberFormatId = 56L; // Long | accountNumberFormatId
        PutAccountNumberFormatsRequest putAccountNumberFormatsRequest = new PutAccountNumberFormatsRequest(); // PutAccountNumberFormatsRequest | 
        try {
            PutAccountNumberFormatsResponse result = apiInstance.update1(accountNumberFormatId, putAccountNumberFormatsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountNumberFormatApi#update1");
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
 **accountNumberFormatId** | **Long**| accountNumberFormatId |
 **putAccountNumberFormatsRequest** | [**PutAccountNumberFormatsRequest**](PutAccountNumberFormatsRequest.md)|  |

### Return type

[**PutAccountNumberFormatsResponse**](PutAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

