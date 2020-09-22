# AccountTransfersApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccountTransfersApi.md#create) | **POST** accounttransfers | Create new Transfer
[**retrieveAll**](AccountTransfersApi.md#retrieveAll) | **GET** accounttransfers | List account transfers
[**retrieveOne**](AccountTransfersApi.md#retrieveOne) | **GET** accounttransfers/{transferId} | Retrieve account transfer
[**template**](AccountTransfersApi.md#template) | **GET** accounttransfers/template | Retrieve Account Transfer Template
[**templateRefundByTransfer**](AccountTransfersApi.md#templateRefundByTransfer) | **GET** accounttransfers/templateRefundByTransfer | Retrieve Refund of an Active Loan by Transfer Template
[**templateRefundByTransferPost**](AccountTransfersApi.md#templateRefundByTransferPost) | **POST** accounttransfers/refundByTransfer | Refund of an Active Loan by Transfer


<a name="create"></a>
# **create**
> PostAccountTransfersResponse create(body)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<PostAccountTransfersResponse> call = apiService.create(body);
call.enqueue(new Callback<PostAccountTransfersResponse>() {
    @Override
    public void onResponse(Call<PostAccountTransfersResponse> call, Response<PostAccountTransfersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountTransfersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostAccountTransfersRequest**](PostAccountTransfersRequest.md)| body |

### Return type

[**PostAccountTransfersResponse**](PostAccountTransfersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetAccountTransfersResponse retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId)

List account transfers

Lists account&#39;s transfers  Example Requests:    accounttransfers

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersResponse> call = apiService.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);
call.enqueue(new Callback<GetAccountTransfersResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersResponse> call, Response<GetAccountTransfersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **accountDetailId** | **Long**| accountDetailId | [optional]

### Return type

[**GetAccountTransfersResponse**](GetAccountTransfersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetAccountTransfersPageItems retrieveOne(transferId)

Retrieve account transfer

Retrieves account transfer  Example Requests :    accounttransfers/1

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersPageItems> call = apiService.retrieveOne(transferId);
call.enqueue(new Callback<GetAccountTransfersPageItems>() {
    @Override
    public void onResponse(Call<GetAccountTransfersPageItems> call, Response<GetAccountTransfersPageItems> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersPageItems> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **transferId** | **Long**| transferId |

### Return type

[**GetAccountTransfersPageItems**](GetAccountTransfersPageItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetAccountTransfersTemplateResponse template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Account Transfer Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersTemplateResponse> call = apiService.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
call.enqueue(new Callback<GetAccountTransfersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersTemplateResponse> call, Response<GetAccountTransfersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateResponse**](GetAccountTransfersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templateRefundByTransfer"></a>
# **templateRefundByTransfer**
> GetAccountTransfersTemplateRefundByTransferResponse templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Refund of an Active Loan by Transfer Template

Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersTemplateRefundByTransferResponse> call = apiService.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
call.enqueue(new Callback<GetAccountTransfersTemplateRefundByTransferResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersTemplateRefundByTransferResponse> call, Response<GetAccountTransfersTemplateRefundByTransferResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersTemplateRefundByTransferResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateRefundByTransferResponse**](GetAccountTransfersTemplateRefundByTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templateRefundByTransferPost"></a>
# **templateRefundByTransferPost**
> PostAccountTransfersRefundByTransferResponse templateRefundByTransferPost(body)

Refund of an Active Loan by Transfer

Ability to refund an active loan by transferring to a savings account.

### Example
```java

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<PostAccountTransfersRefundByTransferResponse> call = apiService.templateRefundByTransferPost(body);
call.enqueue(new Callback<PostAccountTransfersRefundByTransferResponse>() {
    @Override
    public void onResponse(Call<PostAccountTransfersRefundByTransferResponse> call, Response<PostAccountTransfersRefundByTransferResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountTransfersRefundByTransferResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostAccountTransfersRefundByTransferRequest**](PostAccountTransfersRefundByTransferRequest.md)| body |

### Return type

[**PostAccountTransfersRefundByTransferResponse**](PostAccountTransfersRefundByTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

