
# SavingsAccountTransactionEnumData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **amountHold** | **kotlin.Boolean** |  |  [optional] |
| **amountRelease** | **kotlin.Boolean** |  |  [optional] |
| **annualFee** | **kotlin.Boolean** |  |  [optional] |
| **approveTransfer** | **kotlin.Boolean** |  |  [optional] |
| **chargeTransaction** | **kotlin.Boolean** |  |  [optional] |
| **code** | **kotlin.String** |  |  [optional] |
| **credit** | **kotlin.Boolean** |  |  [optional] |
| **debit** | **kotlin.Boolean** |  |  [optional] |
| **deposit** | **kotlin.Boolean** |  |  [optional] |
| **depositOrWithdrawal** | **kotlin.Boolean** |  |  [optional] |
| **dividendPayout** | **kotlin.Boolean** |  |  [optional] |
| **entryType** | [**inline**](#EntryType) |  |  [optional] |
| **escheat** | **kotlin.Boolean** |  |  [optional] |
| **feeDeduction** | **kotlin.Boolean** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **incomeFromInterest** | **kotlin.Boolean** |  |  [optional] |
| **initiateTransfer** | **kotlin.Boolean** |  |  [optional] |
| **interestPosting** | **kotlin.Boolean** |  |  [optional] |
| **overDraftInterestPosting** | **kotlin.Boolean** |  |  [optional] |
| **overdraftFee** | **kotlin.Boolean** |  |  [optional] |
| **overdraftInterest** | **kotlin.Boolean** |  |  [optional] |
| **payCharge** | **kotlin.Boolean** |  |  [optional] |
| **rejectTransfer** | **kotlin.Boolean** |  |  [optional] |
| **transactionTypeEnum** | [**inline**](#TransactionTypeEnum) |  |  [optional] |
| **&#x60;value&#x60;** | **kotlin.String** |  |  [optional] |
| **withdrawTransfer** | **kotlin.Boolean** |  |  [optional] |
| **withdrawal** | **kotlin.Boolean** |  |  [optional] |
| **withdrawalFee** | **kotlin.Boolean** |  |  [optional] |
| **withholdTax** | **kotlin.Boolean** |  |  [optional] |
| **writtenoff** | **kotlin.Boolean** |  |  [optional] |


<a id="EntryType"></a>
## Enum: entryType
| Name | Value |
| ---- | ----- |
| entryType | CREDIT, DEBIT |


<a id="TransactionTypeEnum"></a>
## Enum: transactionTypeEnum
| Name | Value |
| ---- | ----- |
| transactionTypeEnum | INVALID, DEPOSIT, WITHDRAWAL, INTEREST_POSTING, WITHDRAWAL_FEE, ANNUAL_FEE, WAIVE_CHARGES, PAY_CHARGE, DIVIDEND_PAYOUT, INITIATE_TRANSFER, APPROVE_TRANSFER, WITHDRAW_TRANSFER, REJECT_TRANSFER, WRITTEN_OFF, OVERDRAFT_INTEREST, WITHHOLD_TAX, ESCHEAT, AMOUNT_HOLD, AMOUNT_RELEASE |



