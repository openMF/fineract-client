# FundsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FundsApi;


FundsApi apiInstance = new FundsApi();
PostFundsRequest body = new PostFundsRequest(); // PostFundsRequest | body
try {
    PostFundsResponse result = apiInstance.createFund(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsApi#createFund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FundsApi;


FundsApi apiInstance = new FundsApi();
Long fundId = 789L; // Long | fundId
try {
    GetFundsResponse result = apiInstance.retreiveFund(fundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsApi#retreiveFund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FundsApi;


FundsApi apiInstance = new FundsApi();
try {
    List<GetFundsResponse> result = apiInstance.retrieveFunds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsApi#retrieveFunds");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FundsApi;


FundsApi apiInstance = new FundsApi();
Long fundId = 789L; // Long | fundId
PutFundsFundIdRequest body = new PutFundsFundIdRequest(); // PutFundsFundIdRequest | body
try {
    PutFundsFundIdResponse result = apiInstance.updateFund(fundId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsApi#updateFund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundId** | **Long**| fundId |
 **body** | [**PutFundsFundIdRequest**](PutFundsFundIdRequest.md)| body |

### Return type

[**PutFundsFundIdResponse**](PutFundsFundIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

