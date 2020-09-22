# OfficesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<PostOfficesResponse> call = apiService.createOffice(body);
call.enqueue(new Callback<PostOfficesResponse>() {
    @Override
    public void onResponse(Call<PostOfficesResponse> call, Response<PostOfficesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostOfficesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getOfficeTemplate(dateFormat);
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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postOfficeTemplate(file, locale, dateFormat);
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

<a name="retreiveOffice"></a>
# **retreiveOffice**
> GetOfficesResponse retreiveOffice(officeId)

Retrieve an Office

Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName

### Example
```java

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<GetOfficesResponse> call = apiService.retreiveOffice(officeId);
call.enqueue(new Callback<GetOfficesResponse>() {
    @Override
    public void onResponse(Call<GetOfficesResponse> call, Response<GetOfficesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetOfficesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<GetOfficesTemplateResponse> call = apiService.retrieveOfficeTemplate();
call.enqueue(new Callback<GetOfficesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetOfficesTemplateResponse> call, Response<GetOfficesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetOfficesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetOfficesResponse&gt;> call = apiService.retrieveOffices(includeAllOffices, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetOfficesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetOfficesResponse&gt;> call, Response<List&lt;GetOfficesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetOfficesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<PutOfficesOfficeIdResponse> call = apiService.updateOffice(officeId, body);
call.enqueue(new Callback<PutOfficesOfficeIdResponse>() {
    @Override
    public void onResponse(Call<PutOfficesOfficeIdResponse> call, Response<PutOfficesOfficeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutOfficesOfficeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**| officeId |
 **body** | [**PutOfficesOfficeIdRequest**](PutOfficesOfficeIdRequest.md)| body |

### Return type

[**PutOfficesOfficeIdResponse**](PutOfficesOfficeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

