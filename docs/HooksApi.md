# HooksApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHook**](HooksApi.md#createHook) | **POST** hooks | Create a Hook
[**deleteHook**](HooksApi.md#deleteHook) | **DELETE** hooks/{hookId} | Delete a Hook
[**retrieveHook**](HooksApi.md#retrieveHook) | **GET** hooks/{hookId} | Retrieve a Hook
[**retrieveHooks**](HooksApi.md#retrieveHooks) | **GET** hooks | Retrieve Hooks
[**template**](HooksApi.md#template) | **GET** hooks/template | Retrieve Hooks Template
[**updateHook**](HooksApi.md#updateHook) | **PUT** hooks/{hookId} | Update a Hook


<a name="createHook"></a>
# **createHook**
> PostHookResponse createHook(body)

Create a Hook

The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
PostHookRequest body = new PostHookRequest(); // PostHookRequest | 
try {
    PostHookResponse result = apiInstance.createHook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#createHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostHookRequest**](PostHookRequest.md)|  |

### Return type

[**PostHookResponse**](PostHookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHook"></a>
# **deleteHook**
> DeleteHookResponse deleteHook(hookId)

Delete a Hook

Deletes a hook.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
Long hookId = 789L; // Long | hookId
try {
    DeleteHookResponse result = apiInstance.deleteHook(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#deleteHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **Long**| hookId |

### Return type

[**DeleteHookResponse**](DeleteHookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveHook"></a>
# **retrieveHook**
> GetHookResponse retrieveHook(hookId)

Retrieve a Hook

Returns the details of a Hook.  Example Requests:  hooks/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
Long hookId = 789L; // Long | hookId
try {
    GetHookResponse result = apiInstance.retrieveHook(hookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#retrieveHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **Long**| hookId |

### Return type

[**GetHookResponse**](GetHookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveHooks"></a>
# **retrieveHooks**
> List&lt;GetHookResponse&gt; retrieveHooks()

Retrieve Hooks

Returns the list of hooks.  Example Requests:  hooks

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
try {
    List<GetHookResponse> result = apiInstance.retrieveHooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#retrieveHooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetHookResponse&gt;**](GetHookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetHookTemplateResponse template()

Retrieve Hooks Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  hooks/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
try {
    GetHookTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#template");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHookTemplateResponse**](GetHookTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHook"></a>
# **updateHook**
> PutHookResponse updateHook(hookId, body)

Update a Hook

Updates the details of a hook.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HooksApi;


HooksApi apiInstance = new HooksApi();
Long hookId = 789L; // Long | hookId
PutHookRequest body = new PutHookRequest(); // PutHookRequest | 
try {
    PutHookResponse result = apiInstance.updateHook(hookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#updateHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **Long**| hookId |
 **body** | [**PutHookRequest**](PutHookRequest.md)|  |

### Return type

[**PutHookResponse**](PutHookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

