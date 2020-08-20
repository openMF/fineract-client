# SavingsAccountApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](SavingsAccountApi.md#delete) | **DELETE** savingsaccounts/{accountId} | Delete a savings application
[**getSavingsTemplate**](SavingsAccountApi.md#getSavingsTemplate) | **GET** savingsaccounts/downloadtemplate | 
[**getSavingsTransactionTemplate**](SavingsAccountApi.md#getSavingsTransactionTemplate) | **GET** savingsaccounts/transactions/downloadtemplate | 
[**handleCommands**](SavingsAccountApi.md#handleCommands) | **POST** savingsaccounts/{accountId} | Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
[**postSavingsTemplate**](SavingsAccountApi.md#postSavingsTemplate) | **POST** savingsaccounts/uploadtemplate | 
[**postSavingsTransactionTemplate**](SavingsAccountApi.md#postSavingsTransactionTemplate) | **POST** savingsaccounts/transactions/uploadtemplate | 
[**retrieveAll**](SavingsAccountApi.md#retrieveAll) | **GET** savingsaccounts | List savings applications/accounts
[**retrieveOne**](SavingsAccountApi.md#retrieveOne) | **GET** savingsaccounts/{accountId} | Retrieve a savings application/account
[**submitApplication**](SavingsAccountApi.md#submitApplication) | **POST** savingsaccounts | Submit new savings application
[**template**](SavingsAccountApi.md#template) | **GET** savingsaccounts/template | Retrieve Savings Account Template
[**update**](SavingsAccountApi.md#update) | **PUT** savingsaccounts/{accountId} | Modify a savings application | Modify savings account withhold tax applicability


<a name="delete"></a>
# **delete**
> DeleteSavingsAccountsAccountIdResponse delete(accountId)

Delete a savings application

At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long accountId = 789L; // Long | accountId
try {
    DeleteSavingsAccountsAccountIdResponse result = apiInstance.delete(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |

### Return type

[**DeleteSavingsAccountsAccountIdResponse**](DeleteSavingsAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSavingsTemplate"></a>
# **getSavingsTemplate**
> getSavingsTemplate(officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getSavingsTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#getSavingsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="getSavingsTransactionTemplate"></a>
# **getSavingsTransactionTemplate**
> getSavingsTransactionTemplate(officeId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long officeId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getSavingsTransactionTemplate(officeId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#getSavingsTransactionTemplate");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="handleCommands"></a>
# **handleCommands**
> PostSavingsAccountsAccountIdResponse handleCommands(accountId, body, command)

Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions

Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean value, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long accountId = 789L; // Long | accountId
PostSavingsAccountsAccountIdRequest body = new PostSavingsAccountsAccountIdRequest(); // PostSavingsAccountsAccountIdRequest | body
String command = "command_example"; // String | command
try {
    PostSavingsAccountsAccountIdResponse result = apiInstance.handleCommands(accountId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **body** | [**PostSavingsAccountsAccountIdRequest**](PostSavingsAccountsAccountIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostSavingsAccountsAccountIdResponse**](PostSavingsAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSavingsTemplate"></a>
# **postSavingsTemplate**
> String postSavingsTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postSavingsTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#postSavingsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="postSavingsTransactionTemplate"></a>
# **postSavingsTransactionTemplate**
> String postSavingsTransactionTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postSavingsTransactionTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#postSavingsTransactionTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retrieveAll"></a>
# **retrieveAll**
> GetSavingsAccountsResponse retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder)

List savings applications/accounts

Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
String externalId = "externalId_example"; // String | externalId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    GetSavingsAccountsResponse result = apiInstance.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetSavingsAccountsResponse**](GetSavingsAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetSavingsAccountsAccountIdResponse retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus)

Retrieve a savings application/account

Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long accountId = 789L; // Long | accountId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
String chargeStatus = "all"; // String | chargeStatus
try {
    GetSavingsAccountsAccountIdResponse result = apiInstance.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetSavingsAccountsAccountIdResponse**](GetSavingsAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitApplication"></a>
# **submitApplication**
> PostSavingsAccountsResponse submitApplication(body)

Submit new savings application

Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
PostSavingsAccountsRequest body = new PostSavingsAccountsRequest(); // PostSavingsAccountsRequest | body
try {
    PostSavingsAccountsResponse result = apiInstance.submitApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#submitApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSavingsAccountsRequest**](PostSavingsAccountsRequest.md)| body |

### Return type

[**PostSavingsAccountsResponse**](PostSavingsAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetSavingsAccountsTemplateResponse template(clientId, groupId, productId, staffInSelectedOfficeOnly)

Retrieve Savings Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long clientId = 789L; // Long | clientId
Long groupId = 789L; // Long | groupId
Long productId = 789L; // Long | productId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetSavingsAccountsTemplateResponse result = apiInstance.template(clientId, groupId, productId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **groupId** | **Long**| groupId | [optional]
 **productId** | **Long**| productId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetSavingsAccountsTemplateResponse**](GetSavingsAccountsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutSavingsAccountsAccountIdResponse update(accountId, body, command)

Modify a savings application | Modify savings account withhold tax applicability

Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsAccountApi;


SavingsAccountApi apiInstance = new SavingsAccountApi();
Long accountId = 789L; // Long | accountId
PutSavingsAccountsAccountIdRequest body = new PutSavingsAccountsAccountIdRequest(); // PutSavingsAccountsAccountIdRequest | body
String command = "command_example"; // String | command
try {
    PutSavingsAccountsAccountIdResponse result = apiInstance.update(accountId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsAccountApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **body** | [**PutSavingsAccountsAccountIdRequest**](PutSavingsAccountsAccountIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PutSavingsAccountsAccountIdResponse**](PutSavingsAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

