# ChargesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCharge**](ChargesApi.md#createCharge) | **POST** charges | Create/Define a Charge
[**deleteCharge**](ChargesApi.md#deleteCharge) | **DELETE** charges/{chargeId} | Delete a Charge
[**retrieveAllCharges**](ChargesApi.md#retrieveAllCharges) | **GET** charges | Retrieve Charges
[**retrieveCharge**](ChargesApi.md#retrieveCharge) | **GET** charges/{chargeId} | Retrieve a Charge
[**retrieveNewChargeDetails**](ChargesApi.md#retrieveNewChargeDetails) | **GET** charges/template | Retrieve Charge Template
[**updateCharge**](ChargesApi.md#updateCharge) | **PUT** charges/{chargeId} | Update a Charge


<a name="createCharge"></a>
# **createCharge**
> PostChargesResponse createCharge(body)

Create/Define a Charge

Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
PostChargesRequest body = new PostChargesRequest(); // PostChargesRequest | body
try {
    PostChargesResponse result = apiInstance.createCharge(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#createCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostChargesRequest**](PostChargesRequest.md)| body |

### Return type

[**PostChargesResponse**](PostChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCharge"></a>
# **deleteCharge**
> DeleteChargesChargeIdResponse deleteCharge(chargeId)

Delete a Charge

Deletes a Charge.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
Long chargeId = 789L; // Long | chargeId
try {
    DeleteChargesChargeIdResponse result = apiInstance.deleteCharge(chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#deleteCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteChargesChargeIdResponse**](DeleteChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllCharges"></a>
# **retrieveAllCharges**
> List&lt;GetChargesResponse&gt; retrieveAllCharges()

Retrieve Charges

Returns the list of defined charges.  Example Requests:  charges

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
try {
    List<GetChargesResponse> result = apiInstance.retrieveAllCharges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#retrieveAllCharges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetChargesResponse&gt;**](GetChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCharge"></a>
# **retrieveCharge**
> GetChargesResponse retrieveCharge(chargeId)

Retrieve a Charge

Returns the details of a defined Charge.  Example Requests:  charges/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
Long chargeId = 789L; // Long | chargeId
try {
    GetChargesResponse result = apiInstance.retrieveCharge(chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#retrieveCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeId** | **Long**| chargeId |

### Return type

[**GetChargesResponse**](GetChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveNewChargeDetails"></a>
# **retrieveNewChargeDetails**
> GetChargesTemplateResponse retrieveNewChargeDetails()

Retrieve Charge Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  charges/template 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
try {
    GetChargesTemplateResponse result = apiInstance.retrieveNewChargeDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#retrieveNewChargeDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetChargesTemplateResponse**](GetChargesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCharge"></a>
# **updateCharge**
> PutChargesChargeIdResponse updateCharge(chargeId, body)

Update a Charge

Updates the details of a Charge.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ChargesApi;


ChargesApi apiInstance = new ChargesApi();
Long chargeId = 789L; // Long | chargeId
PutChargesChargeIdRequest body = new PutChargesChargeIdRequest(); // PutChargesChargeIdRequest | body
try {
    PutChargesChargeIdResponse result = apiInstance.updateCharge(chargeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#updateCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeId** | **Long**| chargeId |
 **body** | [**PutChargesChargeIdRequest**](PutChargesChargeIdRequest.md)| body |

### Return type

[**PutChargesChargeIdResponse**](PutChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

