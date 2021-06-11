# ClientsAddressApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClientAddress**](ClientsAddressApi.md#addClientAddress) | **POST** client/{clientid}/addresses | Create an address for a Client
[**getAddresses1**](ClientsAddressApi.md#getAddresses1) | **GET** client/{clientid}/addresses | List all addresses for a Client
[**getAddressesTemplate**](ClientsAddressApi.md#getAddressesTemplate) | **GET** client/addresses/template | 
[**updateClientAddress**](ClientsAddressApi.md#updateClientAddress) | **PUT** client/{clientid}/addresses | Update an address for a Client



## addClientAddress

> PostClientClientIdAddressesResponse addClientAddress(clientid, postClientClientIdAddressesRequest, type)

Create an address for a Client

Mandatory Fields :  type and clientId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientsAddressApi;

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

        ClientsAddressApi apiInstance = new ClientsAddressApi(defaultClient);
        Long clientid = 56L; // Long | clientId
        PostClientClientIdAddressesRequest postClientClientIdAddressesRequest = new PostClientClientIdAddressesRequest(); // PostClientClientIdAddressesRequest | 
        Long type = 56L; // Long | type
        try {
            PostClientClientIdAddressesResponse result = apiInstance.addClientAddress(clientid, postClientClientIdAddressesRequest, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsAddressApi#addClientAddress");
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
 **clientid** | **Long**| clientId |
 **postClientClientIdAddressesRequest** | [**PostClientClientIdAddressesRequest**](PostClientClientIdAddressesRequest.md)|  |
 **type** | **Long**| type | [optional]

### Return type

[**PostClientClientIdAddressesResponse**](PostClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAddresses1

> List&lt;GetClientClientIdAddressesResponse&gt; getAddresses1(clientid, status, type)

List all addresses for a Client

Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientsAddressApi;

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

        ClientsAddressApi apiInstance = new ClientsAddressApi(defaultClient);
        Long clientid = 56L; // Long | clientId
        String status = "status_example"; // String | status
        Long type = 56L; // Long | type
        try {
            List<GetClientClientIdAddressesResponse> result = apiInstance.getAddresses1(clientid, status, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsAddressApi#getAddresses1");
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
 **clientid** | **Long**| clientId |
 **status** | **String**| status | [optional]
 **type** | **Long**| type | [optional]

### Return type

[**List&lt;GetClientClientIdAddressesResponse&gt;**](GetClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAddressesTemplate

> String getAddressesTemplate()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientsAddressApi;

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

        ClientsAddressApi apiInstance = new ClientsAddressApi(defaultClient);
        try {
            String result = apiInstance.getAddressesTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsAddressApi#getAddressesTemplate");
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


## updateClientAddress

> PutClientClientIdAddressesResponse updateClientAddress(clientid, putClientClientIdAddressesRequest)

Update an address for a Client

All the address fields can be updated by using update client address API  Mandatory Fields type and addressId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientsAddressApi;

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

        ClientsAddressApi apiInstance = new ClientsAddressApi(defaultClient);
        Long clientid = 56L; // Long | clientId
        PutClientClientIdAddressesRequest putClientClientIdAddressesRequest = new PutClientClientIdAddressesRequest(); // PutClientClientIdAddressesRequest | 
        try {
            PutClientClientIdAddressesResponse result = apiInstance.updateClientAddress(clientid, putClientClientIdAddressesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsAddressApi#updateClientAddress");
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
 **clientid** | **Long**| clientId |
 **putClientClientIdAddressesRequest** | [**PutClientClientIdAddressesRequest**](PutClientClientIdAddressesRequest.md)|  |

### Return type

[**PutClientClientIdAddressesResponse**](PutClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

