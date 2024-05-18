# CoreCalendarGetAllowedEventTypes200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedeventtypes** | **List[object]** |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_allowed_event_types200_response import CoreCalendarGetAllowedEventTypes200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetAllowedEventTypes200Response from a JSON string
core_calendar_get_allowed_event_types200_response_instance = CoreCalendarGetAllowedEventTypes200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetAllowedEventTypes200Response.to_json())

# convert the object into a dict
core_calendar_get_allowed_event_types200_response_dict = core_calendar_get_allowed_event_types200_response_instance.to_dict()
# create an instance of CoreCalendarGetAllowedEventTypes200Response from a dict
core_calendar_get_allowed_event_types200_response_from_dict = CoreCalendarGetAllowedEventTypes200Response.from_dict(core_calendar_get_allowed_event_types200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


