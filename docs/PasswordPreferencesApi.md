# PasswordPreferencesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve**](PasswordPreferencesApi.md#retrieve) | **GET** passwordpreferences | 
[**template**](PasswordPreferencesApi.md#template) | **GET** passwordpreferences/template | List Application Password validation policies
[**update**](PasswordPreferencesApi.md#update) | **PUT** passwordpreferences | Update password preferences


<a name="retrieve"></a>
# **retrieve**
> GetPasswordPreferencesTemplateResponse retrieve()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PasswordPreferencesApi;


PasswordPreferencesApi apiInstance = new PasswordPreferencesApi();
try {
    GetPasswordPreferencesTemplateResponse result = apiInstance.retrieve();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordPreferencesApi#retrieve");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPasswordPreferencesTemplateResponse**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetPasswordPreferencesTemplateResponse&gt; template()

List Application Password validation policies

ARGUMENTS Example Requests:  passwordpreferences

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PasswordPreferencesApi;


PasswordPreferencesApi apiInstance = new PasswordPreferencesApi();
try {
    List<GetPasswordPreferencesTemplateResponse> result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordPreferencesApi#template");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPasswordPreferencesTemplateResponse&gt;**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(body)

Update password preferences



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PasswordPreferencesApi;


PasswordPreferencesApi apiInstance = new PasswordPreferencesApi();
PutPasswordPreferencesTemplateRequest body = new PutPasswordPreferencesTemplateRequest(); // PutPasswordPreferencesTemplateRequest | body
try {
    apiInstance.update(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordPreferencesApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPasswordPreferencesTemplateRequest**](PutPasswordPreferencesTemplateRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

