# ExternalServicesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveOne**](ExternalServicesApi.md#retrieveOne) | **GET** externalservice/{servicename} | Retrieve External Services Configuration
[**updateExternalServiceProperties**](ExternalServicesApi.md#updateExternalServiceProperties) | **PUT** externalservice/{servicename} | Update External Service


<a name="retrieveOne"></a>
# **retrieveOne**
> ExternalServicesPropertiesData retrieveOne(servicename)

Retrieve External Services Configuration

Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ExternalServicesApi;


ExternalServicesApi apiInstance = new ExternalServicesApi();
String servicename = "servicename_example"; // String | servicename
try {
    ExternalServicesPropertiesData result = apiInstance.retrieveOne(servicename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalServicesApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **servicename** | **String**| servicename |

### Return type

[**ExternalServicesPropertiesData**](ExternalServicesPropertiesData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExternalServiceProperties"></a>
# **updateExternalServiceProperties**
> updateExternalServiceProperties(servicename, body)

Update External Service

Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ExternalServicesApi;


ExternalServicesApi apiInstance = new ExternalServicesApi();
String servicename = "servicename_example"; // String | servicename
PutExternalServiceRequest body = new PutExternalServiceRequest(); // PutExternalServiceRequest | body
try {
    apiInstance.updateExternalServiceProperties(servicename, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalServicesApi#updateExternalServiceProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **servicename** | **String**| servicename |
 **body** | [**PutExternalServiceRequest**](PutExternalServiceRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

