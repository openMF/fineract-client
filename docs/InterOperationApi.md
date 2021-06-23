# InterOperationApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuote**](InterOperationApi.md#createQuote) | **POST** interoperation/quotes | Calculate Interoperation Quote
[**createTransactionRequest**](InterOperationApi.md#createTransactionRequest) | **POST** interoperation/requests | Allow Interoperation Transaction Request
[**deleteAccountIdentifier**](InterOperationApi.md#deleteAccountIdentifier) | **DELETE** interoperation/parties/{idType}/{idValue} | Allow Interoperation Identifier registration
[**deleteAccountIdentifier1**](InterOperationApi.md#deleteAccountIdentifier1) | **DELETE** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Allow Interoperation Identifier registration
[**disburseLoan**](InterOperationApi.md#disburseLoan) | **POST** interoperation/transactions/{accountId}/disburse | Disburse Loan by Account Id
[**getAccountByIdentifier**](InterOperationApi.md#getAccountByIdentifier) | **GET** interoperation/parties/{idType}/{idValue} | Query Interoperation Account by secondary identifier
[**getAccountByIdentifier1**](InterOperationApi.md#getAccountByIdentifier1) | **GET** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Query Interoperation Account by secondary identifier
[**getAccountDetails**](InterOperationApi.md#getAccountDetails) | **GET** interoperation/accounts/{accountId} | Query Interoperation Account details
[**getAccountIdentifiers**](InterOperationApi.md#getAccountIdentifiers) | **GET** interoperation/accounts/{accountId}/identifiers | Query Interoperation secondary identifiers by Account Id
[**getAccountTransactions**](InterOperationApi.md#getAccountTransactions) | **GET** interoperation/accounts/{accountId}/transactions | Query transactions by Account Id
[**getClientKyc**](InterOperationApi.md#getClientKyc) | **GET** interoperation/accounts/{accountId}/kyc | Query KYC by Account Id
[**getQuote**](InterOperationApi.md#getQuote) | **GET** interoperation/transactions/{transactionCode}/quotes/{quoteCode} | Query Interoperation Quote
[**getTransactionRequest**](InterOperationApi.md#getTransactionRequest) | **GET** interoperation/transactions/{transactionCode}/requests/{requestCode} | Query Interoperation Transaction Request
[**getTransfer**](InterOperationApi.md#getTransfer) | **GET** interoperation/transactions/{transactionCode}/transfers/{transferCode} | Query Interoperation Transfer
[**health**](InterOperationApi.md#health) | **GET** interoperation/health | Query Interoperation Health Request
[**performTransfer**](InterOperationApi.md#performTransfer) | **POST** interoperation/transfers | Prepare Interoperation Transfer
[**registerAccountIdentifier**](InterOperationApi.md#registerAccountIdentifier) | **POST** interoperation/parties/{idType}/{idValue} | Interoperation Identifier registration
[**registerAccountIdentifier1**](InterOperationApi.md#registerAccountIdentifier1) | **POST** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Interoperation Identifier registration



## createQuote

> InteropQuoteResponseData createQuote(interopQuoteRequestData)

Calculate Interoperation Quote

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        InteropQuoteRequestData interopQuoteRequestData = new InteropQuoteRequestData(); // InteropQuoteRequestData | 
        try {
            InteropQuoteResponseData result = apiInstance.createQuote(interopQuoteRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#createQuote");
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
 **interopQuoteRequestData** | [**InteropQuoteRequestData**](InteropQuoteRequestData.md)|  |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createTransactionRequest

> InteropTransactionRequestResponseData createTransactionRequest(interopTransactionRequestData)

Allow Interoperation Transaction Request

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        InteropTransactionRequestData interopTransactionRequestData = new InteropTransactionRequestData(); // InteropTransactionRequestData | 
        try {
            InteropTransactionRequestResponseData result = apiInstance.createTransactionRequest(interopTransactionRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#createTransactionRequest");
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
 **interopTransactionRequestData** | [**InteropTransactionRequestData**](InteropTransactionRequestData.md)|  |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteAccountIdentifier

> InteropIdentifierAccountResponseData deleteAccountIdentifier(idType, idValue, interopIdentifierRequestData)

Allow Interoperation Identifier registration

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        InteropIdentifierRequestData interopIdentifierRequestData = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | 
        try {
            InteropIdentifierAccountResponseData result = apiInstance.deleteAccountIdentifier(idType, idValue, interopIdentifierRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#deleteAccountIdentifier");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |
 **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteAccountIdentifier1

> InteropIdentifierAccountResponseData deleteAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData)

Allow Interoperation Identifier registration

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        String subIdOrType = "subIdOrType_example"; // String | subIdOrType
        InteropIdentifierRequestData interopIdentifierRequestData = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | 
        try {
            InteropIdentifierAccountResponseData result = apiInstance.deleteAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#deleteAccountIdentifier1");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |
 **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## disburseLoan

> String disburseLoan(accountId)

Disburse Loan by Account Id

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String accountId = "accountId_example"; // String | accountId
        try {
            String result = apiInstance.disburseLoan(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#disburseLoan");
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
 **accountId** | **String**| accountId |

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


## getAccountByIdentifier

> InteropIdentifierAccountResponseData getAccountByIdentifier(idType, idValue)

Query Interoperation Account by secondary identifier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        try {
            InteropIdentifierAccountResponseData result = apiInstance.getAccountByIdentifier(idType, idValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getAccountByIdentifier");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAccountByIdentifier1

> InteropIdentifierAccountResponseData getAccountByIdentifier1(idType, idValue, subIdOrType)

Query Interoperation Account by secondary identifier

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        String subIdOrType = "subIdOrType_example"; // String | subIdOrType
        try {
            InteropIdentifierAccountResponseData result = apiInstance.getAccountByIdentifier1(idType, idValue, subIdOrType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getAccountByIdentifier1");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAccountDetails

> InteropAccountData getAccountDetails(accountId)

Query Interoperation Account details

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String accountId = "accountId_example"; // String | accountId
        try {
            InteropAccountData result = apiInstance.getAccountDetails(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getAccountDetails");
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
 **accountId** | **String**| accountId |

### Return type

[**InteropAccountData**](InteropAccountData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAccountIdentifiers

> InteropIdentifiersResponseData getAccountIdentifiers(accountId)

Query Interoperation secondary identifiers by Account Id

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String accountId = "accountId_example"; // String | accountId
        try {
            InteropIdentifiersResponseData result = apiInstance.getAccountIdentifiers(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getAccountIdentifiers");
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
 **accountId** | **String**| accountId |

### Return type

[**InteropIdentifiersResponseData**](InteropIdentifiersResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAccountTransactions

> InteropTransactionsData getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime)

Query transactions by Account Id

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String accountId = "accountId_example"; // String | accountId
        Boolean debit = true; // Boolean | debit
        Boolean credit = false; // Boolean | credit
        String fromBookingDateTime = "fromBookingDateTime_example"; // String | fromBookingDateTime
        String toBookingDateTime = "toBookingDateTime_example"; // String | toBookingDateTime
        try {
            InteropTransactionsData result = apiInstance.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getAccountTransactions");
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
 **accountId** | **String**| accountId |
 **debit** | **Boolean**| debit | [optional] [default to true]
 **credit** | **Boolean**| credit | [optional] [default to false]
 **fromBookingDateTime** | **String**| fromBookingDateTime | [optional]
 **toBookingDateTime** | **String**| toBookingDateTime | [optional]

### Return type

[**InteropTransactionsData**](InteropTransactionsData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getClientKyc

> InteropKycResponseData getClientKyc(accountId)

Query KYC by Account Id

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String accountId = "accountId_example"; // String | accountId
        try {
            InteropKycResponseData result = apiInstance.getClientKyc(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getClientKyc");
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
 **accountId** | **String**| accountId |

### Return type

[**InteropKycResponseData**](InteropKycResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getQuote

> InteropQuoteResponseData getQuote(transactionCode, quoteCode)

Query Interoperation Quote

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String transactionCode = "transactionCode_example"; // String | transactionCode
        String quoteCode = "quoteCode_example"; // String | quoteCode
        try {
            InteropQuoteResponseData result = apiInstance.getQuote(transactionCode, quoteCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getQuote");
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
 **transactionCode** | **String**| transactionCode |
 **quoteCode** | **String**| quoteCode |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTransactionRequest

> InteropTransactionRequestResponseData getTransactionRequest(transactionCode, requestCode)

Query Interoperation Transaction Request

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String transactionCode = "transactionCode_example"; // String | transactionCode
        String requestCode = "requestCode_example"; // String | requestCode
        try {
            InteropTransactionRequestResponseData result = apiInstance.getTransactionRequest(transactionCode, requestCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getTransactionRequest");
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
 **transactionCode** | **String**| transactionCode |
 **requestCode** | **String**| requestCode |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTransfer

> InteropTransferResponseData getTransfer(transactionCode, transferCode)

Query Interoperation Transfer

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String transactionCode = "transactionCode_example"; // String | transactionCode
        String transferCode = "transferCode_example"; // String | transferCode
        try {
            InteropTransferResponseData result = apiInstance.getTransfer(transactionCode, transferCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#getTransfer");
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
 **transactionCode** | **String**| transactionCode |
 **transferCode** | **String**| transferCode |

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## health

> health()

Query Interoperation Health Request

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        try {
            apiInstance.health();
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#health");
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

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## performTransfer

> InteropTransferResponseData performTransfer(interopTransferRequestData, action)

Prepare Interoperation Transfer

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        InteropTransferRequestData interopTransferRequestData = new InteropTransferRequestData(); // InteropTransferRequestData | 
        String action = "action_example"; // String | action
        try {
            InteropTransferResponseData result = apiInstance.performTransfer(interopTransferRequestData, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#performTransfer");
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
 **interopTransferRequestData** | [**InteropTransferRequestData**](InteropTransferRequestData.md)|  |
 **action** | **String**| action | [optional]

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## registerAccountIdentifier

> InteropIdentifierAccountResponseData registerAccountIdentifier(idType, idValue, interopIdentifierRequestData)

Interoperation Identifier registration

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        InteropIdentifierRequestData interopIdentifierRequestData = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | 
        try {
            InteropIdentifierAccountResponseData result = apiInstance.registerAccountIdentifier(idType, idValue, interopIdentifierRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#registerAccountIdentifier");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |
 **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## registerAccountIdentifier1

> InteropIdentifierAccountResponseData registerAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData)

Interoperation Identifier registration

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterOperationApi;

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

        InterOperationApi apiInstance = new InterOperationApi(defaultClient);
        String idType = "idType_example"; // String | idType
        String idValue = "idValue_example"; // String | idValue
        String subIdOrType = "subIdOrType_example"; // String | subIdOrType
        InteropIdentifierRequestData interopIdentifierRequestData = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | 
        try {
            InteropIdentifierAccountResponseData result = apiInstance.registerAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterOperationApi#registerAccountIdentifier1");
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
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |
 **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

