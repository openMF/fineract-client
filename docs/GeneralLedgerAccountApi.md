# GeneralLedgerAccountApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<PostGLAccountsResponse> call = apiService.createGLAccount(body);
call.enqueue(new Callback<PostGLAccountsResponse>() {
    @Override
    public void onResponse(Call<PostGLAccountsResponse> call, Response<PostGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<DeleteGLAccountsRequest> call = apiService.deleteGLAccount(glAccountId);
call.enqueue(new Callback<DeleteGLAccountsRequest>() {
    @Override
    public void onResponse(Call<DeleteGLAccountsRequest> call, Response<DeleteGLAccountsRequest> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteGLAccountsRequest> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getGlAccountsTemplate(dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postGlAccountsTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<GetGLAccountsResponse> call = apiService.retreiveAccount(glAccountId, fetchRunningBalance);
call.enqueue(new Callback<GetGLAccountsResponse>() {
    @Override
    public void onResponse(Call<GetGLAccountsResponse> call, Response<GetGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGLAccountsResponse&gt;> call = apiService.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);
call.enqueue(new Callback<List&lt;GetGLAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGLAccountsResponse&gt;> call, Response<List&lt;GetGLAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGLAccountsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<GetGLAccountsTemplateResponse> call = apiService.retrieveNewAccountDetails(type);
call.enqueue(new Callback<GetGLAccountsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetGLAccountsTemplateResponse> call, Response<GetGLAccountsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGLAccountsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<PutGLAccountsResponse> call = apiService.updateGLAccount(glAccountId, body);
call.enqueue(new Callback<PutGLAccountsResponse>() {
    @Override
    public void onResponse(Call<PutGLAccountsResponse> call, Response<PutGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **glAccountId** | **Long**| glAccountId |
 **body** | [**PutGLAccountsRequest**](PutGLAccountsRequest.md)| body | [optional]

### Return type

[**PutGLAccountsResponse**](PutGLAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

