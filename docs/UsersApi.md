# UsersApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<PostUsersResponse> call = apiService.create(body);
call.enqueue(new Callback<PostUsersResponse>() {
    @Override
    public void onResponse(Call<PostUsersResponse> call, Response<PostUsersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostUsersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<DeleteUsersUserIdResponse> call = apiService.delete(userId);
call.enqueue(new Callback<DeleteUsersUserIdResponse>() {
    @Override
    public void onResponse(Call<DeleteUsersUserIdResponse> call, Response<DeleteUsersUserIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteUsersUserIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getUserTemplate(officeId, staffId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postUsersTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetUsersResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetUsersResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetUsersResponse&gt;> call, Response<List&lt;GetUsersResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetUsersResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<GetUsersUserIdResponse> call = apiService.retrieveOne(userId);
call.enqueue(new Callback<GetUsersUserIdResponse>() {
    @Override
    public void onResponse(Call<GetUsersUserIdResponse> call, Response<GetUsersUserIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetUsersUserIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<GetUsersTemplateResponse> call = apiService.template();
call.enqueue(new Callback<GetUsersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetUsersTemplateResponse> call, Response<GetUsersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetUsersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

UsersApi apiService = defaultClient.createService(UsersApi.class);

// Initialize these parameters earlier.
Call<PutUsersUserIdResponse> call = apiService.update(userId, body);
call.enqueue(new Callback<PutUsersUserIdResponse>() {
    @Override
    public void onResponse(Call<PutUsersUserIdResponse> call, Response<PutUsersUserIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutUsersUserIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **userId** | **Long**| userId |
 **body** | [**PutUsersUserIdRequest**](PutUsersUserIdRequest.md)| body |

### Return type

[**PutUsersUserIdResponse**](PutUsersUserIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

