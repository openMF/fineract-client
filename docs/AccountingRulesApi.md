# AccountingRulesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<PostAccountingRulesResponse> call = apiService.createAccountingRule(body);
call.enqueue(new Callback<PostAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<PostAccountingRulesResponse> call, Response<PostAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<DeleteAccountingRulesResponse> call = apiService.deleteAccountingRule(accountingRuleId);
call.enqueue(new Callback<DeleteAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<DeleteAccountingRulesResponse> call, Response<DeleteAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<AccountingRuleData> call = apiService.retreiveAccountingRule(accountingRuleId);
call.enqueue(new Callback<AccountingRuleData>() {
    @Override
    public void onResponse(Call<AccountingRuleData> call, Response<AccountingRuleData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<AccountingRuleData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetAccountRulesResponse&gt;> call = apiService.retrieveAllAccountingRules();
call.enqueue(new Callback<List&lt;GetAccountRulesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetAccountRulesResponse&gt;> call, Response<List&lt;GetAccountRulesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetAccountRulesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<GetAccountRulesTemplateResponse> call = apiService.retrieveTemplate();
call.enqueue(new Callback<GetAccountRulesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountRulesTemplateResponse> call, Response<GetAccountRulesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountRulesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<PutAccountingRulesResponse> call = apiService.updateAccountingRule(accountingRuleId, body);
call.enqueue(new Callback<PutAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<PutAccountingRulesResponse> call, Response<PutAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountingRuleId** | **Long**| accountingRuleId |
 **body** | [**PutAccountingRulesRequest**](PutAccountingRulesRequest.md)| body | [optional]

### Return type

[**PutAccountingRulesResponse**](PutAccountingRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

