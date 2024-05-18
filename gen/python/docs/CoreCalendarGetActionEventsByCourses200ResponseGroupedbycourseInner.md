# CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | courseid | [optional] [default to null]
**events** | [**List[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner]**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner.md) |  | [optional] 
**firstid** | **int** | firstid | [optional] 
**lastid** | **int** | lastid | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner import CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner from a JSON string
core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_instance = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_dict = core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner from a dict
core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_from_dict = CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner.from_dict(core_calendar_get_action_events_by_courses200_response_groupedbycourse_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


