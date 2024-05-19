# CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | [**List[CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner]**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.md) |  | [optional] 
**postpadding** | **List[object]** |  | [optional] 
**prepadding** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_monthly_view200_response_weeks_inner import CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner from a JSON string
core_calendar_get_calendar_monthly_view200_response_weeks_inner_instance = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.to_json())

# convert the object into a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_dict = core_calendar_get_calendar_monthly_view200_response_weeks_inner_instance.to_dict()
# create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner from a dict
core_calendar_get_calendar_monthly_view200_response_weeks_inner_from_dict = CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.from_dict(core_calendar_get_calendar_monthly_view200_response_weeks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


