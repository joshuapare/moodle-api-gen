# CoreCalendarCreateCalendarEvents200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**List[CoreCalendarCreateCalendarEvents200ResponseEventsInner]**](CoreCalendarCreateCalendarEvents200ResponseEventsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_create_calendar_events200_response import CoreCalendarCreateCalendarEvents200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarCreateCalendarEvents200Response from a JSON string
core_calendar_create_calendar_events200_response_instance = CoreCalendarCreateCalendarEvents200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarCreateCalendarEvents200Response.to_json())

# convert the object into a dict
core_calendar_create_calendar_events200_response_dict = core_calendar_create_calendar_events200_response_instance.to_dict()
# create an instance of CoreCalendarCreateCalendarEvents200Response from a dict
core_calendar_create_calendar_events200_response_from_dict = CoreCalendarCreateCalendarEvents200Response.from_dict(core_calendar_create_calendar_events200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


