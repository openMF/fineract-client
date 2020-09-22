# AccountingClosureApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLClosure**](AccountingClosureApi.md#createGLClosure) | **POST** glclosures | Create an Accounting Closure
[**deleteGLClosure**](AccountingClosureApi.md#deleteGLClosure) | **DELETE** glclosures/{glClosureId} | Delete an accounting closure
[**retreiveClosure**](AccountingClosureApi.md#retreiveClosure) | **GET** glclosures/{glClosureId} | Retrieve an Accounting Closure
[**retrieveAllClosures**](AccountingClosureApi.md#retrieveAllClosures) | **GET** glclosures | List Accounting closures
[**updateGLClosure**](AccountingClosureApi.md#updateGLClosure) | **PUT** glclosures/{glClosureId} | Update an Accounting closure


<a name="createGLClosure"></a>
# **createGLClosure**
> PostGlClosuresResponse createGLClosure(body)

Create an Accounting Closure

Mandatory Fields officeId,closingDate

### Example
```java

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<PostGlClosuresResponse> call = apiService.createGLClosure(body);
call.enqueue(new Callback<PostGlClosuresResponse>() {
    @Override
    public void onResponse(Call<PostGlClosuresResponse> call, Response<PostGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostGLCLosuresRequest**](PostGLCLosuresRequest.md)| Request Body |

### Return type

[**PostGlClosuresResponse**](PostGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLClosure"></a>
# **deleteGLClosure**
> DeleteGlClosuresResponse deleteGLClosure(glClosureId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example
```java

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<DeleteGlClosuresResponse> call = apiService.deleteGLClosure(glClosureId);
call.enqueue(new Callback<DeleteGlClosuresResponse>() {
    @Override
    public void onResponse(Call<DeleteGlClosuresResponse> call, Response<DeleteGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **glClosureId** | **Long**| glclosureId |

### Return type

[**DeleteGlClosuresResponse**](DeleteGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreiveClosure"></a>
# **retreiveClosure**
> GetGLClosureResponse retreiveClosure(glClosureId)

Retrieve an Accounting Closure

Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate

### Example
```java

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<GetGLClosureResponse> call = apiService.retreiveClosure(glClosureId);
call.enqueue(new Callback<GetGLClosureResponse>() {
    @Override
    public void onResponse(Call<GetGLClosureResponse> call, Response<GetGLClosureResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGLClosureResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **glClosureId** | **Long**| glClosureId |

### Return type

[**GetGLClosureResponse**](GetGLClosureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClosures"></a>
# **retrieveAllClosures**
> List&lt;GetGLClosureResponse&gt; retrieveAllClosures(officeId)

List Accounting closures

Example Requests:  glclosures

### Example
```java

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGLClosureResponse&gt;> call = apiService.retrieveAllClosures(officeId);
call.enqueue(new Callback<List&lt;GetGLClosureResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGLClosureResponse&gt;> call, Response<List&lt;GetGLClosureResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGLClosureResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**| officeId | [optional]

### Return type

[**List&lt;GetGLClosureResponse&gt;**](GetGLClosureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGLClosure"></a>
# **updateGLClosure**
> PutGlClosuresResponse updateGLClosure(glClosureId, body)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited

### Example
```java

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<PutGlClosuresResponse> call = apiService.updateGLClosure(glClosureId, body);
call.enqueue(new Callback<PutGlClosuresResponse>() {
    @Override
    public void onResponse(Call<PutGlClosuresResponse> call, Response<PutGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **glClosureId** | **Long**| glClosureId |
 **body** | [**PutGlClosuresRequest**](PutGlClosuresRequest.md)| Request body |

### Return type

[**PutGlClosuresResponse**](PutGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

