# CoreCalendarGetActionEventsByTimesort200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner]**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner.md) |  | 
**firstid** | **int** | firstid | 
**lastid** | **int** | lastid | 

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_timesort200_response import CoreCalendarGetActionEventsByTimesort200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByTimesort200Response from a JSON string
core_calendar_get_action_events_by_timesort200_response_instance = CoreCalendarGetActionEventsByTimesort200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByTimesort200Response.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_timesort200_response_dict = core_calendar_get_action_events_by_timesort200_response_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByTimesort200Response from a dict
core_calendar_get_action_events_by_timesort200_response_from_dict = CoreCalendarGetActionEventsByTimesort200Response.from_dict(core_calendar_get_action_events_by_timesort200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


