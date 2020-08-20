# SelfAccountTransferApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SelfAccountTransferApi.md#create) | **POST** self/accounttransfers | Create new Transfer
[**template**](SelfAccountTransferApi.md#template) | **GET** self/accounttransfers/template | Retrieve Account Transfer Template


<a name="create"></a>
# **create**
> List&lt;PostNewTransferResponse&gt; create(type, body)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfAccountTransferApi;


SelfAccountTransferApi apiInstance = new SelfAccountTransferApi();
String type = "type_example"; // String | type
String body = "body_example"; // String | 
try {
    List<PostNewTransferResponse> result = apiInstance.create(type, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfAccountTransferApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type | [optional]
 **body** | **String**|  | [optional]

### Return type

[**List&lt;PostNewTransferResponse&gt;**](PostNewTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetAccountTransferTemplateResponse&gt; template(type)

Retrieve Account Transfer Template

Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfAccountTransferApi;


SelfAccountTransferApi apiInstance = new SelfAccountTransferApi();
String type = "type_example"; // String | type
try {
    List<GetAccountTransferTemplateResponse> result = apiInstance.template(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfAccountTransferApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type | [optional]

### Return type

[**List&lt;GetAccountTransferTemplateResponse&gt;**](GetAccountTransferTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

