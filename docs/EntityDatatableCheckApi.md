# EntityDatatableCheckApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntityDatatableCheck**](EntityDatatableCheckApi.md#createEntityDatatableCheck) | **POST** entityDatatableChecks | Create Entity-Datatable Checks
[**deleteDatatable**](EntityDatatableCheckApi.md#deleteDatatable) | **DELETE** entityDatatableChecks/{entityDatatableCheckId} | Delete Entity-Datatable Checks
[**getTemplate**](EntityDatatableCheckApi.md#getTemplate) | **GET** entityDatatableChecks/template | Retrieve Entity-Datatable Checks Template
[**retrieveAll**](EntityDatatableCheckApi.md#retrieveAll) | **GET** entityDatatableChecks | List Entity-Datatable Checks


<a name="createEntityDatatableCheck"></a>
# **createEntityDatatableCheck**
> PostEntityDatatableChecksTemplateResponse createEntityDatatableCheck(body)

Create Entity-Datatable Checks

Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId

### Example
```java

EntityDatatableCheckApi apiService = defaultClient.createService(EntityDatatableCheckApi.class);

// Initialize these parameters earlier.
Call<PostEntityDatatableChecksTemplateResponse> call = apiService.createEntityDatatableCheck(body);
call.enqueue(new Callback<PostEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<PostEntityDatatableChecksTemplateResponse> call, Response<PostEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostEntityDatatableChecksTemplateRequest**](PostEntityDatatableChecksTemplateRequest.md)| body |

### Return type

[**PostEntityDatatableChecksTemplateResponse**](PostEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatable"></a>
# **deleteDatatable**
> DeleteEntityDatatableChecksTemplateResponse deleteDatatable(entityDatatableCheckId, body)

Delete Entity-Datatable Checks

Deletes an existing Entity-Datatable Check

### Example
```java

EntityDatatableCheckApi apiService = defaultClient.createService(EntityDatatableCheckApi.class);

// Initialize these parameters earlier.
Call<DeleteEntityDatatableChecksTemplateResponse> call = apiService.deleteDatatable(entityDatatableCheckId, body);
call.enqueue(new Callback<DeleteEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<DeleteEntityDatatableChecksTemplateResponse> call, Response<DeleteEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entityDatatableCheckId** | **Long**| entityDatatableCheckId |
 **body** | **String**|  | [optional]

### Return type

[**DeleteEntityDatatableChecksTemplateResponse**](DeleteEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> GetEntityDatatableChecksTemplateResponse getTemplate()

Retrieve Entity-Datatable Checks Template

This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed Value Lists Example Request:  entityDatatableChecks/template

### Example
```java

EntityDatatableCheckApi apiService = defaultClient.createService(EntityDatatableCheckApi.class);

// Initialize these parameters earlier.
Call<GetEntityDatatableChecksTemplateResponse> call = apiService.getTemplate();
call.enqueue(new Callback<GetEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<GetEntityDatatableChecksTemplateResponse> call, Response<GetEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEntityDatatableChecksTemplateResponse**](GetEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetEntityDatatableChecksResponse&gt; retrieveAll(status, entity, productId, offset, limit)

List Entity-Datatable Checks

The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15

### Example
```java

EntityDatatableCheckApi apiService = defaultClient.createService(EntityDatatableCheckApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetEntityDatatableChecksResponse&gt;> call = apiService.retrieveAll(status, entity, productId, offset, limit);
call.enqueue(new Callback<List&lt;GetEntityDatatableChecksResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetEntityDatatableChecksResponse&gt;> call, Response<List&lt;GetEntityDatatableChecksResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetEntityDatatableChecksResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **status** | **Long**| status | [optional]
 **entity** | **String**| entity | [optional]
 **productId** | **Long**| productId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;GetEntityDatatableChecksResponse&gt;**](GetEntityDatatableChecksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

