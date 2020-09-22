# DomainNameapiv1entitytoentitymappingApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createMap(relId, body);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.delete(mapId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getEntityToEntityMappings(mapId, fromId, toId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll();
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveOne(mapId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DomainNameapiv1entitytoentitymappingApi apiService = defaultClient.createService(DomainNameapiv1entitytoentitymappingApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateMap(mapId, body);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **mapId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

