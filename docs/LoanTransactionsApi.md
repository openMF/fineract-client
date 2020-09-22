# LoanTransactionsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustLoanTransaction**](LoanTransactionsApi.md#adjustLoanTransaction) | **POST** loans/{loanId}/transactions/{transactionId} | Adjust a Transaction
[**executeLoanTransaction**](LoanTransactionsApi.md#executeLoanTransaction) | **POST** loans/{loanId}/transactions | Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction
[**retrieveTransaction**](LoanTransactionsApi.md#retrieveTransaction) | **GET** loans/{loanId}/transactions/{transactionId} | Retrieve a Transaction Details
[**retrieveTransactionTemplate**](LoanTransactionsApi.md#retrieveTransactionTemplate) | **GET** loans/{loanId}/transactions/template | Retrieve Loan Transaction Template


<a name="adjustLoanTransaction"></a>
# **adjustLoanTransaction**
> PostLoansLoanIdTransactionsTransactionIdResponse adjustLoanTransaction(loanId, transactionId, body)

Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example
```java

LoanTransactionsApi apiService = defaultClient.createService(LoanTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdTransactionsTransactionIdResponse> call = apiService.adjustLoanTransaction(loanId, transactionId, body);
call.enqueue(new Callback<PostLoansLoanIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdTransactionsTransactionIdResponse> call, Response<PostLoansLoanIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **transactionId** | **Long**| transactionId |
 **body** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)| body |

### Return type

[**PostLoansLoanIdTransactionsTransactionIdResponse**](PostLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeLoanTransaction"></a>
# **executeLoanTransaction**
> PostLoansLoanIdTransactionsResponse executeLoanTransaction(loanId, body, command)

Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction

Make Recovery Payment:  This API allows collecting recovery payments for written-off loans

### Example
```java

LoanTransactionsApi apiService = defaultClient.createService(LoanTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdTransactionsResponse> call = apiService.executeLoanTransaction(loanId, body, command);
call.enqueue(new Callback<PostLoansLoanIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdTransactionsResponse> call, Response<PostLoansLoanIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **body** | [**PostLoansLoanIdTransactionsRequest**](PostLoansLoanIdTransactionsRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTransaction"></a>
# **retrieveTransaction**
> GetLoansLoanIdTransactionsTransactionIdResponse retrieveTransaction(loanId, transactionId)

Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/5/transactions/3

### Example
```java

LoanTransactionsApi apiService = defaultClient.createService(LoanTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdTransactionsTransactionIdResponse> call = apiService.retrieveTransaction(loanId, transactionId);
call.enqueue(new Callback<GetLoansLoanIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdTransactionsTransactionIdResponse> call, Response<GetLoansLoanIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTransactionTemplate"></a>
# **retrieveTransactionTemplate**
> GetLoansLoanIdTransactionsTemplateResponse retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale)

Retrieve Loan Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  loans/1/transactions/template?command&#x3D;repayment

### Example
```java

LoanTransactionsApi apiService = defaultClient.createService(LoanTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdTransactionsTemplateResponse> call = apiService.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale);
call.enqueue(new Callback<GetLoansLoanIdTransactionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdTransactionsTemplateResponse> call, Response<GetLoansLoanIdTransactionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdTransactionsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **command** | **String**| command | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **transactionDate** | **String**| transactionDate | [optional]
 **locale** | **String**| locale | [optional]

### Return type

[**GetLoansLoanIdTransactionsTemplateResponse**](GetLoansLoanIdTransactionsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

