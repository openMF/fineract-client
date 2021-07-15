# ClientChargesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyClientCharge**](ClientChargesApi.md#applyClientCharge) | **POST** clients/{clientId}/charges | Add Client Charge
[**deleteClientCharge**](ClientChargesApi.md#deleteClientCharge) | **DELETE** clients/{clientId}/charges/{chargeId} | Delete a Client Charge
[**payOrWaiveClientCharge**](ClientChargesApi.md#payOrWaiveClientCharge) | **POST** clients/{clientId}/charges/{chargeId} | Pay a Client Charge | Waive a Client Charge
[**retrieveAllClientCharges**](ClientChargesApi.md#retrieveAllClientCharges) | **GET** clients/{clientId}/charges | List Client Charges
[**retrieveClientCharge**](ClientChargesApi.md#retrieveClientCharge) | **GET** clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveTemplate4**](ClientChargesApi.md#retrieveTemplate4) | **GET** clients/{clientId}/charges/template | 



## applyClientCharge

> PostClientsClientIdChargesResponse applyClientCharge(clientId, postClientsClientIdChargesRequest)

Add Client Charge

 This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        PostClientsClientIdChargesRequest postClientsClientIdChargesRequest = new PostClientsClientIdChargesRequest(); // PostClientsClientIdChargesRequest | 
        try {
            PostClientsClientIdChargesResponse result = apiInstance.applyClientCharge(clientId, postClientsClientIdChargesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#applyClientCharge");
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
 **postClientsClientIdChargesRequest** | [**PostClientsClientIdChargesRequest**](PostClientsClientIdChargesRequest.md)|  |

### Return type

[**PostClientsClientIdChargesResponse**](PostClientsClientIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteClientCharge

> DeleteClientsClientIdChargesChargeIdResponse deleteClientCharge(clientId, chargeId)

Delete a Client Charge

Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long chargeId = 56L; // Long | chargeId
        try {
            DeleteClientsClientIdChargesChargeIdResponse result = apiInstance.deleteClientCharge(clientId, chargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#deleteClientCharge");
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
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteClientsClientIdChargesChargeIdResponse**](DeleteClientsClientIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## payOrWaiveClientCharge

> PostClientsClientIdChargesChargeIdResponse payOrWaiveClientCharge(clientId, chargeId, postClientsClientIdChargesChargeIdRequest, command)

Pay a Client Charge | Waive a Client Charge

Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long chargeId = 56L; // Long | chargeId
        PostClientsClientIdChargesChargeIdRequest postClientsClientIdChargesChargeIdRequest = new PostClientsClientIdChargesChargeIdRequest(); // PostClientsClientIdChargesChargeIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostClientsClientIdChargesChargeIdResponse result = apiInstance.payOrWaiveClientCharge(clientId, chargeId, postClientsClientIdChargesChargeIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#payOrWaiveClientCharge");
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
 **chargeId** | **Long**| chargeId |
 **postClientsClientIdChargesChargeIdRequest** | [**PostClientsClientIdChargesChargeIdRequest**](PostClientsClientIdChargesChargeIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostClientsClientIdChargesChargeIdResponse**](PostClientsClientIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllClientCharges

> GetClientsClientIdChargesResponse retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        String chargeStatus = "\"all\""; // String | chargeStatus
        Boolean pendingPayment = true; // Boolean | pendingPayment
        Integer limit = 56; // Integer | limit
        Integer offset = 56; // Integer | offset
        try {
            GetClientsClientIdChargesResponse result = apiInstance.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#retrieveAllClientCharges");
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
 **chargeStatus** | **String**| chargeStatus | [optional] [default to &quot;all&quot;]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetClientsClientIdChargesResponse**](GetClientsClientIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveClientCharge

> GetClientsChargesPageItems retrieveClientCharge(clientId, chargeId)

Retrieve a Client Charge

Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long chargeId = 56L; // Long | chargeId
        try {
            GetClientsChargesPageItems result = apiInstance.retrieveClientCharge(clientId, chargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#retrieveClientCharge");
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
 **chargeId** | **Long**| chargeId |

### Return type

[**GetClientsChargesPageItems**](GetClientsChargesPageItems.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate4

> String retrieveTemplate4(clientId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientChargesApi;

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

        ClientChargesApi apiInstance = new ClientChargesApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        try {
            String result = apiInstance.retrieveTemplate4(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientChargesApi#retrieveTemplate4");
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

