# CoreCalendarCreateCalendarEventsRequestEventsInner

event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [optional] [default to 0]
**description** | **str** | Description | [optional] [default to 'null']
**eventtype** | **str** | Event type | [optional] [default to 'user']
**format** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**groupid** | **int** | group id | [optional] [default to 0]
**name** | **str** | event name | [optional] [default to '']
**repeats** | **int** | number of repeats | [optional] [default to 0]
**sequence** | **int** | sequence | [optional] [default to 1]
**timeduration** | **int** | time duration | [optional] [default to 0]
**timestart** | **int** | timestart | [optional] [default to 1716010508]
**visible** | **int** | visible | [optional] [default to 1]

## Example

```python
from openapi_client.models.core_calendar_create_calendar_events_request_events_inner import CoreCalendarCreateCalendarEventsRequestEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarCreateCalendarEventsRequestEventsInner from a JSON string
core_calendar_create_calendar_events_request_events_inner_instance = CoreCalendarCreateCalendarEventsRequestEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarCreateCalendarEventsRequestEventsInner.to_json())

# convert the object into a dict
core_calendar_create_calendar_events_request_events_inner_dict = core_calendar_create_calendar_events_request_events_inner_instance.to_dict()
# create an instance of CoreCalendarCreateCalendarEventsRequestEventsInner from a dict
core_calendar_create_calendar_events_request_events_inner_from_dict = CoreCalendarCreateCalendarEventsRequestEventsInner.from_dict(core_calendar_create_calendar_events_request_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


