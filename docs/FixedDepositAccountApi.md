# FixedDepositAccountApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountClosureTemplate**](FixedDepositAccountApi.md#accountClosureTemplate) | **GET** fixeddepositaccounts/{accountId}/template | 
[**delete**](FixedDepositAccountApi.md#delete) | **DELETE** fixeddepositaccounts/{accountId} | Delete a fixed deposit application
[**getFixedDepositTemplate**](FixedDepositAccountApi.md#getFixedDepositTemplate) | **GET** fixeddepositaccounts/downloadtemplate | 
[**getFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#getFixedDepositTransactionTemplate) | **GET** fixeddepositaccounts/transaction/downloadtemplate | 
[**handleCommands**](FixedDepositAccountApi.md#handleCommands) | **POST** fixeddepositaccounts/{accountId} | Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
[**postFixedDepositTemplate**](FixedDepositAccountApi.md#postFixedDepositTemplate) | **POST** fixeddepositaccounts/uploadtemplate | 
[**postFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#postFixedDepositTransactionTemplate) | **POST** fixeddepositaccounts/transaction/uploadtemplate | 
[**retrieveAll**](FixedDepositAccountApi.md#retrieveAll) | **GET** fixeddepositaccounts | List Fixed deposit applications/accounts
[**retrieveOne**](FixedDepositAccountApi.md#retrieveOne) | **GET** fixeddepositaccounts/{accountId} | Retrieve a fixed deposit application/account
[**submitApplication**](FixedDepositAccountApi.md#submitApplication) | **POST** fixeddepositaccounts | Submit new fixed deposit application
[**template**](FixedDepositAccountApi.md#template) | **GET** fixeddepositaccounts/template | Retrieve Fixed Deposit Account Template
[**update**](FixedDepositAccountApi.md#update) | **PUT** fixeddepositaccounts/{accountId} | Modify a fixed deposit application


<a name="accountClosureTemplate"></a>
# **accountClosureTemplate**
> String accountClosureTemplate(accountId, command)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long accountId = 789L; // Long | accountId
String command = "command_example"; // String | command
try {
    String result = apiInstance.accountClosureTemplate(accountId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#accountClosureTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteFixedDepositAccountsAccountIdResponse delete(accountId)

Delete a fixed deposit application

At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long accountId = 789L; // Long | accountId
try {
    DeleteFixedDepositAccountsAccountIdResponse result = apiInstance.delete(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |

### Return type

[**DeleteFixedDepositAccountsAccountIdResponse**](DeleteFixedDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFixedDepositTemplate"></a>
# **getFixedDepositTemplate**
> getFixedDepositTemplate(officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getFixedDepositTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#getFixedDepositTemplate");
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

<a name="getFixedDepositTransactionTemplate"></a>
# **getFixedDepositTransactionTemplate**
> getFixedDepositTransactionTemplate(officeId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long officeId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getFixedDepositTransactionTemplate(officeId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#getFixedDepositTransactionTemplate");
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
> PostFixedDepositAccountsAccountIdResponse handleCommands(accountId, body, command)

Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account

Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long accountId = 789L; // Long | accountId
PostFixedDepositAccountsAccountIdRequest body = new PostFixedDepositAccountsAccountIdRequest(); // PostFixedDepositAccountsAccountIdRequest | body
String command = "command_example"; // String | command
try {
    PostFixedDepositAccountsAccountIdResponse result = apiInstance.handleCommands(accountId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **body** | [**PostFixedDepositAccountsAccountIdRequest**](PostFixedDepositAccountsAccountIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostFixedDepositAccountsAccountIdResponse**](PostFixedDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFixedDepositTemplate"></a>
# **postFixedDepositTemplate**
> String postFixedDepositTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postFixedDepositTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#postFixedDepositTemplate");
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

<a name="postFixedDepositTransactionTemplate"></a>
# **postFixedDepositTransactionTemplate**
> String postFixedDepositTransactionTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postFixedDepositTransactionTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#postFixedDepositTransactionTemplate");
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
> List&lt;GetFixedDepositAccountsResponse&gt; retrieveAll(paged, offset, limit, orderBy, sortOrder)

List Fixed deposit applications/accounts

Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Boolean paged = true; // Boolean | paged
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    List<GetFixedDepositAccountsResponse> result = apiInstance.retrieveAll(paged, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetFixedDepositAccountsResponse&gt;**](GetFixedDepositAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetFixedDepositAccountsAccountIdResponse retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus)

Retrieve a fixed deposit application/account

Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long accountId = 789L; // Long | accountId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
String chargeStatus = "all"; // String | chargeStatus
try {
    GetFixedDepositAccountsAccountIdResponse result = apiInstance.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#retrieveOne");
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

[**GetFixedDepositAccountsAccountIdResponse**](GetFixedDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitApplication"></a>
# **submitApplication**
> PostFixedDepositAccountsResponse submitApplication(body)

Submit new fixed deposit application

Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
PostFixedDepositAccountsRequest body = new PostFixedDepositAccountsRequest(); // PostFixedDepositAccountsRequest | body
try {
    PostFixedDepositAccountsResponse result = apiInstance.submitApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#submitApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFixedDepositAccountsRequest**](PostFixedDepositAccountsRequest.md)| body |

### Return type

[**PostFixedDepositAccountsResponse**](PostFixedDepositAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetFixedDepositAccountsTemplateResponse template(clientId, groupId, productId, staffInSelectedOfficeOnly)

Retrieve Fixed Deposit Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long clientId = 789L; // Long | clientId
Long groupId = 789L; // Long | groupId
Long productId = 789L; // Long | productId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetFixedDepositAccountsTemplateResponse result = apiInstance.template(clientId, groupId, productId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#template");
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

[**GetFixedDepositAccountsTemplateResponse**](GetFixedDepositAccountsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutFixedDepositAccountsAccountIdResponse update(accountId, body)

Modify a fixed deposit application

Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositAccountApi;


FixedDepositAccountApi apiInstance = new FixedDepositAccountApi();
Long accountId = 789L; // Long | accountId
PutFixedDepositAccountsAccountIdRequest body = new PutFixedDepositAccountsAccountIdRequest(); // PutFixedDepositAccountsAccountIdRequest | body
try {
    PutFixedDepositAccountsAccountIdResponse result = apiInstance.update(accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositAccountApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **body** | [**PutFixedDepositAccountsAccountIdRequest**](PutFixedDepositAccountsAccountIdRequest.md)| body |

### Return type

[**PutFixedDepositAccountsAccountIdResponse**](PutFixedDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

