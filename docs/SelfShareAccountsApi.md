# SelfShareAccountsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](SelfShareAccountsApi.md#createAccount) | **POST** self/shareaccounts | Submit new share application
[**retrieveShareAccount**](SelfShareAccountsApi.md#retrieveShareAccount) | **GET** self/shareaccounts/{accountId} | 
[**template**](SelfShareAccountsApi.md#template) | **GET** self/shareaccounts/template | Retrieve Share Account Template


<a name="createAccount"></a>
# **createAccount**
> List&lt;PostNewShareApplicationResponse&gt; createAccount(body)

Submit new share application

Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.

### Example
```java

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<List&lt;PostNewShareApplicationResponse&gt;> call = apiService.createAccount(body);
call.enqueue(new Callback<List&lt;PostNewShareApplicationResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;PostNewShareApplicationResponse&gt;> call, Response<List&lt;PostNewShareApplicationResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;PostNewShareApplicationResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | **String**|  | [optional]

### Return type

[**List&lt;PostNewShareApplicationResponse&gt;**](PostNewShareApplicationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveShareAccount"></a>
# **retrieveShareAccount**
> String retrieveShareAccount(accountId)



### Example
```java

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveShareAccount(accountId);
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

 **accountId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetShareAccountsClientIdProductIdResponse&gt; template(clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 

### Example
```java

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call = apiService.template(clientId, productId);
call.enqueue(new Callback<List&lt;GetShareAccountsClientIdProductIdResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call, Response<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]

### Return type

[**List&lt;GetShareAccountsClientIdProductIdResponse&gt;**](GetShareAccountsClientIdProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

