# AccountTransfersApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
PostAccountTransfersRequest body = new PostAccountTransfersRequest(); // PostAccountTransfersRequest | body
try {
    PostAccountTransfersResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
String externalId = "externalId_example"; // String | externalId
Integer offset = 56; // Integer | offset
Integer limit = limit; // Integer | 
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
Long accountDetailId = 789L; // Long | accountDetailId
try {
    GetAccountTransfersResponse result = apiInstance.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
Long transferId = 789L; // Long | transferId
try {
    GetAccountTransfersPageItems result = apiInstance.retrieveOne(transferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
Long fromOfficeId = 789L; // Long | fromOfficeId
Long fromClientId = 789L; // Long | fromClientId
Long fromAccountId = 789L; // Long | fromAccountId
Integer fromAccountType = 56; // Integer | fromAccountType
Long toOfficeId = 789L; // Long | toOfficeId
Long toClientId = 789L; // Long | toClientId
Long toAccountId = 789L; // Long | toAccountId
Integer toAccountType = 56; // Integer | toAccountType
try {
    GetAccountTransfersTemplateResponse result = apiInstance.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
Long fromOfficeId = 789L; // Long | fromOfficeId
Long fromClientId = 789L; // Long | fromClientId
Long fromAccountId = 789L; // Long | fromAccountId
Integer fromAccountType = 56; // Integer | fromAccountType
Long toOfficeId = 789L; // Long | toOfficeId
Long toClientId = 789L; // Long | toClientId
Long toAccountId = 789L; // Long | toAccountId
Integer toAccountType = 56; // Integer | toAccountType
try {
    GetAccountTransfersTemplateRefundByTransferResponse result = apiInstance.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#templateRefundByTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountTransfersApi;


AccountTransfersApi apiInstance = new AccountTransfersApi();
PostAccountTransfersRefundByTransferRequest body = new PostAccountTransfersRefundByTransferRequest(); // PostAccountTransfersRefundByTransferRequest | body
try {
    PostAccountTransfersRefundByTransferResponse result = apiInstance.templateRefundByTransferPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountTransfersApi#templateRefundByTransferPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountTransfersRefundByTransferRequest**](PostAccountTransfersRefundByTransferRequest.md)| body |

### Return type

[**PostAccountTransfersRefundByTransferResponse**](PostAccountTransfersRefundByTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

