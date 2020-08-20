# UsersApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UsersApi.md#create) | **POST** users | Create a User
[**delete**](UsersApi.md#delete) | **DELETE** users/{userId} | Delete a User
[**getUserTemplate**](UsersApi.md#getUserTemplate) | **GET** users/downloadtemplate | 
[**postUsersTemplate**](UsersApi.md#postUsersTemplate) | **POST** users/uploadtemplate | 
[**retrieveAll**](UsersApi.md#retrieveAll) | **GET** users | Retrieve list of users
[**retrieveOne**](UsersApi.md#retrieveOne) | **GET** users/{userId} | Retrieve a User
[**template**](UsersApi.md#template) | **GET** users/template | Retrieve User Details Template
[**update**](UsersApi.md#update) | **PUT** users/{userId} | Update a User


<a name="create"></a>
# **create**
> PostUsersResponse create(body)

Create a User

Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
PostUsersRequest body = new PostUsersRequest(); // PostUsersRequest | body
try {
    PostUsersResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostUsersRequest**](PostUsersRequest.md)| body |

### Return type

[**PostUsersResponse**](PostUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteUsersUserIdResponse delete(userId)

Delete a User

Removes the user and the associated roles and permissions.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
try {
    DeleteUsersUserIdResponse result = apiInstance.delete(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**DeleteUsersUserIdResponse**](DeleteUsersUserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTemplate"></a>
# **getUserTemplate**
> getUserTemplate(officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getUserTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserTemplate");
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

<a name="postUsersTemplate"></a>
# **postUsersTemplate**
> String postUsersTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postUsersTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersTemplate");
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
> List&lt;GetUsersResponse&gt; retrieveAll()

Retrieve list of users

Example Requests:  users   users?fields&#x3D;id,username,email,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    List<GetUsersResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetUsersResponse&gt;**](GetUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetUsersUserIdResponse retrieveOne(userId)

Retrieve a User

Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
try {
    GetUsersUserIdResponse result = apiInstance.retrieveOne(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**GetUsersUserIdResponse**](GetUsersUserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetUsersTemplateResponse template()

Retrieve User Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  users/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    GetUsersTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#template");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUsersTemplateResponse**](GetUsersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutUsersUserIdResponse update(userId, body)

Update a User

When updating a password you must provide the repeatPassword parameter also.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.UsersApi;


UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
PutUsersUserIdRequest body = new PutUsersUserIdRequest(); // PutUsersUserIdRequest | body
try {
    PutUsersUserIdResponse result = apiInstance.update(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**PutUsersUserIdRequest**](PutUsersUserIdRequest.md)| body |

### Return type

[**PutUsersUserIdResponse**](PutUsersUserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

