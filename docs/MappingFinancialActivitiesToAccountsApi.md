# MappingFinancialActivitiesToAccountsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount**](MappingFinancialActivitiesToAccountsApi.md#createGLAccount) | **POST** financialactivityaccounts | Create a new Financial Activity to Accounts Mapping
[**deleteGLAccount**](MappingFinancialActivitiesToAccountsApi.md#deleteGLAccount) | **DELETE** financialactivityaccounts/{mappingId} | Delete a Financial Activity to Account Mapping
[**retreive**](MappingFinancialActivitiesToAccountsApi.md#retreive) | **GET** financialactivityaccounts/{mappingId} | Retrieve a Financial Activity to Account Mapping 
[**retrieveAll**](MappingFinancialActivitiesToAccountsApi.md#retrieveAll) | **GET** financialactivityaccounts | List Financial Activities to Accounts Mappings
[**retrieveTemplate**](MappingFinancialActivitiesToAccountsApi.md#retrieveTemplate) | **GET** financialactivityaccounts/template | 
[**updateGLAccount**](MappingFinancialActivitiesToAccountsApi.md#updateGLAccount) | **PUT** financialactivityaccounts/{mappingId} | Update a Financial Activity to Account Mapping


<a name="createGLAccount"></a>
# **createGLAccount**
> PostFinancialActivityAccountsResponse createGLAccount(body)

Create a new Financial Activity to Accounts Mapping

Mandatory Fields financialActivityId, glAccountId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
PostFinancialActivityAccountsRequest body = new PostFinancialActivityAccountsRequest(); // PostFinancialActivityAccountsRequest | Request body
try {
    PostFinancialActivityAccountsResponse result = apiInstance.createGLAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#createGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)| Request body | [optional]

### Return type

[**PostFinancialActivityAccountsResponse**](PostFinancialActivityAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLAccount"></a>
# **deleteGLAccount**
> DeleteFinancialActivityAccountsResponse deleteGLAccount(mappingId)

Delete a Financial Activity to Account Mapping



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
Long mappingId = 789L; // Long | mappingId
try {
    DeleteFinancialActivityAccountsResponse result = apiInstance.deleteGLAccount(mappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#deleteGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |

### Return type

[**DeleteFinancialActivityAccountsResponse**](DeleteFinancialActivityAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreive"></a>
# **retreive**
> GetFinancialActivityAccountsResponse retreive(mappingId)

Retrieve a Financial Activity to Account Mapping 

Example Requests:  financialactivityaccounts/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
Long mappingId = 789L; // Long | mappingId
try {
    GetFinancialActivityAccountsResponse result = apiInstance.retreive(mappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retreive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |

### Return type

[**GetFinancialActivityAccountsResponse**](GetFinancialActivityAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetFinancialActivityAccountsResponse&gt; retrieveAll()

List Financial Activities to Accounts Mappings

Example Requests:  financialactivityaccounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
try {
    List<GetFinancialActivityAccountsResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFinancialActivityAccountsResponse&gt;**](GetFinancialActivityAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#retrieveTemplate");
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

<a name="updateGLAccount"></a>
# **updateGLAccount**
> PutFinancialActivityAccountsResponse updateGLAccount(mappingId, body)

Update a Financial Activity to Account Mapping

the API updates the Ledger account linked to a Financial Activity  

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MappingFinancialActivitiesToAccountsApi;


MappingFinancialActivitiesToAccountsApi apiInstance = new MappingFinancialActivitiesToAccountsApi();
Long mappingId = 789L; // Long | mappingId
PostFinancialActivityAccountsRequest body = new PostFinancialActivityAccountsRequest(); // PostFinancialActivityAccountsRequest | Request body
try {
    PutFinancialActivityAccountsResponse result = apiInstance.updateGLAccount(mappingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingFinancialActivitiesToAccountsApi#updateGLAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |
 **body** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)| Request body | [optional]

### Return type

[**PutFinancialActivityAccountsResponse**](PutFinancialActivityAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

