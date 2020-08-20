# TaxComponentsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxCompoent**](TaxComponentsApi.md#createTaxCompoent) | **POST** taxes/component | Create a new Tax Component
[**retrieveAllTaxComponents**](TaxComponentsApi.md#retrieveAllTaxComponents) | **GET** taxes/component | List Tax Components
[**retrieveTaxComponent**](TaxComponentsApi.md#retrieveTaxComponent) | **GET** taxes/component/{taxComponentId} | Retrieve Tax Component
[**retrieveTemplate**](TaxComponentsApi.md#retrieveTemplate) | **GET** taxes/component/template | 
[**updateTaxCompoent**](TaxComponentsApi.md#updateTaxCompoent) | **PUT** taxes/component/{taxComponentId} | Update Tax Component


<a name="createTaxCompoent"></a>
# **createTaxCompoent**
> PostTaxesComponentsResponse createTaxCompoent(body)

Create a new Tax Component

Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxComponentsApi;


TaxComponentsApi apiInstance = new TaxComponentsApi();
PostTaxesComponentsRequest body = new PostTaxesComponentsRequest(); // PostTaxesComponentsRequest | body
try {
    PostTaxesComponentsResponse result = apiInstance.createTaxCompoent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxComponentsApi#createTaxCompoent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTaxesComponentsRequest**](PostTaxesComponentsRequest.md)| body |

### Return type

[**PostTaxesComponentsResponse**](PostTaxesComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllTaxComponents"></a>
# **retrieveAllTaxComponents**
> List&lt;GetTaxesComponentsResponse&gt; retrieveAllTaxComponents()

List Tax Components

List Tax Components

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxComponentsApi;


TaxComponentsApi apiInstance = new TaxComponentsApi();
try {
    List<GetTaxesComponentsResponse> result = apiInstance.retrieveAllTaxComponents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxComponentsApi#retrieveAllTaxComponents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetTaxesComponentsResponse&gt;**](GetTaxesComponentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTaxComponent"></a>
# **retrieveTaxComponent**
> GetTaxesComponentsResponse retrieveTaxComponent(taxComponentId)

Retrieve Tax Component

Retrieve Tax Component

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxComponentsApi;


TaxComponentsApi apiInstance = new TaxComponentsApi();
Long taxComponentId = 789L; // Long | taxComponentId
try {
    GetTaxesComponentsResponse result = apiInstance.retrieveTaxComponent(taxComponentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxComponentsApi#retrieveTaxComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxComponentId** | **Long**| taxComponentId |

### Return type

[**GetTaxesComponentsResponse**](GetTaxesComponentsResponse.md)

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
//import org.mifos.fineract.services.TaxComponentsApi;


TaxComponentsApi apiInstance = new TaxComponentsApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxComponentsApi#retrieveTemplate");
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

<a name="updateTaxCompoent"></a>
# **updateTaxCompoent**
> PutTaxesComponentsTaxComponentIdResponse updateTaxCompoent(taxComponentId, body)

Update Tax Component

Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.TaxComponentsApi;


TaxComponentsApi apiInstance = new TaxComponentsApi();
Long taxComponentId = 789L; // Long | taxComponentId
PutTaxesComponentsTaxComponentIdRequest body = new PutTaxesComponentsTaxComponentIdRequest(); // PutTaxesComponentsTaxComponentIdRequest | body
try {
    PutTaxesComponentsTaxComponentIdResponse result = apiInstance.updateTaxCompoent(taxComponentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxComponentsApi#updateTaxCompoent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxComponentId** | **Long**| taxComponentId |
 **body** | [**PutTaxesComponentsTaxComponentIdRequest**](PutTaxesComponentsTaxComponentIdRequest.md)| body |

### Return type

[**PutTaxesComponentsTaxComponentIdResponse**](PutTaxesComponentsTaxComponentIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

