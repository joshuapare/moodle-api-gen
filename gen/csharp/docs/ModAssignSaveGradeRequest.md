# Org.OpenAPITools.Model.ModAssignSaveGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addattempt** | **bool** | Allow another attempt if the attempt reopen method is manual | [default to null]
**Advancedgradingdata** | [**ModAssignSaveGradeRequestAdvancedgradingdata**](ModAssignSaveGradeRequestAdvancedgradingdata.md) |  | [optional] 
**Applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | [default to null]
**Assignmentid** | **int** | The assignment id to operate on | 
**Attemptnumber** | **int** | The attempt number (-1 means latest attempt) | [default to null]
**Grade** | **decimal** | The new grade for this user. Ignored if advanced grading used | [default to nullM]
**Plugindata** | [**ModAssignSaveGradeRequestPlugindata**](ModAssignSaveGradeRequestPlugindata.md) |  | [optional] 
**Userid** | **int** | The student id to operate on | [default to null]
**Workflowstate** | **string** | The next marking workflow state | [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

