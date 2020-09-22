# InterestRateChartApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](InterestRateChartApi.md#create) | **POST** interestratecharts | Create a Chart
[**delete**](InterestRateChartApi.md#delete) | **DELETE** interestratecharts/{chartId} | Delete a Chart
[**retrieveAll**](InterestRateChartApi.md#retrieveAll) | **GET** interestratecharts | Retrieve all Charts
[**retrieveOne**](InterestRateChartApi.md#retrieveOne) | **GET** interestratecharts/{chartId} | Retrieve a Chart
[**template**](InterestRateChartApi.md#template) | **GET** interestratecharts/template | Retrieve Chart Details Template
[**update**](InterestRateChartApi.md#update) | **PUT** interestratecharts/{chartId} | Update a Chart


<a name="create"></a>
# **create**
> PostInterestRateChartsResponse create(body)

Create a Chart

Creates a new chart which can be attached to a term deposit products (FD or RD).

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<PostInterestRateChartsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostInterestRateChartsResponse>() {
    @Override
    public void onResponse(Call<PostInterestRateChartsResponse> call, Response<PostInterestRateChartsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostInterestRateChartsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostInterestRateChartsRequest**](PostInterestRateChartsRequest.md)| body |

### Return type

[**PostInterestRateChartsResponse**](PostInterestRateChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteInterestRateChartsChartIdResponse delete(chartId)

Delete a Chart

It deletes the chart

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<DeleteInterestRateChartsChartIdResponse> call = apiService.delete(chartId);
call.enqueue(new Callback<DeleteInterestRateChartsChartIdResponse>() {
    @Override
    public void onResponse(Call<DeleteInterestRateChartsChartIdResponse> call, Response<DeleteInterestRateChartsChartIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteInterestRateChartsChartIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |

### Return type

[**DeleteInterestRateChartsChartIdResponse**](DeleteInterestRateChartsChartIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetInterestRateChartsResponse&gt; retrieveAll(productId)

Retrieve all Charts

Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetInterestRateChartsResponse&gt;> call = apiService.retrieveAll(productId);
call.enqueue(new Callback<List&lt;GetInterestRateChartsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetInterestRateChartsResponse&gt;> call, Response<List&lt;GetInterestRateChartsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetInterestRateChartsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId | [optional]

### Return type

[**List&lt;GetInterestRateChartsResponse&gt;**](GetInterestRateChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetInterestRateChartsResponse retrieveOne(chartId)

Retrieve a Chart

It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsResponse> call = apiService.retrieveOne(chartId);
call.enqueue(new Callback<GetInterestRateChartsResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsResponse> call, Response<GetInterestRateChartsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |

### Return type

[**GetInterestRateChartsResponse**](GetInterestRateChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetInterestRateChartsTemplateResponse template()

Retrieve Chart Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsTemplateResponse> call = apiService.template();
call.enqueue(new Callback<GetInterestRateChartsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsTemplateResponse> call, Response<GetInterestRateChartsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInterestRateChartsTemplateResponse**](GetInterestRateChartsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutInterestRateChartsChartIdResponse update(chartId, body)

Update a Chart

It updates the Chart.

### Example
```java

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<PutInterestRateChartsChartIdResponse> call = apiService.update(chartId, body);
call.enqueue(new Callback<PutInterestRateChartsChartIdResponse>() {
    @Override
    public void onResponse(Call<PutInterestRateChartsChartIdResponse> call, Response<PutInterestRateChartsChartIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutInterestRateChartsChartIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **chartId** | **Long**| chartId |
 **body** | [**PutInterestRateChartsChartIdRequest**](PutInterestRateChartsChartIdRequest.md)| body |

### Return type

[**PutInterestRateChartsChartIdResponse**](PutInterestRateChartsChartIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

