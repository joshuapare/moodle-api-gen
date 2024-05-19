# CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendareventtypes** | **List[object]** |  | [optional] 
**daytitle** | **str** | daytitle | [optional] [default to 'null']
**events** | [**List[CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner]**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md) |  | [optional] 
**hasevents** | **bool** | hasevents | [optional] [default to False]
**haslastdayofevent** | **bool** | haslastdayofevent | [optional] [default to False]
**hours** | **int** | hours | [optional] 
**istoday** | **bool** | istoday | [optional] [default to False]
**isweekend** | **bool** | isweekend | [optional] [default to False]
**mday** | **int** | mday | [optional] 
**minutes** | **int** | minutes | [optional] 
**neweventtimestamp** | **int** | neweventtimestamp | [optional] 
**nextperiod** | **int** | nextperiod | [optional] [default to null]
**popovertitle** | **str** | popovertitle | [optional] [default to '']
**previousperiod** | **int** | previousperiod | [optional] [default to null]
**seconds** | **int** | seconds | [optional] 
**timestamp** | **int** | timestamp | [optional] 
**viewdaylink** | **str** | viewdaylink | [optional] [default to 'null']
**viewdaylinktitle** | **str** | viewdaylinktitle | [optional] [default to 'null']
**wday** | **int** | wday | [optional] 
**yday** | **int** | yday | [optional] 
**year** | **int** | year | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner import CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner from a JSON string
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_instance = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.to_json())

# convert the object into a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_dict = core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_instance.to_dict()
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner from a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_from_dict = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.from_dict(core_calendar_get_calendar_monthly_view200_response_weeks_inner_days_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


