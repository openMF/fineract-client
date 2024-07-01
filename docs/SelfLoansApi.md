# SelfLoansApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitLoanApplication1**](SelfLoansApi.md#calculateLoanScheduleOrSubmitLoanApplication1) | **POST** self/loans | Calculate Loan Repayment Schedule | Submit a new Loan Application
[**modifyLoanApplication1**](SelfLoansApi.md#modifyLoanApplication1) | **PUT** self/loans/{loanId} | Update a Loan Application
[**retrieveAllLoanCharges1**](SelfLoansApi.md#retrieveAllLoanCharges1) | **GET** self/loans/{loanId}/charges | List Loan Charges
[**retrieveGuarantorDetails2**](SelfLoansApi.md#retrieveGuarantorDetails2) | **GET** self/loans/{loanId}/guarantors | 
[**retrieveLoan1**](SelfLoansApi.md#retrieveLoan1) | **GET** self/loans/{loanId} | Retrieve a Loan
[**retrieveLoanCharge1**](SelfLoansApi.md#retrieveLoanCharge1) | **GET** self/loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge
[**retrieveTransaction1**](SelfLoansApi.md#retrieveTransaction1) | **GET** self/loans/{loanId}/transactions/{transactionId} | Retrieve a Loan Transaction Details
[**stateTransitions1**](SelfLoansApi.md#stateTransitions1) | **POST** self/loans/{loanId} | Applicant Withdraws from Loan Application
[**template17**](SelfLoansApi.md#template17) | **GET** self/loans/template | Retrieve Loan Details Template



## calculateLoanScheduleOrSubmitLoanApplication1

> PostSelfLoansResponse calculateLoanScheduleOrSubmitLoanApplication1(postSelfLoansRequest, command)

Calculate Loan Repayment Schedule | Submit a new Loan Application

Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyCode  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        PostSelfLoansRequest postSelfLoansRequest = new PostSelfLoansRequest(); // PostSelfLoansRequest | 
        String command = "command_example"; // String | command
        try {
            PostSelfLoansResponse result = apiInstance.calculateLoanScheduleOrSubmitLoanApplication1(postSelfLoansRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#calculateLoanScheduleOrSubmitLoanApplication1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSelfLoansRequest** | [**PostSelfLoansRequest**](PostSelfLoansRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansResponse**](PostSelfLoansResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## modifyLoanApplication1

> PutSelfLoansLoanIdResponse modifyLoanApplication1(loanId, putSelfLoansLoanIdRequest)

Update a Loan Application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        PutSelfLoansLoanIdRequest putSelfLoansLoanIdRequest = new PutSelfLoansLoanIdRequest(); // PutSelfLoansLoanIdRequest | 
        try {
            PutSelfLoansLoanIdResponse result = apiInstance.modifyLoanApplication1(loanId, putSelfLoansLoanIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#modifyLoanApplication1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **putSelfLoansLoanIdRequest** | [**PutSelfLoansLoanIdRequest**](PutSelfLoansLoanIdRequest.md)|  |

### Return type

[**PutSelfLoansLoanIdResponse**](PutSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllLoanCharges1

> List&lt;GetSelfLoansLoanIdChargesResponse&gt; retrieveAllLoanCharges1(loanId)

List Loan Charges

Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            List<GetSelfLoansLoanIdChargesResponse> result = apiInstance.retrieveAllLoanCharges1(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#retrieveAllLoanCharges1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetSelfLoansLoanIdChargesResponse&gt;**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveGuarantorDetails2

> String retrieveGuarantorDetails2(loanId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveGuarantorDetails2(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#retrieveGuarantorDetails2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveLoan1

> GetSelfLoansLoanIdResponse retrieveLoan1(loanId)

Retrieve a Loan

Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            GetSelfLoansLoanIdResponse result = apiInstance.retrieveLoan1(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#retrieveLoan1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**GetSelfLoansLoanIdResponse**](GetSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveLoanCharge1

> GetSelfLoansLoanIdChargesResponse retrieveLoanCharge1(loanId, chargeId)

Retrieve a Loan Charge

Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long chargeId = 56L; // Long | chargeId
        try {
            GetSelfLoansLoanIdChargesResponse result = apiInstance.retrieveLoanCharge1(loanId, chargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#retrieveLoanCharge1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfLoansLoanIdChargesResponse**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTransaction1

> GetSelfLoansLoanIdTransactionsTransactionIdResponse retrieveTransaction1(loanId, transactionId)

Retrieve a Loan Transaction Details

Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long transactionId = 56L; // Long | transactionId
        try {
            GetSelfLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.retrieveTransaction1(loanId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#retrieveTransaction1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfLoansLoanIdTransactionsTransactionIdResponse**](GetSelfLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## stateTransitions1

> PostSelfLoansLoanIdResponse stateTransitions1(loanId, postSelfLoansLoanIdRequest, command)

Applicant Withdraws from Loan Application

Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        PostSelfLoansLoanIdRequest postSelfLoansLoanIdRequest = new PostSelfLoansLoanIdRequest(); // PostSelfLoansLoanIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostSelfLoansLoanIdResponse result = apiInstance.stateTransitions1(loanId, postSelfLoansLoanIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#stateTransitions1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **postSelfLoansLoanIdRequest** | [**PostSelfLoansLoanIdRequest**](PostSelfLoansLoanIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansLoanIdResponse**](PostSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template17

> GetSelfLoansTemplateResponse template17(clientId, productId, templateType)

Retrieve Loan Details Template

Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfLoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfLoansApi apiInstance = new SelfLoansApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long productId = 56L; // Long | productId
        String templateType = "templateType_example"; // String | templateType
        try {
            GetSelfLoansTemplateResponse result = apiInstance.template17(clientId, productId, templateType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfLoansApi#template17");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]
 **templateType** | **String**| templateType | [optional]

### Return type

[**GetSelfLoansTemplateResponse**](GetSelfLoansTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

