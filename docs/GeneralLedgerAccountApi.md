# GeneralLedgerAccountApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount**](GeneralLedgerAccountApi.md#createGLAccount) | **POST** glaccounts | Create a General Ledger Account
[**deleteGLAccount**](GeneralLedgerAccountApi.md#deleteGLAccount) | **DELETE** glaccounts/{glAccountId} | Delete an accounting closure
[**getGlAccountsTemplate**](GeneralLedgerAccountApi.md#getGlAccountsTemplate) | **GET** glaccounts/downloadtemplate | 
[**postGlAccountsTemplate**](GeneralLedgerAccountApi.md#postGlAccountsTemplate) | **POST** glaccounts/uploadtemplate | 
[**retreiveAccount**](GeneralLedgerAccountApi.md#retreiveAccount) | **GET** glaccounts/{glAccountId} | Retrieve a General Ledger Account
[**retrieveAllAccounts**](GeneralLedgerAccountApi.md#retrieveAllAccounts) | **GET** glaccounts | List General Ledger Accounts
[**retrieveNewAccountDetails**](GeneralLedgerAccountApi.md#retrieveNewAccountDetails) | **GET** glaccounts/template | Retrieve GL Accounts Template
[**updateGLAccount**](GeneralLedgerAccountApi.md#updateGLAccount) | **PUT** glaccounts/{glAccountId} | Update an Accounting closure


<a name="createGLAccount"></a>
# **createGLAccount**
> PostGLAccountsResponse createGLAccount(body)

Create a General Ledger Account

Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
PostGLAccountsRequest body = new PostGLAccountsRequest(); // PostGLAccountsRequest | body
try {
    PostGLAccountsResponse result = apiInstance.createGLAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#createGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGLAccountsRequest**](PostGLAccountsRequest.md)| body | [optional]

### Return type

[**PostGLAccountsResponse**](PostGLAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLAccount"></a>
# **deleteGLAccount**
> DeleteGLAccountsRequest deleteGLAccount(glAccountId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
Long glAccountId = 789L; // Long | glAccountId
try {
    DeleteGLAccountsRequest result = apiInstance.deleteGLAccount(glAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#deleteGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |

### Return type

[**DeleteGLAccountsRequest**](DeleteGLAccountsRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGlAccountsTemplate"></a>
# **getGlAccountsTemplate**
> getGlAccountsTemplate(dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getGlAccountsTemplate(dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#getGlAccountsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postGlAccountsTemplate"></a>
# **postGlAccountsTemplate**
> String postGlAccountsTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postGlAccountsTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#postGlAccountsTemplate");
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

<a name="retreiveAccount"></a>
# **retreiveAccount**
> GetGLAccountsResponse retreiveAccount(glAccountId, fetchRunningBalance)

Retrieve a General Ledger Account

Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
Long glAccountId = 789L; // Long | glAccountId
Boolean fetchRunningBalance = true; // Boolean | fetchRunningBalance
try {
    GetGLAccountsResponse result = apiInstance.retreiveAccount(glAccountId, fetchRunningBalance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#retreiveAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**GetGLAccountsResponse**](GetGLAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllAccounts"></a>
# **retrieveAllAccounts**
> List&lt;GetGLAccountsResponse&gt; retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance)

List General Ledger Accounts

ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
Integer type = 56; // Integer | type
String searchParam = "searchParam_example"; // String | searchParam
Integer usage = 56; // Integer | usage
Boolean manualEntriesAllowed = true; // Boolean | manualEntriesAllowed
Boolean disabled = true; // Boolean | disabled
Boolean fetchRunningBalance = true; // Boolean | fetchRunningBalance
try {
    List<GetGLAccountsResponse> result = apiInstance.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#retrieveAllAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| type | [optional]
 **searchParam** | **String**| searchParam | [optional]
 **usage** | **Integer**| usage | [optional]
 **manualEntriesAllowed** | **Boolean**| manualEntriesAllowed | [optional]
 **disabled** | **Boolean**| disabled | [optional]
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**List&lt;GetGLAccountsResponse&gt;**](GetGLAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveNewAccountDetails"></a>
# **retrieveNewAccountDetails**
> GetGLAccountsTemplateResponse retrieveNewAccountDetails(type)

Retrieve GL Accounts Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
Integer type = 56; // Integer | type
try {
    GetGLAccountsTemplateResponse result = apiInstance.retrieveNewAccountDetails(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#retrieveNewAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| type | [optional]

### Return type

[**GetGLAccountsTemplateResponse**](GetGLAccountsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGLAccount"></a>
# **updateGLAccount**
> PutGLAccountsResponse updateGLAccount(glAccountId, body)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited  

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GeneralLedgerAccountApi;


GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi();
Long glAccountId = 789L; // Long | glAccountId
PutGLAccountsRequest body = new PutGLAccountsRequest(); // PutGLAccountsRequest | body
try {
    PutGLAccountsResponse result = apiInstance.updateGLAccount(glAccountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerAccountApi#updateGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |
 **body** | [**PutGLAccountsRequest**](PutGLAccountsRequest.md)| body | [optional]

### Return type

[**PutGLAccountsResponse**](PutGLAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

