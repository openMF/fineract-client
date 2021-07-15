# SelfThirdPartyTransferApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](SelfThirdPartyTransferApi.md#add) | **POST** self/beneficiaries/tpt | Add TPT Beneficiary
[**delete20**](SelfThirdPartyTransferApi.md#delete20) | **DELETE** self/beneficiaries/tpt/{beneficiaryId} | Delete TPT Beneficiary
[**retrieveAll35**](SelfThirdPartyTransferApi.md#retrieveAll35) | **GET** self/beneficiaries/tpt | Get All TPT Beneficiary
[**template16**](SelfThirdPartyTransferApi.md#template16) | **GET** self/beneficiaries/tpt/template | Beneficiary Third Party Transfer Template
[**update21**](SelfThirdPartyTransferApi.md#update21) | **PUT** self/beneficiaries/tpt/{beneficiaryId} | Update TPT Beneficiary



## add

> PostSelfBeneficiariesTPTResponse add(postSelfBeneficiariesTPTRequest)

Add TPT Beneficiary

Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfThirdPartyTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi(defaultClient);
        PostSelfBeneficiariesTPTRequest postSelfBeneficiariesTPTRequest = new PostSelfBeneficiariesTPTRequest(); // PostSelfBeneficiariesTPTRequest | 
        try {
            PostSelfBeneficiariesTPTResponse result = apiInstance.add(postSelfBeneficiariesTPTRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfThirdPartyTransferApi#add");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSelfBeneficiariesTPTRequest** | [**PostSelfBeneficiariesTPTRequest**](PostSelfBeneficiariesTPTRequest.md)|  |

### Return type

[**PostSelfBeneficiariesTPTResponse**](PostSelfBeneficiariesTPTResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete20

> DeleteSelfBeneficiariesTPTBeneficiaryIdResponse delete20(beneficiaryId)

Delete TPT Beneficiary

Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfThirdPartyTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi(defaultClient);
        Long beneficiaryId = 56L; // Long | 
        try {
            DeleteSelfBeneficiariesTPTBeneficiaryIdResponse result = apiInstance.delete20(beneficiaryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfThirdPartyTransferApi#delete20");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiaryId** | **Long**|  |

### Return type

[**DeleteSelfBeneficiariesTPTBeneficiaryIdResponse**](DeleteSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll35

> List&lt;GetSelfBeneficiariesTPTResponse&gt; retrieveAll35()

Get All TPT Beneficiary

Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfThirdPartyTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi(defaultClient);
        try {
            List<GetSelfBeneficiariesTPTResponse> result = apiInstance.retrieveAll35();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfThirdPartyTransferApi#retrieveAll35");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetSelfBeneficiariesTPTResponse&gt;**](GetSelfBeneficiariesTPTResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template16

> GetSelfBeneficiariesTPTTemplateResponse template16()

Beneficiary Third Party Transfer Template

Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfThirdPartyTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi(defaultClient);
        try {
            GetSelfBeneficiariesTPTTemplateResponse result = apiInstance.template16();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfThirdPartyTransferApi#template16");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetSelfBeneficiariesTPTTemplateResponse**](GetSelfBeneficiariesTPTTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update21

> PutSelfBeneficiariesTPTBeneficiaryIdResponse update21(beneficiaryId, putSelfBeneficiariesTPTBeneficiaryIdRequest)

Update TPT Beneficiary

Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfThirdPartyTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfThirdPartyTransferApi apiInstance = new SelfThirdPartyTransferApi(defaultClient);
        Long beneficiaryId = 56L; // Long | beneficiaryId
        PutSelfBeneficiariesTPTBeneficiaryIdRequest putSelfBeneficiariesTPTBeneficiaryIdRequest = new PutSelfBeneficiariesTPTBeneficiaryIdRequest(); // PutSelfBeneficiariesTPTBeneficiaryIdRequest | 
        try {
            PutSelfBeneficiariesTPTBeneficiaryIdResponse result = apiInstance.update21(beneficiaryId, putSelfBeneficiariesTPTBeneficiaryIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfThirdPartyTransferApi#update21");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiaryId** | **Long**| beneficiaryId |
 **putSelfBeneficiariesTPTBeneficiaryIdRequest** | [**PutSelfBeneficiariesTPTBeneficiaryIdRequest**](PutSelfBeneficiariesTPTBeneficiaryIdRequest.md)|  |

### Return type

[**PutSelfBeneficiariesTPTBeneficiaryIdResponse**](PutSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

