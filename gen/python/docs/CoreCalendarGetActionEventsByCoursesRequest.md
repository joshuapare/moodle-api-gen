# CoreCalendarGetActionEventsByCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseids** | **List[object]** |  | 
**limitnum** | **int** | Limit number | [optional] [default to 10]
**searchvalue** | **str** | The value a user wishes to search against | [optional] 
**timesortfrom** | **int** | Time sort from | [optional] 
**timesortto** | **int** | Time sort to | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_courses_request import CoreCalendarGetActionEventsByCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCoursesRequest from a JSON string
core_calendar_get_action_events_by_courses_request_instance = CoreCalendarGetActionEventsByCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCoursesRequest.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_courses_request_dict = core_calendar_get_action_events_by_courses_request_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCoursesRequest from a dict
core_calendar_get_action_events_by_courses_request_from_dict = CoreCalendarGetActionEventsByCoursesRequest.from_dict(core_calendar_get_action_events_by_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


