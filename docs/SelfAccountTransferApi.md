# SelfAccountTransferApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SelfAccountTransferApi.md#create) | **POST** self/accounttransfers | Create new Transfer
[**template**](SelfAccountTransferApi.md#template) | **GET** self/accounttransfers/template | Retrieve Account Transfer Template


<a name="create"></a>
# **create**
> List&lt;PostNewTransferResponse&gt; create(type, body)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 

### Example
```java

SelfAccountTransferApi apiService = defaultClient.createService(SelfAccountTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;PostNewTransferResponse&gt;> call = apiService.create(type, body);
call.enqueue(new Callback<List&lt;PostNewTransferResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;PostNewTransferResponse&gt;> call, Response<List&lt;PostNewTransferResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;PostNewTransferResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **type** | **String**| type | [optional]
 **body** | **String**|  | [optional]

### Return type

[**List&lt;PostNewTransferResponse&gt;**](PostNewTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetAccountTransferTemplateResponse&gt; template(type)

Retrieve Account Transfer Template

Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 

### Example
```java

SelfAccountTransferApi apiService = defaultClient.createService(SelfAccountTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetAccountTransferTemplateResponse&gt;> call = apiService.template(type);
call.enqueue(new Callback<List&lt;GetAccountTransferTemplateResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetAccountTransferTemplateResponse&gt;> call, Response<List&lt;GetAccountTransferTemplateResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetAccountTransferTemplateResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **type** | **String**| type | [optional]

### Return type

[**List&lt;GetAccountTransferTemplateResponse&gt;**](GetAccountTransferTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

