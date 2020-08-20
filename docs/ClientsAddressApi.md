# ClientsAddressApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClientAddress**](ClientsAddressApi.md#addClientAddress) | **POST** client/{clientid}/addresses | Create an address for a Client
[**getAddresses**](ClientsAddressApi.md#getAddresses) | **GET** client/{clientid}/addresses | List all addresses for a Client
[**getAddressesTemplate**](ClientsAddressApi.md#getAddressesTemplate) | **GET** client/addresses/template | 
[**updateClientAddress**](ClientsAddressApi.md#updateClientAddress) | **PUT** client/{clientid}/addresses | Update an address for a Client


<a name="addClientAddress"></a>
# **addClientAddress**
> PostClientClientIdAddressesResponse addClientAddress(clientid, body, type)

Create an address for a Client

Mandatory Fields :  type and clientId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientsAddressApi;


ClientsAddressApi apiInstance = new ClientsAddressApi();
Long clientid = 789L; // Long | clientId
PostClientClientIdAddressesRequest body = new PostClientClientIdAddressesRequest(); // PostClientClientIdAddressesRequest | body
Long type = 789L; // Long | type
try {
    PostClientClientIdAddressesResponse result = apiInstance.addClientAddress(clientid, body, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsAddressApi#addClientAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientid** | **Long**| clientId |
 **body** | [**PostClientClientIdAddressesRequest**](PostClientClientIdAddressesRequest.md)| body |
 **type** | **Long**| type | [optional]

### Return type

[**PostClientClientIdAddressesResponse**](PostClientClientIdAddressesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddresses"></a>
# **getAddresses**
> List&lt;GetClientClientIdAddressesResponse&gt; getAddresses(clientid, status, type)

List all addresses for a Client

Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientsAddressApi;


ClientsAddressApi apiInstance = new ClientsAddressApi();
Long clientid = 789L; // Long | clientId
String status = "status_example"; // String | status
Long type = 789L; // Long | type
try {
    List<GetClientClientIdAddressesResponse> result = apiInstance.getAddresses(clientid, status, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsAddressApi#getAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientid** | **Long**| clientId |
 **status** | **String**| status | [optional]
 **type** | **Long**| type | [optional]

### Return type

[**List&lt;GetClientClientIdAddressesResponse&gt;**](GetClientClientIdAddressesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressesTemplate"></a>
# **getAddressesTemplate**
> String getAddressesTemplate()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientsAddressApi;


ClientsAddressApi apiInstance = new ClientsAddressApi();
try {
    String result = apiInstance.getAddressesTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsAddressApi#getAddressesTemplate");
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

<a name="updateClientAddress"></a>
# **updateClientAddress**
> PutClientClientIdAddressesResponse updateClientAddress(clientid, body)

Update an address for a Client

All the address fields can be updated by using update client address API  Mandatory Fields type and addressId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientsAddressApi;


ClientsAddressApi apiInstance = new ClientsAddressApi();
Long clientid = 789L; // Long | clientId
PutClientClientIdAddressesRequest body = new PutClientClientIdAddressesRequest(); // PutClientClientIdAddressesRequest | body
try {
    PutClientClientIdAddressesResponse result = apiInstance.updateClientAddress(clientid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsAddressApi#updateClientAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientid** | **Long**| clientId |
 **body** | [**PutClientClientIdAddressesRequest**](PutClientClientIdAddressesRequest.md)| body |

### Return type

[**PutClientClientIdAddressesResponse**](PutClientClientIdAddressesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

