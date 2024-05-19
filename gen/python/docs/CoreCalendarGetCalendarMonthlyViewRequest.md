# CoreCalendarGetCalendarMonthlyViewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Category being viewed | [optional] 
**courseid** | **int** | Course being viewed | [optional] [default to 1]
**day** | **int** | Day to be viewed | [optional] [default to 1]
**includenavigation** | **bool** | Whether to show course navigation | [optional] [default to True]
**mini** | **bool** | Whether to return the mini month view or not | [optional] [default to False]
**month** | **int** | Month to be viewed | 
**view** | **str** | The view mode of the calendar | [optional] [default to 'month']
**year** | **int** | Year to be viewed | 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_monthly_view_request import CoreCalendarGetCalendarMonthlyViewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarMonthlyViewRequest from a JSON string
core_calendar_get_calendar_monthly_view_request_instance = CoreCalendarGetCalendarMonthlyViewRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarMonthlyViewRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_monthly_view_request_dict = core_calendar_get_calendar_monthly_view_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarMonthlyViewRequest from a dict
core_calendar_get_calendar_monthly_view_request_from_dict = CoreCalendarGetCalendarMonthlyViewRequest.from_dict(core_calendar_get_calendar_monthly_view_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


