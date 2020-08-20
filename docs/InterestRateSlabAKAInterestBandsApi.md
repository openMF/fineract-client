# InterestRateSlabAKAInterestBandsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
Long chartId = 789L; // Long | chartId
PostInterestRateChartsChartIdChartSlabsRequest body = new PostInterestRateChartsChartIdChartSlabsRequest(); // PostInterestRateChartsChartIdChartSlabsRequest | body
try {
    PostInterestRateChartsChartIdChartSlabsResponse result = apiInstance.create(chartId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
Long chartId = 789L; // Long | chartId
Long chartSlabId = 789L; // Long | chartSlabId
try {
    DeleteInterestRateChartsChartIdChartSlabsResponse result = apiInstance.delete(chartId, chartSlabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
Long chartId = 789L; // Long | chartId
try {
    List<GetInterestRateChartsChartIdChartSlabsResponse> result = apiInstance.retrieveAll(chartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
Long chartId = 789L; // Long | chartId
Long chartSlabId = 789L; // Long | chartSlabId
try {
    GetInterestRateChartsChartIdChartSlabsResponse result = apiInstance.retrieveOne(chartId, chartSlabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
try {
    String result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#template");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InterestRateSlabAKAInterestBandsApi;


InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi();
Long chartId = 789L; // Long | chartId
Long chartSlabId = 789L; // Long | chartSlabId
PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest body = new PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest(); // PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest | body
try {
    PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse result = apiInstance.update(chartId, chartSlabId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

