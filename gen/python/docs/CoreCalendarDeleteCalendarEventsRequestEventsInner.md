# CoreCalendarDeleteCalendarEventsRequestEventsInner

List of events to delete

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventid** | **int** | Event ID | [optional] [default to ]
**repeat** | **bool** | Delete comeplete series if repeated event | [optional] [default to False]

## Example

```python
from openapi_client.models.core_calendar_delete_calendar_events_request_events_inner import CoreCalendarDeleteCalendarEventsRequestEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarDeleteCalendarEventsRequestEventsInner from a JSON string
core_calendar_delete_calendar_events_request_events_inner_instance = CoreCalendarDeleteCalendarEventsRequestEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarDeleteCalendarEventsRequestEventsInner.to_json())

# convert the object into a dict
core_calendar_delete_calendar_events_request_events_inner_dict = core_calendar_delete_calendar_events_request_events_inner_instance.to_dict()
# create an instance of CoreCalendarDeleteCalendarEventsRequestEventsInner from a dict
core_calendar_delete_calendar_events_request_events_inner_from_dict = CoreCalendarDeleteCalendarEventsRequestEventsInner.from_dict(core_calendar_delete_calendar_events_request_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


