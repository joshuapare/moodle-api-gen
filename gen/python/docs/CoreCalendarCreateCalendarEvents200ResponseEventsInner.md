# CoreCalendarCreateCalendarEvents200ResponseEventsInner

event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [optional] 
**description** | **str** | Description | [optional] 
**eventtype** | **str** | Event type | [optional] [default to 'null']
**format** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**groupid** | **int** | group id | [optional] [default to null]
**id** | **int** | event id | [optional] [default to null]
**instance** | **int** | instance id | [optional] [default to null]
**modulename** | **str** | module name | [optional] [default to 'null']
**name** | **str** | event name | [optional] [default to 'null']
**repeatid** | **int** | repeat id | [optional] [default to null]
**sequence** | **int** | sequence | [optional] [default to null]
**subscriptionid** | **int** | Subscription id | [optional] [default to null]
**timeduration** | **int** | time duration | [optional] [default to null]
**timemodified** | **int** | time modified | [optional] [default to null]
**timestart** | **int** | timestart | [optional] [default to null]
**userid** | **int** | user id | [optional] [default to null]
**uuid** | **str** | unique id of ical events | [optional] [default to '']
**visible** | **int** | visible | [optional] [default to null]

## Example

```python
from openapi_client.models.core_calendar_create_calendar_events200_response_events_inner import CoreCalendarCreateCalendarEvents200ResponseEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarCreateCalendarEvents200ResponseEventsInner from a JSON string
core_calendar_create_calendar_events200_response_events_inner_instance = CoreCalendarCreateCalendarEvents200ResponseEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarCreateCalendarEvents200ResponseEventsInner.to_json())

# convert the object into a dict
core_calendar_create_calendar_events200_response_events_inner_dict = core_calendar_create_calendar_events200_response_events_inner_instance.to_dict()
# create an instance of CoreCalendarCreateCalendarEvents200ResponseEventsInner from a dict
core_calendar_create_calendar_events200_response_events_inner_from_dict = CoreCalendarCreateCalendarEvents200ResponseEventsInner.from_dict(core_calendar_create_calendar_events200_response_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


