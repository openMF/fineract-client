# UserGeneratedDocumentsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<PostTemplatesResponse> call = apiService.createTemplate(body);
call.enqueue(new Callback<PostTemplatesResponse>() {
    @Override
    public void onResponse(Call<PostTemplatesResponse> call, Response<PostTemplatesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTemplatesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<DeleteTemplatesTemplateIdResponse> call = apiService.deleteTemplate(templateId);
call.enqueue(new Callback<DeleteTemplatesTemplateIdResponse>() {
    @Override
    public void onResponse(Call<DeleteTemplatesTemplateIdResponse> call, Response<DeleteTemplatesTemplateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteTemplatesTemplateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getTemplateByTemplate(templateId);
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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.mergeTemplate(templateId, body);
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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<GetTemplatesResponse> call = apiService.retrieveAll(typeId, entityId);
call.enqueue(new Callback<GetTemplatesResponse>() {
    @Override
    public void onResponse(Call<GetTemplatesResponse> call, Response<GetTemplatesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTemplatesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<GetTemplatesTemplateIdResponse> call = apiService.retrieveOne(templateId);
call.enqueue(new Callback<GetTemplatesTemplateIdResponse>() {
    @Override
    public void onResponse(Call<GetTemplatesTemplateIdResponse> call, Response<GetTemplatesTemplateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTemplatesTemplateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<PutTemplatesTemplateIdResponse> call = apiService.saveTemplate(templateId, body);
call.enqueue(new Callback<PutTemplatesTemplateIdResponse>() {
    @Override
    public void onResponse(Call<PutTemplatesTemplateIdResponse> call, Response<PutTemplatesTemplateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutTemplatesTemplateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

UserGeneratedDocumentsApi apiService = defaultClient.createService(UserGeneratedDocumentsApi.class);

// Initialize these parameters earlier.
Call<GetTemplatesTemplateResponse> call = apiService.template();
call.enqueue(new Callback<GetTemplatesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetTemplatesTemplateResponse> call, Response<GetTemplatesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTemplatesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

