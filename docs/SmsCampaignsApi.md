# SmsCampaignsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](SmsCampaignsApi.md#createCampaign) | **POST** smscampaigns | Create a SMS Campaign
[**delete**](SmsCampaignsApi.md#delete) | **DELETE** smscampaigns/{campaignId} | Delete a SMS Campaign
[**handleCommands**](SmsCampaignsApi.md#handleCommands) | **POST** smscampaigns/{campaignId} | SMS Campaign
[**preview**](SmsCampaignsApi.md#preview) | **POST** smscampaigns/preview | 
[**retrieveAllEmails**](SmsCampaignsApi.md#retrieveAllEmails) | **GET** smscampaigns | List SMS Campaigns
[**retrieveCampaign**](SmsCampaignsApi.md#retrieveCampaign) | **GET** smscampaigns/{resourceId} | Retrieve a SMS Campaign
[**template**](SmsCampaignsApi.md#template) | **GET** smscampaigns/template | Retrieve a SMS Campaign
[**updateCampaign**](SmsCampaignsApi.md#updateCampaign) | **PUT** smscampaigns/{campaignId} | Update a Campaign


<a name="createCampaign"></a>
# **createCampaign**
> String createCampaign(body)

Create a SMS Campaign

Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
CommandWrapper body = new CommandWrapper(); // CommandWrapper | body
try {
    String result = apiInstance.createCampaign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#createCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommandWrapper**](CommandWrapper.md)| body |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> String delete(campaignId)

Delete a SMS Campaign

Note: Only closed SMS Campaigns can be deleted

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | 
try {
    String result = apiInstance.delete(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="handleCommands"></a>
# **handleCommands**
> String handleCommands(campaignId, command)

SMS Campaign

Activates | Deactivates | Reactivates

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | 
String command = "command_example"; // String | 
try {
    String result = apiInstance.handleCommands(campaignId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**|  |
 **command** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="preview"></a>
# **preview**
> String preview(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.preview(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#preview");
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

<a name="retrieveAllEmails"></a>
# **retrieveAllEmails**
> String retrieveAllEmails(sqlSearch, offset, limit, orderBy, sortOrder)

List SMS Campaigns

Example Requests:  smscampaigns

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
String sqlSearch = "sqlSearch_example"; // String | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
try {
    String result = apiInstance.retrieveAllEmails(sqlSearch, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#retrieveAllEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCampaign"></a>
# **retrieveCampaign**
> String retrieveCampaign(resourceId)

Retrieve a SMS Campaign

Example Requests:  smscampaigns/1 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long resourceId = 789L; // Long | 
try {
    String result = apiInstance.retrieveCampaign(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#retrieveCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template"></a>
# **template**
> String template()

Retrieve a SMS Campaign

Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
try {
    String result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#template");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCampaign"></a>
# **updateCampaign**
> String updateCampaign(campaignId, body)

Update a Campaign



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsCampaignsApi;


SmsCampaignsApi apiInstance = new SmsCampaignsApi();
Long campaignId = 789L; // Long | 
CommandWrapper body = new CommandWrapper(); // CommandWrapper | body
try {
    String result = apiInstance.updateCampaign(campaignId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsCampaignsApi#updateCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**|  |
 **body** | [**CommandWrapper**](CommandWrapper.md)| body |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

