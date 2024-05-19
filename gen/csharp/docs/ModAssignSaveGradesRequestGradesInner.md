# Org.OpenAPITools.Model.ModAssignSaveGradesRequestGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addattempt** | **bool** | Allow another attempt if manual attempt reopen method | [optional] [default to null]
**Advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**Attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [optional] 
**Grade** | **decimal** | The new grade for this user. Ignored if advanced grading used | [optional] 
**Plugindata** | [**ModAssignSaveGradesRequestGradesInnerPlugindata**](ModAssignSaveGradesRequestGradesInnerPlugindata.md) |  | [optional] 
**Userid** | **int** | The student id to operate on | [optional] 
**Workflowstate** | **string** | The next marking workflow state | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

