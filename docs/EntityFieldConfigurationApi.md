# EntityFieldConfigurationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddresses**](EntityFieldConfigurationApi.md#getAddresses) | **GET** fieldconfiguration/{entity} | Retrieves the Entity Field Configuration


<a name="getAddresses"></a>
# **getAddresses**
> List&lt;GetFieldConfigurationEntityResponse&gt; getAddresses(entity)

Retrieves the Entity Field Configuration

It retrieves all the Entity Field Configuration

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.EntityFieldConfigurationApi;


EntityFieldConfigurationApi apiInstance = new EntityFieldConfigurationApi();
String entity = "entity_example"; // String | entity
try {
    List<GetFieldConfigurationEntityResponse> result = apiInstance.getAddresses(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityFieldConfigurationApi#getAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| entity |

### Return type

[**List&lt;GetFieldConfigurationEntityResponse&gt;**](GetFieldConfigurationEntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

