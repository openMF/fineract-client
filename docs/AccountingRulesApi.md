# AccountingRulesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountingRule**](AccountingRulesApi.md#createAccountingRule) | **POST** accountingrules | Create/Define a Accounting rule
[**deleteAccountingRule**](AccountingRulesApi.md#deleteAccountingRule) | **DELETE** accountingrules/{accountingRuleId} | Delete a Accounting Rule
[**retreiveAccountingRule**](AccountingRulesApi.md#retreiveAccountingRule) | **GET** accountingrules/{accountingRuleId} | Retrieve a Accounting rule
[**retrieveAllAccountingRules**](AccountingRulesApi.md#retrieveAllAccountingRules) | **GET** accountingrules | Retrieve Accounting Rules
[**retrieveTemplate**](AccountingRulesApi.md#retrieveTemplate) | **GET** accountingrules/template | Retrieve Accounting Rule Details Template
[**updateAccountingRule**](AccountingRulesApi.md#updateAccountingRule) | **PUT** accountingrules/{accountingRuleId} | Update a Accounting Rule


<a name="createAccountingRule"></a>
# **createAccountingRule**
> PostAccountingRulesResponse createAccountingRule(body)

Create/Define a Accounting rule

Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
PostAccountingRulesRequest body = new PostAccountingRulesRequest(); // PostAccountingRulesRequest | body
try {
    PostAccountingRulesResponse result = apiInstance.createAccountingRule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#createAccountingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountingRulesRequest**](PostAccountingRulesRequest.md)| body | [optional]

### Return type

[**PostAccountingRulesResponse**](PostAccountingRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountingRule"></a>
# **deleteAccountingRule**
> DeleteAccountingRulesResponse deleteAccountingRule(accountingRuleId)

Delete a Accounting Rule

Deletes a Accounting rule.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
Long accountingRuleId = 789L; // Long | accountingRuleId
try {
    DeleteAccountingRulesResponse result = apiInstance.deleteAccountingRule(accountingRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#deleteAccountingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**DeleteAccountingRulesResponse**](DeleteAccountingRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreiveAccountingRule"></a>
# **retreiveAccountingRule**
> AccountingRuleData retreiveAccountingRule(accountingRuleId)

Retrieve a Accounting rule

Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
Long accountingRuleId = 789L; // Long | accountingRuleId
try {
    AccountingRuleData result = apiInstance.retreiveAccountingRule(accountingRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#retreiveAccountingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**AccountingRuleData**](AccountingRuleData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllAccountingRules"></a>
# **retrieveAllAccountingRules**
> List&lt;GetAccountRulesResponse&gt; retrieveAllAccountingRules()

Retrieve Accounting Rules

Returns the list of defined accounting rules.  Example Requests:  accountingrules

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
try {
    List<GetAccountRulesResponse> result = apiInstance.retrieveAllAccountingRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#retrieveAllAccountingRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetAccountRulesResponse&gt;**](GetAccountRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetAccountRulesTemplateResponse retrieveTemplate()

Retrieve Accounting Rule Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
try {
    GetAccountRulesTemplateResponse result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountRulesTemplateResponse**](GetAccountRulesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountingRule"></a>
# **updateAccountingRule**
> PutAccountingRulesResponse updateAccountingRule(accountingRuleId, body)

Update a Accounting Rule

Updates the details of a Accounting rule.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingRulesApi;


AccountingRulesApi apiInstance = new AccountingRulesApi();
Long accountingRuleId = 789L; // Long | accountingRuleId
PutAccountingRulesRequest body = new PutAccountingRulesRequest(); // PutAccountingRulesRequest | body
try {
    PutAccountingRulesResponse result = apiInstance.updateAccountingRule(accountingRuleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingRulesApi#updateAccountingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |
 **body** | [**PutAccountingRulesRequest**](PutAccountingRulesRequest.md)| body | [optional]

### Return type

[**PutAccountingRulesResponse**](PutAccountingRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

