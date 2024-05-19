# CoreCalendarUpdateEventStartDayRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daytimestamp** | **int** | Timestamp for the new start day | [default to null]
**eventid** | **int** | Id of event to be updated | [default to null]

## Example

```python
from openapi_client.models.core_calendar_update_event_start_day_request import CoreCalendarUpdateEventStartDayRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarUpdateEventStartDayRequest from a JSON string
core_calendar_update_event_start_day_request_instance = CoreCalendarUpdateEventStartDayRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarUpdateEventStartDayRequest.to_json())

# convert the object into a dict
core_calendar_update_event_start_day_request_dict = core_calendar_update_event_start_day_request_instance.to_dict()
# create an instance of CoreCalendarUpdateEventStartDayRequest from a dict
core_calendar_update_event_start_day_request_from_dict = CoreCalendarUpdateEventStartDayRequest.from_dict(core_calendar_update_event_start_day_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


