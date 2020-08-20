# CodeValuesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCodeValue**](CodeValuesApi.md#createCodeValue) | **POST** codes/{codeId}/codevalues | Create a Code Value
[**deleteCodeValue**](CodeValuesApi.md#deleteCodeValue) | **DELETE** codes/{codeId}/codevalues/{codeValueId} | Delete a Code Value
[**retrieveAllCodeValues**](CodeValuesApi.md#retrieveAllCodeValues) | **GET** codes/{codeId}/codevalues | List Code Values
[**retrieveCodeValue**](CodeValuesApi.md#retrieveCodeValue) | **GET** codes/{codeId}/codevalues/{codeValueId} | Retrieve a Code Value
[**updateCodeValue**](CodeValuesApi.md#updateCodeValue) | **PUT** codes/{codeId}/codevalues/{codeValueId} | Update a Code Value


<a name="createCodeValue"></a>
# **createCodeValue**
> PostCodeValueDataResponse createCodeValue(codeId, body)

Create a Code Value



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodeValuesApi;


CodeValuesApi apiInstance = new CodeValuesApi();
Long codeId = 789L; // Long | codeId
PostCodeValuesDataRequest body = new PostCodeValuesDataRequest(); // PostCodeValuesDataRequest | body
try {
    PostCodeValueDataResponse result = apiInstance.createCodeValue(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodeValuesApi#createCodeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |
 **body** | [**PostCodeValuesDataRequest**](PostCodeValuesDataRequest.md)| body |

### Return type

[**PostCodeValueDataResponse**](PostCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCodeValue"></a>
# **deleteCodeValue**
> DeleteCodeValueDataResponse deleteCodeValue(codeId, codeValueId)

Delete a Code Value

Deletes a code value

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodeValuesApi;


CodeValuesApi apiInstance = new CodeValuesApi();
Long codeId = 789L; // Long | codeId
Long codeValueId = 789L; // Long | codeValueId
try {
    DeleteCodeValueDataResponse result = apiInstance.deleteCodeValue(codeId, codeValueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodeValuesApi#deleteCodeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |

### Return type

[**DeleteCodeValueDataResponse**](DeleteCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllCodeValues"></a>
# **retrieveAllCodeValues**
> List&lt;GetCodeValuesDataResponse&gt; retrieveAllCodeValues(codeId)

List Code Values

Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodeValuesApi;


CodeValuesApi apiInstance = new CodeValuesApi();
Long codeId = 789L; // Long | codeId
try {
    List<GetCodeValuesDataResponse> result = apiInstance.retrieveAllCodeValues(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodeValuesApi#retrieveAllCodeValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**List&lt;GetCodeValuesDataResponse&gt;**](GetCodeValuesDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCodeValue"></a>
# **retrieveCodeValue**
> GetCodeValuesDataResponse retrieveCodeValue(codeValueId)

Retrieve a Code Value

Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodeValuesApi;


CodeValuesApi apiInstance = new CodeValuesApi();
Long codeValueId = 789L; // Long | codeValueId
try {
    GetCodeValuesDataResponse result = apiInstance.retrieveCodeValue(codeValueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodeValuesApi#retrieveCodeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeValueId** | **Long**| codeValueId |

### Return type

[**GetCodeValuesDataResponse**](GetCodeValuesDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCodeValue"></a>
# **updateCodeValue**
> PutCodeValueDataResponse updateCodeValue(codeId, codeValueId, body)

Update a Code Value

Updates the details of a code value.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CodeValuesApi;


CodeValuesApi apiInstance = new CodeValuesApi();
Long codeId = 789L; // Long | codeId
Long codeValueId = 789L; // Long | codeValueId
PutCodeValuesDataRequest body = new PutCodeValuesDataRequest(); // PutCodeValuesDataRequest | body
try {
    PutCodeValueDataResponse result = apiInstance.updateCodeValue(codeId, codeValueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodeValuesApi#updateCodeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |
 **body** | [**PutCodeValuesDataRequest**](PutCodeValuesDataRequest.md)| body |

### Return type

[**PutCodeValueDataResponse**](PutCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

