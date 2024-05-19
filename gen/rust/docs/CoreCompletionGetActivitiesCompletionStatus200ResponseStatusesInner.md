# CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | Option<**i32**> | course module ID | [optional][default to null]
**details** | Option<[**Vec<models::CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner>**](core_completion_get_activities_completion_status_200_response_statuses_inner_details_inner.md)> |  | [optional]
**hascompletion** | Option<**bool**> | Whether this activity module has completion enabled | [optional][default to null]
**instance** | Option<**i32**> | instance ID | [optional][default to null]
**isautomatic** | Option<**bool**> | Whether this activity module instance tracks completion automatically. | [optional][default to null]
**istrackeduser** | Option<**bool**> | Whether completion is being tracked for this user. | [optional][default to null]
**modname** | Option<**String**> | activity module name | [optional][default to null]
**overrideby** | Option<**i32**> | The user id who has overriden the status, or null | [optional][default to null]
**state** | Option<**i32**> | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail | [optional][default to null]
**timecompleted** | Option<**i32**> | timestamp for completed activity | [optional][default to null]
**tracking** | Option<**i32**> | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic | [optional][default to null]
**uservisible** | Option<**bool**> | Whether this activity is visible to the user. | [optional][default to null]
**valueused** | Option<**bool**> | Whether the completion status affects the availability of another activity. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


