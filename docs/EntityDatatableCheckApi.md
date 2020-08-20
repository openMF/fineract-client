# EntityDatatableCheckApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntityDatatableCheck**](EntityDatatableCheckApi.md#createEntityDatatableCheck) | **POST** entityDatatableChecks | Create Entity-Datatable Checks
[**deleteDatatable**](EntityDatatableCheckApi.md#deleteDatatable) | **DELETE** entityDatatableChecks/{entityDatatableCheckId} | Delete Entity-Datatable Checks
[**getTemplate**](EntityDatatableCheckApi.md#getTemplate) | **GET** entityDatatableChecks/template | Retrieve Entity-Datatable Checks Template
[**retrieveAll**](EntityDatatableCheckApi.md#retrieveAll) | **GET** entityDatatableChecks | List Entity-Datatable Checks


<a name="createEntityDatatableCheck"></a>
# **createEntityDatatableCheck**
> PostEntityDatatableChecksTemplateResponse createEntityDatatableCheck(body)

Create Entity-Datatable Checks

Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.EntityDatatableCheckApi;


EntityDatatableCheckApi apiInstance = new EntityDatatableCheckApi();
PostEntityDatatableChecksTemplateRequest body = new PostEntityDatatableChecksTemplateRequest(); // PostEntityDatatableChecksTemplateRequest | body
try {
    PostEntityDatatableChecksTemplateResponse result = apiInstance.createEntityDatatableCheck(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityDatatableCheckApi#createEntityDatatableCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostEntityDatatableChecksTemplateRequest**](PostEntityDatatableChecksTemplateRequest.md)| body |

### Return type

[**PostEntityDatatableChecksTemplateResponse**](PostEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatable"></a>
# **deleteDatatable**
> DeleteEntityDatatableChecksTemplateResponse deleteDatatable(entityDatatableCheckId, body)

Delete Entity-Datatable Checks

Deletes an existing Entity-Datatable Check

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.EntityDatatableCheckApi;


EntityDatatableCheckApi apiInstance = new EntityDatatableCheckApi();
Long entityDatatableCheckId = 789L; // Long | entityDatatableCheckId
String body = "body_example"; // String | 
try {
    DeleteEntityDatatableChecksTemplateResponse result = apiInstance.deleteDatatable(entityDatatableCheckId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityDatatableCheckApi#deleteDatatable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityDatatableCheckId** | **Long**| entityDatatableCheckId |
 **body** | **String**|  | [optional]

### Return type

[**DeleteEntityDatatableChecksTemplateResponse**](DeleteEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> GetEntityDatatableChecksTemplateResponse getTemplate()

Retrieve Entity-Datatable Checks Template

This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed Value Lists Example Request:  entityDatatableChecks/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.EntityDatatableCheckApi;


EntityDatatableCheckApi apiInstance = new EntityDatatableCheckApi();
try {
    GetEntityDatatableChecksTemplateResponse result = apiInstance.getTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityDatatableCheckApi#getTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEntityDatatableChecksTemplateResponse**](GetEntityDatatableChecksTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetEntityDatatableChecksResponse&gt; retrieveAll(status, entity, productId, offset, limit)

List Entity-Datatable Checks

The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.EntityDatatableCheckApi;


EntityDatatableCheckApi apiInstance = new EntityDatatableCheckApi();
Long status = 789L; // Long | status
String entity = "entity_example"; // String | entity
Long productId = 789L; // Long | productId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    List<GetEntityDatatableChecksResponse> result = apiInstance.retrieveAll(status, entity, productId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityDatatableCheckApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **Long**| status | [optional]
 **entity** | **String**| entity | [optional]
 **productId** | **Long**| productId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;GetEntityDatatableChecksResponse&gt;**](GetEntityDatatableChecksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

