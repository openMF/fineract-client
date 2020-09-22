# FloatingRatesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFloatingRate**](FloatingRatesApi.md#createFloatingRate) | **POST** floatingrates | Create a new Floating Rate
[**retrieveAll**](FloatingRatesApi.md#retrieveAll) | **GET** floatingrates | List Floating Rates
[**retrieveOne**](FloatingRatesApi.md#retrieveOne) | **GET** floatingrates/{floatingRateId} | Retrieve Floating Rate
[**updateFloatingRate**](FloatingRatesApi.md#updateFloatingRate) | **PUT** floatingrates/{floatingRateId} | Update Floating Rate


<a name="createFloatingRate"></a>
# **createFloatingRate**
> PostFloatingRatesResponse createFloatingRate(body)

Create a new Floating Rate

Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods

### Example
```java

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<PostFloatingRatesResponse> call = apiService.createFloatingRate(body);
call.enqueue(new Callback<PostFloatingRatesResponse>() {
    @Override
    public void onResponse(Call<PostFloatingRatesResponse> call, Response<PostFloatingRatesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFloatingRatesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostFloatingRatesRequest**](PostFloatingRatesRequest.md)| body |

### Return type

[**PostFloatingRatesResponse**](PostFloatingRatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetFloatingRatesResponse&gt; retrieveAll()

List Floating Rates

Lists Floating Rates

### Example
```java

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFloatingRatesResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetFloatingRatesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFloatingRatesResponse&gt;> call, Response<List&lt;GetFloatingRatesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFloatingRatesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFloatingRatesResponse&gt;**](GetFloatingRatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetFloatingRatesFloatingRateIdResponse retrieveOne(floatingRateId)

Retrieve Floating Rate

Retrieves Floating Rate

### Example
```java

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<GetFloatingRatesFloatingRateIdResponse> call = apiService.retrieveOne(floatingRateId);
call.enqueue(new Callback<GetFloatingRatesFloatingRateIdResponse>() {
    @Override
    public void onResponse(Call<GetFloatingRatesFloatingRateIdResponse> call, Response<GetFloatingRatesFloatingRateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFloatingRatesFloatingRateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **floatingRateId** | **Long**| floatingRateId |

### Return type

[**GetFloatingRatesFloatingRateIdResponse**](GetFloatingRatesFloatingRateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFloatingRate"></a>
# **updateFloatingRate**
> PutFloatingRatesFloatingRateIdResponse updateFloatingRate(floatingRateId, body)

Update Floating Rate

Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.

### Example
```java

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<PutFloatingRatesFloatingRateIdResponse> call = apiService.updateFloatingRate(floatingRateId, body);
call.enqueue(new Callback<PutFloatingRatesFloatingRateIdResponse>() {
    @Override
    public void onResponse(Call<PutFloatingRatesFloatingRateIdResponse> call, Response<PutFloatingRatesFloatingRateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFloatingRatesFloatingRateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **floatingRateId** | **Long**| floatingRateId |
 **body** | [**PutFloatingRatesFloatingRateIdRequest**](PutFloatingRatesFloatingRateIdRequest.md)| body |

### Return type

[**PutFloatingRatesFloatingRateIdResponse**](PutFloatingRatesFloatingRateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

