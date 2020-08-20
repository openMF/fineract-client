
# GetLoanProductsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**shortName** | **String** |  |  [optional]
**includeInBorrowerCycle** | **Boolean** |  |  [optional]
**useBorrowerCycle** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**status** | **String** |  |  [optional]
**currency** | [**GetLoanProductsCurrency**](GetLoanProductsCurrency.md) |  |  [optional]
**principal** | **Float** |  |  [optional]
**minPrincipal** | **Float** |  |  [optional]
**maxPrincipal** | **Float** |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**minNumberOfRepayments** | **Integer** |  |  [optional]
**maxNumberOfRepayments** | **Integer** |  |  [optional]
**repaymentEvery** | **Integer** |  |  [optional]
**repaymentFrequencyType** | [**GetLoanProductsRepaymentFrequencyType**](GetLoanProductsRepaymentFrequencyType.md) |  |  [optional]
**interestRatePerPeriod** | **Float** |  |  [optional]
**interestRateFrequencyType** | [**GetLoanProductsInterestRateFrequencyType**](GetLoanProductsInterestRateFrequencyType.md) |  |  [optional]
**annualInterestRate** | **Float** |  |  [optional]
**amortizationType** | [**GetLoanProductsAmortizationType**](GetLoanProductsAmortizationType.md) |  |  [optional]
**interestType** | [**GetLoanProductsInterestType**](GetLoanProductsInterestType.md) |  |  [optional]
**interestCalculationPeriodType** | [**GetLoansProductsInterestCalculationPeriodType**](GetLoansProductsInterestCalculationPeriodType.md) |  |  [optional]
**transactionProcessingStrategyId** | **Integer** |  |  [optional]
**transactionProcessingStrategyName** | **String** |  |  [optional]
**principalVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional]
**interestRateVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional]
**numberOfRepaymentVariationsForBorrowerCycle** | **List&lt;Integer&gt;** |  |  [optional]
**daysInMonthType** | [**GetLoansProductsDaysInMonthType**](GetLoansProductsDaysInMonthType.md) |  |  [optional]
**daysInYearType** | [**GetLoansProductsDaysInYearType**](GetLoansProductsDaysInYearType.md) |  |  [optional]
**isInterestRecalculationEnabled** | **Boolean** |  |  [optional]
**interestRecalculationData** | [**GetLoanProductsInterestRecalculationData**](GetLoanProductsInterestRecalculationData.md) |  |  [optional]
**accountingRule** | [**GetLoanProductsAccountingRule**](GetLoanProductsAccountingRule.md) |  |  [optional]
**principalThresholdForLastInstalment** | **Integer** |  |  [optional]



