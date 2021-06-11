# ProvisioningCriteriaApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningCriteria**](ProvisioningCriteriaApi.md#createProvisioningCriteria) | **POST** provisioningcriteria | Create a new Provisioning Criteria
[**deleteProvisioningCriteria**](ProvisioningCriteriaApi.md#deleteProvisioningCriteria) | **DELETE** provisioningcriteria/{criteriaId} | Deletes Provisioning Criteria
[**retrieveAllProvisioningCriterias**](ProvisioningCriteriaApi.md#retrieveAllProvisioningCriterias) | **GET** provisioningcriteria | Retrieves all created Provisioning Criterias
[**retrieveProvisioningCriteria**](ProvisioningCriteriaApi.md#retrieveProvisioningCriteria) | **GET** provisioningcriteria/{criteriaId} | Retrieves a Provisioning Criteria
[**retrieveTemplate3**](ProvisioningCriteriaApi.md#retrieveTemplate3) | **GET** provisioningcriteria/template | 
[**updateProvisioningCriteria**](ProvisioningCriteriaApi.md#updateProvisioningCriteria) | **PUT** provisioningcriteria/{criteriaId} | Updates a new Provisioning Criteria



## createProvisioningCriteria

> PostProvisioningCriteriaResponse createProvisioningCriteria(postProvisioningCriteriaRequest)

Create a new Provisioning Criteria

Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        PostProvisioningCriteriaRequest postProvisioningCriteriaRequest = new PostProvisioningCriteriaRequest(); // PostProvisioningCriteriaRequest | 
        try {
            PostProvisioningCriteriaResponse result = apiInstance.createProvisioningCriteria(postProvisioningCriteriaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#createProvisioningCriteria");
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
 **postProvisioningCriteriaRequest** | [**PostProvisioningCriteriaRequest**](PostProvisioningCriteriaRequest.md)|  |

### Return type

[**PostProvisioningCriteriaResponse**](PostProvisioningCriteriaResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteProvisioningCriteria

> DeleteProvisioningCriteriaResponse deleteProvisioningCriteria(criteriaId)

Deletes Provisioning Criteria

Deletes Provisioning Criteria

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        Long criteriaId = 56L; // Long | criteriaId
        try {
            DeleteProvisioningCriteriaResponse result = apiInstance.deleteProvisioningCriteria(criteriaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#deleteProvisioningCriteria");
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
 **criteriaId** | **Long**| criteriaId |

### Return type

[**DeleteProvisioningCriteriaResponse**](DeleteProvisioningCriteriaResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllProvisioningCriterias

> List&lt;GetProvisioningCriteriaResponse&gt; retrieveAllProvisioningCriterias()

Retrieves all created Provisioning Criterias

Retrieves all created Provisioning Criterias

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        try {
            List<GetProvisioningCriteriaResponse> result = apiInstance.retrieveAllProvisioningCriterias();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveAllProvisioningCriterias");
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

[**List&lt;GetProvisioningCriteriaResponse&gt;**](GetProvisioningCriteriaResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveProvisioningCriteria

> GetProvisioningCriteriaCriteriaIdResponse retrieveProvisioningCriteria(criteriaId)

Retrieves a Provisioning Criteria

Retrieves a Provisioning Criteria

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        Long criteriaId = 56L; // Long | criteriaId
        try {
            GetProvisioningCriteriaCriteriaIdResponse result = apiInstance.retrieveProvisioningCriteria(criteriaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveProvisioningCriteria");
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
 **criteriaId** | **Long**| criteriaId |

### Return type

[**GetProvisioningCriteriaCriteriaIdResponse**](GetProvisioningCriteriaCriteriaIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate3

> String retrieveTemplate3()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        try {
            String result = apiInstance.retrieveTemplate3();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveTemplate3");
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


## updateProvisioningCriteria

> PutProvisioningCriteriaResponse updateProvisioningCriteria(criteriaId, putProvisioningCriteriaRequest)

Updates a new Provisioning Criteria

Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ProvisioningCriteriaApi;

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

        ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi(defaultClient);
        Long criteriaId = 56L; // Long | criteriaId
        PutProvisioningCriteriaRequest putProvisioningCriteriaRequest = new PutProvisioningCriteriaRequest(); // PutProvisioningCriteriaRequest | 
        try {
            PutProvisioningCriteriaResponse result = apiInstance.updateProvisioningCriteria(criteriaId, putProvisioningCriteriaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvisioningCriteriaApi#updateProvisioningCriteria");
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
 **criteriaId** | **Long**| criteriaId |
 **putProvisioningCriteriaRequest** | [**PutProvisioningCriteriaRequest**](PutProvisioningCriteriaRequest.md)|  |

### Return type

[**PutProvisioningCriteriaResponse**](PutProvisioningCriteriaResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

