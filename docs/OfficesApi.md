# OfficesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOffice**](OfficesApi.md#createOffice) | **POST** offices | Create an Office
[**getOfficeTemplate**](OfficesApi.md#getOfficeTemplate) | **GET** offices/downloadtemplate | 
[**postOfficeTemplate**](OfficesApi.md#postOfficeTemplate) | **POST** offices/uploadtemplate | 
[**retreiveOffice**](OfficesApi.md#retreiveOffice) | **GET** offices/{officeId} | Retrieve an Office
[**retrieveOfficeTemplate**](OfficesApi.md#retrieveOfficeTemplate) | **GET** offices/template | Retrieve Office Details Template
[**retrieveOffices**](OfficesApi.md#retrieveOffices) | **GET** offices | List Offices
[**updateOffice**](OfficesApi.md#updateOffice) | **PUT** offices/{officeId} | Update Office


<a name="createOffice"></a>
# **createOffice**
> PostOfficesResponse createOffice(body)

Create an Office

Mandatory Fields name, openingDate, parentId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
PostOfficesRequest body = new PostOfficesRequest(); // PostOfficesRequest | body
try {
    PostOfficesResponse result = apiInstance.createOffice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#createOffice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostOfficesRequest**](PostOfficesRequest.md)| body |

### Return type

[**PostOfficesResponse**](PostOfficesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOfficeTemplate"></a>
# **getOfficeTemplate**
> getOfficeTemplate(dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getOfficeTemplate(dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#getOfficeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postOfficeTemplate"></a>
# **postOfficeTemplate**
> String postOfficeTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postOfficeTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#postOfficeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retreiveOffice"></a>
# **retreiveOffice**
> GetOfficesResponse retreiveOffice(officeId)

Retrieve an Office

Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
Long officeId = 789L; // Long | officeId
try {
    GetOfficesResponse result = apiInstance.retreiveOffice(officeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#retreiveOffice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId |

### Return type

[**GetOfficesResponse**](GetOfficesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOfficeTemplate"></a>
# **retrieveOfficeTemplate**
> GetOfficesTemplateResponse retrieveOfficeTemplate()

Retrieve Office Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  offices/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
try {
    GetOfficesTemplateResponse result = apiInstance.retrieveOfficeTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#retrieveOfficeTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetOfficesTemplateResponse**](GetOfficesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOffices"></a>
# **retrieveOffices**
> List&lt;GetOfficesResponse&gt; retrieveOffices(includeAllOffices, orderBy, sortOrder)

List Offices

Example Requests:  offices   offices?fields&#x3D;id,name,openingDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
Boolean includeAllOffices = false; // Boolean | includeAllOffices
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    List<GetOfficesResponse> result = apiInstance.retrieveOffices(includeAllOffices, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#retrieveOffices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeAllOffices** | **Boolean**| includeAllOffices | [optional] [default to false]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetOfficesResponse&gt;**](GetOfficesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOffice"></a>
# **updateOffice**
> PutOfficesOfficeIdResponse updateOffice(officeId, body)

Update Office



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficesApi;


OfficesApi apiInstance = new OfficesApi();
Long officeId = 789L; // Long | officeId
PutOfficesOfficeIdRequest body = new PutOfficesOfficeIdRequest(); // PutOfficesOfficeIdRequest | body
try {
    PutOfficesOfficeIdResponse result = apiInstance.updateOffice(officeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficesApi#updateOffice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId |
 **body** | [**PutOfficesOfficeIdRequest**](PutOfficesOfficeIdRequest.md)| body |

### Return type

[**PutOfficesOfficeIdResponse**](PutOfficesOfficeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

