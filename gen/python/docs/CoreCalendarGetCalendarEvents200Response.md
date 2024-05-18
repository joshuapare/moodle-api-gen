# CoreCalendarGetCalendarEvents200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarGetCalendarEvents200ResponseEventsInner]**](CoreCalendarGetCalendarEvents200ResponseEventsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_events200_response import CoreCalendarGetCalendarEvents200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarEvents200Response from a JSON string
core_calendar_get_calendar_events200_response_instance = CoreCalendarGetCalendarEvents200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarEvents200Response.to_json())

# convert the object into a dict
core_calendar_get_calendar_events200_response_dict = core_calendar_get_calendar_events200_response_instance.to_dict()
# create an instance of CoreCalendarGetCalendarEvents200Response from a dict
core_calendar_get_calendar_events200_response_from_dict = CoreCalendarGetCalendarEvents200Response.from_dict(core_calendar_get_calendar_events200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


