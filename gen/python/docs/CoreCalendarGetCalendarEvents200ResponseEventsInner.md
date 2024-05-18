# CoreCalendarGetCalendarEvents200ResponseEventsInner

event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Category id (only for category events). | [optional] [default to null]
**courseid** | **int** | course id | [optional] 
**description** | **str** | Description | [optional] 
**eventtype** | **str** | Event type | [optional] 
**format** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**groupid** | **int** | group id | [optional] 
**id** | **int** | event id | [optional] 
**instance** | **int** | instance id | [optional] 
**modulename** | **str** | module name | [optional] 
**name** | **str** | event name | [optional] 
**repeatid** | **int** | repeat id | [optional] 
**sequence** | **int** | sequence | [optional] 
**subscriptionid** | **int** | Subscription id | [optional] 
**timeduration** | **int** | time duration | [optional] 
**timemodified** | **int** | time modified | [optional] 
**timestart** | **int** | timestart | [optional] 
**userid** | **int** | user id | [optional] 
**uuid** | **str** | unique id of ical events | [optional] [default to 'null']
**visible** | **int** | visible | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_events200_response_events_inner import CoreCalendarGetCalendarEvents200ResponseEventsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEvents200ResponseEventsInner from a JSON string
core_calendar_get_calendar_events200_response_events_inner_instance = CoreCalendarGetCalendarEvents200ResponseEventsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEvents200ResponseEventsInner.to_json())

# convert the object into a dict
core_calendar_get_calendar_events200_response_events_inner_dict = core_calendar_get_calendar_events200_response_events_inner_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEvents200ResponseEventsInner from a dict
core_calendar_get_calendar_events200_response_events_inner_from_dict = CoreCalendarGetCalendarEvents200ResponseEventsInner.from_dict(core_calendar_get_calendar_events200_response_events_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


