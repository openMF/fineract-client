# TellerCashManagementApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
[**getCashierData**](TellerCashManagementApi.md#getCashierData) | **GET** tellers/{tellerId}/cashiers | List Cashiers
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


<a name="allocateCashToCashier"></a>
# **allocateCashToCashier**
> PostTellersTellerIdCashiersCashierIdAllocateResponse allocateCashToCashier(tellerId, cashierId, body)

Allocate Cash To Cashier

Mandatory Fields:  Date, Amount, Currency, Notes/Comments

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
PostTellersTellerIdCashiersCashierIdAllocateRequest body = new PostTellersTellerIdCashiersCashierIdAllocateRequest(); // PostTellersTellerIdCashiersCashierIdAllocateRequest | body
try {
    PostTellersTellerIdCashiersCashierIdAllocateResponse result = apiInstance.allocateCashToCashier(tellerId, cashierId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#allocateCashToCashier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PostTellersTellerIdCashiersCashierIdAllocateRequest**](PostTellersTellerIdCashiersCashierIdAllocateRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersCashierIdAllocateResponse**](PostTellersTellerIdCashiersCashierIdAllocateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="createCashier"></a>
# **createCashier**
> PostTellersTellerIdCashiersResponse createCashier(tellerId, body)

Create Cashiers

Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
PostTellersTellerIdCashiersRequest body = new PostTellersTellerIdCashiersRequest(); // PostTellersTellerIdCashiersRequest | body
try {
    PostTellersTellerIdCashiersResponse result = apiInstance.createCashier(tellerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#createCashier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |
 **body** | [**PostTellersTellerIdCashiersRequest**](PostTellersTellerIdCashiersRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersResponse**](PostTellersTellerIdCashiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTeller"></a>
# **createTeller**
> PostTellersResponse createTeller(body)

Create teller

Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
PostTellersRequest body = new PostTellersRequest(); // PostTellersRequest | body
try {
    PostTellersResponse result = apiInstance.createTeller(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#createTeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTellersRequest**](PostTellersRequest.md)| body |

### Return type

[**PostTellersResponse**](PostTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCashier"></a>
# **deleteCashier**
> DeleteTellersTellerIdCashiersCashierIdResponse deleteCashier(tellerId, cashierId)

Delete Cashier



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
try {
    DeleteTellersTellerIdCashiersCashierIdResponse result = apiInstance.deleteCashier(tellerId, cashierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#deleteCashier");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="deleteTeller"></a>
# **deleteTeller**
> String deleteTeller(tellerId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
try {
    String result = apiInstance.deleteTeller(tellerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#deleteTeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findCashierData"></a>
# **findCashierData**
> GetTellersTellerIdCashiersCashierIdResponse findCashierData(tellerId, cashierId)

Retrieve a cashier



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
try {
    GetTellersTellerIdCashiersCashierIdResponse result = apiInstance.findCashierData(tellerId, cashierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#findCashierData");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findTeller"></a>
# **findTeller**
> GetTellersResponse findTeller(tellerId)

Retrieve tellers



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
try {
    GetTellersResponse result = apiInstance.findTeller(tellerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#findTeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersResponse**](GetTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findTransactionData"></a>
# **findTransactionData**
> String findTransactionData(tellerId, transactionId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long transactionId = 789L; // Long | transactionId
try {
    String result = apiInstance.findTransactionData(tellerId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#findTransactionData");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierData"></a>
# **getCashierData**
> GetTellersTellerIdCashiersResponse getCashierData(tellerId, fromdate, todate)

List Cashiers



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
String fromdate = "fromdate_example"; // String | fromdate
String todate = "todate_example"; // String | todate
try {
    GetTellersTellerIdCashiersResponse result = apiInstance.getCashierData(tellerId, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getCashierData");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierTemplate"></a>
# **getCashierTemplate**
> GetTellersTellerIdCashiersTemplateResponse getCashierTemplate(tellerId)

Find Cashiers



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
try {
    GetTellersTellerIdCashiersTemplateResponse result = apiInstance.getCashierTemplate(tellerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getCashierTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersTellerIdCashiersTemplateResponse**](GetTellersTellerIdCashiersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierTxnTemplate"></a>
# **getCashierTxnTemplate**
> GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse getCashierTxnTemplate(tellerId, cashierId)

Retrieve Cashier Transaction Template



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
try {
    GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse result = apiInstance.getCashierTxnTemplate(tellerId, cashierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getCashierTxnTemplate");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getJournalData"></a>
# **getJournalData**
> String getJournalData(tellerId, cashierId, dateRange)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
String dateRange = "dateRange_example"; // String | dateRange
try {
    String result = apiInstance.getJournalData(tellerId, cashierId, dateRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getJournalData");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTellerData"></a>
# **getTellerData**
> List&lt;GetTellersResponse&gt; getTellerData(officeId)

List all tellers

Retrieves list tellers

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long officeId = 789L; // Long | officeId
try {
    List<GetTellersResponse> result = apiInstance.getTellerData(officeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getTellerData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]

### Return type

[**List&lt;GetTellersResponse&gt;**](GetTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTransactionData"></a>
# **getTransactionData**
> String getTransactionData(tellerId, dateRange)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
String dateRange = "dateRange_example"; // String | dateRange
try {
    String result = apiInstance.getTransactionData(tellerId, dateRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#getTransactionData");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTransactionsForCashier"></a>
# **getTransactionsForCashier**
> List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt; getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Retrieve Cashier Transaction



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
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
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionsWtihSummaryForCashier"></a>
# **getTransactionsWtihSummaryForCashier**
> GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Transactions Wtih Summary For Cashier



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
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
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settleCashFromCashier"></a>
# **settleCashFromCashier**
> PostTellersTellerIdCashiersCashierIdSettleResponse settleCashFromCashier(tellerId, cashierId, body)

Settle Cash From Cashier

Mandatory Fields Date, Amount, Currency, Notes/Comments

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
PostTellersTellerIdCashiersCashierIdSettleRequest body = new PostTellersTellerIdCashiersCashierIdSettleRequest(); // PostTellersTellerIdCashiersCashierIdSettleRequest | body
try {
    PostTellersTellerIdCashiersCashierIdSettleResponse result = apiInstance.settleCashFromCashier(tellerId, cashierId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#settleCashFromCashier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PostTellersTellerIdCashiersCashierIdSettleRequest**](PostTellersTellerIdCashiersCashierIdSettleRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersCashierIdSettleResponse**](PostTellersTellerIdCashiersCashierIdSettleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="updateCashier"></a>
# **updateCashier**
> PutTellersTellerIdCashiersCashierIdResponse updateCashier(tellerId, cashierId, body)

Update Cashier



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
Long cashierId = 789L; // Long | cashierId
PutTellersTellerIdCashiersCashierIdRequest body = new PutTellersTellerIdCashiersCashierIdRequest(); // PutTellersTellerIdCashiersCashierIdRequest | body
try {
    PutTellersTellerIdCashiersCashierIdResponse result = apiInstance.updateCashier(tellerId, cashierId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#updateCashier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PutTellersTellerIdCashiersCashierIdRequest**](PutTellersTellerIdCashiersCashierIdRequest.md)| body |

### Return type

[**PutTellersTellerIdCashiersCashierIdResponse**](PutTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTeller"></a>
# **updateTeller**
> PutTellersResponse updateTeller(tellerId, body)

Update teller



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TellerCashManagementApi;


TellerCashManagementApi apiInstance = new TellerCashManagementApi();
Long tellerId = 789L; // Long | tellerId
PutTellersRequest body = new PutTellersRequest(); // PutTellersRequest | body
try {
    PutTellersResponse result = apiInstance.updateTeller(tellerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TellerCashManagementApi#updateTeller");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tellerId** | **Long**| tellerId |
 **body** | [**PutTellersRequest**](PutTellersRequest.md)| body |

### Return type

[**PutTellersResponse**](PutTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

