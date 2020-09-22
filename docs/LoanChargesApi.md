# LoanChargesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLoanCharge**](LoanChargesApi.md#deleteLoanCharge) | **DELETE** loans/{loanId}/charges/{chargeId} | Delete a Loan Charge
[**executeLoanCharge**](LoanChargesApi.md#executeLoanCharge) | **POST** loans/{loanId}/charges/{chargeId} | Pay Loan Charge
[**executeLoanCharge_0**](LoanChargesApi.md#executeLoanCharge_0) | **POST** loans/{loanId}/charges | Create a Loan Charge
[**retrieveAllLoanCharges**](LoanChargesApi.md#retrieveAllLoanCharges) | **GET** loans/{loanId}/charges | List Loan Charges
[**retrieveLoanCharge**](LoanChargesApi.md#retrieveLoanCharge) | **GET** loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge
[**retrieveTemplate**](LoanChargesApi.md#retrieveTemplate) | **GET** loans/{loanId}/charges/template | Retrieve Loan Charges Template
[**updateLoanCharge**](LoanChargesApi.md#updateLoanCharge) | **PUT** loans/{loanId}/charges/{chargeId} | Update a Loan Charge


<a name="deleteLoanCharge"></a>
# **deleteLoanCharge**
> DeleteLoansLoanIdChargesChargeIdResponse deleteLoanCharge(loanId, chargeId)

Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<DeleteLoansLoanIdChargesChargeIdResponse> call = apiService.deleteLoanCharge(loanId, chargeId);
call.enqueue(new Callback<DeleteLoansLoanIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<DeleteLoansLoanIdChargesChargeIdResponse> call, Response<DeleteLoansLoanIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteLoansLoanIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeLoanCharge"></a>
# **executeLoanCharge**
> PostLoansLoanIdChargesChargeIdResponse executeLoanCharge(loanId, chargeId, body, command)

Pay Loan Charge

Loan Charge will be paid if the loan is linked with a savings account

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdChargesChargeIdResponse> call = apiService.executeLoanCharge(loanId, chargeId, body, command);
call.enqueue(new Callback<PostLoansLoanIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdChargesChargeIdResponse> call, Response<PostLoansLoanIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |
 **body** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeLoanCharge_0"></a>
# **executeLoanCharge_0**
> PostLoansLoanIdChargesResponse executeLoanCharge_0(loanId, body, command)

Create a Loan Charge

It Creates a Loan Charge

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdChargesResponse> call = apiService.executeLoanCharge_0(loanId, body, command);
call.enqueue(new Callback<PostLoansLoanIdChargesResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdChargesResponse> call, Response<PostLoansLoanIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **body** | [**PostLoansLoanIdChargesRequest**](PostLoansLoanIdChargesRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdChargesResponse**](PostLoansLoanIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllLoanCharges"></a>
# **retrieveAllLoanCharges**
> List&lt;GetLoansLoanIdChargesChargeIdResponse&gt; retrieveAllLoanCharges(loanId)

List Loan Charges

It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;> call = apiService.retrieveAllLoanCharges(loanId);
call.enqueue(new Callback<List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;> call, Response<List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoanCharge"></a>
# **retrieveLoanCharge**
> GetLoansLoanIdChargesChargeIdResponse retrieveLoanCharge(loanId, chargeId)

Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdChargesChargeIdResponse> call = apiService.retrieveLoanCharge(loanId, chargeId);
call.enqueue(new Callback<GetLoansLoanIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdChargesChargeIdResponse> call, Response<GetLoansLoanIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetLoansLoanIdChargesTemplateResponse retrieveTemplate(loanId)

Retrieve Loan Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/charges/template  

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdChargesTemplateResponse> call = apiService.retrieveTemplate(loanId);
call.enqueue(new Callback<GetLoansLoanIdChargesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdChargesTemplateResponse> call, Response<GetLoansLoanIdChargesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdChargesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |

### Return type

[**GetLoansLoanIdChargesTemplateResponse**](GetLoansLoanIdChargesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoanCharge"></a>
# **updateLoanCharge**
> PutLoansLoanIdChargesChargeIdResponse updateLoanCharge(loanId, chargeId, body)

Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example
```java

LoanChargesApi apiService = defaultClient.createService(LoanChargesApi.class);

// Initialize these parameters earlier.
Call<PutLoansLoanIdChargesChargeIdResponse> call = apiService.updateLoanCharge(loanId, chargeId, body);
call.enqueue(new Callback<PutLoansLoanIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<PutLoansLoanIdChargesChargeIdResponse> call, Response<PutLoansLoanIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutLoansLoanIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |
 **body** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)| body |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

