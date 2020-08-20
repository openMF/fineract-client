
# GetLoanProductsProductIdResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**shortName** | **String** |  |  [optional]
**includeInBorrowerCycle** | **Boolean** |  |  [optional]
**useBorrowerCycle** | **Boolean** |  |  [optional]
**status** | **String** |  |  [optional]
**currency** | [**GetLoanProductsCurrency**](GetLoanProductsCurrency.md) |  |  [optional]
**principal** | **Float** |  |  [optional]
**minPrincipal** | **Float** |  |  [optional]
**maxPrincipal** | **Float** |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**repaymentEvery** | **Integer** |  |  [optional]
**repaymentFrequencyType** | [**GetLoanProductsRepaymentFrequencyType**](GetLoanProductsRepaymentFrequencyType.md) |  |  [optional]
**interestRatePerPeriod** | **Float** |  |  [optional]
**interestRateFrequencyType** | [**GetLoanProductsInterestRateFrequencyType**](GetLoanProductsInterestRateFrequencyType.md) |  |  [optional]
**annualInterestRate** | **Float** |  |  [optional]
**amortizationType** | [**GetLoanProductsAmortizationType**](GetLoanProductsAmortizationType.md) |  |  [optional]
**interestType** | [**GetLoanProductsInterestTemplateType**](GetLoanProductsInterestTemplateType.md) |  |  [optional]
**interestCalculationPeriodType** | [**GetLoansProductsInterestCalculationPeriodType**](GetLoansProductsInterestCalculationPeriodType.md) |  |  [optional]
**transactionProcessingStrategyId** | **Integer** |  |  [optional]
**transactionProcessingStrategyName** | **String** |  |  [optional]
**charges** | **List&lt;Integer&gt;** |  |  [optional]
**productsPrincipalVariationsForBorrowerCycle** | [**List&lt;GetLoanProductsPrincipalVariationsForBorrowerCycle&gt;**](GetLoanProductsPrincipalVariationsForBorrowerCycle.md) |  |  [optional]
**interestRateVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional]
**numberOfRepaymentVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional]
**accountingRule** | [**GetLoanProductsAccountingRule**](GetLoanProductsAccountingRule.md) |  |  [optional]
**accountingMappings** | [**GetLoanAccountingMappings**](GetLoanAccountingMappings.md) |  |  [optional]
**paymentChannelToFundSourceMappings** | [**List&lt;GetLoanPaymentChannelToFundSourceMappings&gt;**](GetLoanPaymentChannelToFundSourceMappings.md) |  |  [optional]
**feeToIncomeAccountMappings** | [**List&lt;GetLoanFeeToIncomeAccountMappings&gt;**](GetLoanFeeToIncomeAccountMappings.md) |  |  [optional]
**multiDisburseLoan** | **Boolean** |  |  [optional]
**maxTrancheCount** | **Integer** |  |  [optional]
**outstandingLoanBalance** | **Float** |  |  [optional]
**overdueDaysForNPA** | **Integer** |  |  [optional]
**principalThresholdForLastInstalment** | **Integer** |  |  [optional]



