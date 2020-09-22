# BatchApiApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleBatchRequests**](BatchApiApi.md#handleBatchRequests) | **POST** batches | Batch requests in a single transaction


<a name="handleBatchRequests"></a>
# **handleBatchRequests**
> BatchResponse handleBatchRequests(body, enclosingTransaction)

Batch requests in a single transaction

The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.

### Example
```java

BatchApiApi apiService = defaultClient.createService(BatchApiApi.class);

// Initialize these parameters earlier.
Call<BatchResponse> call = apiService.handleBatchRequests(body, enclosingTransaction);
call.enqueue(new Callback<BatchResponse>() {
    @Override
    public void onResponse(Call<BatchResponse> call, Response<BatchResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<BatchResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostBatchesRequest**](PostBatchesRequest.md)| request body |
 **enclosingTransaction** | **Boolean**| enclosingTransaction | [optional] [default to false]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

