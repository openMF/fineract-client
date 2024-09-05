
# PostColumnHeaderData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  |
| **type** | **kotlin.String** | Any of them: Boolean | Date | DateTime | Decimal | Dropdown | Number | String | Text |  |
| **code** | **kotlin.String** | Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned. |  [optional] |
| **indexed** | **kotlin.Boolean** | Defaults to false |  [optional] |
| **length** | **kotlin.Long** | Length of the text field. Mandatory if type String is used, otherwise an error is returned. |  [optional] |
| **mandatory** | **kotlin.Boolean** | Defaults to false |  [optional] |
| **unique** | **kotlin.Boolean** | Defaults to false |  [optional] |



