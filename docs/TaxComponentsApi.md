# TaxComponentsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxCompoent**](TaxComponentsApi.md#createTaxCompoent) | **POST** taxes/component | Create a new Tax Component
[**retrieveAllTaxComponents**](TaxComponentsApi.md#retrieveAllTaxComponents) | **GET** taxes/component | List Tax Components
[**retrieveTaxComponent**](TaxComponentsApi.md#retrieveTaxComponent) | **GET** taxes/component/{taxComponentId} | Retrieve Tax Component
[**retrieveTemplate**](TaxComponentsApi.md#retrieveTemplate) | **GET** taxes/component/template | 
[**updateTaxCompoent**](TaxComponentsApi.md#updateTaxCompoent) | **PUT** taxes/component/{taxComponentId} | Update Tax Component


<a name="createTaxCompoent"></a>
# **createTaxCompoent**
> PostTaxesComponentsResponse createTaxCompoent(body)

Create a new Tax Component

Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate

### Example
```java

TaxComponentsApi apiService = defaultClient.createService(TaxComponentsApi.class);

// Initialize these parameters earlier.
Call<PostTaxesComponentsResponse> call = apiService.createTaxCompoent(body);
call.enqueue(new Callback<PostTaxesComponentsResponse>() {
    @Override
    public void onResponse(Call<PostTaxesComponentsResponse> call, Response<PostTaxesComponentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTaxesComponentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostTaxesComponentsRequest**](PostTaxesComponentsRequest.md)| body |

### Return type

[**PostTaxesComponentsResponse**](PostTaxesComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllTaxComponents"></a>
# **retrieveAllTaxComponents**
> List&lt;GetTaxesComponentsResponse&gt; retrieveAllTaxComponents()

List Tax Components

List Tax Components

### Example
```java

TaxComponentsApi apiService = defaultClient.createService(TaxComponentsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetTaxesComponentsResponse&gt;> call = apiService.retrieveAllTaxComponents();
call.enqueue(new Callback<List&lt;GetTaxesComponentsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetTaxesComponentsResponse&gt;> call, Response<List&lt;GetTaxesComponentsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetTaxesComponentsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetTaxesComponentsResponse&gt;**](GetTaxesComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTaxComponent"></a>
# **retrieveTaxComponent**
> GetTaxesComponentsResponse retrieveTaxComponent(taxComponentId)

Retrieve Tax Component

Retrieve Tax Component

### Example
```java

TaxComponentsApi apiService = defaultClient.createService(TaxComponentsApi.class);

// Initialize these parameters earlier.
Call<GetTaxesComponentsResponse> call = apiService.retrieveTaxComponent(taxComponentId);
call.enqueue(new Callback<GetTaxesComponentsResponse>() {
    @Override
    public void onResponse(Call<GetTaxesComponentsResponse> call, Response<GetTaxesComponentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTaxesComponentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **taxComponentId** | **Long**| taxComponentId |

### Return type

[**GetTaxesComponentsResponse**](GetTaxesComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



### Example
```java

TaxComponentsApi apiService = defaultClient.createService(TaxComponentsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxCompoent"></a>
# **updateTaxCompoent**
> PutTaxesComponentsTaxComponentIdResponse updateTaxCompoent(taxComponentId, body)

Update Tax Component

Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.

### Example
```java

TaxComponentsApi apiService = defaultClient.createService(TaxComponentsApi.class);

// Initialize these parameters earlier.
Call<PutTaxesComponentsTaxComponentIdResponse> call = apiService.updateTaxCompoent(taxComponentId, body);
call.enqueue(new Callback<PutTaxesComponentsTaxComponentIdResponse>() {
    @Override
    public void onResponse(Call<PutTaxesComponentsTaxComponentIdResponse> call, Response<PutTaxesComponentsTaxComponentIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutTaxesComponentsTaxComponentIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **taxComponentId** | **Long**| taxComponentId |
 **body** | [**PutTaxesComponentsTaxComponentIdRequest**](PutTaxesComponentsTaxComponentIdRequest.md)| body |

### Return type

[**PutTaxesComponentsTaxComponentIdResponse**](PutTaxesComponentsTaxComponentIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

