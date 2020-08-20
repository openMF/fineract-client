# ClientChargesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyClientCharge**](ClientChargesApi.md#applyClientCharge) | **POST** clients/{clientId}/charges | Add Client Charge
[**deleteClientCharge**](ClientChargesApi.md#deleteClientCharge) | **DELETE** clients/{clientId}/charges/{chargeId} | Delete a Client Charge
[**payOrWaiveClientCharge**](ClientChargesApi.md#payOrWaiveClientCharge) | **POST** clients/{clientId}/charges/{chargeId} | Pay a Client Charge | Waive a Client Charge
[**retrieveAllClientCharges**](ClientChargesApi.md#retrieveAllClientCharges) | **GET** clients/{clientId}/charges | List Client Charges
[**retrieveClientCharge**](ClientChargesApi.md#retrieveClientCharge) | **GET** clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveTemplate**](ClientChargesApi.md#retrieveTemplate) | **GET** clients/{clientId}/charges/template | 


<a name="applyClientCharge"></a>
# **applyClientCharge**
> PostClientsClientIdChargesResponse applyClientCharge(clientId, body)

Add Client Charge

 This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
Long clientId = 789L; // Long | clientId
PostClientsClientIdChargesRequest body = new PostClientsClientIdChargesRequest(); // PostClientsClientIdChargesRequest | body
try {
    PostClientsClientIdChargesResponse result = apiInstance.applyClientCharge(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#applyClientCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **body** | [**PostClientsClientIdChargesRequest**](PostClientsClientIdChargesRequest.md)| body |

### Return type

[**PostClientsClientIdChargesResponse**](PostClientsClientIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientCharge"></a>
# **deleteClientCharge**
> DeleteClientsClientIdChargesChargeIdResponse deleteClientCharge(clientId, chargeId)

Delete a Client Charge

Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
Long clientId = 789L; // Long | clientId
Long chargeId = 789L; // Long | chargeId
try {
    DeleteClientsClientIdChargesChargeIdResponse result = apiInstance.deleteClientCharge(clientId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#deleteClientCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteClientsClientIdChargesChargeIdResponse**](DeleteClientsClientIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payOrWaiveClientCharge"></a>
# **payOrWaiveClientCharge**
> PostClientsClientIdChargesChargeIdResponse payOrWaiveClientCharge(clientId, chargeId, body, command)

Pay a Client Charge | Waive a Client Charge

Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
Long clientId = 789L; // Long | clientId
Long chargeId = 789L; // Long | chargeId
PostClientsClientIdChargesChargeIdRequest body = new PostClientsClientIdChargesChargeIdRequest(); // PostClientsClientIdChargesChargeIdRequest | body
String command = "command_example"; // String | command
try {
    PostClientsClientIdChargesChargeIdResponse result = apiInstance.payOrWaiveClientCharge(clientId, chargeId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#payOrWaiveClientCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |
 **body** | [**PostClientsClientIdChargesChargeIdRequest**](PostClientsClientIdChargesChargeIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostClientsClientIdChargesChargeIdResponse**](PostClientsClientIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientCharges"></a>
# **retrieveAllClientCharges**
> GetClientsClientIdChargesResponse retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
Long clientId = 789L; // Long | clientId
String chargeStatus = "all"; // String | chargeStatus
Boolean pendingPayment = true; // Boolean | pendingPayment
Integer limit = 56; // Integer | limit
Integer offset = 56; // Integer | offset
try {
    GetClientsClientIdChargesResponse result = apiInstance.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#retrieveAllClientCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetClientsClientIdChargesResponse**](GetClientsClientIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientCharge"></a>
# **retrieveClientCharge**
> GetClientsChargesPageItems retrieveClientCharge(clientId, chargeId)

Retrieve a Client Charge

Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
Long clientId = 789L; // Long | clientId
Long chargeId = 789L; // Long | chargeId
try {
    GetClientsChargesPageItems result = apiInstance.retrieveClientCharge(clientId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#retrieveClientCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetClientsChargesPageItems**](GetClientsChargesPageItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientChargesApi;


ClientChargesApi apiInstance = new ClientChargesApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientChargesApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

