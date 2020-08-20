# LikelihoodApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve**](LikelihoodApi.md#retrieve) | **GET** likelihood/{ppiName}/{likelihoodId} | 
[**retrieveAll**](LikelihoodApi.md#retrieveAll) | **GET** likelihood/{ppiName} | 
[**update**](LikelihoodApi.md#update) | **PUT** likelihood/{ppiName}/{likelihoodId} | 


<a name="retrieve"></a>
# **retrieve**
> String retrieve(likelihoodId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LikelihoodApi;


LikelihoodApi apiInstance = new LikelihoodApi();
Long likelihoodId = 789L; // Long | 
try {
    String result = apiInstance.retrieve(likelihoodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LikelihoodApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **likelihoodId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(ppiName)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LikelihoodApi;


LikelihoodApi apiInstance = new LikelihoodApi();
String ppiName = "ppiName_example"; // String | 
try {
    String result = apiInstance.retrieveAll(ppiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LikelihoodApi#retrieveAll");
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

<a name="update"></a>
# **update**
> String update(likelihoodId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LikelihoodApi;


LikelihoodApi apiInstance = new LikelihoodApi();
Long likelihoodId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.update(likelihoodId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LikelihoodApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **likelihoodId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

