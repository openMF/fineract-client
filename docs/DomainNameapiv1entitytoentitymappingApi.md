# DomainNameapiv1entitytoentitymappingApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMap**](DomainNameapiv1entitytoentitymappingApi.md#createMap) | **POST** entitytoentitymapping/{relId} | 
[**delete**](DomainNameapiv1entitytoentitymappingApi.md#delete) | **DELETE** entitytoentitymapping/{mapId} | 
[**getEntityToEntityMappings**](DomainNameapiv1entitytoentitymappingApi.md#getEntityToEntityMappings) | **GET** entitytoentitymapping/{mapId}/{fromId}/{toId} | 
[**retrieveAll**](DomainNameapiv1entitytoentitymappingApi.md#retrieveAll) | **GET** entitytoentitymapping | 
[**retrieveOne**](DomainNameapiv1entitytoentitymappingApi.md#retrieveOne) | **GET** entitytoentitymapping/{mapId} | 
[**updateMap**](DomainNameapiv1entitytoentitymappingApi.md#updateMap) | **PUT** entitytoentitymapping/{mapId} | 


<a name="createMap"></a>
# **createMap**
> String createMap(relId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
Long relId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.createMap(relId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#createMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> String delete(mapId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
Long mapId = 789L; // Long | 
try {
    String result = apiInstance.delete(mapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEntityToEntityMappings"></a>
# **getEntityToEntityMappings**
> String getEntityToEntityMappings(mapId, fromId, toId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
Long mapId = 789L; // Long | 
Long fromId = 789L; // Long | 
Long toId = 789L; // Long | 
try {
    String result = apiInstance.getEntityToEntityMappings(mapId, fromId, toId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#getEntityToEntityMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapId** | **Long**|  |
 **fromId** | **Long**|  |
 **toId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
try {
    String result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#retrieveAll");
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

<a name="retrieveOne"></a>
# **retrieveOne**
> String retrieveOne(mapId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
Long mapId = 789L; // Long | 
try {
    String result = apiInstance.retrieveOne(mapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMap"></a>
# **updateMap**
> String updateMap(mapId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DomainNameapiv1entitytoentitymappingApi;


DomainNameapiv1entitytoentitymappingApi apiInstance = new DomainNameapiv1entitytoentitymappingApi();
Long mapId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateMap(mapId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainNameapiv1entitytoentitymappingApi#updateMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

