# SelfSavingsAccountApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modifySavingsAccountApplication**](SelfSavingsAccountApi.md#modifySavingsAccountApplication) | **PUT** self/savingsaccounts/{accountId} | 
[**retrieveAllSavingsAccountCharges**](SelfSavingsAccountApi.md#retrieveAllSavingsAccountCharges) | **GET** self/savingsaccounts/{accountId}/charges | List Savings Charges
[**retrieveSavings**](SelfSavingsAccountApi.md#retrieveSavings) | **GET** self/savingsaccounts/{accountId} | Retrieve a savings account
[**retrieveSavingsAccountCharge**](SelfSavingsAccountApi.md#retrieveSavingsAccountCharge) | **GET** self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveSavingsTransaction**](SelfSavingsAccountApi.md#retrieveSavingsTransaction) | **GET** self/savingsaccounts/{accountId}/transactions/{transactionId} | Retrieve Savings Account Transaction
[**submitSavingsAccountApplication**](SelfSavingsAccountApi.md#submitSavingsAccountApplication) | **POST** self/savingsaccounts | 
[**template**](SelfSavingsAccountApi.md#template) | **GET** self/savingsaccounts/template | 


<a name="modifySavingsAccountApplication"></a>
# **modifySavingsAccountApplication**
> String modifySavingsAccountApplication(accountId, command, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long accountId = 789L; // Long | 
String command = "command_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.modifySavingsAccountApplication(accountId, command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#modifySavingsAccountApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**|  |
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllSavingsAccountCharges"></a>
# **retrieveAllSavingsAccountCharges**
> List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges(accountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long accountId = 789L; // Long | accountId
String chargeStatus = "all"; // String | chargeStatus
try {
    List<GetSelfSavingsAccountsAccountIdChargesResponse> result = apiInstance.retrieveAllSavingsAccountCharges(accountId, chargeStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#retrieveAllSavingsAccountCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;**](GetSelfSavingsAccountsAccountIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavings"></a>
# **retrieveSavings**
> GetSelfSavingsAccountsResponse retrieveSavings(accountId, chargeStatus)

Retrieve a savings account

Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long accountId = 789L; // Long | accountId
String chargeStatus = "all"; // String | chargeStatus
try {
    GetSelfSavingsAccountsResponse result = apiInstance.retrieveSavings(accountId, chargeStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetSelfSavingsAccountsResponse**](GetSelfSavingsAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavingsAccountCharge"></a>
# **retrieveSavingsAccountCharge**
> GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(accountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long accountId = 789L; // Long | accountId
Long savingsAccountChargeId = 789L; // Long | savingsAccountChargeId
try {
    GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.retrieveSavingsAccountCharge(accountId, savingsAccountChargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse**](GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavingsTransaction"></a>
# **retrieveSavingsTransaction**
> GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse retrieveSavingsTransaction(accountId, transactionId)

Retrieve Savings Account Transaction

Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long accountId = 789L; // Long | accountId
Long transactionId = 789L; // Long | transactionId
try {
    GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse result = apiInstance.retrieveSavingsTransaction(accountId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavingsTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse**](GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSavingsAccountApplication"></a>
# **submitSavingsAccountApplication**
> String submitSavingsAccountApplication(command, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
String command = "command_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.submitSavingsAccountApplication(command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#submitSavingsAccountApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> String template(clientId, productId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSavingsAccountApi;


SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi();
Long clientId = 789L; // Long | 
Long productId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.template(clientId, productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSavingsAccountApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

