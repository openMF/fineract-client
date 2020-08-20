# RecurringDepositAccountTransactionsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleTransactionCommands**](RecurringDepositAccountTransactionsApi.md#handleTransactionCommands) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Adjust Transaction | Undo transaction
[**retrieveOne**](RecurringDepositAccountTransactionsApi.md#retrieveOne) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Retrieve Recurring Deposit Account Transaction
[**retrieveTemplate**](RecurringDepositAccountTransactionsApi.md#retrieveTemplate) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/template | Retrieve Recurring Deposit Account Transaction Template
[**transaction**](RecurringDepositAccountTransactionsApi.md#transaction) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions | Deposit Transaction | Withdrawal Transaction


<a name="handleTransactionCommands"></a>
# **handleTransactionCommands**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse handleTransactionCommands(recurringDepositAccountId, transactionId, body, command)

Adjust Transaction | Undo transaction

Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositAccountTransactionsApi;


RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi();
Long recurringDepositAccountId = 789L; // Long | recurringDepositAccountId
Long transactionId = 789L; // Long | transactionId
PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = new PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest(); // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | body
String command = "command_example"; // String | command
try {
    PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse result = apiInstance.handleTransactionCommands(recurringDepositAccountId, transactionId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#handleTransactionCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse retrieveOne(recurringDepositAccountId, transactionId)

Retrieve Recurring Deposit Account Transaction

Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositAccountTransactionsApi;


RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi();
Long recurringDepositAccountId = 789L; // Long | recurringDepositAccountId
Long transactionId = 789L; // Long | transactionId
try {
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse result = apiInstance.retrieveOne(recurringDepositAccountId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse retrieveTemplate(recurringDepositAccountId, command)

Retrieve Recurring Deposit Account Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositAccountTransactionsApi;


RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi();
Long recurringDepositAccountId = 789L; // Long | recurringDepositAccountId
String command = "command_example"; // String | command
try {
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse result = apiInstance.retrieveTemplate(recurringDepositAccountId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **command** | **String**| command | [optional]

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transaction"></a>
# **transaction**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse transaction(recurringDepositAccountId, body, command)

Deposit Transaction | Withdrawal Transaction

Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositAccountTransactionsApi;


RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi();
Long recurringDepositAccountId = 789L; // Long | recurringDepositAccountId
PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = new PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest(); // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | body
String command = "command_example"; // String | command
try {
    PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse result = apiInstance.transaction(recurringDepositAccountId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#transaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

