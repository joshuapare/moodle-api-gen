# CoreCalendarGetActionEventsByTimesortRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aftereventid** | **int** | The last seen event id | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 20]
**limittononsuspendedevents** | **bool** | Limit the events to courses the user is not suspended in | [optional] [default to False]
**searchvalue** | **str** | The value a user wishes to search against | [optional] 
**timesortfrom** | **int** | Time sort from | [optional] [default to 0]
**timesortto** | **int** | Time sort to | [optional] 
**userid** | **int** | The user id | [optional] [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_action_events_by_timesort_request import CoreCalendarGetActionEventsByTimesortRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetActionEventsByTimesortRequest from a JSON string
core_calendar_get_action_events_by_timesort_request_instance = CoreCalendarGetActionEventsByTimesortRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetActionEventsByTimesortRequest.to_json())

# convert the object into a dict
core_calendar_get_action_events_by_timesort_request_dict = core_calendar_get_action_events_by_timesort_request_instance.to_dict()
# create an instance of CoreCalendarGetActionEventsByTimesortRequest from a dict
core_calendar_get_action_events_by_timesort_request_from_dict = CoreCalendarGetActionEventsByTimesortRequest.from_dict(core_calendar_get_action_events_by_timesort_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


