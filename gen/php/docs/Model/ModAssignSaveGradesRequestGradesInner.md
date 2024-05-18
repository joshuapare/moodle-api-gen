# # ModAssignSaveGradesRequestGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | **bool** | Allow another attempt if manual attempt reopen method | [optional] [default to null]
**advancedgradingdata** | [**\OpenAPI\Client\Model\ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional]
**attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [optional]
**grade** | **float** | The new grade for this user. Ignored if advanced grading used | [optional]
**plugindata** | [**\OpenAPI\Client\Model\ModAssignSaveGradesRequestGradesInnerPlugindata**](ModAssignSaveGradesRequestGradesInnerPlugindata.md) |  | [optional]
**userid** | **int** | The student id to operate on | [optional]
**workflowstate** | **string** | The next marking workflow state | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
