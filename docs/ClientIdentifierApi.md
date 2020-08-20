# ClientIdentifierApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientIdentifier**](ClientIdentifierApi.md#createClientIdentifier) | **POST** clients/{clientId}/identifiers | Create an Identifier for a Client
[**deleteClientIdentifier**](ClientIdentifierApi.md#deleteClientIdentifier) | **DELETE** clients/{clientId}/identifiers/{identifierId} | Delete a Client Identifier
[**newClientIdentifierDetails**](ClientIdentifierApi.md#newClientIdentifierDetails) | **GET** clients/{clientId}/identifiers/template | Retrieve Client Identifier Details Template
[**retrieveAllClientIdentifiers**](ClientIdentifierApi.md#retrieveAllClientIdentifiers) | **GET** clients/{clientId}/identifiers | List all Identifiers for a Client
[**retrieveClientIdentifiers**](ClientIdentifierApi.md#retrieveClientIdentifiers) | **GET** clients/{clientId}/identifiers/{identifierId} | Retrieve a Client Identifier
[**updateClientIdentifer**](ClientIdentifierApi.md#updateClientIdentifer) | **PUT** clients/{clientId}/identifiers/{identifierId} | Update a Client Identifier


<a name="createClientIdentifier"></a>
# **createClientIdentifier**
> PostClientsClientIdIdentifiersResponse createClientIdentifier(clientId, body)

Create an Identifier for a Client

Mandatory Fields documentKey, documentTypeId 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
Long clientId = 789L; // Long | clientId
PostClientsClientIdIdentifiersRequest body = new PostClientsClientIdIdentifiersRequest(); // PostClientsClientIdIdentifiersRequest | body
try {
    PostClientsClientIdIdentifiersResponse result = apiInstance.createClientIdentifier(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#createClientIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **body** | [**PostClientsClientIdIdentifiersRequest**](PostClientsClientIdIdentifiersRequest.md)| body |

### Return type

[**PostClientsClientIdIdentifiersResponse**](PostClientsClientIdIdentifiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientIdentifier"></a>
# **deleteClientIdentifier**
> DeleteClientsClientIdIdentifiersIdentifierIdResponse deleteClientIdentifier(clientId, identifierId)

Delete a Client Identifier

Deletes a Client Identifier

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
Long clientId = 789L; // Long | clientId
Long identifierId = 789L; // Long | identifierId
try {
    DeleteClientsClientIdIdentifiersIdentifierIdResponse result = apiInstance.deleteClientIdentifier(clientId, identifierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#deleteClientIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**DeleteClientsClientIdIdentifiersIdentifierIdResponse**](DeleteClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newClientIdentifierDetails"></a>
# **newClientIdentifierDetails**
> GetClientsClientIdIdentifiersTemplateResponse newClientIdentifierDetails()

Retrieve Client Identifier Details Template

This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed Value Lists   Example Request: clients/1/identifiers/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
try {
    GetClientsClientIdIdentifiersTemplateResponse result = apiInstance.newClientIdentifierDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#newClientIdentifierDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetClientsClientIdIdentifiersTemplateResponse**](GetClientsClientIdIdentifiersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientIdentifiers"></a>
# **retrieveAllClientIdentifiers**
> List&lt;GetClientsClientIdIdentifiersResponse&gt; retrieveAllClientIdentifiers(clientId)

List all Identifiers for a Client

Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
Long clientId = 789L; // Long | clientId
try {
    List<GetClientsClientIdIdentifiersResponse> result = apiInstance.retrieveAllClientIdentifiers(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#retrieveAllClientIdentifiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**List&lt;GetClientsClientIdIdentifiersResponse&gt;**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientIdentifiers"></a>
# **retrieveClientIdentifiers**
> GetClientsClientIdIdentifiersResponse retrieveClientIdentifiers(clientId, identifierId)

Retrieve a Client Identifier

Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
Long clientId = 789L; // Long | clientId
Long identifierId = 789L; // Long | identifierId
try {
    GetClientsClientIdIdentifiersResponse result = apiInstance.retrieveClientIdentifiers(clientId, identifierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#retrieveClientIdentifiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**GetClientsClientIdIdentifiersResponse**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientIdentifer"></a>
# **updateClientIdentifer**
> PutClientsClientIdIdentifiersIdentifierIdResponse updateClientIdentifer(clientId, identifierId, body)

Update a Client Identifier

Updates a Client Identifier

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientIdentifierApi;


ClientIdentifierApi apiInstance = new ClientIdentifierApi();
Long clientId = 789L; // Long | clientId
Long identifierId = 789L; // Long | identifierId
PutClientsClientIdIdentifiersIdentifierIdRequest body = new PutClientsClientIdIdentifiersIdentifierIdRequest(); // PutClientsClientIdIdentifiersIdentifierIdRequest | body
try {
    PutClientsClientIdIdentifiersIdentifierIdResponse result = apiInstance.updateClientIdentifer(clientId, identifierId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientIdentifierApi#updateClientIdentifer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |
 **body** | [**PutClientsClientIdIdentifiersIdentifierIdRequest**](PutClientsClientIdIdentifiersIdentifierIdRequest.md)| body |

### Return type

[**PutClientsClientIdIdentifiersIdentifierIdResponse**](PutClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

