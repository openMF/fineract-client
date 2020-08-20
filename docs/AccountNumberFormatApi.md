# AccountNumberFormatApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccountNumberFormatApi.md#create) | **POST** accountnumberformats | Create an Account number format
[**delete**](AccountNumberFormatApi.md#delete) | **DELETE** accountnumberformats/{accountNumberFormatId} | Delete an Account number format
[**retrieveAll**](AccountNumberFormatApi.md#retrieveAll) | **GET** accountnumberformats | List Account number formats
[**retrieveOne**](AccountNumberFormatApi.md#retrieveOne) | **GET** accountnumberformats/{accountNumberFormatId} | Retrieve an Account number format
[**retrieveTemplate**](AccountNumberFormatApi.md#retrieveTemplate) | **GET** accountnumberformats/template | Retrieve Account number format Template
[**update**](AccountNumberFormatApi.md#update) | **PUT** accountnumberformats/{accountNumberFormatId} | Update an Account number format


<a name="create"></a>
# **create**
> PostAccountNumberFormatsResponse create(body)

Create an Account number format

Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
PostAccountNumberFormatsRequest body = new PostAccountNumberFormatsRequest(); // PostAccountNumberFormatsRequest | body
try {
    PostAccountNumberFormatsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountNumberFormatsRequest**](PostAccountNumberFormatsRequest.md)| body | [optional]

### Return type

[**PostAccountNumberFormatsResponse**](PostAccountNumberFormatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteAccountNumberFormatsResponse delete(accountNumberFormatId)

Delete an Account number format

Note: Account numbers created while this format was active would remain unchanged.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
Long accountNumberFormatId = 789L; // Long | accountNumberFormatId
try {
    DeleteAccountNumberFormatsResponse result = apiInstance.delete(accountNumberFormatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**DeleteAccountNumberFormatsResponse**](DeleteAccountNumberFormatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetAccountNumberFormatsIdResponse&gt; retrieveAll()

List Account number formats

Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
try {
    List<GetAccountNumberFormatsIdResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetAccountNumberFormatsIdResponse&gt;**](GetAccountNumberFormatsIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetAccountNumberFormatsIdResponse retrieveOne(accountNumberFormatId)

Retrieve an Account number format

Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
Long accountNumberFormatId = 789L; // Long | accountNumberFormatId
try {
    GetAccountNumberFormatsIdResponse result = apiInstance.retrieveOne(accountNumberFormatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**GetAccountNumberFormatsIdResponse**](GetAccountNumberFormatsIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetAccountNumberFormatsResponseTemplate retrieveTemplate()

Retrieve Account number format Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
try {
    GetAccountNumberFormatsResponseTemplate result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountNumberFormatsResponseTemplate**](GetAccountNumberFormatsResponseTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutAccountNumberFormatsResponse update(accountNumberFormatId, body)

Update an Account number format



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountNumberFormatApi;


AccountNumberFormatApi apiInstance = new AccountNumberFormatApi();
Long accountNumberFormatId = 789L; // Long | accountNumberFormatId
PutAccountNumberFormatsRequest body = new PutAccountNumberFormatsRequest(); // PutAccountNumberFormatsRequest | body
try {
    PutAccountNumberFormatsResponse result = apiInstance.update(accountNumberFormatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountNumberFormatApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumberFormatId** | **Long**| accountNumberFormatId |
 **body** | [**PutAccountNumberFormatsRequest**](PutAccountNumberFormatsRequest.md)| body |

### Return type

[**PutAccountNumberFormatsResponse**](PutAccountNumberFormatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

