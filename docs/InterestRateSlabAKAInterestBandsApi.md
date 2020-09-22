# InterestRateSlabAKAInterestBandsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](InterestRateSlabAKAInterestBandsApi.md#create) | **POST** interestratecharts/{chartId}/chartslabs | Create a Slab
[**delete**](InterestRateSlabAKAInterestBandsApi.md#delete) | **DELETE** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Delete a Slab
[**retrieveAll**](InterestRateSlabAKAInterestBandsApi.md#retrieveAll) | **GET** interestratecharts/{chartId}/chartslabs | Retrieve all Slabs
[**retrieveOne**](InterestRateSlabAKAInterestBandsApi.md#retrieveOne) | **GET** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Retrieve a Slab
[**template**](InterestRateSlabAKAInterestBandsApi.md#template) | **GET** interestratecharts/{chartId}/chartslabs/template | 
[**update**](InterestRateSlabAKAInterestBandsApi.md#update) | **PUT** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Update a Slab


<a name="create"></a>
# **create**
> PostInterestRateChartsChartIdChartSlabsResponse create(chartId, body)

Create a Slab

Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs

### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<PostInterestRateChartsChartIdChartSlabsResponse> call = apiService.create(chartId, body);
call.enqueue(new Callback<PostInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<PostInterestRateChartsChartIdChartSlabsResponse> call, Response<PostInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |
 **body** | [**PostInterestRateChartsChartIdChartSlabsRequest**](PostInterestRateChartsChartIdChartSlabsRequest.md)| body |

### Return type

[**PostInterestRateChartsChartIdChartSlabsResponse**](PostInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteInterestRateChartsChartIdChartSlabsResponse delete(chartId, chartSlabId)

Delete a Slab

Delete a Slab from a chart

### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call = apiService.delete(chartId, chartSlabId);
call.enqueue(new Callback<DeleteInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call, Response<DeleteInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**DeleteInterestRateChartsChartIdChartSlabsResponse**](DeleteInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt; retrieveAll(chartId)

Retrieve all Slabs

Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs

### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call = apiService.retrieveAll(chartId);
call.enqueue(new Callback<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call, Response<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |

### Return type

[**List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetInterestRateChartsChartIdChartSlabsResponse retrieveOne(chartId, chartSlabId)

Retrieve a Slab

Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 

### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsChartIdChartSlabsResponse> call = apiService.retrieveOne(chartId, chartSlabId);
call.enqueue(new Callback<GetInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsChartIdChartSlabsResponse> call, Response<GetInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**GetInterestRateChartsChartIdChartSlabsResponse**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> String template()



### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template();
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

<a name="update"></a>
# **update**
> PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse update(chartId, chartSlabId, body)

Update a Slab

It updates the Slab from chart

### Example
```java

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call = apiService.update(chartId, chartSlabId, body);
call.enqueue(new Callback<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse>() {
    @Override
    public void onResponse(Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call, Response<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |
 **body** | [**PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest**](PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest.md)| body |

### Return type

[**PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse**](PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

