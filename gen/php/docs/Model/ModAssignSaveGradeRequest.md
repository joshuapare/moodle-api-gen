# # ModAssignSaveGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | **bool** | Allow another attempt if the attempt reopen method is manual | [default to null]
**advancedgradingdata** | [**\OpenAPI\Client\Model\ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional]
**applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | [default to null]
**assignmentid** | **int** | The assignment id to operate on |
**attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [default to null]
**grade** | **float** | The new grade for this user. Ignored if advanced grading used | [default to null]
**plugindata** | [**\OpenAPI\Client\Model\ModAssignSaveGradeRequestPlugindata**](ModAssignSaveGradeRequestPlugindata.md) |  | [optional]
**userid** | **int** | The student id to operate on | [default to null]
**workflowstate** | **string** | The next marking workflow state | [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
