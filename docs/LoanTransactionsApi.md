# LoanTransactionsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanTransactionsApi;


LoanTransactionsApi apiInstance = new LoanTransactionsApi();
Long loanId = 789L; // Long | loanId
Long transactionId = 789L; // Long | transactionId
PostLoansLoanIdTransactionsTransactionIdRequest body = new PostLoansLoanIdTransactionsTransactionIdRequest(); // PostLoansLoanIdTransactionsTransactionIdRequest | body
try {
    PostLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.adjustLoanTransaction(loanId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanTransactionsApi#adjustLoanTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanTransactionsApi;


LoanTransactionsApi apiInstance = new LoanTransactionsApi();
Long loanId = 789L; // Long | loanId
PostLoansLoanIdTransactionsRequest body = new PostLoansLoanIdTransactionsRequest(); // PostLoansLoanIdTransactionsRequest | body
String command = "command_example"; // String | command
try {
    PostLoansLoanIdTransactionsResponse result = apiInstance.executeLoanTransaction(loanId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanTransactionsApi#executeLoanTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanTransactionsApi;


LoanTransactionsApi apiInstance = new LoanTransactionsApi();
Long loanId = 789L; // Long | loanId
Long transactionId = 789L; // Long | transactionId
try {
    GetLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.retrieveTransaction(loanId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanTransactionsApi#retrieveTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanTransactionsApi;


LoanTransactionsApi apiInstance = new LoanTransactionsApi();
Long loanId = 789L; // Long | loanId
String command = "command_example"; // String | command
String dateFormat = "dateFormat_example"; // String | dateFormat
String transactionDate = "transactionDate_example"; // String | transactionDate
String locale = "locale_example"; // String | locale
try {
    GetLoansLoanIdTransactionsTemplateResponse result = apiInstance.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanTransactionsApi#retrieveTransactionTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

