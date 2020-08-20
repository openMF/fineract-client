# ProvisioningCriteriaApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningCriteria**](ProvisioningCriteriaApi.md#createProvisioningCriteria) | **POST** provisioningcriteria | Create a new Provisioning Criteria
[**deleteProvisioningCriteria**](ProvisioningCriteriaApi.md#deleteProvisioningCriteria) | **DELETE** provisioningcriteria/{criteriaId} | Deletes Provisioning Criteria
[**retrieveAllProvisioningCriterias**](ProvisioningCriteriaApi.md#retrieveAllProvisioningCriterias) | **GET** provisioningcriteria | Retrieves all created Provisioning Criterias
[**retrieveProvisioningCriteria**](ProvisioningCriteriaApi.md#retrieveProvisioningCriteria) | **GET** provisioningcriteria/{criteriaId} | Retrieves a Provisioning Criteria
[**retrieveTemplate**](ProvisioningCriteriaApi.md#retrieveTemplate) | **GET** provisioningcriteria/template | 
[**updateProvisioningCriteria**](ProvisioningCriteriaApi.md#updateProvisioningCriteria) | **PUT** provisioningcriteria/{criteriaId} | Updates a new Provisioning Criteria


<a name="createProvisioningCriteria"></a>
# **createProvisioningCriteria**
> PostProvisioningCriteriaResponse createProvisioningCriteria(body)

Create a new Provisioning Criteria

Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
PostProvisioningCriteriaRequest body = new PostProvisioningCriteriaRequest(); // PostProvisioningCriteriaRequest | body
try {
    PostProvisioningCriteriaResponse result = apiInstance.createProvisioningCriteria(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#createProvisioningCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostProvisioningCriteriaRequest**](PostProvisioningCriteriaRequest.md)| body |

### Return type

[**PostProvisioningCriteriaResponse**](PostProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvisioningCriteria"></a>
# **deleteProvisioningCriteria**
> DeleteProvisioningCriteriaResponse deleteProvisioningCriteria(criteriaId)

Deletes Provisioning Criteria

Deletes Provisioning Criteria

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
Long criteriaId = 789L; // Long | criteriaId
try {
    DeleteProvisioningCriteriaResponse result = apiInstance.deleteProvisioningCriteria(criteriaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#deleteProvisioningCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteriaId** | **Long**| criteriaId |

### Return type

[**DeleteProvisioningCriteriaResponse**](DeleteProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProvisioningCriterias"></a>
# **retrieveAllProvisioningCriterias**
> List&lt;GetProvisioningCriteriaResponse&gt; retrieveAllProvisioningCriterias()

Retrieves all created Provisioning Criterias

Retrieves all created Provisioning Criterias

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
try {
    List<GetProvisioningCriteriaResponse> result = apiInstance.retrieveAllProvisioningCriterias();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveAllProvisioningCriterias");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetProvisioningCriteriaResponse&gt;**](GetProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProvisioningCriteria"></a>
# **retrieveProvisioningCriteria**
> GetProvisioningCriteriaCriteriaIdResponse retrieveProvisioningCriteria(criteriaId)

Retrieves a Provisioning Criteria

Retrieves a Provisioning Criteria

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
Long criteriaId = 789L; // Long | criteriaId
try {
    GetProvisioningCriteriaCriteriaIdResponse result = apiInstance.retrieveProvisioningCriteria(criteriaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveProvisioningCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteriaId** | **Long**| criteriaId |

### Return type

[**GetProvisioningCriteriaCriteriaIdResponse**](GetProvisioningCriteriaCriteriaIdResponse.md)

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
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#retrieveTemplate");
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

<a name="updateProvisioningCriteria"></a>
# **updateProvisioningCriteria**
> PutProvisioningCriteriaResponse updateProvisioningCriteria(criteriaId, body)

Updates a new Provisioning Criteria

Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCriteriaApi;


ProvisioningCriteriaApi apiInstance = new ProvisioningCriteriaApi();
Long criteriaId = 789L; // Long | criteriaId
PutProvisioningCriteriaRequest body = new PutProvisioningCriteriaRequest(); // PutProvisioningCriteriaRequest | body
try {
    PutProvisioningCriteriaResponse result = apiInstance.updateProvisioningCriteria(criteriaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCriteriaApi#updateProvisioningCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteriaId** | **Long**| criteriaId |
 **body** | [**PutProvisioningCriteriaRequest**](PutProvisioningCriteriaRequest.md)| body |

### Return type

[**PutProvisioningCriteriaResponse**](PutProvisioningCriteriaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

