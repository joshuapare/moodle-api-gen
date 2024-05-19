

# ModAssignSaveGradeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addattempt** | **Boolean** | Allow another attempt if the attempt reopen method is manual |  |
|**advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  |  [optional] |
|**applytoall** | **Boolean** | If true, this grade will be applied to all members of the group (for group assignments). |  |
|**assignmentid** | **Integer** | The assignment id to operate on |  |
|**attemptnumber** | **Integer** | The attempt number (-1 means latest attempt) |  |
|**grade** | **BigDecimal** | The new grade for this user. Ignored if advanced grading used |  |
|**plugindata** | [**ModAssignSaveGradeRequestPlugindata**](ModAssignSaveGradeRequestPlugindata.md) |  |  [optional] |
|**userid** | **Integer** | The student id to operate on |  |
|**workflowstate** | **String** | The next marking workflow state |  |



