# InterestRateChartApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
PostInterestRateChartsRequest body = new PostInterestRateChartsRequest(); // PostInterestRateChartsRequest | body
try {
    PostInterestRateChartsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
Long chartId = 789L; // Long | chartId
try {
    DeleteInterestRateChartsChartIdResponse result = apiInstance.delete(chartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
Long productId = 789L; // Long | productId
try {
    List<GetInterestRateChartsResponse> result = apiInstance.retrieveAll(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
Long chartId = 789L; // Long | chartId
try {
    GetInterestRateChartsResponse result = apiInstance.retrieveOne(chartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
try {
    GetInterestRateChartsTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#template");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateChartApi;


InterestRateChartApi apiInstance = new InterestRateChartApi();
Long chartId = 789L; // Long | chartId
PutInterestRateChartsChartIdRequest body = new PutInterestRateChartsChartIdRequest(); // PutInterestRateChartsChartIdRequest | body
try {
    PutInterestRateChartsChartIdResponse result = apiInstance.update(chartId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateChartApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |
 **body** | [**PutInterestRateChartsChartIdRequest**](PutInterestRateChartsChartIdRequest.md)| body |

### Return type

[**PutInterestRateChartsChartIdResponse**](PutInterestRateChartsChartIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

