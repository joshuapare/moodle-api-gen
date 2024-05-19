# CoreCalendarGetActionEventsByCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aftereventid** | **int** | The last seen event id | [optional] [default to 0]
**courseid** | **int** | Course id | 
**limitnum** | **int** | Limit number | [optional] [default to 20]
**searchvalue** | **str** | The value a user wishes to search against | [optional] [default to 'null']
**timesortfrom** | **int** | Time sort from | [optional] [default to null]
**timesortto** | **int** | Time sort to | [optional] [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_course_request import CoreCalendarGetActionEventsByCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourseRequest from a JSON string
core_calendar_get_action_events_by_course_request_instance = CoreCalendarGetActionEventsByCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourseRequest.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_course_request_dict = core_calendar_get_action_events_by_course_request_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourseRequest from a dict
core_calendar_get_action_events_by_course_request_from_dict = CoreCalendarGetActionEventsByCourseRequest.from_dict(core_calendar_get_action_events_by_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


