

# ModAssignSaveGradesRequestGradesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addattempt** | **Boolean** | Allow another attempt if manual attempt reopen method |  [optional] |
|**advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  |  [optional] |
|**attemptnumber** | **Integer** | The attempt number (-1 means latest attempt) |  [optional] |
|**grade** | **BigDecimal** | The new grade for this user. Ignored if advanced grading used |  [optional] |
|**plugindata** | [**ModAssignSaveGradesRequestGradesInnerPlugindata**](ModAssignSaveGradesRequestGradesInnerPlugindata.md) |  |  [optional] |
|**userid** | **Integer** | The student id to operate on |  [optional] |
|**workflowstate** | **String** | The next marking workflow state |  [optional] |



