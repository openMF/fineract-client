# SavingsChargesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSavingsAccountCharge**](SavingsChargesApi.md#addSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges | Create a Savings account Charge
[**deleteSavingsAccountCharge**](SavingsChargesApi.md#deleteSavingsAccountCharge) | **DELETE** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Delete a Savings account Charge
[**payOrWaiveSavingsAccountCharge**](SavingsChargesApi.md#payOrWaiveSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
[**retrieveAllSavingsAccountCharges**](SavingsChargesApi.md#retrieveAllSavingsAccountCharges) | **GET** savingsaccounts/{savingsAccountId}/charges | List Savings Charges
[**retrieveSavingsAccountCharge**](SavingsChargesApi.md#retrieveSavingsAccountCharge) | **GET** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveTemplate**](SavingsChargesApi.md#retrieveTemplate) | **GET** savingsaccounts/{savingsAccountId}/charges/template | Retrieve Savings Charges Template
[**updateSavingsAccountCharge**](SavingsChargesApi.md#updateSavingsAccountCharge) | **PUT** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Update a Savings account Charge


<a name="addSavingsAccountCharge"></a>
# **addSavingsAccountCharge**
> PostSavingsAccountsSavingsAccountIdChargesResponse addSavingsAccountCharge(savingsAccountId, body)

Create a Savings account Charge

Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
PostSavingsAccountsSavingsAccountIdChargesRequest body = new PostSavingsAccountsSavingsAccountIdChargesRequest(); // PostSavingsAccountsSavingsAccountIdChargesRequest | body
try {
    PostSavingsAccountsSavingsAccountIdChargesResponse result = apiInstance.addSavingsAccountCharge(savingsAccountId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#addSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **body** | [**PostSavingsAccountsSavingsAccountIdChargesRequest**](PostSavingsAccountsSavingsAccountIdChargesRequest.md)| body |

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesResponse**](PostSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSavingsAccountCharge"></a>
# **deleteSavingsAccountCharge**
> DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Delete a Savings account Charge

Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
Long savingsAccountChargeId = 789L; // Long | savingsAccountChargeId
try {
    DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#deleteSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payOrWaiveSavingsAccountCharge"></a>
# **payOrWaiveSavingsAccountCharge**
> PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body, command)

Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge

Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
Long savingsAccountChargeId = 789L; // Long | savingsAccountChargeId
PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = new PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest(); // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | body
String command = "command_example"; // String | command
try {
    PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#payOrWaiveSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |
 **body** | [**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllSavingsAccountCharges"></a>
# **retrieveAllSavingsAccountCharges**
> List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
String chargeStatus = "all"; // String | chargeStatus
try {
    List<GetSavingsAccountsSavingsAccountIdChargesResponse> result = apiInstance.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#retrieveAllSavingsAccountCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;**](GetSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavingsAccountCharge"></a>
# **retrieveSavingsAccountCharge**
> GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
Long savingsAccountChargeId = 789L; // Long | savingsAccountChargeId
try {
    GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#retrieveSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetSavingsAccountsSavingsAccountIdChargesTemplateResponse retrieveTemplate(savingsAccountId)

Retrieve Savings Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsaccounts/1/charges/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
try {
    GetSavingsAccountsSavingsAccountIdChargesTemplateResponse result = apiInstance.retrieveTemplate(savingsAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesTemplateResponse**](GetSavingsAccountsSavingsAccountIdChargesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSavingsAccountCharge"></a>
# **updateSavingsAccountCharge**
> PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body)

Update a Savings account Charge

Currently Savings account Charges may be updated only if the Savings account is not yet approved.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsChargesApi;


SavingsChargesApi apiInstance = new SavingsChargesApi();
Long savingsAccountId = 789L; // Long | savingsAccountId
Long savingsAccountChargeId = 789L; // Long | savingsAccountChargeId
PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = new PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest(); // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | body
try {
    PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsChargesApi#updateSavingsAccountCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |
 **body** | [**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)| body |

### Return type

[**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

