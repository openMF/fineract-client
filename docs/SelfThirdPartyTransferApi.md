# SelfThirdPartyTransferApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfThirdPartyTransferApi;


SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi();
PostSelfBeneficiariesTPTRequest body = new PostSelfBeneficiariesTPTRequest(); // PostSelfBeneficiariesTPTRequest | body
try {
    PostSelfBeneficiariesTPTResponse result = apiInstance.add(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfThirdPartyTransferApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfThirdPartyTransferApi;


SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi();
Long beneficiaryId = 789L; // Long | 
try {
    DeleteSelfBeneficiariesTPTBeneficiaryIdResponse result = apiInstance.delete(beneficiaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfThirdPartyTransferApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfThirdPartyTransferApi;


SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi();
try {
    List<GetSelfBeneficiariesTPTResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfThirdPartyTransferApi#retrieveAll");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfThirdPartyTransferApi;


SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi();
try {
    GetSelfBeneficiariesTPTTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfThirdPartyTransferApi#template");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfThirdPartyTransferApi;


SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi();
Long beneficiaryId = 789L; // Long | beneficiaryId
PutSelfBeneficiariesTPTBeneficiaryIdRequest body = new PutSelfBeneficiariesTPTBeneficiaryIdRequest(); // PutSelfBeneficiariesTPTBeneficiaryIdRequest | body
try {
    PutSelfBeneficiariesTPTBeneficiaryIdResponse result = apiInstance.update(beneficiaryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfThirdPartyTransferApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiaryId** | **Long**| beneficiaryId |
 **body** | [**PutSelfBeneficiariesTPTBeneficiaryIdRequest**](PutSelfBeneficiariesTPTBeneficiaryIdRequest.md)| body |

### Return type

[**PutSelfBeneficiariesTPTBeneficiaryIdResponse**](PutSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

