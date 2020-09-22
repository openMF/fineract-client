# SelfThirdPartyTransferApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](SelfThirdPartyTransferApi.md#add) | **POST** self/beneficiaries/tpt | Add TPT Beneficiary
[**delete**](SelfThirdPartyTransferApi.md#delete) | **DELETE** self/beneficiaries/tpt/{beneficiaryId} | Delete TPT Beneficiary
[**retrieveAll**](SelfThirdPartyTransferApi.md#retrieveAll) | **GET** self/beneficiaries/tpt | Get All TPT Beneficiary
[**template**](SelfThirdPartyTransferApi.md#template) | **GET** self/beneficiaries/tpt/template | Beneficiary Third Party Transfer Template
[**update**](SelfThirdPartyTransferApi.md#update) | **PUT** self/beneficiaries/tpt/{beneficiaryId} | Update TPT Beneficiary


<a name="add"></a>
# **add**
> PostSelfBeneficiariesTPTResponse add(body)

Add TPT Beneficiary

Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit

### Example
```java

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<PostSelfBeneficiariesTPTResponse> call = apiService.add(body);
call.enqueue(new Callback<PostSelfBeneficiariesTPTResponse>() {
    @Override
    public void onResponse(Call<PostSelfBeneficiariesTPTResponse> call, Response<PostSelfBeneficiariesTPTResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfBeneficiariesTPTResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostSelfBeneficiariesTPTRequest**](PostSelfBeneficiariesTPTRequest.md)| body |

### Return type

[**PostSelfBeneficiariesTPTResponse**](PostSelfBeneficiariesTPTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteSelfBeneficiariesTPTBeneficiaryIdResponse delete(beneficiaryId)

Delete TPT Beneficiary

Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}

### Example
```java

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call = apiService.delete(beneficiaryId);
call.enqueue(new Callback<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse>() {
    @Override
    public void onResponse(Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call, Response<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **beneficiaryId** | **Long**|  |

### Return type

[**DeleteSelfBeneficiariesTPTBeneficiaryIdResponse**](DeleteSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetSelfBeneficiariesTPTResponse&gt; retrieveAll()

Get All TPT Beneficiary

Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt

### Example
```java

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetSelfBeneficiariesTPTResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call, Response<List&lt;GetSelfBeneficiariesTPTResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSelfBeneficiariesTPTResponse&gt;**](GetSelfBeneficiariesTPTResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetSelfBeneficiariesTPTTemplateResponse template()

Beneficiary Third Party Transfer Template

Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template

### Example
```java

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<GetSelfBeneficiariesTPTTemplateResponse> call = apiService.template();
call.enqueue(new Callback<GetSelfBeneficiariesTPTTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSelfBeneficiariesTPTTemplateResponse> call, Response<GetSelfBeneficiariesTPTTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfBeneficiariesTPTTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSelfBeneficiariesTPTTemplateResponse**](GetSelfBeneficiariesTPTTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutSelfBeneficiariesTPTBeneficiaryIdResponse update(beneficiaryId, body)

Update TPT Beneficiary

Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit

### Example
```java

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call = apiService.update(beneficiaryId, body);
call.enqueue(new Callback<PutSelfBeneficiariesTPTBeneficiaryIdResponse>() {
    @Override
    public void onResponse(Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call, Response<PutSelfBeneficiariesTPTBeneficiaryIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **beneficiaryId** | **Long**| beneficiaryId |
 **body** | [**PutSelfBeneficiariesTPTBeneficiaryIdRequest**](PutSelfBeneficiariesTPTBeneficiaryIdRequest.md)| body |

### Return type

[**PutSelfBeneficiariesTPTBeneficiaryIdResponse**](PutSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

