# CoreCalendarGetCalendarDayViewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Category being viewed | [optional] [default to null]
**courseid** | **int** | Course being viewed | [optional] [default to 1]
**day** | **int** | Day to be viewed | [default to null]
**month** | **int** | Month to be viewed | [default to null]
**year** | **int** | Year to be viewed | [default to null]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_day_view_request import CoreCalendarGetCalendarDayViewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarDayViewRequest from a JSON string
core_calendar_get_calendar_day_view_request_instance = CoreCalendarGetCalendarDayViewRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarDayViewRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_day_view_request_dict = core_calendar_get_calendar_day_view_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarDayViewRequest from a dict
core_calendar_get_calendar_day_view_request_from_dict = CoreCalendarGetCalendarDayViewRequest.from_dict(core_calendar_get_calendar_day_view_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


