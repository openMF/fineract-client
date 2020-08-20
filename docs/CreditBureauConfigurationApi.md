# CreditBureauConfigurationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrganisationCreditBureau**](CreditBureauConfigurationApi.md#addOrganisationCreditBureau) | **POST** CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId} | 
[**createCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#createCreditBureauLoanProductMapping) | **POST** CreditBureauConfiguration/mappings/{CreditBureauId} | 
[**fetchLoanProducts**](CreditBureauConfigurationApi.md#fetchLoanProducts) | **GET** CreditBureauConfiguration/loanProduct | 
[**getConfiguration**](CreditBureauConfigurationApi.md#getConfiguration) | **GET** CreditBureauConfiguration/config/{organisationCreditBureauId} | 
[**getCreditBureau**](CreditBureauConfigurationApi.md#getCreditBureau) | **GET** CreditBureauConfiguration | 
[**getCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#getCreditBureauLoanProductMapping) | **GET** CreditBureauConfiguration/mappings | 
[**getOrganisationCreditBureau**](CreditBureauConfigurationApi.md#getOrganisationCreditBureau) | **GET** CreditBureauConfiguration/organisationCreditBureau | 
[**updateCreditBureau**](CreditBureauConfigurationApi.md#updateCreditBureau) | **PUT** CreditBureauConfiguration/organisationCreditBureau | 
[**updateCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#updateCreditBureauLoanProductMapping) | **PUT** CreditBureauConfiguration/mappings | 


<a name="addOrganisationCreditBureau"></a>
# **addOrganisationCreditBureau**
> String addOrganisationCreditBureau(organisationCreditBureauId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
Long organisationCreditBureauId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.addOrganisationCreditBureau(organisationCreditBureauId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#addOrganisationCreditBureau");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationCreditBureauId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCreditBureauLoanProductMapping"></a>
# **createCreditBureauLoanProductMapping**
> String createCreditBureauLoanProductMapping(creditBureauId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
Long creditBureauId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.createCreditBureauLoanProductMapping(creditBureauId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#createCreditBureauLoanProductMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditBureauId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchLoanProducts"></a>
# **fetchLoanProducts**
> String fetchLoanProducts()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
try {
    String result = apiInstance.fetchLoanProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#fetchLoanProducts");
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

<a name="getConfiguration"></a>
# **getConfiguration**
> String getConfiguration(organisationCreditBureauId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
Long organisationCreditBureauId = 789L; // Long | 
try {
    String result = apiInstance.getConfiguration(organisationCreditBureauId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#getConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationCreditBureauId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditBureau"></a>
# **getCreditBureau**
> String getCreditBureau()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
try {
    String result = apiInstance.getCreditBureau();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#getCreditBureau");
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

<a name="getCreditBureauLoanProductMapping"></a>
# **getCreditBureauLoanProductMapping**
> String getCreditBureauLoanProductMapping()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
try {
    String result = apiInstance.getCreditBureauLoanProductMapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#getCreditBureauLoanProductMapping");
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

<a name="getOrganisationCreditBureau"></a>
# **getOrganisationCreditBureau**
> String getOrganisationCreditBureau()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
try {
    String result = apiInstance.getOrganisationCreditBureau();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#getOrganisationCreditBureau");
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

<a name="updateCreditBureau"></a>
# **updateCreditBureau**
> String updateCreditBureau(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateCreditBureau(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#updateCreditBureau");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCreditBureauLoanProductMapping"></a>
# **updateCreditBureauLoanProductMapping**
> String updateCreditBureauLoanProductMapping(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CreditBureauConfigurationApi;


CreditBureauConfigurationApi apiInstance = new CreditBureauConfigurationApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateCreditBureauLoanProductMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditBureauConfigurationApi#updateCreditBureauLoanProductMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

