# MixTaxonomyApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](MixTaxonomyApi.md#retrieveAll) | **GET** mixtaxonomy | 


<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MixTaxonomyApi;


MixTaxonomyApi apiInstance = new MixTaxonomyApi();
try {
    String result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixTaxonomyApi#retrieveAll");
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

