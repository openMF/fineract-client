# ShareAccountApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PostAccountsTypeResponse> call = apiService.createAccount(type, body);
call.enqueue(new Callback<PostAccountsTypeResponse>() {
    @Override
    public void onResponse(Call<PostAccountsTypeResponse> call, Response<PostAccountsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getSharedAccountsTemplate(officeId, dateFormat);
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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PostAccountsTypeAccountIdResponse> call = apiService.handleCommands(type, accountId, body, command);
call.enqueue(new Callback<PostAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<PostAccountsTypeAccountIdResponse> call, Response<PostAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postSharedAccountsTemplate(file, locale, dateFormat);
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

<a name="retrieveAccount"></a>
# **retrieveAccount**
> GetAccountsTypeAccountIdResponse retrieveAccount(accountId, type)

Retrieve a share application/account

Retrieves a share application/account  Example Requests :  shareaccount/1

### Example
```java

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeAccountIdResponse> call = apiService.retrieveAccount(accountId, type);
call.enqueue(new Callback<GetAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeAccountIdResponse> call, Response<GetAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeResponse> call = apiService.retrieveAllAccounts(type, offset, limit);
call.enqueue(new Callback<GetAccountsTypeResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeResponse> call, Response<GetAccountsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeTemplateResponse> call = apiService.template(type, clientId, productId);
call.enqueue(new Callback<GetAccountsTypeTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeTemplateResponse> call, Response<GetAccountsTypeTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PutAccountsTypeAccountIdResponse> call = apiService.updateAccount(type, accountId, body);
call.enqueue(new Callback<PutAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<PutAccountsTypeAccountIdResponse> call, Response<PutAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

