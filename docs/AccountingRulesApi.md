# AccountingRulesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountingRule**](AccountingRulesApi.md#createAccountingRule) | **POST** accountingrules | Create/Define a Accounting rule
[**deleteAccountingRule**](AccountingRulesApi.md#deleteAccountingRule) | **DELETE** accountingrules/{accountingRuleId} | Delete a Accounting Rule
[**retreiveAccountingRule**](AccountingRulesApi.md#retreiveAccountingRule) | **GET** accountingrules/{accountingRuleId} | Retrieve a Accounting rule
[**retrieveAllAccountingRules**](AccountingRulesApi.md#retrieveAllAccountingRules) | **GET** accountingrules | Retrieve Accounting Rules
[**retrieveTemplate1**](AccountingRulesApi.md#retrieveTemplate1) | **GET** accountingrules/template | Retrieve Accounting Rule Details Template
[**updateAccountingRule**](AccountingRulesApi.md#updateAccountingRule) | **PUT** accountingrules/{accountingRuleId} | Update a Accounting Rule



## createAccountingRule

> PostAccountingRulesResponse createAccountingRule(postAccountingRulesRequest)

Create/Define a Accounting rule

Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        PostAccountingRulesRequest postAccountingRulesRequest = new PostAccountingRulesRequest(); // PostAccountingRulesRequest | 
        try {
            PostAccountingRulesResponse result = apiInstance.createAccountingRule(postAccountingRulesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#createAccountingRule");
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
 **postAccountingRulesRequest** | [**PostAccountingRulesRequest**](PostAccountingRulesRequest.md)|  | [optional]

### Return type

[**PostAccountingRulesResponse**](PostAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteAccountingRule

> DeleteAccountingRulesResponse deleteAccountingRule(accountingRuleId)

Delete a Accounting Rule

Deletes a Accounting rule.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        Long accountingRuleId = 56L; // Long | accountingRuleId
        try {
            DeleteAccountingRulesResponse result = apiInstance.deleteAccountingRule(accountingRuleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#deleteAccountingRule");
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
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**DeleteAccountingRulesResponse**](DeleteAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retreiveAccountingRule

> AccountingRuleData retreiveAccountingRule(accountingRuleId)

Retrieve a Accounting rule

Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        Long accountingRuleId = 56L; // Long | accountingRuleId
        try {
            AccountingRuleData result = apiInstance.retreiveAccountingRule(accountingRuleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#retreiveAccountingRule");
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
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**AccountingRuleData**](AccountingRuleData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllAccountingRules

> List&lt;GetAccountRulesResponse&gt; retrieveAllAccountingRules()

Retrieve Accounting Rules

Returns the list of defined accounting rules.  Example Requests:  accountingrules

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        try {
            List<GetAccountRulesResponse> result = apiInstance.retrieveAllAccountingRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#retrieveAllAccountingRules");
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

[**List&lt;GetAccountRulesResponse&gt;**](GetAccountRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate1

> GetAccountRulesTemplateResponse retrieveTemplate1()

Retrieve Accounting Rule Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        try {
            GetAccountRulesTemplateResponse result = apiInstance.retrieveTemplate1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#retrieveTemplate1");
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

[**GetAccountRulesTemplateResponse**](GetAccountRulesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateAccountingRule

> PutAccountingRulesResponse updateAccountingRule(accountingRuleId, putAccountingRulesRequest)

Update a Accounting Rule

Updates the details of a Accounting rule.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingRulesApi;

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

        AccountingRulesApi apiInstance = new AccountingRulesApi(defaultClient);
        Long accountingRuleId = 56L; // Long | accountingRuleId
        PutAccountingRulesRequest putAccountingRulesRequest = new PutAccountingRulesRequest(); // PutAccountingRulesRequest | 
        try {
            PutAccountingRulesResponse result = apiInstance.updateAccountingRule(accountingRuleId, putAccountingRulesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingRulesApi#updateAccountingRule");
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
 **accountingRuleId** | **Long**| accountingRuleId |
 **putAccountingRulesRequest** | [**PutAccountingRulesRequest**](PutAccountingRulesRequest.md)|  | [optional]

### Return type

[**PutAccountingRulesResponse**](PutAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

