# ProvisioningCriteriaApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningCriteria**](ProvisioningCriteriaApi.md#createProvisioningCriteria) | **POST** provisioningcriteria | Create a new Provisioning Criteria
[**deleteProvisioningCriteria**](ProvisioningCriteriaApi.md#deleteProvisioningCriteria) | **DELETE** provisioningcriteria/{criteriaId} | Deletes Provisioning Criteria
[**retrieveAllProvisioningCriterias**](ProvisioningCriteriaApi.md#retrieveAllProvisioningCriterias) | **GET** provisioningcriteria | Retrieves all created Provisioning Criterias
[**retrieveProvisioningCriteria**](ProvisioningCriteriaApi.md#retrieveProvisioningCriteria) | **GET** provisioningcriteria/{criteriaId} | Retrieves a Provisioning Criteria
[**retrieveTemplate**](ProvisioningCriteriaApi.md#retrieveTemplate) | **GET** provisioningcriteria/template | 
[**updateProvisioningCriteria**](ProvisioningCriteriaApi.md#updateProvisioningCriteria) | **PUT** provisioningcriteria/{criteriaId} | Updates a new Provisioning Criteria


<a name="createProvisioningCriteria"></a>
# **createProvisioningCriteria**
> PostProvisioningCriteriaResponse createProvisioningCriteria(body)

Create a new Provisioning Criteria

Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts

### Example
```java

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

// Initialize these parameters earlier.
Call<PostProvisioningCriteriaResponse> call = apiService.createProvisioningCriteria(body);
call.enqueue(new Callback<PostProvisioningCriteriaResponse>() {
    @Override
    public void onResponse(Call<PostProvisioningCriteriaResponse> call, Response<PostProvisioningCriteriaResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostProvisioningCriteriaResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostProvisioningCriteriaRequest**](PostProvisioningCriteriaRequest.md)| body |

### Return type

[**PostProvisioningCriteriaResponse**](PostProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvisioningCriteria"></a>
# **deleteProvisioningCriteria**
> DeleteProvisioningCriteriaResponse deleteProvisioningCriteria(criteriaId)

Deletes Provisioning Criteria

Deletes Provisioning Criteria

### Example
```java

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

// Initialize these parameters earlier.
Call<DeleteProvisioningCriteriaResponse> call = apiService.deleteProvisioningCriteria(criteriaId);
call.enqueue(new Callback<DeleteProvisioningCriteriaResponse>() {
    @Override
    public void onResponse(Call<DeleteProvisioningCriteriaResponse> call, Response<DeleteProvisioningCriteriaResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteProvisioningCriteriaResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **criteriaId** | **Long**| criteriaId |

### Return type

[**DeleteProvisioningCriteriaResponse**](DeleteProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProvisioningCriterias"></a>
# **retrieveAllProvisioningCriterias**
> List&lt;GetProvisioningCriteriaResponse&gt; retrieveAllProvisioningCriterias()

Retrieves all created Provisioning Criterias

Retrieves all created Provisioning Criterias

### Example
```java

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetProvisioningCriteriaResponse&gt;> call = apiService.retrieveAllProvisioningCriterias();
call.enqueue(new Callback<List&lt;GetProvisioningCriteriaResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetProvisioningCriteriaResponse&gt;> call, Response<List&lt;GetProvisioningCriteriaResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetProvisioningCriteriaResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetProvisioningCriteriaResponse&gt;**](GetProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProvisioningCriteria"></a>
# **retrieveProvisioningCriteria**
> GetProvisioningCriteriaCriteriaIdResponse retrieveProvisioningCriteria(criteriaId)

Retrieves a Provisioning Criteria

Retrieves a Provisioning Criteria

### Example
```java

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

// Initialize these parameters earlier.
Call<GetProvisioningCriteriaCriteriaIdResponse> call = apiService.retrieveProvisioningCriteria(criteriaId);
call.enqueue(new Callback<GetProvisioningCriteriaCriteriaIdResponse>() {
    @Override
    public void onResponse(Call<GetProvisioningCriteriaCriteriaIdResponse> call, Response<GetProvisioningCriteriaCriteriaIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetProvisioningCriteriaCriteriaIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **criteriaId** | **Long**| criteriaId |

### Return type

[**GetProvisioningCriteriaCriteriaIdResponse**](GetProvisioningCriteriaCriteriaIdResponse.md)

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

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

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

<a name="updateProvisioningCriteria"></a>
# **updateProvisioningCriteria**
> PutProvisioningCriteriaResponse updateProvisioningCriteria(criteriaId, body)

Updates a new Provisioning Criteria

Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria

### Example
```java

ProvisioningCriteriaApi apiService = defaultClient.createService(ProvisioningCriteriaApi.class);

// Initialize these parameters earlier.
Call<PutProvisioningCriteriaResponse> call = apiService.updateProvisioningCriteria(criteriaId, body);
call.enqueue(new Callback<PutProvisioningCriteriaResponse>() {
    @Override
    public void onResponse(Call<PutProvisioningCriteriaResponse> call, Response<PutProvisioningCriteriaResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutProvisioningCriteriaResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **criteriaId** | **Long**| criteriaId |
 **body** | [**PutProvisioningCriteriaRequest**](PutProvisioningCriteriaRequest.md)| body |

### Return type

[**PutProvisioningCriteriaResponse**](PutProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

