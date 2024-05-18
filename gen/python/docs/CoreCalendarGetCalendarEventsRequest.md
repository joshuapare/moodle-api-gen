# CoreCalendarGetCalendarEventsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**CoreCalendarGetCalendarEventsRequestEvents**](CoreCalendarGetCalendarEventsRequestEvents.md) |  | [optional] 
**options** | [**CoreCalendarGetCalendarEventsRequestOptions**](CoreCalendarGetCalendarEventsRequestOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_events_request import CoreCalendarGetCalendarEventsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEventsRequest from a JSON string
core_calendar_get_calendar_events_request_instance = CoreCalendarGetCalendarEventsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEventsRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_events_request_dict = core_calendar_get_calendar_events_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEventsRequest from a dict
core_calendar_get_calendar_events_request_from_dict = CoreCalendarGetCalendarEventsRequest.from_dict(core_calendar_get_calendar_events_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


