# Org.OpenAPITools.Model.CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner
Activity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int** | course module ID | [optional] [default to null]
**Details** | [**List&lt;CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner&gt;**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md) |  | [optional] 
**Hascompletion** | **bool** | Whether this activity module has completion enabled | [optional] [default to null]
**Instance** | **int** | instance ID | [optional] [default to null]
**Isautomatic** | **bool** | Whether this activity module instance tracks completion automatically. | [optional] [default to null]
**Istrackeduser** | **bool** | Whether completion is being tracked for this user. | [optional] [default to null]
**Modname** | **string** | activity module name | [optional] [default to "null"]
**Overrideby** | **int** | The user id who has overriden the status, or null | [optional] [default to null]
**State** | **int** | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail | [optional] [default to null]
**Timecompleted** | **int** | timestamp for completed activity | [optional] [default to null]
**Tracking** | **int** | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic | [optional] [default to null]
**Uservisible** | **bool** | Whether this activity is visible to the user. | [optional] [default to null]
**Valueused** | **bool** | Whether the completion status affects the availability of another activity. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

