# ModAssignSaveGradeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | **bool** | Allow another attempt if the attempt reopen method is manual | [default to null]
**advancedgradingdata** | Option<[**models::ModAssignSaveGradeRequestAdvancedgradingdata**](mod_assign_save_grade_request_advancedgradingdata.md)> |  | [optional]
**applytoall** | **bool** | If true, this grade will be applied to all members of the group (for group assignments). | [default to null]
**assignmentid** | **i32** | The assignment id to operate on | 
**attemptnumber** | **i32** | The attempt number (-1 means latest attempt) | [default to null]
**grade** | **f64** | The new grade for this user. Ignored if advanced grading used | [default to null]
**plugindata** | Option<[**models::ModAssignSaveGradeRequestPlugindata**](mod_assign_save_grade_request_plugindata.md)> |  | [optional]
**userid** | **i32** | The student id to operate on | [default to null]
**workflowstate** | **String** | The next marking workflow state | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


