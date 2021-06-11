# TaxGroupApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxGroup**](TaxGroupApi.md#createTaxGroup) | **POST** taxes/group | Create a new Tax Group
[**retrieveAllTaxGroups**](TaxGroupApi.md#retrieveAllTaxGroups) | **GET** taxes/group | List Tax Group
[**retrieveTaxGroup**](TaxGroupApi.md#retrieveTaxGroup) | **GET** taxes/group/{taxGroupId} | Retrieve Tax Group
[**retrieveTemplate21**](TaxGroupApi.md#retrieveTemplate21) | **GET** taxes/group/template | 
[**updateTaxGroup**](TaxGroupApi.md#updateTaxGroup) | **PUT** taxes/group/{taxGroupId} | Update Tax Group



## createTaxGroup

> PostTaxesGroupResponse createTaxGroup(postTaxesGroupRequest)

Create a new Tax Group

Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxGroupApi;

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

        TaxGroupApi apiInstance = new TaxGroupApi(defaultClient);
        PostTaxesGroupRequest postTaxesGroupRequest = new PostTaxesGroupRequest(); // PostTaxesGroupRequest | 
        try {
            PostTaxesGroupResponse result = apiInstance.createTaxGroup(postTaxesGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxGroupApi#createTaxGroup");
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
 **postTaxesGroupRequest** | [**PostTaxesGroupRequest**](PostTaxesGroupRequest.md)|  |

### Return type

[**PostTaxesGroupResponse**](PostTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllTaxGroups

> List&lt;GetTaxesGroupResponse&gt; retrieveAllTaxGroups()

List Tax Group

List Tax Group

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxGroupApi;

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

        TaxGroupApi apiInstance = new TaxGroupApi(defaultClient);
        try {
            List<GetTaxesGroupResponse> result = apiInstance.retrieveAllTaxGroups();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxGroupApi#retrieveAllTaxGroups");
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

[**List&lt;GetTaxesGroupResponse&gt;**](GetTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTaxGroup

> GetTaxesGroupResponse retrieveTaxGroup(taxGroupId)

Retrieve Tax Group

Retrieve Tax Group

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxGroupApi;

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

        TaxGroupApi apiInstance = new TaxGroupApi(defaultClient);
        Long taxGroupId = 56L; // Long | taxGroupId
        try {
            GetTaxesGroupResponse result = apiInstance.retrieveTaxGroup(taxGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxGroupApi#retrieveTaxGroup");
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
 **taxGroupId** | **Long**| taxGroupId |

### Return type

[**GetTaxesGroupResponse**](GetTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate21

> String retrieveTemplate21()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxGroupApi;

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

        TaxGroupApi apiInstance = new TaxGroupApi(defaultClient);
        try {
            String result = apiInstance.retrieveTemplate21();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxGroupApi#retrieveTemplate21");
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


## updateTaxGroup

> PutTaxesGroupTaxGroupIdResponse updateTaxGroup(taxGroupId, putTaxesGroupTaxGroupIdRequest)

Update Tax Group

Updates Tax Group. Only end date can be up-datable and can insert new tax components.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxGroupApi;

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

        TaxGroupApi apiInstance = new TaxGroupApi(defaultClient);
        Long taxGroupId = 56L; // Long | taxGroupId
        PutTaxesGroupTaxGroupIdRequest putTaxesGroupTaxGroupIdRequest = new PutTaxesGroupTaxGroupIdRequest(); // PutTaxesGroupTaxGroupIdRequest | 
        try {
            PutTaxesGroupTaxGroupIdResponse result = apiInstance.updateTaxGroup(taxGroupId, putTaxesGroupTaxGroupIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxGroupApi#updateTaxGroup");
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
 **taxGroupId** | **Long**| taxGroupId |
 **putTaxesGroupTaxGroupIdRequest** | [**PutTaxesGroupTaxGroupIdRequest**](PutTaxesGroupTaxGroupIdRequest.md)|  |

### Return type

[**PutTaxesGroupTaxGroupIdResponse**](PutTaxesGroupTaxGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

