# FundsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFund**](FundsApi.md#createFund) | **POST** funds | Create a Fund
[**retreiveFund**](FundsApi.md#retreiveFund) | **GET** funds/{fundId} | Retrieve a Fund
[**retrieveFunds**](FundsApi.md#retrieveFunds) | **GET** funds | Retrieve Funds
[**updateFund**](FundsApi.md#updateFund) | **PUT** funds/{fundId} | Update a Fund


<a name="createFund"></a>
# **createFund**
> PostFundsResponse createFund(body)

Create a Fund

Creates a Fund

### Example
```java

FundsApi apiService = defaultClient.createService(FundsApi.class);

// Initialize these parameters earlier.
Call<PostFundsResponse> call = apiService.createFund(body);
call.enqueue(new Callback<PostFundsResponse>() {
    @Override
    public void onResponse(Call<PostFundsResponse> call, Response<PostFundsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFundsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostFundsRequest**](PostFundsRequest.md)| body |

### Return type

[**PostFundsResponse**](PostFundsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreiveFund"></a>
# **retreiveFund**
> GetFundsResponse retreiveFund(fundId)

Retrieve a Fund

Returns the details of a Fund.  Example Requests:  funds/1

### Example
```java

FundsApi apiService = defaultClient.createService(FundsApi.class);

// Initialize these parameters earlier.
Call<GetFundsResponse> call = apiService.retreiveFund(fundId);
call.enqueue(new Callback<GetFundsResponse>() {
    @Override
    public void onResponse(Call<GetFundsResponse> call, Response<GetFundsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFundsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **fundId** | **Long**| fundId |

### Return type

[**GetFundsResponse**](GetFundsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveFunds"></a>
# **retrieveFunds**
> List&lt;GetFundsResponse&gt; retrieveFunds()

Retrieve Funds

Returns the list of funds.  Example Requests:  funds

### Example
```java

FundsApi apiService = defaultClient.createService(FundsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFundsResponse&gt;> call = apiService.retrieveFunds();
call.enqueue(new Callback<List&lt;GetFundsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFundsResponse&gt;> call, Response<List&lt;GetFundsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFundsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFundsResponse&gt;**](GetFundsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFund"></a>
# **updateFund**
> PutFundsFundIdResponse updateFund(fundId, body)

Update a Fund

Updates the details of a fund.

### Example
```java

FundsApi apiService = defaultClient.createService(FundsApi.class);

// Initialize these parameters earlier.
Call<PutFundsFundIdResponse> call = apiService.updateFund(fundId, body);
call.enqueue(new Callback<PutFundsFundIdResponse>() {
    @Override
    public void onResponse(Call<PutFundsFundIdResponse> call, Response<PutFundsFundIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFundsFundIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **fundId** | **Long**| fundId |
 **body** | [**PutFundsFundIdRequest**](PutFundsFundIdRequest.md)| body |

### Return type

[**PutFundsFundIdResponse**](PutFundsFundIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

