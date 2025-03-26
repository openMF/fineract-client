
# GetLoanProductsProductIdResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountingMappings** | [**GetLoanAccountingMappings**](GetLoanAccountingMappings.md) |  |  [optional] |
| **accountingRule** | [**GetLoanProductsAccountingRule**](GetLoanProductsAccountingRule.md) |  |  [optional] |
| **amortizationType** | [**GetLoanProductsAmortizationType**](GetLoanProductsAmortizationType.md) |  |  [optional] |
| **annualInterestRate** | **kotlin.Double** |  |  [optional] |
| **charges** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **currency** | [**GetLoanProductsCurrency**](GetLoanProductsCurrency.md) |  |  [optional] |
| **delinquencyBucket** | [**GetDelinquencyBucketsResponse**](GetDelinquencyBucketsResponse.md) |  |  [optional] |
| **disableScheduleExtensionForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **disallowExpectedDisbursements** | **kotlin.Boolean** |  |  [optional] |
| **disbursedAmountPercentageForDownPayment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **dueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **enableAutoRepaymentForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableInstallmentLevelDelinquency** | **kotlin.Boolean** |  |  [optional] |
| **feeToIncomeAccountMappings** | [**kotlin.collections.Set&lt;GetLoanFeeToIncomeAccountMappings&gt;**](GetLoanFeeToIncomeAccountMappings.md) |  |  [optional] |
| **fixedPrincipalPercentagePerInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **inArrearsTolerance** | **kotlin.Int** |  |  [optional] |
| **includeInBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **interestCalculationPeriodType** | [**GetLoansProductsInterestCalculationPeriodType**](GetLoansProductsInterestCalculationPeriodType.md) |  |  [optional] |
| **interestRateFrequencyType** | [**GetLoanProductsInterestRateFrequencyType**](GetLoanProductsInterestRateFrequencyType.md) |  |  [optional] |
| **interestRatePerPeriod** | **kotlin.Double** |  |  [optional] |
| **interestRateVariationsForBorrowerCycle** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **interestType** | [**GetLoanProductsInterestTemplateType**](GetLoanProductsInterestTemplateType.md) |  |  [optional] |
| **loanScheduleProcessingType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **maxPrincipal** | **kotlin.Double** |  |  [optional] |
| **maxTrancheCount** | **kotlin.Int** |  |  [optional] |
| **minPrincipal** | **kotlin.Double** |  |  [optional] |
| **multiDisburseLoan** | **kotlin.Boolean** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **numberOfRepaymentVariationsForBorrowerCycle** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **numberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **outstandingLoanBalance** | **kotlin.Double** |  |  [optional] |
| **overDueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **overdueDaysForNPA** | **kotlin.Int** |  |  [optional] |
| **paymentAllocation** | [**kotlin.collections.List&lt;AdvancedPaymentData&gt;**](AdvancedPaymentData.md) |  |  [optional] |
| **paymentChannelToFundSourceMappings** | [**kotlin.collections.Set&lt;GetLoanPaymentChannelToFundSourceMappings&gt;**](GetLoanPaymentChannelToFundSourceMappings.md) |  |  [optional] |
| **principal** | **kotlin.Double** |  |  [optional] |
| **principalThresholdForLastInstalment** | **kotlin.Int** |  |  [optional] |
| **productsPrincipalVariationsForBorrowerCycle** | [**kotlin.collections.Set&lt;GetLoanProductsPrincipalVariationsForBorrowerCycle&gt;**](GetLoanProductsPrincipalVariationsForBorrowerCycle.md) |  |  [optional] |
| **repaymentEvery** | **kotlin.Int** |  |  [optional] |
| **repaymentFrequencyType** | [**GetLoanProductsRepaymentFrequencyType**](GetLoanProductsRepaymentFrequencyType.md) |  |  [optional] |
| **repaymentStartDateType** | [**GetLoanProductsRepaymentStartDateType**](GetLoanProductsRepaymentStartDateType.md) |  |  [optional] |
| **shortName** | **kotlin.String** |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **transactionProcessingStrategyCode** | **kotlin.String** |  |  [optional] |
| **transactionProcessingStrategyName** | **kotlin.String** |  |  [optional] |
| **useBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |



