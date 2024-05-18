# ModAssignGetAssignmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**courseids** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**includenotenrolledcourses** | Option<**bool**> | whether to return courses that the user can see                                                                     even if is not enroled in. This requires the parameter courseids                                                                     to not be empty. | [optional][default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


