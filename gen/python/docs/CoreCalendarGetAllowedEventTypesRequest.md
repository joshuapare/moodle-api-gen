# CoreCalendarGetAllowedEventTypesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course to check, empty for site. | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_calendar_get_allowed_event_types_request import CoreCalendarGetAllowedEventTypesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetAllowedEventTypesRequest from a JSON string
core_calendar_get_allowed_event_types_request_instance = CoreCalendarGetAllowedEventTypesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetAllowedEventTypesRequest.to_json())

# convert the object into a dict
core_calendar_get_allowed_event_types_request_dict = core_calendar_get_allowed_event_types_request_instance.to_dict()
# create an instance of CoreCalendarGetAllowedEventTypesRequest from a dict
core_calendar_get_allowed_event_types_request_from_dict = CoreCalendarGetAllowedEventTypesRequest.from_dict(core_calendar_get_allowed_event_types_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


