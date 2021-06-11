# ClientIdentifierApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientIdentifier**](ClientIdentifierApi.md#createClientIdentifier) | **POST** clients/{clientId}/identifiers | Create an Identifier for a Client
[**deleteClientIdentifier**](ClientIdentifierApi.md#deleteClientIdentifier) | **DELETE** clients/{clientId}/identifiers/{identifierId} | Delete a Client Identifier
[**newClientIdentifierDetails**](ClientIdentifierApi.md#newClientIdentifierDetails) | **GET** clients/{clientId}/identifiers/template | Retrieve Client Identifier Details Template
[**retrieveAllClientIdentifiers**](ClientIdentifierApi.md#retrieveAllClientIdentifiers) | **GET** clients/{clientId}/identifiers | List all Identifiers for a Client
[**retrieveClientIdentifiers**](ClientIdentifierApi.md#retrieveClientIdentifiers) | **GET** clients/{clientId}/identifiers/{identifierId} | Retrieve a Client Identifier
[**updateClientIdentifer**](ClientIdentifierApi.md#updateClientIdentifer) | **PUT** clients/{clientId}/identifiers/{identifierId} | Update a Client Identifier



## createClientIdentifier

> PostClientsClientIdIdentifiersResponse createClientIdentifier(clientId, postClientsClientIdIdentifiersRequest)

Create an Identifier for a Client

Mandatory Fields documentKey, documentTypeId 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        PostClientsClientIdIdentifiersRequest postClientsClientIdIdentifiersRequest = new PostClientsClientIdIdentifiersRequest(); // PostClientsClientIdIdentifiersRequest | 
        try {
            PostClientsClientIdIdentifiersResponse result = apiInstance.createClientIdentifier(clientId, postClientsClientIdIdentifiersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#createClientIdentifier");
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
 **clientId** | **Long**| clientId |
 **postClientsClientIdIdentifiersRequest** | [**PostClientsClientIdIdentifiersRequest**](PostClientsClientIdIdentifiersRequest.md)|  |

### Return type

[**PostClientsClientIdIdentifiersResponse**](PostClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteClientIdentifier

> DeleteClientsClientIdIdentifiersIdentifierIdResponse deleteClientIdentifier(clientId, identifierId)

Delete a Client Identifier

Deletes a Client Identifier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long identifierId = 56L; // Long | identifierId
        try {
            DeleteClientsClientIdIdentifiersIdentifierIdResponse result = apiInstance.deleteClientIdentifier(clientId, identifierId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#deleteClientIdentifier");
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
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**DeleteClientsClientIdIdentifiersIdentifierIdResponse**](DeleteClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## newClientIdentifierDetails

> GetClientsClientIdIdentifiersTemplateResponse newClientIdentifierDetails(clientId)

Retrieve Client Identifier Details Template

This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        try {
            GetClientsClientIdIdentifiersTemplateResponse result = apiInstance.newClientIdentifierDetails(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#newClientIdentifierDetails");
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
 **clientId** | **Long**| clientId |

### Return type

[**GetClientsClientIdIdentifiersTemplateResponse**](GetClientsClientIdIdentifiersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllClientIdentifiers

> List&lt;GetClientsClientIdIdentifiersResponse&gt; retrieveAllClientIdentifiers(clientId)

List all Identifiers for a Client

Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        try {
            List<GetClientsClientIdIdentifiersResponse> result = apiInstance.retrieveAllClientIdentifiers(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#retrieveAllClientIdentifiers");
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
 **clientId** | **Long**| clientId |

### Return type

[**List&lt;GetClientsClientIdIdentifiersResponse&gt;**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveClientIdentifiers

> GetClientsClientIdIdentifiersResponse retrieveClientIdentifiers(clientId, identifierId)

Retrieve a Client Identifier

Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long identifierId = 56L; // Long | identifierId
        try {
            GetClientsClientIdIdentifiersResponse result = apiInstance.retrieveClientIdentifiers(clientId, identifierId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#retrieveClientIdentifiers");
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
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**GetClientsClientIdIdentifiersResponse**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateClientIdentifer

> PutClientsClientIdIdentifiersIdentifierIdResponse updateClientIdentifer(clientId, identifierId, putClientsClientIdIdentifiersIdentifierIdRequest)

Update a Client Identifier

Updates a Client Identifier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientIdentifierApi;

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

        ClientIdentifierApi apiInstance = new ClientIdentifierApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long identifierId = 56L; // Long | identifierId
        PutClientsClientIdIdentifiersIdentifierIdRequest putClientsClientIdIdentifiersIdentifierIdRequest = new PutClientsClientIdIdentifiersIdentifierIdRequest(); // PutClientsClientIdIdentifiersIdentifierIdRequest | 
        try {
            PutClientsClientIdIdentifiersIdentifierIdResponse result = apiInstance.updateClientIdentifer(clientId, identifierId, putClientsClientIdIdentifiersIdentifierIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientIdentifierApi#updateClientIdentifer");
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
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |
 **putClientsClientIdIdentifiersIdentifierIdRequest** | [**PutClientsClientIdIdentifiersIdentifierIdRequest**](PutClientsClientIdIdentifiersIdentifierIdRequest.md)|  |

### Return type

[**PutClientsClientIdIdentifiersIdentifierIdResponse**](PutClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

