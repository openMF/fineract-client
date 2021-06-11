# JournalEntriesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLJournalEntry**](JournalEntriesApi.md#createGLJournalEntry) | **POST** journalentries | Create \&quot;Balanced\&quot; Journal Entries
[**createReversalJournalEntry**](JournalEntriesApi.md#createReversalJournalEntry) | **POST** journalentries/{transactionId} | Update Running balances for Journal Entries
[**getJournalEntriesTemplate**](JournalEntriesApi.md#getJournalEntriesTemplate) | **GET** journalentries/downloadtemplate | 
[**postJournalEntriesTemplate**](JournalEntriesApi.md#postJournalEntriesTemplate) | **POST** journalentries/uploadtemplate | 
[**retreiveJournalEntryById**](JournalEntriesApi.md#retreiveJournalEntryById) | **GET** journalentries/{journalEntryId} | Retrieve a single Entry
[**retrieveAll1**](JournalEntriesApi.md#retrieveAll1) | **GET** journalentries | List Journal Entries
[**retrieveJournalEntries**](JournalEntriesApi.md#retrieveJournalEntries) | **GET** journalentries/provisioning | 
[**retrieveOpeningBalance**](JournalEntriesApi.md#retrieveOpeningBalance) | **GET** journalentries/openingbalance | 



## createGLJournalEntry

> PostJournalEntriesResponse createGLJournalEntry(command, journalEntryCommand)

Create \&quot;Balanced\&quot; Journal Entries

Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        String command = "command_example"; // String | command
        JournalEntryCommand journalEntryCommand = new JournalEntryCommand(); // JournalEntryCommand | 
        try {
            PostJournalEntriesResponse result = apiInstance.createGLJournalEntry(command, journalEntryCommand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#createGLJournalEntry");
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
 **command** | **String**| command | [optional]
 **journalEntryCommand** | [**JournalEntryCommand**](JournalEntryCommand.md)|  | [optional]

### Return type

[**PostJournalEntriesResponse**](PostJournalEntriesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createReversalJournalEntry

> PostJournalEntriesTransactionIdResponse createReversalJournalEntry(transactionId, command, postJournalEntriesTransactionIdRequest)

Update Running balances for Journal Entries

This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        String transactionId = "transactionId_example"; // String | transactionId
        String command = "command_example"; // String | command
        PostJournalEntriesTransactionIdRequest postJournalEntriesTransactionIdRequest = new PostJournalEntriesTransactionIdRequest(); // PostJournalEntriesTransactionIdRequest | 
        try {
            PostJournalEntriesTransactionIdResponse result = apiInstance.createReversalJournalEntry(transactionId, command, postJournalEntriesTransactionIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#createReversalJournalEntry");
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
 **transactionId** | **String**| transactionId |
 **command** | **String**| command | [optional]
 **postJournalEntriesTransactionIdRequest** | [**PostJournalEntriesTransactionIdRequest**](PostJournalEntriesTransactionIdRequest.md)|  | [optional]

### Return type

[**PostJournalEntriesTransactionIdResponse**](PostJournalEntriesTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getJournalEntriesTemplate

> getJournalEntriesTemplate(officeId, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        Long officeId = 56L; // Long | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getJournalEntriesTemplate(officeId, dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#getJournalEntriesTemplate");
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
 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## postJournalEntriesTemplate

> String postJournalEntriesTemplate(file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postJournalEntriesTemplate(file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#postJournalEntriesTemplate");
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
 **file** | [**FormDataContentDisposition**](FormDataContentDisposition.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retreiveJournalEntryById

> JournalEntryData retreiveJournalEntryById(journalEntryId, runningBalance, transactionDetails)

Retrieve a single Entry

Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        Long journalEntryId = 56L; // Long | journalEntryId
        Boolean runningBalance = true; // Boolean | runningBalance
        Boolean transactionDetails = true; // Boolean | transactionDetails
        try {
            JournalEntryData result = apiInstance.retreiveJournalEntryById(journalEntryId, runningBalance, transactionDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#retreiveJournalEntryById");
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
 **journalEntryId** | **Long**| journalEntryId |
 **runningBalance** | **Boolean**| runningBalance | [optional]
 **transactionDetails** | **Boolean**| transactionDetails | [optional]

### Return type

[**JournalEntryData**](JournalEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll1

> List&lt;JournalEntryData&gt; retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails)

List Journal Entries

The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Long glAccountId = 56L; // Long | glAccountId
        Boolean manualEntriesOnly = true; // Boolean | manualEntriesOnly
        Object fromDate = null; // Object | fromDate
        Object toDate = null; // Object | toDate
        String transactionId = "transactionId_example"; // String | transactionId
        Integer entityType = 56; // Integer | entityType
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        String locale = "locale_example"; // String | locale
        String dateFormat = "dateFormat_example"; // String | dateFormat
        Long loanId = 56L; // Long | loanId
        Long savingsId = 56L; // Long | savingsId
        Boolean runningBalance = true; // Boolean | runningBalance
        Boolean transactionDetails = true; // Boolean | transactionDetails
        try {
            List<JournalEntryData> result = apiInstance.retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#retrieveAll1");
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
 **glAccountId** | **Long**| glAccountId | [optional]
 **manualEntriesOnly** | **Boolean**| manualEntriesOnly | [optional]
 **fromDate** | [**Object**](.md)| fromDate | [optional]
 **toDate** | [**Object**](.md)| toDate | [optional]
 **transactionId** | **String**| transactionId | [optional]
 **entityType** | **Integer**| entityType | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **loanId** | **Long**| loanId | [optional]
 **savingsId** | **Long**| savingsId | [optional]
 **runningBalance** | **Boolean**| runningBalance | [optional]
 **transactionDetails** | **Boolean**| transactionDetails | [optional]

### Return type

[**List&lt;JournalEntryData&gt;**](JournalEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveJournalEntries

> String retrieveJournalEntries(offset, limit, entryId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        Long entryId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveJournalEntries(offset, limit, entryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#retrieveJournalEntries");
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
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **entryId** | **Long**|  | [optional]

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


## retrieveOpeningBalance

> String retrieveOpeningBalance(officeId, currencyCode)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.JournalEntriesApi;

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

        JournalEntriesApi apiInstance = new JournalEntriesApi(defaultClient);
        Long officeId = 56L; // Long | 
        String currencyCode = "currencyCode_example"; // String | 
        try {
            String result = apiInstance.retrieveOpeningBalance(officeId, currencyCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JournalEntriesApi#retrieveOpeningBalance");
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
 **officeId** | **Long**|  | [optional]
 **currencyCode** | **String**|  | [optional]

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

