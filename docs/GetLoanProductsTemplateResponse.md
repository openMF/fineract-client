
# GetLoanProductsTemplateResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountingMappingOptions** | [**GetLoanProductsAccountingMappingOptions**](GetLoanProductsAccountingMappingOptions.md) |  |  [optional] |
| **accountingRule** | [**GetLoanProductsAccountingRule**](GetLoanProductsAccountingRule.md) |  |  [optional] |
| **accountingRuleOptions** | [**kotlin.collections.Set&lt;GetLoanProductsAccountingRule&gt;**](GetLoanProductsAccountingRule.md) |  |  [optional] |
| **advancedPaymentAllocationFutureInstallmentAllocationRules** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **advancedPaymentAllocationTransactionTypes** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **advancedPaymentAllocationTypes** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **amortizationType** | [**GetLoanProductsAmortizationType**](GetLoanProductsAmortizationType.md) |  |  [optional] |
| **amortizationTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsAmortizationType&gt;**](GetLoanProductsAmortizationType.md) |  |  [optional] |
| **chargeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsChargeOptions&gt;**](GetLoanProductsChargeOptions.md) |  |  [optional] |
| **currency** | [**GetLoanProductsTemplateCurrency**](GetLoanProductsTemplateCurrency.md) |  |  [optional] |
| **currencyOptions** | [**kotlin.collections.Set&lt;GetLoanProductsCurrencyOptions&gt;**](GetLoanProductsCurrencyOptions.md) |  |  [optional] |
| **daysInMonthType** | [**GetLoansProductsDaysInMonthTemplateType**](GetLoansProductsDaysInMonthTemplateType.md) |  |  [optional] |
| **daysInMonthTypeOptions** | [**kotlin.collections.Set&lt;GetLoansProductsDaysInMonthTemplateType&gt;**](GetLoansProductsDaysInMonthTemplateType.md) |  |  [optional] |
| **daysInYearType** | [**GetLoanProductsDaysInYearTemplateType**](GetLoanProductsDaysInYearTemplateType.md) |  |  [optional] |
| **daysInYearTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsInterestTemplateType&gt;**](GetLoanProductsInterestTemplateType.md) |  |  [optional] |
| **includeInBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **interestCalculationPeriodType** | [**GetLoansProductsInterestCalculationPeriodType**](GetLoansProductsInterestCalculationPeriodType.md) |  |  [optional] |
| **interestCalculationPeriodTypeOptions** | [**kotlin.collections.Set&lt;GetLoansProductsInterestCalculationPeriodType&gt;**](GetLoansProductsInterestCalculationPeriodType.md) |  |  [optional] |
| **interestRateFrequencyType** | [**GetLoanProductsInterestRateTemplateFrequencyType**](GetLoanProductsInterestRateTemplateFrequencyType.md) |  |  [optional] |
| **interestRateFrequencyTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsInterestRateTemplateFrequencyType&gt;**](GetLoanProductsInterestRateTemplateFrequencyType.md) |  |  [optional] |
| **interestRateVariationsForBorrowerCycle** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **interestRecalculationCompoundingTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsInterestRecalculationCompoundingType&gt;**](GetLoanProductsInterestRecalculationCompoundingType.md) |  |  [optional] |
| **interestRecalculationData** | [**GetLoanProductsInterestRecalculationTemplateData**](GetLoanProductsInterestRecalculationTemplateData.md) |  |  [optional] |
| **interestRecalculationFrequencyTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsInterestRecalculationCompoundingFrequencyType&gt;**](GetLoanProductsInterestRecalculationCompoundingFrequencyType.md) |  |  [optional] |
| **interestType** | [**GetLoanProductsInterestTemplateType**](GetLoanProductsInterestTemplateType.md) |  |  [optional] |
| **interestTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsInterestTemplateType&gt;**](GetLoanProductsInterestTemplateType.md) |  |  [optional] |
| **isInterestRecalculationEnabled** | **kotlin.Boolean** |  |  [optional] |
| **loanScheduleProcessingTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleTypeOptions** | [**kotlin.collections.List&lt;EnumOptionData&gt;**](EnumOptionData.md) |  |  [optional] |
| **numberOfRepaymentVariationsForBorrowerCycle** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **paymentTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsPaymentTypeOptions&gt;**](GetLoanProductsPaymentTypeOptions.md) |  |  [optional] |
| **preClosureInterestCalculationStrategyOptions** | [**kotlin.collections.Set&lt;GetLoanProductsPreClosureInterestCalculationStrategy&gt;**](GetLoanProductsPreClosureInterestCalculationStrategy.md) |  |  [optional] |
| **principalVariationsForBorrowerCycle** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **repaymentFrequencyType** | [**GetLoanProductsRepaymentTemplateFrequencyType**](GetLoanProductsRepaymentTemplateFrequencyType.md) |  |  [optional] |
| **repaymentFrequencyTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsRepaymentTemplateFrequencyType&gt;**](GetLoanProductsRepaymentTemplateFrequencyType.md) |  |  [optional] |
| **repaymentStartDateTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsRepaymentStartDateType&gt;**](GetLoanProductsRepaymentStartDateType.md) |  |  [optional] |
| **rescheduleStrategyTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsRescheduleStrategyType&gt;**](GetLoanProductsRescheduleStrategyType.md) |  |  [optional] |
| **transactionProcessingStrategyOptions** | [**kotlin.collections.Set&lt;GetLoanProductsTransactionProcessingStrategyOptions&gt;**](GetLoanProductsTransactionProcessingStrategyOptions.md) |  |  [optional] |
| **useBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **valueConditionTypeOptions** | [**kotlin.collections.Set&lt;GetLoanProductsValueConditionTypeOptions&gt;**](GetLoanProductsValueConditionTypeOptions.md) |  |  [optional] |



