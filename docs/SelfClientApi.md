# SelfClientApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewClientImage**](SelfClientApi.md#addNewClientImage) | **POST** self/clients/{clientId}/images | 
[**deleteClientImage**](SelfClientApi.md#deleteClientImage) | **DELETE** self/clients/{clientId}/images | 
[**retrieveAll**](SelfClientApi.md#retrieveAll) | **GET** self/clients | List Clients associated to the user
[**retrieveAllClientCharges**](SelfClientApi.md#retrieveAllClientCharges) | **GET** self/clients/{clientId}/charges | List Client Charges
[**retrieveAllClientTransactions**](SelfClientApi.md#retrieveAllClientTransactions) | **GET** self/clients/{clientId}/transactions | List Client Transactions
[**retrieveAssociatedAccounts**](SelfClientApi.md#retrieveAssociatedAccounts) | **GET** self/clients/{clientId}/accounts | Retrieve client accounts overview
[**retrieveClientCharge**](SelfClientApi.md#retrieveClientCharge) | **GET** self/clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveClientTransaction**](SelfClientApi.md#retrieveClientTransaction) | **GET** self/clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction
[**retrieveImage**](SelfClientApi.md#retrieveImage) | **GET** self/clients/{clientId}/images | Retrieve Client Image
[**retrieveObligeeDetails**](SelfClientApi.md#retrieveObligeeDetails) | **GET** self/clients/{clientId}/obligeedetails | 
[**retrieveOne**](SelfClientApi.md#retrieveOne) | **GET** self/clients/{clientId} | Retrieve a Client


<a name="addNewClientImage"></a>
# **addNewClientImage**
> String addNewClientImage(clientId, contentLength, file)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | 
Long contentLength = 789L; // Long | 
File file = new File("/path/to/file.txt"); // File | 
try {
    String result = apiInstance.addNewClientImage(clientId, contentLength, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#addNewClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |
 **contentLength** | **Long**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteClientImage"></a>
# **deleteClientImage**
> String deleteClientImage(clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.deleteClientImage(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#deleteClientImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetSelfClientsResponse retrieveAll(displayName, firstName, lastName, offset, limit, orderBy, sortOrder)

List Clients associated to the user

The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
String displayName = "displayName_example"; // String | displayName
String firstName = "firstName_example"; // String | firstName
String lastName = "lastName_example"; // String | lastName
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    GetSelfClientsResponse result = apiInstance.retrieveAll(displayName, firstName, lastName, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **displayName** | **String**| displayName | [optional]
 **firstName** | **String**| firstName | [optional]
 **lastName** | **String**| lastName | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetSelfClientsResponse**](GetSelfClientsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientCharges"></a>
# **retrieveAllClientCharges**
> GetSelfClientsClientIdChargesResponse retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
String chargeStatus = "all"; // String | chargeStatus
Boolean pendingPayment = true; // Boolean | pendingPayment
Integer limit = 56; // Integer | limit
Integer offset = 56; // Integer | offset
try {
    GetSelfClientsClientIdChargesResponse result = apiInstance.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveAllClientCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetSelfClientsClientIdChargesResponse**](GetSelfClientsClientIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientTransactions"></a>
# **retrieveAllClientTransactions**
> GetSelfClientsClientIdTransactionsResponse retrieveAllClientTransactions(clientId, offset, limit)

List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    GetSelfClientsClientIdTransactionsResponse result = apiInstance.retrieveAllClientTransactions(clientId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveAllClientTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetSelfClientsClientIdTransactionsResponse**](GetSelfClientsClientIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAssociatedAccounts"></a>
# **retrieveAssociatedAccounts**
> GetSelfClientsClientIdAccountsResponse retrieveAssociatedAccounts(clientId)

Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
try {
    GetSelfClientsClientIdAccountsResponse result = apiInstance.retrieveAssociatedAccounts(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveAssociatedAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdAccountsResponse**](GetSelfClientsClientIdAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientCharge"></a>
# **retrieveClientCharge**
> GetSelfClientsClientIdChargesChargeIdResponse retrieveClientCharge(clientId, chargeId)

Retrieve a Client Charge

Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
Long chargeId = 789L; // Long | chargeId
try {
    GetSelfClientsClientIdChargesChargeIdResponse result = apiInstance.retrieveClientCharge(clientId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveClientCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfClientsClientIdChargesChargeIdResponse**](GetSelfClientsClientIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientTransaction"></a>
# **retrieveClientTransaction**
> GetSelfClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction(clientId, transactionId)

Retrieve a Client Transaction

Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
Long transactionId = 789L; // Long | transactionId
try {
    GetSelfClientsClientIdTransactionsTransactionIdResponse result = apiInstance.retrieveClientTransaction(clientId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveClientTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfClientsClientIdTransactionsTransactionIdResponse**](GetSelfClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveImage"></a>
# **retrieveImage**
> retrieveImage(clientId, maxWidth, maxHeight, output)

Retrieve Client Image

Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
Integer maxWidth = maxWidth; // Integer | 
Integer maxHeight = maxHeight; // Integer | 
String output = "output"; // String | 
try {
    apiInstance.retrieveImage(clientId, maxWidth, maxHeight, output);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **maxWidth** | **Integer**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **output** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, text/htmlapplication/json, 
 - **Accept**: text/plain

<a name="retrieveObligeeDetails"></a>
# **retrieveObligeeDetails**
> String retrieveObligeeDetails(clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.retrieveObligeeDetails(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveObligeeDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetSelfClientsClientIdResponse retrieveOne(clientId)

Retrieve a Client

Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfClientApi;


SelfClientApi apiInstance = new SelfClientApi();
Long clientId = 789L; // Long | clientId
try {
    GetSelfClientsClientIdResponse result = apiInstance.retrieveOne(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfClientApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdResponse**](GetSelfClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

