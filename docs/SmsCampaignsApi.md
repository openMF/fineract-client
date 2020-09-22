# SmsCampaignsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createCampaign(body);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.delete(campaignId);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.handleCommands(campaignId, command);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.preview(body);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAllEmails(sqlSearch, offset, limit, orderBy, sortOrder);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveCampaign(resourceId);
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

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template();
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCampaign"></a>
# **updateCampaign**
> String updateCampaign(campaignId, body)

Update a Campaign



### Example
```java

SmsCampaignsApi apiService = defaultClient.createService(SmsCampaignsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateCampaign(campaignId, body);
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

 **campaignId** | **Long**|  |
 **body** | [**CommandWrapper**](CommandWrapper.md)| body |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

