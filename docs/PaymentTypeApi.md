# PaymentTypeApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentType**](PaymentTypeApi.md#createPaymentType) | **POST** paymenttypes | Create a Payment Type
[**deleteCode**](PaymentTypeApi.md#deleteCode) | **DELETE** paymenttypes/{paymentTypeId} | Delete a Payment Type
[**getAllPaymentTypes**](PaymentTypeApi.md#getAllPaymentTypes) | **GET** paymenttypes | Retrieve all Payment Types
[**retrieveOnePaymentType**](PaymentTypeApi.md#retrieveOnePaymentType) | **GET** paymenttypes/{paymentTypeId} | Retrieve a Payment Type
[**updatePaymentType**](PaymentTypeApi.md#updatePaymentType) | **PUT** paymenttypes/{paymentTypeId} | Update a Payment Type


<a name="createPaymentType"></a>
# **createPaymentType**
> PostPaymentTypesResponse createPaymentType(body)

Create a Payment Type

Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position

### Example
```java

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<PostPaymentTypesResponse> call = apiService.createPaymentType(body);
call.enqueue(new Callback<PostPaymentTypesResponse>() {
    @Override
    public void onResponse(Call<PostPaymentTypesResponse> call, Response<PostPaymentTypesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostPaymentTypesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostPaymentTypesRequest**](PostPaymentTypesRequest.md)| body |

### Return type

[**PostPaymentTypesResponse**](PostPaymentTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCode"></a>
# **deleteCode**
> DeletePaymentTypesPaymentTypeIdResponse deleteCode(paymentTypeId)

Delete a Payment Type

Deletes payment type

### Example
```java

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<DeletePaymentTypesPaymentTypeIdResponse> call = apiService.deleteCode(paymentTypeId);
call.enqueue(new Callback<DeletePaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<DeletePaymentTypesPaymentTypeIdResponse> call, Response<DeletePaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeletePaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**DeletePaymentTypesPaymentTypeIdResponse**](DeletePaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllPaymentTypes"></a>
# **getAllPaymentTypes**
> List&lt;GetPaymentTypesResponse&gt; getAllPaymentTypes()

Retrieve all Payment Types

Retrieve list of payment types

### Example
```java

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPaymentTypesResponse&gt;> call = apiService.getAllPaymentTypes();
call.enqueue(new Callback<List&lt;GetPaymentTypesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPaymentTypesResponse&gt;> call, Response<List&lt;GetPaymentTypesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPaymentTypesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPaymentTypesResponse&gt;**](GetPaymentTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="retrieveOnePaymentType"></a>
# **retrieveOnePaymentType**
> GetPaymentTypesPaymentTypeIdResponse retrieveOnePaymentType(paymentTypeId)

Retrieve a Payment Type

Retrieves a payment type

### Example
```java

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<GetPaymentTypesPaymentTypeIdResponse> call = apiService.retrieveOnePaymentType(paymentTypeId);
call.enqueue(new Callback<GetPaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<GetPaymentTypesPaymentTypeIdResponse> call, Response<GetPaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetPaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**GetPaymentTypesPaymentTypeIdResponse**](GetPaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="updatePaymentType"></a>
# **updatePaymentType**
> PutPaymentTypesPaymentTypeIdResponse updatePaymentType(paymentTypeId, body)

Update a Payment Type

Updates a Payment Type

### Example
```java

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<PutPaymentTypesPaymentTypeIdResponse> call = apiService.updatePaymentType(paymentTypeId, body);
call.enqueue(new Callback<PutPaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<PutPaymentTypesPaymentTypeIdResponse> call, Response<PutPaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutPaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **paymentTypeId** | **Long**| paymentTypeId |
 **body** | [**PutPaymentTypesPaymentTypeIdRequest**](PutPaymentTypesPaymentTypeIdRequest.md)| body |

### Return type

[**PutPaymentTypesPaymentTypeIdResponse**](PutPaymentTypesPaymentTypeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

