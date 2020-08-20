# SelfLoanProductsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllLoanProducts**](SelfLoanProductsApi.md#retrieveAllLoanProducts) | **GET** self/loanproducts | 
[**retrieveLoanProductDetails**](SelfLoanProductsApi.md#retrieveLoanProductDetails) | **GET** self/loanproducts/{productId} | 


<a name="retrieveAllLoanProducts"></a>
# **retrieveAllLoanProducts**
> String retrieveAllLoanProducts(clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoanProductsApi;


SelfLoanProductsApi apiInstance = new SelfLoanProductsApi();
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.retrieveAllLoanProducts(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoanProductsApi#retrieveAllLoanProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoanProductDetails"></a>
# **retrieveLoanProductDetails**
> String retrieveLoanProductDetails(productId, clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoanProductsApi;


SelfLoanProductsApi apiInstance = new SelfLoanProductsApi();
Long productId = 789L; // Long | 
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.retrieveLoanProductDetails(productId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoanProductsApi#retrieveLoanProductDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**|  |
 **clientId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

