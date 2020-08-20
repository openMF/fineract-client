# MixMapping_Api

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveTaxonomyMapping**](MixMapping_Api.md#retrieveTaxonomyMapping) | **GET** mixmapping | 
[**updateTaxonomyMapping**](MixMapping_Api.md#updateTaxonomyMapping) | **PUT** mixmapping | 


<a name="retrieveTaxonomyMapping"></a>
# **retrieveTaxonomyMapping**
> String retrieveTaxonomyMapping()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MixMapping_Api;


MixMapping_Api apiInstance = new MixMapping_Api();
try {
    String result = apiInstance.retrieveTaxonomyMapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixMapping_Api#retrieveTaxonomyMapping");
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

<a name="updateTaxonomyMapping"></a>
# **updateTaxonomyMapping**
> String updateTaxonomyMapping(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MixMapping_Api;


MixMapping_Api apiInstance = new MixMapping_Api();
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateTaxonomyMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixMapping_Api#updateTaxonomyMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

