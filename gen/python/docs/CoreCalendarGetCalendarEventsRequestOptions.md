# CoreCalendarGetCalendarEventsRequestOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignorehidden** | **bool** | Ignore hidden events or not | [optional] [default to True]
**siteevents** | **bool** | Set to true to return site events | [optional] [default to True]
**timeend** | **int** | Time to which the events should be returned. We treat 0 and null as no end | [optional] [default to 0]
**timestart** | **int** | Time from which events should be returned | [optional] [default to 0]
**userevents** | **bool** | Set to true to return current user&#39;s user events | [optional] [default to True]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_events_request_options import CoreCalendarGetCalendarEventsRequestOptions

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEventsRequestOptions from a JSON string
core_calendar_get_calendar_events_request_options_instance = CoreCalendarGetCalendarEventsRequestOptions.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEventsRequestOptions.to_json())

# convert the object into a dict
core_calendar_get_calendar_events_request_options_dict = core_calendar_get_calendar_events_request_options_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEventsRequestOptions from a dict
core_calendar_get_calendar_events_request_options_from_dict = CoreCalendarGetCalendarEventsRequestOptions.from_dict(core_calendar_get_calendar_events_request_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


