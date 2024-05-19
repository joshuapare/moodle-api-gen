# CoreCalendarGetCalendarEventByIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventid** | **int** | The event id to be retrieved | [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_event_by_id_request import CoreCalendarGetCalendarEventByIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEventByIdRequest from a JSON string
core_calendar_get_calendar_event_by_id_request_instance = CoreCalendarGetCalendarEventByIdRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEventByIdRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_event_by_id_request_dict = core_calendar_get_calendar_event_by_id_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEventByIdRequest from a dict
core_calendar_get_calendar_event_by_id_request_from_dict = CoreCalendarGetCalendarEventByIdRequest.from_dict(core_calendar_get_calendar_event_by_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


