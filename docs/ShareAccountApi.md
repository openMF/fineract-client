# ShareAccountApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](ShareAccountApi.md#createAccount) | **POST** accounts/{type} | Submit new share application
[**getSharedAccountsTemplate**](ShareAccountApi.md#getSharedAccountsTemplate) | **GET** accounts/{type}/downloadtemplate | 
[**handleCommands**](ShareAccountApi.md#handleCommands) | **POST** accounts/{type}/{accountId} | Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
[**postSharedAccountsTemplate**](ShareAccountApi.md#postSharedAccountsTemplate) | **POST** accounts/{type}/uploadtemplate | 
[**retrieveAccount**](ShareAccountApi.md#retrieveAccount) | **GET** accounts/{type}/{accountId} | Retrieve a share application/account
[**retrieveAllAccounts**](ShareAccountApi.md#retrieveAllAccounts) | **GET** accounts/{type} | List share applications/accounts
[**template**](ShareAccountApi.md#template) | **GET** accounts/{type}/template | Retrieve Share Account Template
[**updateAccount**](ShareAccountApi.md#updateAccount) | **PUT** accounts/{type}/{accountId} | Modify a share application


<a name="createAccount"></a>
# **createAccount**
> PostAccountsTypeResponse createAccount(type, body)

Submit new share application

Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
String type = "type_example"; // String | type
PostAccountsTypeRequest body = new PostAccountsTypeRequest(); // PostAccountsTypeRequest | body
try {
    PostAccountsTypeResponse result = apiInstance.createAccount(type, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **body** | [**PostAccountsTypeRequest**](PostAccountsTypeRequest.md)| body |

### Return type

[**PostAccountsTypeResponse**](PostAccountsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSharedAccountsTemplate"></a>
# **getSharedAccountsTemplate**
> getSharedAccountsTemplate(officeId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
Long officeId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getSharedAccountsTemplate(officeId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#getSharedAccountsTemplate");
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
> PostAccountsTypeAccountIdResponse handleCommands(type, accountId, body, command)

Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account

Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#shareaccounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
String type = "type_example"; // String | type
Long accountId = 789L; // Long | accountId
PostAccountsTypeAccountIdRequest body = new PostAccountsTypeAccountIdRequest(); // PostAccountsTypeAccountIdRequest | body
String command = "command_example"; // String | command
try {
    PostAccountsTypeAccountIdResponse result = apiInstance.handleCommands(type, accountId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **accountId** | **Long**| accountId |
 **body** | [**PostAccountsTypeAccountIdRequest**](PostAccountsTypeAccountIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostAccountsTypeAccountIdResponse**](PostAccountsTypeAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSharedAccountsTemplate"></a>
# **postSharedAccountsTemplate**
> String postSharedAccountsTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postSharedAccountsTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#postSharedAccountsTemplate");
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

<a name="retrieveAccount"></a>
# **retrieveAccount**
> GetAccountsTypeAccountIdResponse retrieveAccount(accountId, type)

Retrieve a share application/account

Retrieves a share application/account  Example Requests :  shareaccount/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
Long accountId = 789L; // Long | accountId
String type = "type_example"; // String | type
try {
    GetAccountsTypeAccountIdResponse result = apiInstance.retrieveAccount(accountId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#retrieveAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **type** | **String**| type |

### Return type

[**GetAccountsTypeAccountIdResponse**](GetAccountsTypeAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllAccounts"></a>
# **retrieveAllAccounts**
> GetAccountsTypeResponse retrieveAllAccounts(type, offset, limit)

List share applications/accounts

Lists share applications/accounts  Example Requests:  shareaccount

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
String type = "type_example"; // String | type
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    GetAccountsTypeResponse result = apiInstance.retrieveAllAccounts(type, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#retrieveAllAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetAccountsTypeResponse**](GetAccountsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetAccountsTypeTemplateResponse template(type, clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
String type = "type_example"; // String | type
Long clientId = 789L; // Long | clientId
Long productId = 789L; // Long | productId
try {
    GetAccountsTypeTemplateResponse result = apiInstance.template(type, clientId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]

### Return type

[**GetAccountsTypeTemplateResponse**](GetAccountsTypeTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccount"></a>
# **updateAccount**
> PutAccountsTypeAccountIdResponse updateAccount(type, accountId, body)

Modify a share application

Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ShareAccountApi;


ShareAccountApi apiInstance = new ShareAccountApi();
String type = "type_example"; // String | type
Long accountId = 789L; // Long | accountId
PutAccountsTypeAccountIdRequest body = new PutAccountsTypeAccountIdRequest(); // PutAccountsTypeAccountIdRequest | body
try {
    PutAccountsTypeAccountIdResponse result = apiInstance.updateAccount(type, accountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareAccountApi#updateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **accountId** | **Long**| accountId |
 **body** | [**PutAccountsTypeAccountIdRequest**](PutAccountsTypeAccountIdRequest.md)| body |

### Return type

[**PutAccountsTypeAccountIdResponse**](PutAccountsTypeAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

