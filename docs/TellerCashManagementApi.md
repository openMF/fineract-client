# TellerCashManagementApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateCashToCashier**](TellerCashManagementApi.md#allocateCashToCashier) | **POST** tellers/{tellerId}/cashiers/{cashierId}/allocate | Allocate Cash To Cashier
[**createCashier**](TellerCashManagementApi.md#createCashier) | **POST** tellers/{tellerId}/cashiers | Create Cashiers
[**createTeller**](TellerCashManagementApi.md#createTeller) | **POST** tellers | Create teller
[**deleteCashier**](TellerCashManagementApi.md#deleteCashier) | **DELETE** tellers/{tellerId}/cashiers/{cashierId} | Delete Cashier
[**deleteTeller**](TellerCashManagementApi.md#deleteTeller) | **DELETE** tellers/{tellerId} | 
[**findCashierData**](TellerCashManagementApi.md#findCashierData) | **GET** tellers/{tellerId}/cashiers/{cashierId} | Retrieve a cashier
[**findTeller**](TellerCashManagementApi.md#findTeller) | **GET** tellers/{tellerId} | Retrieve tellers
[**findTransactionData**](TellerCashManagementApi.md#findTransactionData) | **GET** tellers/{tellerId}/transactions/{transactionId} | 
[**getCashierData1**](TellerCashManagementApi.md#getCashierData1) | **GET** tellers/{tellerId}/cashiers | List Cashiers
[**getCashierTemplate**](TellerCashManagementApi.md#getCashierTemplate) | **GET** tellers/{tellerId}/cashiers/template | Find Cashiers
[**getCashierTxnTemplate**](TellerCashManagementApi.md#getCashierTxnTemplate) | **GET** tellers/{tellerId}/cashiers/{cashierId}/transactions/template | Retrieve Cashier Transaction Template
[**getJournalData**](TellerCashManagementApi.md#getJournalData) | **GET** tellers/{tellerId}/journals | 
[**getTellerData**](TellerCashManagementApi.md#getTellerData) | **GET** tellers | List all tellers
[**getTransactionData**](TellerCashManagementApi.md#getTransactionData) | **GET** tellers/{tellerId}/transactions | 
[**getTransactionsForCashier**](TellerCashManagementApi.md#getTransactionsForCashier) | **GET** tellers/{tellerId}/cashiers/{cashierId}/transactions | Retrieve Cashier Transaction
[**getTransactionsWtihSummaryForCashier**](TellerCashManagementApi.md#getTransactionsWtihSummaryForCashier) | **GET** tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions | Transactions Wtih Summary For Cashier
[**settleCashFromCashier**](TellerCashManagementApi.md#settleCashFromCashier) | **POST** tellers/{tellerId}/cashiers/{cashierId}/settle | Settle Cash From Cashier
[**updateCashier**](TellerCashManagementApi.md#updateCashier) | **PUT** tellers/{tellerId}/cashiers/{cashierId} | Update Cashier
[**updateTeller**](TellerCashManagementApi.md#updateTeller) | **PUT** tellers/{tellerId} | Update teller



## allocateCashToCashier

> PostTellersTellerIdCashiersCashierIdAllocateResponse allocateCashToCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdAllocateRequest)

Allocate Cash To Cashier

Mandatory Fields:  Date, Amount, Currency, Notes/Comments

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        PostTellersTellerIdCashiersCashierIdAllocateRequest postTellersTellerIdCashiersCashierIdAllocateRequest = new PostTellersTellerIdCashiersCashierIdAllocateRequest(); // PostTellersTellerIdCashiersCashierIdAllocateRequest | 
        try {
            PostTellersTellerIdCashiersCashierIdAllocateResponse result = apiInstance.allocateCashToCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdAllocateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#allocateCashToCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **postTellersTellerIdCashiersCashierIdAllocateRequest** | [**PostTellersTellerIdCashiersCashierIdAllocateRequest**](PostTellersTellerIdCashiersCashierIdAllocateRequest.md)|  |

### Return type

[**PostTellersTellerIdCashiersCashierIdAllocateResponse**](PostTellersTellerIdCashiersCashierIdAllocateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: text/htmlapplication/json, 
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createCashier

> PostTellersTellerIdCashiersResponse createCashier(tellerId, postTellersTellerIdCashiersRequest)

Create Cashiers

Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        PostTellersTellerIdCashiersRequest postTellersTellerIdCashiersRequest = new PostTellersTellerIdCashiersRequest(); // PostTellersTellerIdCashiersRequest | 
        try {
            PostTellersTellerIdCashiersResponse result = apiInstance.createCashier(tellerId, postTellersTellerIdCashiersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#createCashier");
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
 **tellerId** | **Long**| tellerId |
 **postTellersTellerIdCashiersRequest** | [**PostTellersTellerIdCashiersRequest**](PostTellersTellerIdCashiersRequest.md)|  |

### Return type

[**PostTellersTellerIdCashiersResponse**](PostTellersTellerIdCashiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createTeller

> PostTellersResponse createTeller(postTellersRequest)

Create teller

Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        PostTellersRequest postTellersRequest = new PostTellersRequest(); // PostTellersRequest | 
        try {
            PostTellersResponse result = apiInstance.createTeller(postTellersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#createTeller");
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
 **postTellersRequest** | [**PostTellersRequest**](PostTellersRequest.md)|  |

### Return type

[**PostTellersResponse**](PostTellersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCashier

> DeleteTellersTellerIdCashiersCashierIdResponse deleteCashier(tellerId, cashierId)

Delete Cashier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        try {
            DeleteTellersTellerIdCashiersCashierIdResponse result = apiInstance.deleteCashier(tellerId, cashierId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#deleteCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**DeleteTellersTellerIdCashiersCashierIdResponse**](DeleteTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteTeller

> String deleteTeller(tellerId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        try {
            String result = apiInstance.deleteTeller(tellerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#deleteTeller");
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
 **tellerId** | **Long**| tellerId |

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


## findCashierData

> GetTellersTellerIdCashiersCashierIdResponse findCashierData(tellerId, cashierId)

Retrieve a cashier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        try {
            GetTellersTellerIdCashiersCashierIdResponse result = apiInstance.findCashierData(tellerId, cashierId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#findCashierData");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**GetTellersTellerIdCashiersCashierIdResponse**](GetTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## findTeller

> GetTellersResponse findTeller(tellerId)

Retrieve tellers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        try {
            GetTellersResponse result = apiInstance.findTeller(tellerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#findTeller");
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
 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersResponse**](GetTellersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## findTransactionData

> String findTransactionData(tellerId, transactionId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long transactionId = 56L; // Long | transactionId
        try {
            String result = apiInstance.findTransactionData(tellerId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#findTransactionData");
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
 **tellerId** | **Long**| tellerId |
 **transactionId** | **Long**| transactionId |

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


## getCashierData1

> GetTellersTellerIdCashiersResponse getCashierData1(tellerId, fromdate, todate)

List Cashiers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        String fromdate = "fromdate_example"; // String | fromdate
        String todate = "todate_example"; // String | todate
        try {
            GetTellersTellerIdCashiersResponse result = apiInstance.getCashierData1(tellerId, fromdate, todate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getCashierData1");
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
 **tellerId** | **Long**| tellerId |
 **fromdate** | **String**| fromdate | [optional]
 **todate** | **String**| todate | [optional]

### Return type

[**GetTellersTellerIdCashiersResponse**](GetTellersTellerIdCashiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCashierTemplate

> GetTellersTellerIdCashiersTemplateResponse getCashierTemplate(tellerId)

Find Cashiers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        try {
            GetTellersTellerIdCashiersTemplateResponse result = apiInstance.getCashierTemplate(tellerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getCashierTemplate");
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
 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersTellerIdCashiersTemplateResponse**](GetTellersTellerIdCashiersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCashierTxnTemplate

> GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse getCashierTxnTemplate(tellerId, cashierId)

Retrieve Cashier Transaction Template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        try {
            GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse result = apiInstance.getCashierTxnTemplate(tellerId, cashierId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getCashierTxnTemplate");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse**](GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getJournalData

> String getJournalData(tellerId, cashierId, dateRange)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        String dateRange = "dateRange_example"; // String | dateRange
        try {
            String result = apiInstance.getJournalData(tellerId, cashierId, dateRange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getJournalData");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId | [optional]
 **dateRange** | **String**| dateRange | [optional]

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


## getTellerData

> List&lt;GetTellersResponse&gt; getTellerData(officeId)

List all tellers

Retrieves list tellers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        try {
            List<GetTellersResponse> result = apiInstance.getTellerData(officeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getTellerData");
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
 **officeId** | **Long**| officeId | [optional]

### Return type

[**List&lt;GetTellersResponse&gt;**](GetTellersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTransactionData

> String getTransactionData(tellerId, dateRange)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        String dateRange = "dateRange_example"; // String | dateRange
        try {
            String result = apiInstance.getTransactionData(tellerId, dateRange);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getTransactionData");
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
 **tellerId** | **Long**| tellerId |
 **dateRange** | **String**| dateRange | [optional]

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


## getTransactionsForCashier

> List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt; getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Retrieve Cashier Transaction

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        String currencyCode = "currencyCode_example"; // String | currencyCode
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse> result = apiInstance.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getTransactionsForCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **currencyCode** | **String**| currencyCode | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;**](GetTellersTellerIdCashiersCashiersIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTransactionsWtihSummaryForCashier

> GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Transactions Wtih Summary For Cashier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        String currencyCode = "currencyCode_example"; // String | currencyCode
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse result = apiInstance.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#getTransactionsWtihSummaryForCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **currencyCode** | **String**| currencyCode | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse**](GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## settleCashFromCashier

> PostTellersTellerIdCashiersCashierIdSettleResponse settleCashFromCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdSettleRequest)

Settle Cash From Cashier

Mandatory Fields Date, Amount, Currency, Notes/Comments

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        PostTellersTellerIdCashiersCashierIdSettleRequest postTellersTellerIdCashiersCashierIdSettleRequest = new PostTellersTellerIdCashiersCashierIdSettleRequest(); // PostTellersTellerIdCashiersCashierIdSettleRequest | 
        try {
            PostTellersTellerIdCashiersCashierIdSettleResponse result = apiInstance.settleCashFromCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdSettleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#settleCashFromCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **postTellersTellerIdCashiersCashierIdSettleRequest** | [**PostTellersTellerIdCashiersCashierIdSettleRequest**](PostTellersTellerIdCashiersCashierIdSettleRequest.md)|  |

### Return type

[**PostTellersTellerIdCashiersCashierIdSettleResponse**](PostTellersTellerIdCashiersCashierIdSettleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: text/htmlapplication/json, 
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCashier

> PutTellersTellerIdCashiersCashierIdResponse updateCashier(tellerId, cashierId, putTellersTellerIdCashiersCashierIdRequest)

Update Cashier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        Long cashierId = 56L; // Long | cashierId
        PutTellersTellerIdCashiersCashierIdRequest putTellersTellerIdCashiersCashierIdRequest = new PutTellersTellerIdCashiersCashierIdRequest(); // PutTellersTellerIdCashiersCashierIdRequest | 
        try {
            PutTellersTellerIdCashiersCashierIdResponse result = apiInstance.updateCashier(tellerId, cashierId, putTellersTellerIdCashiersCashierIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#updateCashier");
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
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **putTellersTellerIdCashiersCashierIdRequest** | [**PutTellersTellerIdCashiersCashierIdRequest**](PutTellersTellerIdCashiersCashierIdRequest.md)|  |

### Return type

[**PutTellersTellerIdCashiersCashierIdResponse**](PutTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateTeller

> PutTellersResponse updateTeller(tellerId, putTellersRequest)

Update teller

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TellerCashManagementApi;

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

        TellerCashManagementApi apiInstance = new TellerCashManagementApi(defaultClient);
        Long tellerId = 56L; // Long | tellerId
        PutTellersRequest putTellersRequest = new PutTellersRequest(); // PutTellersRequest | 
        try {
            PutTellersResponse result = apiInstance.updateTeller(tellerId, putTellersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TellerCashManagementApi#updateTeller");
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
 **tellerId** | **Long**| tellerId |
 **putTellersRequest** | [**PutTellersRequest**](PutTellersRequest.md)|  |

### Return type

[**PutTellersResponse**](PutTellersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

