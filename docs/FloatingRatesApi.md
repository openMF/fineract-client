# FloatingRatesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FloatingRatesApi;


FloatingRatesApi apiInstance = new FloatingRatesApi();
PostFloatingRatesRequest body = new PostFloatingRatesRequest(); // PostFloatingRatesRequest | body
try {
    PostFloatingRatesResponse result = apiInstance.createFloatingRate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloatingRatesApi#createFloatingRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FloatingRatesApi;


FloatingRatesApi apiInstance = new FloatingRatesApi();
try {
    List<GetFloatingRatesResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloatingRatesApi#retrieveAll");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FloatingRatesApi;


FloatingRatesApi apiInstance = new FloatingRatesApi();
Long floatingRateId = 789L; // Long | floatingRateId
try {
    GetFloatingRatesFloatingRateIdResponse result = apiInstance.retrieveOne(floatingRateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloatingRatesApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FloatingRatesApi;


FloatingRatesApi apiInstance = new FloatingRatesApi();
Long floatingRateId = 789L; // Long | floatingRateId
PutFloatingRatesFloatingRateIdRequest body = new PutFloatingRatesFloatingRateIdRequest(); // PutFloatingRatesFloatingRateIdRequest | body
try {
    PutFloatingRatesFloatingRateIdResponse result = apiInstance.updateFloatingRate(floatingRateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FloatingRatesApi#updateFloatingRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **floatingRateId** | **Long**| floatingRateId |
 **body** | [**PutFloatingRatesFloatingRateIdRequest**](PutFloatingRatesFloatingRateIdRequest.md)| body |

### Return type

[**PutFloatingRatesFloatingRateIdResponse**](PutFloatingRatesFloatingRateIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

