
# LoanProductInterestRecalculationDetails

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **arrearsBasedOnOriginalSchedule** | **kotlin.Boolean** |  |  [optional] |
| **compoundingFrequencyNthDay** | **kotlin.Int** |  |  [optional] |
| **compoundingFrequencyOnDay** | **kotlin.Int** |  |  [optional] |
| **compoundingFrequencyType** | [**inline**](#CompoundingFrequencyType) |  |  [optional] |
| **compoundingFrequencyWeekday** | **kotlin.Int** |  |  [optional] |
| **compoundingInterval** | **kotlin.Int** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **interestRecalculationCompoundingMethod** | **kotlin.Int** |  |  [optional] |
| **isCompoundingToBePostedAsTransaction** | **kotlin.Boolean** |  |  [optional] |
| **new** | **kotlin.Boolean** |  |  [optional] |
| **rescheduleStrategyMethod** | **kotlin.Int** |  |  [optional] |
| **restFrequencyNthDay** | **kotlin.Int** |  |  [optional] |
| **restFrequencyOnDay** | **kotlin.Int** |  |  [optional] |
| **restFrequencyType** | [**inline**](#RestFrequencyType) |  |  [optional] |
| **restFrequencyWeekday** | **kotlin.Int** |  |  [optional] |
| **restInterval** | **kotlin.Int** |  |  [optional] |


<a id="CompoundingFrequencyType"></a>
## Enum: compoundingFrequencyType
| Name | Value |
| ---- | ----- |
| compoundingFrequencyType | INVALID, SAME_AS_REPAYMENT_PERIOD, DAILY, WEEKLY, MONTHLY |


<a id="RestFrequencyType"></a>
## Enum: restFrequencyType
| Name | Value |
| ---- | ----- |
| restFrequencyType | INVALID, SAME_AS_REPAYMENT_PERIOD, DAILY, WEEKLY, MONTHLY |



