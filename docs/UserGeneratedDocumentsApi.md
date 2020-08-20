# UserGeneratedDocumentsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](UserGeneratedDocumentsApi.md#createTemplate) | **POST** templates | Add a UGD
[**deleteTemplate**](UserGeneratedDocumentsApi.md#deleteTemplate) | **DELETE** templates/{templateId} | Delete a UGD
[**getTemplateByTemplate**](UserGeneratedDocumentsApi.md#getTemplateByTemplate) | **GET** templates/{templateId}/template | 
[**mergeTemplate**](UserGeneratedDocumentsApi.md#mergeTemplate) | **POST** templates/{templateId} | 
[**retrieveAll**](UserGeneratedDocumentsApi.md#retrieveAll) | **GET** templates | Retrieve all UGDs
[**retrieveOne**](UserGeneratedDocumentsApi.md#retrieveOne) | **GET** templates/{templateId} | Retrieve a UGD
[**saveTemplate**](UserGeneratedDocumentsApi.md#saveTemplate) | **PUT** templates/{templateId} | Update a UGD
[**template**](UserGeneratedDocumentsApi.md#template) | **GET** templates/template | Retrieve UGD Details Template


<a name="createTemplate"></a>
# **createTemplate**
> PostTemplatesResponse createTemplate(body)

Add a UGD

Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
PostTemplatesRequest body = new PostTemplatesRequest(); // PostTemplatesRequest | body
try {
    PostTemplatesResponse result = apiInstance.createTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTemplatesRequest**](PostTemplatesRequest.md)| body |

### Return type

[**PostTemplatesResponse**](PostTemplatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> DeleteTemplatesTemplateIdResponse deleteTemplate(templateId)

Delete a UGD



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Long templateId = 789L; // Long | templateId
try {
    DeleteTemplatesTemplateIdResponse result = apiInstance.deleteTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| templateId |

### Return type

[**DeleteTemplatesTemplateIdResponse**](DeleteTemplatesTemplateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplateByTemplate"></a>
# **getTemplateByTemplate**
> String getTemplateByTemplate(templateId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Long templateId = 789L; // Long | 
try {
    String result = apiInstance.getTemplateByTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#getTemplateByTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mergeTemplate"></a>
# **mergeTemplate**
> String mergeTemplate(templateId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Long templateId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.mergeTemplate(templateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#mergeTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="retrieveAll"></a>
# **retrieveAll**
> GetTemplatesResponse retrieveAll(typeId, entityId)

Retrieve all UGDs

Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Integer typeId = -1; // Integer | typeId
Integer entityId = -1; // Integer | entityId
try {
    GetTemplatesResponse result = apiInstance.retrieveAll(typeId, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | **Integer**| typeId | [optional] [default to -1]
 **entityId** | **Integer**| entityId | [optional] [default to -1]

### Return type

[**GetTemplatesResponse**](GetTemplatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetTemplatesTemplateIdResponse retrieveOne(templateId)

Retrieve a UGD

Example Requests:  templates/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Long templateId = 789L; // Long | templateId
try {
    GetTemplatesTemplateIdResponse result = apiInstance.retrieveOne(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| templateId |

### Return type

[**GetTemplatesTemplateIdResponse**](GetTemplatesTemplateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveTemplate"></a>
# **saveTemplate**
> PutTemplatesTemplateIdResponse saveTemplate(templateId, body)

Update a UGD



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
Long templateId = 789L; // Long | templateId
PutTemplatesTemplateIdRequest body = new PutTemplatesTemplateIdRequest(); // PutTemplatesTemplateIdRequest | body
try {
    PutTemplatesTemplateIdResponse result = apiInstance.saveTemplate(templateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#saveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| templateId |
 **body** | [**PutTemplatesTemplateIdRequest**](PutTemplatesTemplateIdRequest.md)| body |

### Return type

[**PutTemplatesTemplateIdResponse**](PutTemplatesTemplateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetTemplatesTemplateResponse template()

Retrieve UGD Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UserGeneratedDocumentsApi;


UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi();
try {
    GetTemplatesTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGeneratedDocumentsApi#template");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTemplatesTemplateResponse**](GetTemplatesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

