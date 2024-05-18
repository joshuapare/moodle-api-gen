# CoreCalendarGetActionEventsByCourse200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarGetActionEventsByCourse200ResponseEventsInner]**](CoreCalendarGetActionEventsByCourse200ResponseEventsInner.md) |  | 
**firstid** | **int** | firstid | [default to null]
**lastid** | **int** | lastid | [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_course200_response import CoreCalendarGetActionEventsByCourse200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByCourse200Response from a JSON string
core_calendar_get_action_events_by_course200_response_instance = CoreCalendarGetActionEventsByCourse200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByCourse200Response.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_course200_response_dict = core_calendar_get_action_events_by_course200_response_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByCourse200Response from a dict
core_calendar_get_action_events_by_course200_response_from_dict = CoreCalendarGetActionEventsByCourse200Response.from_dict(core_calendar_get_action_events_by_course200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


