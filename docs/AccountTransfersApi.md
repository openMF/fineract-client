# AccountTransfersApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create4**](AccountTransfersApi.md#create4) | **POST** accounttransfers | Create new Transfer
[**retrieveAll18**](AccountTransfersApi.md#retrieveAll18) | **GET** accounttransfers | List account transfers
[**retrieveOne9**](AccountTransfersApi.md#retrieveOne9) | **GET** accounttransfers/{transferId} | Retrieve account transfer
[**template5**](AccountTransfersApi.md#template5) | **GET** accounttransfers/template | Retrieve Account Transfer Template
[**templateRefundByTransfer**](AccountTransfersApi.md#templateRefundByTransfer) | **GET** accounttransfers/templateRefundByTransfer | Retrieve Refund of an Active Loan by Transfer Template
[**templateRefundByTransferPost**](AccountTransfersApi.md#templateRefundByTransferPost) | **POST** accounttransfers/refundByTransfer | Refund of an Active Loan by Transfer



## create4

> PostAccountTransfersResponse create4(postAccountTransfersRequest)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        PostAccountTransfersRequest postAccountTransfersRequest = new PostAccountTransfersRequest(); // PostAccountTransfersRequest | 
        try {
            PostAccountTransfersResponse result = apiInstance.create4(postAccountTransfersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#create4");
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
 **postAccountTransfersRequest** | [**PostAccountTransfersRequest**](PostAccountTransfersRequest.md)|  |

### Return type

[**PostAccountTransfersResponse**](PostAccountTransfersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll18

> GetAccountTransfersResponse retrieveAll18(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId)

List account transfers

Lists account&#39;s transfers  Example Requests:    accounttransfers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        String sqlSearch = "sqlSearch_example"; // String | sqlSearch
        String externalId = "externalId_example"; // String | externalId
        Integer offset = 56; // Integer | offset
        Integer limit = limit; // Integer | 
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        Long accountDetailId = 56L; // Long | accountDetailId
        try {
            GetAccountTransfersResponse result = apiInstance.retrieveAll18(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#retrieveAll18");
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
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **accountDetailId** | **Long**| accountDetailId | [optional]

### Return type

[**GetAccountTransfersResponse**](GetAccountTransfersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne9

> GetAccountTransfersPageItems retrieveOne9(transferId)

Retrieve account transfer

Retrieves account transfer  Example Requests :    accounttransfers/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        Long transferId = 56L; // Long | transferId
        try {
            GetAccountTransfersPageItems result = apiInstance.retrieveOne9(transferId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#retrieveOne9");
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
 **transferId** | **Long**| transferId |

### Return type

[**GetAccountTransfersPageItems**](GetAccountTransfersPageItems.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template5

> GetAccountTransfersTemplateResponse template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Account Transfer Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        Long fromOfficeId = 56L; // Long | fromOfficeId
        Long fromClientId = 56L; // Long | fromClientId
        Long fromAccountId = 56L; // Long | fromAccountId
        Integer fromAccountType = 56; // Integer | fromAccountType
        Long toOfficeId = 56L; // Long | toOfficeId
        Long toClientId = 56L; // Long | toClientId
        Long toAccountId = 56L; // Long | toAccountId
        Integer toAccountType = 56; // Integer | toAccountType
        try {
            GetAccountTransfersTemplateResponse result = apiInstance.template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#template5");
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
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateResponse**](GetAccountTransfersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## templateRefundByTransfer

> GetAccountTransfersTemplateRefundByTransferResponse templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Refund of an Active Loan by Transfer Template

Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        Long fromOfficeId = 56L; // Long | fromOfficeId
        Long fromClientId = 56L; // Long | fromClientId
        Long fromAccountId = 56L; // Long | fromAccountId
        Integer fromAccountType = 56; // Integer | fromAccountType
        Long toOfficeId = 56L; // Long | toOfficeId
        Long toClientId = 56L; // Long | toClientId
        Long toAccountId = 56L; // Long | toAccountId
        Integer toAccountType = 56; // Integer | toAccountType
        try {
            GetAccountTransfersTemplateRefundByTransferResponse result = apiInstance.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#templateRefundByTransfer");
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
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateRefundByTransferResponse**](GetAccountTransfersTemplateRefundByTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## templateRefundByTransferPost

> PostAccountTransfersRefundByTransferResponse templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest)

Refund of an Active Loan by Transfer

Ability to refund an active loan by transferring to a savings account.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountTransfersApi;

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

        AccountTransfersApi apiInstance = new AccountTransfersApi(defaultClient);
        PostAccountTransfersRefundByTransferRequest postAccountTransfersRefundByTransferRequest = new PostAccountTransfersRefundByTransferRequest(); // PostAccountTransfersRefundByTransferRequest | 
        try {
            PostAccountTransfersRefundByTransferResponse result = apiInstance.templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountTransfersApi#templateRefundByTransferPost");
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
 **postAccountTransfersRefundByTransferRequest** | [**PostAccountTransfersRefundByTransferRequest**](PostAccountTransfersRefundByTransferRequest.md)|  |

### Return type

[**PostAccountTransfersRefundByTransferResponse**](PostAccountTransfersRefundByTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

