# CoreCalendarGetCalendarDayView200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | categoryid | [optional] [default to 0]
**courseid** | **int** | courseid | 
**var_date** | [**CoreCalendarGetCalendarDayView200ResponseDate**](CoreCalendarGetCalendarDayView200ResponseDate.md) |  | 
**defaulteventcontext** | **int** | defaulteventcontext | [default to 0]
**events** | [**List[CoreCalendarGetCalendarDayView200ResponseEventsInner]**](CoreCalendarGetCalendarDayView200ResponseEventsInner.md) |  | 
**filter_selector** | **str** | filter_selector | [default to 'null']
**larrow** | **str** | larrow | [default to 'null']
**neweventtimestamp** | **int** | neweventtimestamp | [default to null]
**nextperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**nextperiodlink** | **str** | nextperiodlink | [default to 'null']
**nextperiodname** | **str** | nextperiodname | [default to 'null']
**periodname** | **str** | periodname | [default to 'null']
**previousperiod** | [**CoreCalendarGetCalendarDayView200ResponseNextperiod**](CoreCalendarGetCalendarDayView200ResponseNextperiod.md) |  | 
**previousperiodlink** | **str** | previousperiodlink | [default to 'null']
**previousperiodname** | **str** | previousperiodname | [default to 'null']
**rarrow** | **str** | rarrow | [default to 'null']

## Example

```python
from openapi_client.models.core_calendar_get_calendar_day_view200_response import CoreCalendarGetCalendarDayView200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarDayView200Response from a JSON string
core_calendar_get_calendar_day_view200_response_instance = CoreCalendarGetCalendarDayView200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarDayView200Response.to_json())

# convert the object into a dict
core_calendar_get_calendar_day_view200_response_dict = core_calendar_get_calendar_day_view200_response_instance.to_dict()
# create an instance of CoreCalendarGetCalendarDayView200Response from a dict
core_calendar_get_calendar_day_view200_response_from_dict = CoreCalendarGetCalendarDayView200Response.from_dict(core_calendar_get_calendar_day_view200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


