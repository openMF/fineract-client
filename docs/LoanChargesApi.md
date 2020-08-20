# LoanChargesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
Long chargeId = 789L; // Long | chargeId
try {
    DeleteLoansLoanIdChargesChargeIdResponse result = apiInstance.deleteLoanCharge(loanId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#deleteLoanCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
Long chargeId = 789L; // Long | chargeId
PostLoansLoanIdChargesChargeIdRequest body = new PostLoansLoanIdChargesChargeIdRequest(); // PostLoansLoanIdChargesChargeIdRequest | body
String command = "command_example"; // String | command
try {
    PostLoansLoanIdChargesChargeIdResponse result = apiInstance.executeLoanCharge(loanId, chargeId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#executeLoanCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
PostLoansLoanIdChargesRequest body = new PostLoansLoanIdChargesRequest(); // PostLoansLoanIdChargesRequest | body
String command = "command_example"; // String | command
try {
    PostLoansLoanIdChargesResponse result = apiInstance.executeLoanCharge_0(loanId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#executeLoanCharge_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
try {
    List<GetLoansLoanIdChargesChargeIdResponse> result = apiInstance.retrieveAllLoanCharges(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#retrieveAllLoanCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
Long chargeId = 789L; // Long | chargeId
try {
    GetLoansLoanIdChargesChargeIdResponse result = apiInstance.retrieveLoanCharge(loanId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#retrieveLoanCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
try {
    GetLoansLoanIdChargesTemplateResponse result = apiInstance.retrieveTemplate(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanChargesApi;


LoanChargesApi apiInstance = new LoanChargesApi();
Long loanId = 789L; // Long | loanId
Long chargeId = 789L; // Long | chargeId
PutLoansLoanIdChargesChargeIdRequest body = new PutLoansLoanIdChargesChargeIdRequest(); // PutLoansLoanIdChargesChargeIdRequest | body
try {
    PutLoansLoanIdChargesChargeIdResponse result = apiInstance.updateLoanCharge(loanId, chargeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanChargesApi#updateLoanCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

