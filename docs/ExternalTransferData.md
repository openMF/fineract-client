
# ExternalTransferData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **details** | [**ExternalTransferDataDetails**](ExternalTransferDataDetails.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **effectiveTo** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **loan** | [**ExternalTransferLoanData**](ExternalTransferLoanData.md) |  |  [optional] |
| **owner** | [**ExternalTransferOwnerData**](ExternalTransferOwnerData.md) |  |  [optional] |
| **purchasePriceRatio** | **kotlin.String** |  |  [optional] |
| **settlementDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **subStatus** | [**inline**](#SubStatus) |  |  [optional] |
| **transferExternalId** | **kotlin.String** |  |  [optional] |
| **transferId** | **kotlin.Long** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | ACTIVE, DECLINED, PENDING, BUYBACK, CANCELLED |


<a id="SubStatus"></a>
## Enum: subStatus
| Name | Value |
| ---- | ----- |
| subStatus | BALANCE_ZERO, BALANCE_NEGATIVE, SAMEDAY_TRANSFERS, USER_REQUESTED, UNSOLD |



