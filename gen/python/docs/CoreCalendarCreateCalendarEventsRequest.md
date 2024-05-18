# CoreCalendarCreateCalendarEventsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarCreateCalendarEventsRequestEventsInner]**](CoreCalendarCreateCalendarEventsRequestEventsInner.md) |  | 

## Example

```python
from openapi_client.models.core_calendar_create_calendar_events_request import CoreCalendarCreateCalendarEventsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarCreateCalendarEventsRequest from a JSON string
core_calendar_create_calendar_events_request_instance = CoreCalendarCreateCalendarEventsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarCreateCalendarEventsRequest.to_json())

# convert the object into a dict
core_calendar_create_calendar_events_request_dict = core_calendar_create_calendar_events_request_instance.to_dict()
# create an instance of CoreCalendarCreateCalendarEventsRequest from a dict
core_calendar_create_calendar_events_request_from_dict = CoreCalendarCreateCalendarEventsRequest.from_dict(core_calendar_create_calendar_events_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


