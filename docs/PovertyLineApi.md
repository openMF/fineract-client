# PovertyLineApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](PovertyLineApi.md#retrieveAll) | **GET** povertyLine/{ppiName} | 
[**retrieveAll_0**](PovertyLineApi.md#retrieveAll_0) | **GET** povertyLine/{ppiName}/{likelihoodId} | 


<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(ppiName)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PovertyLineApi;


PovertyLineApi apiInstance = new PovertyLineApi();
String ppiName = "ppiName_example"; // String | 
try {
    String result = apiInstance.retrieveAll(ppiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PovertyLineApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ppiName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll_0"></a>
# **retrieveAll_0**
> String retrieveAll_0(ppiName, likelihoodId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PovertyLineApi;


PovertyLineApi apiInstance = new PovertyLineApi();
String ppiName = "ppiName_example"; // String | 
Long likelihoodId = 789L; // Long | 
try {
    String result = apiInstance.retrieveAll_0(ppiName, likelihoodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PovertyLineApi#retrieveAll_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ppiName** | **String**|  |
 **likelihoodId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

