# CodesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCode**](CodesApi.md#createCode) | **POST** codes | Create a Code
[**deleteCode**](CodesApi.md#deleteCode) | **DELETE** codes/{codeId} | Delete a Code
[**retrieveCode**](CodesApi.md#retrieveCode) | **GET** codes/{codeId} | Retrieve a Code
[**retrieveCodes**](CodesApi.md#retrieveCodes) | **GET** codes | Retrieve Codes
[**updateCode**](CodesApi.md#updateCode) | **PUT** codes/{codeId} | Update a Code


<a name="createCode"></a>
# **createCode**
> PostCodesResponse createCode(body)

Create a Code

Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodesApi;


CodesApi apiInstance = new CodesApi();
PostCodesRequest body = new PostCodesRequest(); // PostCodesRequest | body
try {
    PostCodesResponse result = apiInstance.createCode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#createCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCodesRequest**](PostCodesRequest.md)| body |

### Return type

[**PostCodesResponse**](PostCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCode"></a>
# **deleteCode**
> DeleteCodesResponse deleteCode(codeId)

Delete a Code

Deletes a code if it is not system defined.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodesApi;


CodesApi apiInstance = new CodesApi();
Long codeId = 789L; // Long | codeId
try {
    DeleteCodesResponse result = apiInstance.deleteCode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#deleteCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**DeleteCodesResponse**](DeleteCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCode"></a>
# **retrieveCode**
> GetCodesResponse retrieveCode(codeId)

Retrieve a Code

Returns the details of a Code.  Example Requests:  codes/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodesApi;


CodesApi apiInstance = new CodesApi();
Long codeId = 789L; // Long | codeId
try {
    GetCodesResponse result = apiInstance.retrieveCode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#retrieveCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**GetCodesResponse**](GetCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCodes"></a>
# **retrieveCodes**
> List&lt;GetCodesResponse&gt; retrieveCodes()

Retrieve Codes

Returns the list of codes.  Example Requests:  codes

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodesApi;


CodesApi apiInstance = new CodesApi();
try {
    List<GetCodesResponse> result = apiInstance.retrieveCodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#retrieveCodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetCodesResponse&gt;**](GetCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCode"></a>
# **updateCode**
> PutCodesResponse updateCode(codeId, body)

Update a Code

Updates the details of a code if it is not system defined.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodesApi;


CodesApi apiInstance = new CodesApi();
Long codeId = 789L; // Long | codeId
PutCodesRequest body = new PutCodesRequest(); // PutCodesRequest | body
try {
    PutCodesResponse result = apiInstance.updateCode(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#updateCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |
 **body** | [**PutCodesRequest**](PutCodesRequest.md)| body |

### Return type

[**PutCodesResponse**](PutCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

