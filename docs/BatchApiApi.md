# BatchApiApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.BatchApiApi;


BatchApiApi apiInstance = new BatchApiApi();
PostBatchesRequest body = new PostBatchesRequest(); // PostBatchesRequest | request body
Boolean enclosingTransaction = false; // Boolean | enclosingTransaction
try {
    BatchResponse result = apiInstance.handleBatchRequests(body, enclosingTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApiApi#handleBatchRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostBatchesRequest**](PostBatchesRequest.md)| request body |
 **enclosingTransaction** | **Boolean**| enclosingTransaction | [optional] [default to false]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

