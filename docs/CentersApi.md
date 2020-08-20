# CentersApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate**](CentersApi.md#activate) | **POST** centers/{centerId} | Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
[**create**](CentersApi.md#create) | **POST** centers | Create a Center
[**delete**](CentersApi.md#delete) | **DELETE** centers/{centerId} | Delete a Center
[**getCentersTemplate**](CentersApi.md#getCentersTemplate) | **GET** centers/downloadtemplate | 
[**postCentersTemplate**](CentersApi.md#postCentersTemplate) | **POST** centers/uploadtemplate | 
[**retrieveAll**](CentersApi.md#retrieveAll) | **GET** centers | List Centers
[**retrieveGroupAccount**](CentersApi.md#retrieveGroupAccount) | **GET** centers/{centerId}/accounts | Retrieve Center accounts overview
[**retrieveOne**](CentersApi.md#retrieveOne) | **GET** centers/{centerId} | Retrieve a Center
[**retrieveTemplate**](CentersApi.md#retrieveTemplate) | **GET** centers/template | Retrieve a Center Template
[**update**](CentersApi.md#update) | **PUT** centers/{centerId} | Update a Center


<a name="activate"></a>
# **activate**
> PostCentersCenterIdResponse activate(centerId, body, command)

Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups

Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long centerId = 789L; // Long | centerId
PostCentersCenterIdRequest body = new PostCentersCenterIdRequest(); // PostCentersCenterIdRequest | body
String command = "command_example"; // String | command
try {
    PostCentersCenterIdResponse result = apiInstance.activate(centerId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#activate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |
 **body** | [**PostCentersCenterIdRequest**](PostCentersCenterIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostCentersCenterIdResponse**](PostCentersCenterIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create"></a>
# **create**
> PostCentersResponse create(body)

Create a Center

Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
PostCentersRequest body = new PostCentersRequest(); // PostCentersRequest | body
try {
    PostCentersResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCentersRequest**](PostCentersRequest.md)| body |

### Return type

[**PostCentersResponse**](PostCentersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteCentersCenterIdResponse delete(centerId)

Delete a Center

A Center can be deleted if it is in pending state and has no association - groups, loans or savings

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long centerId = 789L; // Long | centerId
try {
    DeleteCentersCenterIdResponse result = apiInstance.delete(centerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |

### Return type

[**DeleteCentersCenterIdResponse**](DeleteCentersCenterIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCentersTemplate"></a>
# **getCentersTemplate**
> getCentersTemplate(officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getCentersTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#getCentersTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postCentersTemplate"></a>
# **postCentersTemplate**
> String postCentersTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postCentersTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#postCentersTemplate");
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

<a name="retrieveAll"></a>
# **retrieveAll**
> GetCentersResponse retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale)

List Centers

The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with value -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
Long officeId = 789L; // Long | officeId
Long staffId = 789L; // Long | staffId
String externalId = "externalId_example"; // String | externalId
String name = "name_example"; // String | name
String underHierarchy = "underHierarchy_example"; // String | underHierarchy
Boolean paged = true; // Boolean | paged
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
String meetingDate = "meetingDate_example"; // String | meetingDate
String dateFormat = "dateFormat_example"; // String | dateFormat
String locale = "locale_example"; // String | locale
try {
    GetCentersResponse result = apiInstance.retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffId** | **Long**| staffId | [optional]
 **externalId** | **String**| externalId | [optional]
 **name** | **String**| name | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **meetingDate** | **String**| meetingDate | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **locale** | **String**| locale | [optional]

### Return type

[**GetCentersResponse**](GetCentersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveGroupAccount"></a>
# **retrieveGroupAccount**
> GetCentersCenterIdAccountsResponse retrieveGroupAccount(centerId)

Retrieve Center accounts overview

An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long centerId = 789L; // Long | centerId
try {
    GetCentersCenterIdAccountsResponse result = apiInstance.retrieveGroupAccount(centerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#retrieveGroupAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |

### Return type

[**GetCentersCenterIdAccountsResponse**](GetCentersCenterIdAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetCentersCenterIdResponse retrieveOne(centerId, staffInSelectedOfficeOnly)

Retrieve a Center

Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long centerId = 789L; // Long | centerId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetCentersCenterIdResponse result = apiInstance.retrieveOne(centerId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersCenterIdResponse**](GetCentersCenterIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetCentersTemplateResponse retrieveTemplate(command, officeId, staffInSelectedOfficeOnly)

Retrieve a Center Template

Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
String command = "command_example"; // String | command
Long officeId = 789L; // Long | officeId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetCentersTemplateResponse result = apiInstance.retrieveTemplate(command, officeId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **command** | **String**| command | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersTemplateResponse**](GetCentersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutCentersCenterIdResponse update(centerId, body)

Update a Center

Updates a Center

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CentersApi;


CentersApi apiInstance = new CentersApi();
Long centerId = 789L; // Long | centerId
PutCentersCenterIdRequest body = new PutCentersCenterIdRequest(); // PutCentersCenterIdRequest | body
try {
    PutCentersCenterIdResponse result = apiInstance.update(centerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CentersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |
 **body** | [**PutCentersCenterIdRequest**](PutCentersCenterIdRequest.md)| body |

### Return type

[**PutCentersCenterIdResponse**](PutCentersCenterIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

