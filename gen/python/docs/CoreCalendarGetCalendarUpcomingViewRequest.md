# CoreCalendarGetCalendarUpcomingViewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Category being viewed | [optional] 
**courseid** | **int** | Course being viewed | [optional] [default to 1]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_upcoming_view_request import CoreCalendarGetCalendarUpcomingViewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarUpcomingViewRequest from a JSON string
core_calendar_get_calendar_upcoming_view_request_instance = CoreCalendarGetCalendarUpcomingViewRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarUpcomingViewRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_upcoming_view_request_dict = core_calendar_get_calendar_upcoming_view_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarUpcomingViewRequest from a dict
core_calendar_get_calendar_upcoming_view_request_from_dict = CoreCalendarGetCalendarUpcomingViewRequest.from_dict(core_calendar_get_calendar_upcoming_view_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

