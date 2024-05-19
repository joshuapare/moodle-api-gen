# CoreCalendarGetCalendarUpcomingView200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | categoryid | [optional] [default to 0]
**courseid** | **int** | courseid | 
**var_date** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**defaulteventcontext** | **int** | defaulteventcontext | [default to 0]
**events** | [**List[CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner]**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md) |  | 
**filter_selector** | **str** | filter_selector | 
**isloggedin** | **bool** | isloggedin | [default to False]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_upcoming_view200_response import CoreCalendarGetCalendarUpcomingView200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarUpcomingView200Response from a JSON string
core_calendar_get_calendar_upcoming_view200_response_instance = CoreCalendarGetCalendarUpcomingView200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarUpcomingView200Response.to_json())

# convert the object into a dict
core_calendar_get_calendar_upcoming_view200_response_dict = core_calendar_get_calendar_upcoming_view200_response_instance.to_dict()
# create an instance of CoreCalendarGetCalendarUpcomingView200Response from a dict
core_calendar_get_calendar_upcoming_view200_response_from_dict = CoreCalendarGetCalendarUpcomingView200Response.from_dict(core_calendar_get_calendar_upcoming_view200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


