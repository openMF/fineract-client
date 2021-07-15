# PaymentTypeApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentType**](PaymentTypeApi.md#createPaymentType) | **POST** paymenttypes | Create a Payment Type
[**deleteCode1**](PaymentTypeApi.md#deleteCode1) | **DELETE** paymenttypes/{paymentTypeId} | Delete a Payment Type
[**getAllPaymentTypes**](PaymentTypeApi.md#getAllPaymentTypes) | **GET** paymenttypes | Retrieve all Payment Types
[**retrieveOnePaymentType**](PaymentTypeApi.md#retrieveOnePaymentType) | **GET** paymenttypes/{paymentTypeId} | Retrieve a Payment Type
[**updatePaymentType**](PaymentTypeApi.md#updatePaymentType) | **PUT** paymenttypes/{paymentTypeId} | Update a Payment Type



## createPaymentType

> PostPaymentTypesResponse createPaymentType(postPaymentTypesRequest)

Create a Payment Type

Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PaymentTypeApi;

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

        PaymentTypeApi apiInstance = new PaymentTypeApi(defaultClient);
        PostPaymentTypesRequest postPaymentTypesRequest = new PostPaymentTypesRequest(); // PostPaymentTypesRequest | 
        try {
            PostPaymentTypesResponse result = apiInstance.createPaymentType(postPaymentTypesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentTypeApi#createPaymentType");
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
 **postPaymentTypesRequest** | [**PostPaymentTypesRequest**](PostPaymentTypesRequest.md)|  |

### Return type

[**PostPaymentTypesResponse**](PostPaymentTypesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCode1

> DeletePaymentTypesPaymentTypeIdResponse deleteCode1(paymentTypeId)

Delete a Payment Type

Deletes payment type

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PaymentTypeApi;

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

        PaymentTypeApi apiInstance = new PaymentTypeApi(defaultClient);
        Long paymentTypeId = 56L; // Long | paymentTypeId
        try {
            DeletePaymentTypesPaymentTypeIdResponse result = apiInstance.deleteCode1(paymentTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentTypeApi#deleteCode1");
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
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**DeletePaymentTypesPaymentTypeIdResponse**](DeletePaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllPaymentTypes

> List&lt;GetPaymentTypesResponse&gt; getAllPaymentTypes()

Retrieve all Payment Types

Retrieve list of payment types

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PaymentTypeApi;

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

        PaymentTypeApi apiInstance = new PaymentTypeApi(defaultClient);
        try {
            List<GetPaymentTypesResponse> result = apiInstance.getAllPaymentTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentTypeApi#getAllPaymentTypes");
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

[**List&lt;GetPaymentTypesResponse&gt;**](GetPaymentTypesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOnePaymentType

> GetPaymentTypesPaymentTypeIdResponse retrieveOnePaymentType(paymentTypeId)

Retrieve a Payment Type

Retrieves a payment type

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PaymentTypeApi;

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

        PaymentTypeApi apiInstance = new PaymentTypeApi(defaultClient);
        Long paymentTypeId = 56L; // Long | paymentTypeId
        try {
            GetPaymentTypesPaymentTypeIdResponse result = apiInstance.retrieveOnePaymentType(paymentTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentTypeApi#retrieveOnePaymentType");
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
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**GetPaymentTypesPaymentTypeIdResponse**](GetPaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updatePaymentType

> PutPaymentTypesPaymentTypeIdResponse updatePaymentType(paymentTypeId, putPaymentTypesPaymentTypeIdRequest)

Update a Payment Type

Updates a Payment Type

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PaymentTypeApi;

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

        PaymentTypeApi apiInstance = new PaymentTypeApi(defaultClient);
        Long paymentTypeId = 56L; // Long | paymentTypeId
        PutPaymentTypesPaymentTypeIdRequest putPaymentTypesPaymentTypeIdRequest = new PutPaymentTypesPaymentTypeIdRequest(); // PutPaymentTypesPaymentTypeIdRequest | 
        try {
            PutPaymentTypesPaymentTypeIdResponse result = apiInstance.updatePaymentType(paymentTypeId, putPaymentTypesPaymentTypeIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentTypeApi#updatePaymentType");
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
 **paymentTypeId** | **Long**| paymentTypeId |
 **putPaymentTypesPaymentTypeIdRequest** | [**PutPaymentTypesPaymentTypeIdRequest**](PutPaymentTypesPaymentTypeIdRequest.md)|  |

### Return type

[**PutPaymentTypesPaymentTypeIdResponse**](PutPaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

