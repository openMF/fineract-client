
# GetSavingsAccountTransactionsPageItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.Long** |  |  [optional] |
| **accountNo** | **kotlin.String** |  |  [optional] |
| **amount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **chargesPaidByData** | [**kotlin.collections.Set&lt;GetSavingsAccountChargesPaidByData&gt;**](GetSavingsAccountChargesPaidByData.md) |  |  [optional] |
| **currency** | [**GetTransactionsCurrency**](GetTransactionsCurrency.md) |  |  [optional] |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **entryType** | [**inline**](#EntryType) |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **interestedPostedAsOn** | **kotlin.Boolean** |  |  [optional] |
| **isManualTransaction** | **kotlin.Boolean** |  |  [optional] |
| **isReversal** | **kotlin.Boolean** |  |  [optional] |
| **lienTransaction** | **kotlin.Boolean** |  |  [optional] |
| **originalTransactionId** | **kotlin.Long** |  |  [optional] |
| **paymentDetailData** | [**GetTransactionsPaymentDetailData**](GetTransactionsPaymentDetailData.md) |  |  [optional] |
| **releaseTransactionId** | **kotlin.Long** |  |  [optional] |
| **reversed** | **kotlin.Boolean** |  |  [optional] |
| **runningBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **submittedByUsername** | **kotlin.String** |  |  [optional] |
| **submittedOnDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **transactionType** | [**GetTranscationEnumData**](GetTranscationEnumData.md) |  |  [optional] |


<a id="EntryType"></a>
## Enum: entryType
| Name | Value |
| ---- | ----- |
| entryType | CREDIT, DEBIT |



