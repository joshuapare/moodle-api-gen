# CoreCalendarDeleteCalendarEventsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarDeleteCalendarEventsRequestEventsInner]**](CoreCalendarDeleteCalendarEventsRequestEventsInner.md) |  | 

## Example

```python
from openapi_client.models.core_calendar_delete_calendar_events_request import CoreCalendarDeleteCalendarEventsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarDeleteCalendarEventsRequest from a JSON string
core_calendar_delete_calendar_events_request_instance = CoreCalendarDeleteCalendarEventsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarDeleteCalendarEventsRequest.to_json())

# convert the object into a dict
core_calendar_delete_calendar_events_request_dict = core_calendar_delete_calendar_events_request_instance.to_dict()
# create an instance of CoreCalendarDeleteCalendarEventsRequest from a dict
core_calendar_delete_calendar_events_request_from_dict = CoreCalendarDeleteCalendarEventsRequest.from_dict(core_calendar_delete_calendar_events_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


