
# PutTellersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**officeId** | **Long** |  |  [optional]
**description** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**locale** | **String** |  |  [optional]
**dateFormat** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
PENDING | &quot;PENDING&quot;
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
CLOSED | &quot;CLOSED&quot;



