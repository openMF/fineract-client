# LoanCollateralApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCollateral**](LoanCollateralApi.md#createCollateral) | **POST** loans/{loanId}/collaterals | Create a Collateral
[**deleteCollateral**](LoanCollateralApi.md#deleteCollateral) | **DELETE** loans/{loanId}/collaterals/{collateralId} | Remove a Collateral
[**newCollateralTemplate**](LoanCollateralApi.md#newCollateralTemplate) | **GET** loans/{loanId}/collaterals/template | Retrieve Collateral Details Template
[**retrieveCollateralDetails**](LoanCollateralApi.md#retrieveCollateralDetails) | **GET** loans/{loanId}/collaterals | List Loan Collaterals
[**retrieveCollateralDetails_0**](LoanCollateralApi.md#retrieveCollateralDetails_0) | **GET** loans/{loanId}/collaterals/{collateralId} | Retrieve a Collateral
[**updateCollateral**](LoanCollateralApi.md#updateCollateral) | **PUT** loans/{loanId}/collaterals/{collateralId} | Update a Collateral


<a name="createCollateral"></a>
# **createCollateral**
> PostLoansLoanIdCollateralsResponse createCollateral(loanId, body)

Create a Collateral

Note: Currently, Collaterals may be added only before a Loan is approved

### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdCollateralsResponse> call = apiService.createCollateral(loanId, body);
call.enqueue(new Callback<PostLoansLoanIdCollateralsResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdCollateralsResponse> call, Response<PostLoansLoanIdCollateralsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdCollateralsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **body** | [**PostLoansLoanIdCollateralsRequest**](PostLoansLoanIdCollateralsRequest.md)| body |

### Return type

[**PostLoansLoanIdCollateralsResponse**](PostLoansLoanIdCollateralsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCollateral"></a>
# **deleteCollateral**
> DeleteLoansLoanIdCollateralsCollateralIdResponse deleteCollateral(loanId, collateralId)

Remove a Collateral

Note: A collateral can only be removed from Loans that are not yet approved.

### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<DeleteLoansLoanIdCollateralsCollateralIdResponse> call = apiService.deleteCollateral(loanId, collateralId);
call.enqueue(new Callback<DeleteLoansLoanIdCollateralsCollateralIdResponse>() {
    @Override
    public void onResponse(Call<DeleteLoansLoanIdCollateralsCollateralIdResponse> call, Response<DeleteLoansLoanIdCollateralsCollateralIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteLoansLoanIdCollateralsCollateralIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **collateralId** | **Long**| collateralId |

### Return type

[**DeleteLoansLoanIdCollateralsCollateralIdResponse**](DeleteLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newCollateralTemplate"></a>
# **newCollateralTemplate**
> GetLoansLoanIdCollateralsTemplateResponse newCollateralTemplate()

Retrieve Collateral Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template

### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdCollateralsTemplateResponse> call = apiService.newCollateralTemplate();
call.enqueue(new Callback<GetLoansLoanIdCollateralsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdCollateralsTemplateResponse> call, Response<GetLoansLoanIdCollateralsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdCollateralsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLoansLoanIdCollateralsTemplateResponse**](GetLoansLoanIdCollateralsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCollateralDetails"></a>
# **retrieveCollateralDetails**
> List&lt;GetLoansLoanIdCollateralsResponse&gt; retrieveCollateralDetails(loanId)

List Loan Collaterals

Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description

### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetLoansLoanIdCollateralsResponse&gt;> call = apiService.retrieveCollateralDetails(loanId);
call.enqueue(new Callback<List&lt;GetLoansLoanIdCollateralsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetLoansLoanIdCollateralsResponse&gt;> call, Response<List&lt;GetLoansLoanIdCollateralsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetLoansLoanIdCollateralsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetLoansLoanIdCollateralsResponse&gt;**](GetLoansLoanIdCollateralsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCollateralDetails_0"></a>
# **retrieveCollateralDetails_0**
> GetLoansLoanIdCollateralsResponse retrieveCollateralDetails_0(loanId, collateralId)

Retrieve a Collateral

Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;value,description

### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdCollateralsResponse> call = apiService.retrieveCollateralDetails_0(loanId, collateralId);
call.enqueue(new Callback<GetLoansLoanIdCollateralsResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdCollateralsResponse> call, Response<GetLoansLoanIdCollateralsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdCollateralsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **collateralId** | **Long**| collateralId |

### Return type

[**GetLoansLoanIdCollateralsResponse**](GetLoansLoanIdCollateralsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollateral"></a>
# **updateCollateral**
> PutLoansLoanIdCollateralsCollateralIdResponse updateCollateral(loanId, collateralId, body)

Update a Collateral



### Example
```java

LoanCollateralApi apiService = defaultClient.createService(LoanCollateralApi.class);

// Initialize these parameters earlier.
Call<PutLoansLoanIdCollateralsCollateralIdResponse> call = apiService.updateCollateral(loanId, collateralId, body);
call.enqueue(new Callback<PutLoansLoanIdCollateralsCollateralIdResponse>() {
    @Override
    public void onResponse(Call<PutLoansLoanIdCollateralsCollateralIdResponse> call, Response<PutLoansLoanIdCollateralsCollateralIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutLoansLoanIdCollateralsCollateralIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **collateralId** | **Long**| collateralId |
 **body** | [**PutLoansLoandIdCollateralsCollateralIdRequest**](PutLoansLoandIdCollateralsCollateralIdRequest.md)| body |

### Return type

[**PutLoansLoanIdCollateralsCollateralIdResponse**](PutLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

