# ModAssignSaveGradesRequestGradesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addattempt** | Option<**bool**> | Allow another attempt if manual attempt reopen method | [optional][default to null]
**advancedgradingdata** | Option<[**models::ModAssignSaveGradeRequestAdvancedgradingdata**](mod_assign_save_grade_request_advancedgradingdata.md)> |  | [optional]
**attemptnumber** | Option<**i32**> | The attempt number (-1 means latest attempt) | [optional]
**grade** | Option<**f64**> | The new grade for this user. Ignored if advanced grading used | [optional]
**plugindata** | Option<[**models::ModAssignSaveGradesRequestGradesInnerPlugindata**](mod_assign_save_grades_request_grades_inner_plugindata.md)> |  | [optional]
**userid** | Option<**i32**> | The student id to operate on | [optional]
**workflowstate** | Option<**String**> | The next marking workflow state | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


