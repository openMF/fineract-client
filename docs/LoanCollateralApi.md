# LoanCollateralApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
Long loanId = 789L; // Long | loanId
PostLoansLoanIdCollateralsRequest body = new PostLoansLoanIdCollateralsRequest(); // PostLoansLoanIdCollateralsRequest | body
try {
    PostLoansLoanIdCollateralsResponse result = apiInstance.createCollateral(loanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#createCollateral");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
Long loanId = 789L; // Long | loanId
Long collateralId = 789L; // Long | collateralId
try {
    DeleteLoansLoanIdCollateralsCollateralIdResponse result = apiInstance.deleteCollateral(loanId, collateralId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#deleteCollateral");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
try {
    GetLoansLoanIdCollateralsTemplateResponse result = apiInstance.newCollateralTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#newCollateralTemplate");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
Long loanId = 789L; // Long | loanId
try {
    List<GetLoansLoanIdCollateralsResponse> result = apiInstance.retrieveCollateralDetails(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#retrieveCollateralDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
Long loanId = 789L; // Long | loanId
Long collateralId = 789L; // Long | collateralId
try {
    GetLoansLoanIdCollateralsResponse result = apiInstance.retrieveCollateralDetails_0(loanId, collateralId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#retrieveCollateralDetails_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanCollateralApi;


LoanCollateralApi apiInstance = new LoanCollateralApi();
Long loanId = 789L; // Long | loanId
Long collateralId = 789L; // Long | collateralId
PutLoansLoandIdCollateralsCollateralIdRequest body = new PutLoansLoandIdCollateralsCollateralIdRequest(); // PutLoansLoandIdCollateralsCollateralIdRequest | body
try {
    PutLoansLoanIdCollateralsCollateralIdResponse result = apiInstance.updateCollateral(loanId, collateralId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanCollateralApi#updateCollateral");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

