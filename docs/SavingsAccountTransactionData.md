
# SavingsAccountTransactionData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.Long** |  |  [optional] |
| **accountNo** | **kotlin.String** |  |  [optional] |
| **accountNumber** | **kotlin.String** |  |  [optional] |
| **amount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **amountOnHold** | **kotlin.Boolean** |  |  [optional] |
| **amountRelease** | **kotlin.Boolean** |  |  [optional] |
| **annualFee** | **kotlin.Boolean** |  |  [optional] |
| **annualFeeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **balanceEndDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **balanceNumberOfDays** | **kotlin.Int** |  |  [optional] |
| **bankNumber** | **kotlin.String** |  |  [optional] |
| **chargeTransaction** | **kotlin.Boolean** |  |  [optional] |
| **chargeTransactionAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **chargesPaidByData** | [**kotlin.collections.Set&lt;SavingsAccountChargesPaidByData&gt;**](SavingsAccountChargesPaidByData.md) |  |  [optional] |
| **checkNumber** | **kotlin.String** |  |  [optional] |
| **credit** | **kotlin.Boolean** |  |  [optional] |
| **cumulativeBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **currency** | [**CurrencyData**](CurrencyData.md) |  |  [optional] |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **dateFormat** | **kotlin.String** |  |  [optional] |
| **debit** | **kotlin.Boolean** |  |  [optional] |
| **deposit** | **kotlin.Boolean** |  |  [optional] |
| **depositAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **dividendPayoutAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **endOfBalanceLocalDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **entryType** | [**inline**](#EntryType) |  |  [optional] |
| **feeCharge** | **kotlin.Boolean** |  |  [optional] |
| **feeChargeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **interestPosting** | **kotlin.Boolean** |  |  [optional] |
| **interestPostingAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **interestedPostedAsOn** | **kotlin.Boolean** |  |  [optional] |
| **isManualTransaction** | **kotlin.Boolean** |  |  [optional] |
| **isReversal** | **kotlin.Boolean** |  |  [optional] |
| **lienTransaction** | **kotlin.Boolean** |  |  [optional] |
| **locale** | **kotlin.String** |  |  [optional] |
| **manualTransaction** | **kotlin.Boolean** |  |  [optional] |
| **modifiedId** | **kotlin.Long** |  |  [optional] |
| **notReversed** | **kotlin.Boolean** |  |  [optional] |
| **note** | **kotlin.String** |  |  [optional] |
| **originalTransactionId** | **kotlin.Long** |  |  [optional] |
| **outstandingChargeAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **overdraftAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **overdraftInterestAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **payCharge** | **kotlin.Boolean** |  |  [optional] |
| **paymentDetailData** | [**PaymentDetailData**](PaymentDetailData.md) |  |  [optional] |
| **paymentTypeId** | **kotlin.Long** |  |  [optional] |
| **paymentTypeOptions** | [**kotlin.collections.List&lt;PaymentTypeData&gt;**](PaymentTypeData.md) |  |  [optional] |
| **penaltyCharge** | **kotlin.Boolean** |  |  [optional] |
| **penaltyChargeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **reasonForBlock** | **kotlin.String** |  |  [optional] |
| **receiptNumber** | **kotlin.String** |  |  [optional] |
| **refNo** | **kotlin.String** |  |  [optional] |
| **releaseTransactionId** | **kotlin.Long** |  |  [optional] |
| **reversalTransaction** | **kotlin.Boolean** |  |  [optional] |
| **reversed** | **kotlin.Boolean** |  |  [optional] |
| **routingCode** | **kotlin.String** |  |  [optional] |
| **rowIndex** | **kotlin.Int** |  |  [optional] |
| **runningBalance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **savingsAccountChargesPaid** | [**kotlin.collections.Set&lt;SavingsAccountChargesPaidByData&gt;**](SavingsAccountChargesPaidByData.md) |  |  [optional] |
| **savingsAccountId** | **kotlin.Long** |  |  [optional] |
| **submittedByUsername** | **kotlin.String** |  |  [optional] |
| **submittedOnDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **taxDetails** | [**kotlin.collections.List&lt;TaxDetailsData&gt;**](TaxDetailsData.md) |  |  [optional] |
| **transactionAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **transactionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **transactionType** | [**SavingsAccountTransactionEnumData**](SavingsAccountTransactionEnumData.md) |  |  [optional] |
| **transfer** | [**AccountTransferData**](AccountTransferData.md) |  |  [optional] |
| **waiveCharge** | **kotlin.Boolean** |  |  [optional] |
| **waiveFeeCharge** | **kotlin.Boolean** |  |  [optional] |
| **waiveFeeChargeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **waivePenaltyCharge** | **kotlin.Boolean** |  |  [optional] |
| **waivePenaltyChargeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **withHoldTaxAndNotReversed** | **kotlin.Boolean** |  |  [optional] |
| **withdrawal** | **kotlin.Boolean** |  |  [optional] |
| **withdrawalFeeAndNotReversed** | **kotlin.Boolean** |  |  [optional] |


<a id="EntryType"></a>
## Enum: entryType
| Name | Value |
| ---- | ----- |
| entryType | CREDIT, DEBIT |



