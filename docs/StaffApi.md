# StaffApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStaff**](StaffApi.md#createStaff) | **POST** staff | Create a staff member
[**getStaffTemplate**](StaffApi.md#getStaffTemplate) | **GET** staff/downloadtemplate | 
[**postStaffTemplate**](StaffApi.md#postStaffTemplate) | **POST** staff/uploadtemplate | 
[**retreiveStaff**](StaffApi.md#retreiveStaff) | **GET** staff/{staffId} | Retrieve a Staff Member
[**retrieveStaff**](StaffApi.md#retrieveStaff) | **GET** staff | Retrieve Staff
[**updateStaff**](StaffApi.md#updateStaff) | **PUT** staff/{staffId} | Update a Staff Member


<a name="createStaff"></a>
# **createStaff**
> PostStaffResponse createStaff(body)

Create a staff member

Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
PostStaffRequest body = new PostStaffRequest(); // PostStaffRequest | body
try {
    PostStaffResponse result = apiInstance.createStaff(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#createStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostStaffRequest**](PostStaffRequest.md)| body |

### Return type

[**PostStaffResponse**](PostStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStaffTemplate"></a>
# **getStaffTemplate**
> getStaffTemplate(officeId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
Long officeId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getStaffTemplate(officeId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#getStaffTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postStaffTemplate"></a>
# **postStaffTemplate**
> String postStaffTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postStaffTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#postStaffTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retreiveStaff"></a>
# **retreiveStaff**
> GetStaffResponse retreiveStaff(staffId)

Retrieve a Staff Member

Returns the details of a Staff Member.  Example Requests:  staff/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
Long staffId = 789L; // Long | staffId
try {
    GetStaffResponse result = apiInstance.retreiveStaff(staffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#retreiveStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffId** | **Long**| staffId |

### Return type

[**GetStaffResponse**](GetStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveStaff"></a>
# **retrieveStaff**
> GetStaffResponse retrieveStaff(sqlSearch, officeId, staffInOfficeHierarchy, loanOfficersOnly, status)

Retrieve Staff

Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
Long officeId = 789L; // Long | officeId
Boolean staffInOfficeHierarchy = false; // Boolean | staffInOfficeHierarchy
Boolean loanOfficersOnly = false; // Boolean | loanOfficersOnly
String status = "active"; // String | status
try {
    GetStaffResponse result = apiInstance.retrieveStaff(sqlSearch, officeId, staffInOfficeHierarchy, loanOfficersOnly, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#retrieveStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffInOfficeHierarchy** | **Boolean**| staffInOfficeHierarchy | [optional] [default to false]
 **loanOfficersOnly** | **Boolean**| loanOfficersOnly | [optional] [default to false]
 **status** | **String**| status | [optional] [default to active]

### Return type

[**GetStaffResponse**](GetStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStaff"></a>
# **updateStaff**
> PutStaffResponse updateStaff(staffId, body)

Update a Staff Member

Updates the details of a staff member.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StaffApi;


StaffApi apiInstance = new StaffApi();
Long staffId = 789L; // Long | staffId
PutStaffRequest body = new PutStaffRequest(); // PutStaffRequest | body
try {
    PutStaffResponse result = apiInstance.updateStaff(staffId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaffApi#updateStaff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffId** | **Long**| staffId |
 **body** | [**PutStaffRequest**](PutStaffRequest.md)| body |

### Return type

[**PutStaffResponse**](PutStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

