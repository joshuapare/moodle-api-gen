# CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

Activity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | course module ID | [optional] [default to null]
**details** | [**List[CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner]**](CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md) |  | [optional] 
**hascompletion** | **bool** | Whether this activity module has completion enabled | [optional] [default to False]
**instance** | **int** | instance ID | [optional] [default to null]
**isautomatic** | **bool** | Whether this activity module instance tracks completion automatically. | [optional] [default to False]
**istrackeduser** | **bool** | Whether completion is being tracked for this user. | [optional] [default to False]
**modname** | **str** | activity module name | [optional] [default to 'null']
**overrideby** | **int** | The user id who has overriden the status, or null | [optional] [default to null]
**state** | **int** | Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail | [optional] [default to null]
**timecompleted** | **int** | timestamp for completed activity | [optional] [default to null]
**tracking** | **int** | type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic | [optional] [default to null]
**uservisible** | **bool** | Whether this activity is visible to the user. | [optional] [default to False]
**valueused** | **bool** | Whether the completion status affects the availability of another activity. | [optional] [default to False]

## Example

```python
from openapi_client.models.core_completion_get_activities_completion_status200_response_statuses_inner import CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner from a JSON string
core_completion_get_activities_completion_status200_response_statuses_inner_instance = CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.to_json())

# convert the object into a dict
core_completion_get_activities_completion_status200_response_statuses_inner_dict = core_completion_get_activities_completion_status200_response_statuses_inner_instance.to_dict()
# create an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner from a dict
core_completion_get_activities_completion_status200_response_statuses_inner_from_dict = CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.from_dict(core_completion_get_activities_completion_status200_response_statuses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


