# TaxGroupApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxGroup**](TaxGroupApi.md#createTaxGroup) | **POST** taxes/group | Create a new Tax Group
[**retrieveAllTaxGroups**](TaxGroupApi.md#retrieveAllTaxGroups) | **GET** taxes/group | List Tax Group
[**retrieveTaxGroup**](TaxGroupApi.md#retrieveTaxGroup) | **GET** taxes/group/{taxGroupId} | Retrieve Tax Group
[**retrieveTemplate**](TaxGroupApi.md#retrieveTemplate) | **GET** taxes/group/template | 
[**updateTaxGroup**](TaxGroupApi.md#updateTaxGroup) | **PUT** taxes/group/{taxGroupId} | Update Tax Group


<a name="createTaxGroup"></a>
# **createTaxGroup**
> PostTaxesGroupResponse createTaxGroup(body)

Create a new Tax Group

Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxGroupApi;


TaxGroupApi apiInstance = new TaxGroupApi();
PostTaxesGroupRequest body = new PostTaxesGroupRequest(); // PostTaxesGroupRequest | body
try {
    PostTaxesGroupResponse result = apiInstance.createTaxGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxGroupApi#createTaxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTaxesGroupRequest**](PostTaxesGroupRequest.md)| body |

### Return type

[**PostTaxesGroupResponse**](PostTaxesGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllTaxGroups"></a>
# **retrieveAllTaxGroups**
> List&lt;GetTaxesGroupResponse&gt; retrieveAllTaxGroups()

List Tax Group

List Tax Group

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxGroupApi;


TaxGroupApi apiInstance = new TaxGroupApi();
try {
    List<GetTaxesGroupResponse> result = apiInstance.retrieveAllTaxGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxGroupApi#retrieveAllTaxGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetTaxesGroupResponse&gt;**](GetTaxesGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTaxGroup"></a>
# **retrieveTaxGroup**
> GetTaxesGroupResponse retrieveTaxGroup(taxGroupId)

Retrieve Tax Group

Retrieve Tax Group

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxGroupApi;


TaxGroupApi apiInstance = new TaxGroupApi();
Long taxGroupId = 789L; // Long | taxGroupId
try {
    GetTaxesGroupResponse result = apiInstance.retrieveTaxGroup(taxGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxGroupApi#retrieveTaxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxGroupId** | **Long**| taxGroupId |

### Return type

[**GetTaxesGroupResponse**](GetTaxesGroupResponse.md)

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
//import org.mifos.fineract.services.TaxGroupApi;


TaxGroupApi apiInstance = new TaxGroupApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxGroupApi#retrieveTemplate");
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

<a name="updateTaxGroup"></a>
# **updateTaxGroup**
> PutTaxesGroupTaxGroupIdResponse updateTaxGroup(taxGroupId, body)

Update Tax Group

Updates Tax Group. Only end date can be up-datable and can insert new tax components.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxGroupApi;


TaxGroupApi apiInstance = new TaxGroupApi();
Long taxGroupId = 789L; // Long | taxGroupId
PutTaxesGroupTaxGroupIdRequest body = new PutTaxesGroupTaxGroupIdRequest(); // PutTaxesGroupTaxGroupIdRequest | body
try {
    PutTaxesGroupTaxGroupIdResponse result = apiInstance.updateTaxGroup(taxGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxGroupApi#updateTaxGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxGroupId** | **Long**| taxGroupId |
 **body** | [**PutTaxesGroupTaxGroupIdRequest**](PutTaxesGroupTaxGroupIdRequest.md)| body |

### Return type

[**PutTaxesGroupTaxGroupIdResponse**](PutTaxesGroupTaxGroupIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

