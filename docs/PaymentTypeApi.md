# PaymentTypeApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentType**](PaymentTypeApi.md#createPaymentType) | **POST** paymenttypes | Create a Payment Type
[**deleteCode**](PaymentTypeApi.md#deleteCode) | **DELETE** paymenttypes/{paymentTypeId} | Delete a Payment Type
[**getAllPaymentTypes**](PaymentTypeApi.md#getAllPaymentTypes) | **GET** paymenttypes | Retrieve all Payment Types
[**retrieveOnePaymentType**](PaymentTypeApi.md#retrieveOnePaymentType) | **GET** paymenttypes/{paymentTypeId} | Retrieve a Payment Type
[**updatePaymentType**](PaymentTypeApi.md#updatePaymentType) | **PUT** paymenttypes/{paymentTypeId} | Update a Payment Type


<a name="createPaymentType"></a>
# **createPaymentType**
> PostPaymentTypesResponse createPaymentType(body)

Create a Payment Type

Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PaymentTypeApi;


PaymentTypeApi apiInstance = new PaymentTypeApi();
PostPaymentTypesRequest body = new PostPaymentTypesRequest(); // PostPaymentTypesRequest | body
try {
    PostPaymentTypesResponse result = apiInstance.createPaymentType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypeApi#createPaymentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostPaymentTypesRequest**](PostPaymentTypesRequest.md)| body |

### Return type

[**PostPaymentTypesResponse**](PostPaymentTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCode"></a>
# **deleteCode**
> DeletePaymentTypesPaymentTypeIdResponse deleteCode(paymentTypeId)

Delete a Payment Type

Deletes payment type

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PaymentTypeApi;


PaymentTypeApi apiInstance = new PaymentTypeApi();
Long paymentTypeId = 789L; // Long | paymentTypeId
try {
    DeletePaymentTypesPaymentTypeIdResponse result = apiInstance.deleteCode(paymentTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypeApi#deleteCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**DeletePaymentTypesPaymentTypeIdResponse**](DeletePaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllPaymentTypes"></a>
# **getAllPaymentTypes**
> List&lt;GetPaymentTypesResponse&gt; getAllPaymentTypes()

Retrieve all Payment Types

Retrieve list of payment types

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PaymentTypeApi;


PaymentTypeApi apiInstance = new PaymentTypeApi();
try {
    List<GetPaymentTypesResponse> result = apiInstance.getAllPaymentTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypeApi#getAllPaymentTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPaymentTypesResponse&gt;**](GetPaymentTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="retrieveOnePaymentType"></a>
# **retrieveOnePaymentType**
> GetPaymentTypesPaymentTypeIdResponse retrieveOnePaymentType(paymentTypeId)

Retrieve a Payment Type

Retrieves a payment type

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PaymentTypeApi;


PaymentTypeApi apiInstance = new PaymentTypeApi();
Long paymentTypeId = 789L; // Long | paymentTypeId
try {
    GetPaymentTypesPaymentTypeIdResponse result = apiInstance.retrieveOnePaymentType(paymentTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypeApi#retrieveOnePaymentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**GetPaymentTypesPaymentTypeIdResponse**](GetPaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="updatePaymentType"></a>
# **updatePaymentType**
> PutPaymentTypesPaymentTypeIdResponse updatePaymentType(paymentTypeId, body)

Update a Payment Type

Updates a Payment Type

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PaymentTypeApi;


PaymentTypeApi apiInstance = new PaymentTypeApi();
Long paymentTypeId = 789L; // Long | paymentTypeId
PutPaymentTypesPaymentTypeIdRequest body = new PutPaymentTypesPaymentTypeIdRequest(); // PutPaymentTypesPaymentTypeIdRequest | body
try {
    PutPaymentTypesPaymentTypeIdResponse result = apiInstance.updatePaymentType(paymentTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTypeApi#updatePaymentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTypeId** | **Long**| paymentTypeId |
 **body** | [**PutPaymentTypesPaymentTypeIdRequest**](PutPaymentTypesPaymentTypeIdRequest.md)| body |

### Return type

[**PutPaymentTypesPaymentTypeIdResponse**](PutPaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

