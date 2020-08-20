# AccountingClosureApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLClosure**](AccountingClosureApi.md#createGLClosure) | **POST** glclosures | Create an Accounting Closure
[**deleteGLClosure**](AccountingClosureApi.md#deleteGLClosure) | **DELETE** glclosures/{glClosureId} | Delete an accounting closure
[**retreiveClosure**](AccountingClosureApi.md#retreiveClosure) | **GET** glclosures/{glClosureId} | Retrieve an Accounting Closure
[**retrieveAllClosures**](AccountingClosureApi.md#retrieveAllClosures) | **GET** glclosures | List Accounting closures
[**updateGLClosure**](AccountingClosureApi.md#updateGLClosure) | **PUT** glclosures/{glClosureId} | Update an Accounting closure


<a name="createGLClosure"></a>
# **createGLClosure**
> PostGlClosuresResponse createGLClosure(body)

Create an Accounting Closure

Mandatory Fields officeId,closingDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingClosureApi;


AccountingClosureApi apiInstance = new AccountingClosureApi();
PostGLCLosuresRequest body = new PostGLCLosuresRequest(); // PostGLCLosuresRequest | Request Body
try {
    PostGlClosuresResponse result = apiInstance.createGLClosure(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingClosureApi#createGLClosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGLCLosuresRequest**](PostGLCLosuresRequest.md)| Request Body |

### Return type

[**PostGlClosuresResponse**](PostGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLClosure"></a>
# **deleteGLClosure**
> DeleteGlClosuresResponse deleteGLClosure(glClosureId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingClosureApi;


AccountingClosureApi apiInstance = new AccountingClosureApi();
Long glClosureId = 789L; // Long | glclosureId
try {
    DeleteGlClosuresResponse result = apiInstance.deleteGLClosure(glClosureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingClosureApi#deleteGLClosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glclosureId |

### Return type

[**DeleteGlClosuresResponse**](DeleteGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreiveClosure"></a>
# **retreiveClosure**
> GetGLClosureResponse retreiveClosure(glClosureId)

Retrieve an Accounting Closure

Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingClosureApi;


AccountingClosureApi apiInstance = new AccountingClosureApi();
Long glClosureId = 789L; // Long | glClosureId
try {
    GetGLClosureResponse result = apiInstance.retreiveClosure(glClosureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingClosureApi#retreiveClosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glClosureId |

### Return type

[**GetGLClosureResponse**](GetGLClosureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClosures"></a>
# **retrieveAllClosures**
> List&lt;GetGLClosureResponse&gt; retrieveAllClosures(officeId)

List Accounting closures

Example Requests:  glclosures

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingClosureApi;


AccountingClosureApi apiInstance = new AccountingClosureApi();
Long officeId = 789L; // Long | officeId
try {
    List<GetGLClosureResponse> result = apiInstance.retrieveAllClosures(officeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingClosureApi#retrieveAllClosures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]

### Return type

[**List&lt;GetGLClosureResponse&gt;**](GetGLClosureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGLClosure"></a>
# **updateGLClosure**
> PutGlClosuresResponse updateGLClosure(glClosureId, body)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AccountingClosureApi;


AccountingClosureApi apiInstance = new AccountingClosureApi();
Long glClosureId = 789L; // Long | glClosureId
PutGlClosuresRequest body = new PutGlClosuresRequest(); // PutGlClosuresRequest | Request body
try {
    PutGlClosuresResponse result = apiInstance.updateGLClosure(glClosureId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingClosureApi#updateGLClosure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glClosureId |
 **body** | [**PutGlClosuresRequest**](PutGlClosuresRequest.md)| Request body |

### Return type

[**PutGlClosuresResponse**](PutGlClosuresResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

