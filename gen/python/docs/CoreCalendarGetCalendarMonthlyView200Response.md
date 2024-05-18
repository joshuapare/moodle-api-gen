# CoreCalendarGetCalendarMonthlyView200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarinstanceid** | **int** | calendarinstanceid | [default to 0]
**categoryid** | **int** | categoryid | [optional] [default to 0]
**courseid** | **int** | courseid | 
**var_date** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**daynames** | [**List[CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner]**](CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner.md) |  | 
**defaulteventcontext** | **int** | defaulteventcontext | [default to 0]
**filter_selector** | **str** | filter_selector | [optional] 
**includenavigation** | **bool** | includenavigation | [default to True]
**initialeventsloaded** | **bool** | initialeventsloaded | [default to True]
**larrow** | **str** | larrow | 
**nextperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**nextperiodlink** | **str** | nextperiodlink | 
**nextperiodname** | **str** | nextperiodname | 
**periodname** | **str** | periodname | 
**previousperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**previousperiodlink** | **str** | previousperiodlink | 
**previousperiodname** | **str** | previousperiodname | 
**rarrow** | **str** | rarrow | 
**showviewselector** | **bool** | showviewselector | [default to True]
**url** | **str** | url | 
**view** | **str** | view | [default to 'null']
**viewinginblock** | **bool** | viewinginblock | [default to False]
**viewingmonth** | **bool** | viewingmonth | [default to True]
**weeks** | [**List[CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner]**](CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.md) |  | 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_monthly_view200_response import CoreCalendarGetCalendarMonthlyView200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarMonthlyView200Response from a JSON string
core_calendar_get_calendar_monthly_view200_response_instance = CoreCalendarGetCalendarMonthlyView200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarMonthlyView200Response.to_json())

# convert the object into a dict
core_calendar_get_calendar_monthly_view200_response_dict = core_calendar_get_calendar_monthly_view200_response_instance.to_dict()
# create an instance of CoreCalendarGetCalendarMonthlyView200Response from a dict
core_calendar_get_calendar_monthly_view200_response_from_dict = CoreCalendarGetCalendarMonthlyView200Response.from_dict(core_calendar_get_calendar_monthly_view200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


