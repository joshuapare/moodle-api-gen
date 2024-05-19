# ModAssignGetSubmissionStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignid** | **i32** | assignment instance id | [default to null]
**groupid** | Option<**i32**> | filter by users in group (used for generating the grading summary).                     0 for all groups information, any other empty value will calculate currrent group. | [optional][default to 0]
**userid** | Option<**i32**> | user id (empty for current user) | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


