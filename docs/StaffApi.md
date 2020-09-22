# StaffApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<PostStaffResponse> call = apiService.createStaff(body);
call.enqueue(new Callback<PostStaffResponse>() {
    @Override
    public void onResponse(Call<PostStaffResponse> call, Response<PostStaffResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostStaffResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getStaffTemplate(officeId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postStaffTemplate(file, locale, dateFormat);
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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<GetStaffResponse> call = apiService.retreiveStaff(staffId);
call.enqueue(new Callback<GetStaffResponse>() {
    @Override
    public void onResponse(Call<GetStaffResponse> call, Response<GetStaffResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStaffResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<GetStaffResponse> call = apiService.retrieveStaff(sqlSearch, officeId, staffInOfficeHierarchy, loanOfficersOnly, status);
call.enqueue(new Callback<GetStaffResponse>() {
    @Override
    public void onResponse(Call<GetStaffResponse> call, Response<GetStaffResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStaffResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StaffApi apiService = defaultClient.createService(StaffApi.class);

// Initialize these parameters earlier.
Call<PutStaffResponse> call = apiService.updateStaff(staffId, body);
call.enqueue(new Callback<PutStaffResponse>() {
    @Override
    public void onResponse(Call<PutStaffResponse> call, Response<PutStaffResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutStaffResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **staffId** | **Long**| staffId |
 **body** | [**PutStaffRequest**](PutStaffRequest.md)| body |

### Return type

[**PutStaffResponse**](PutStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

