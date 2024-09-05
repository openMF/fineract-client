
# Client

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdBy** | **kotlin.Long** |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **lastModifiedBy** | **kotlin.Long** |  |  |
| **lastModifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **lastModifiedDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **accountNumber** | **kotlin.String** |  |  [optional] |
| **accountNumberRequiresAutoGeneration** | **kotlin.Boolean** |  |  [optional] |
| **activatedBy** | [**AppUser**](AppUser.md) |  |  [optional] |
| **activationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **active** | **kotlin.Boolean** |  |  [optional] |
| **clientClassification** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **clientType** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **closedBy** | [**AppUser**](AppUser.md) |  |  [optional] |
| **closureDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **closureReason** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **dateOfBirth** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **displayName** | **kotlin.String** |  |  [optional] |
| **emailAddress** | **kotlin.String** |  |  [optional] |
| **externalId** | [**ExternalId**](ExternalId.md) |  |  [optional] |
| **firstname** | **kotlin.String** |  |  [optional] |
| **fullname** | **kotlin.String** |  |  [optional] |
| **gender** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **groups** | [**kotlin.collections.Set&lt;Group&gt;**](Group.md) |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **image** | [**Image**](Image.md) |  |  [optional] |
| **lastname** | **kotlin.String** |  |  [optional] |
| **legalForm** | **kotlin.Int** |  |  [optional] |
| **middlename** | **kotlin.String** |  |  [optional] |
| **mobileNo** | **kotlin.String** |  |  [optional] |
| **new** | **kotlin.Boolean** |  |  [optional] |
| **notActive** | **kotlin.Boolean** |  |  [optional] |
| **notPending** | **kotlin.Boolean** |  |  [optional] |
| **notStaff** | **kotlin.Boolean** |  |  [optional] |
| **office** | [**Office**](Office.md) |  |  [optional] |
| **officeJoiningDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **pending** | **kotlin.Boolean** |  |  [optional] |
| **proposedTransferDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **reactivateDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **reactivatedBy** | [**AppUser**](AppUser.md) |  |  [optional] |
| **rejected** | **kotlin.Boolean** |  |  [optional] |
| **rejectedBy** | [**AppUser**](AppUser.md) |  |  [optional] |
| **rejectedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **rejectionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **rejectionReason** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **reopenedBy** | [**AppUser**](AppUser.md) |  |  [optional] |
| **reopenedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **savingsAccountId** | **kotlin.Long** |  |  [optional] |
| **savingsProductId** | **kotlin.Long** |  |  [optional] |
| **staff** | [**Staff**](Staff.md) |  |  [optional] |
| **status** | **kotlin.Int** |  |  [optional] |
| **subStatus** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **submittedOnDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **transferInProgress** | **kotlin.Boolean** |  |  [optional] |
| **transferInProgressOrOnHold** | **kotlin.Boolean** |  |  [optional] |
| **transferOnHold** | **kotlin.Boolean** |  |  [optional] |
| **transferToOffice** | [**Office**](Office.md) |  |  [optional] |
| **withdrawalDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **withdrawalReason** | [**CodeValue**](CodeValue.md) |  |  [optional] |
| **withdrawn** | **kotlin.Boolean** |  |  [optional] |
| **withdrawnBy** | [**AppUser**](AppUser.md) |  |  [optional] |



