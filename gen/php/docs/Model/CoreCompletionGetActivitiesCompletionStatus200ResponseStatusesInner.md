# # CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | course module ID | [optional] [default to null]
**details** | [**\OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner[]**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md) |  | [optional]
**hascompletion** | **bool** | Whether this activity module has completion enabled | [optional] [default to null]
**instance** | **int** | instance ID | [optional] [default to null]
**isautomatic** | **bool** | Whether this activity module instance tracks completion automatically. | [optional] [default to null]
**istrackeduser** | **bool** | Whether completion is being tracked for this user. | [optional] [default to null]
**modname** | **string** | activity module name | [optional] [default to 'null']
**overrideby** | **int** | The user id who has overriden the status, or null | [optional] [default to null]
**state** | **int** | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail | [optional] [default to null]
**timecompleted** | **int** | timestamp for completed activity | [optional] [default to null]
**tracking** | **int** | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic | [optional] [default to null]
**uservisible** | **bool** | Whether this activity is visible to the user. | [optional] [default to null]
**valueused** | **bool** | Whether the completion status affects the availability of another activity. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
