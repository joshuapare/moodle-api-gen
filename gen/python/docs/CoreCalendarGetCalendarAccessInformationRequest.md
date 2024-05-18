# CoreCalendarGetCalendarAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course to check, empty for site calendar events. | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_calendar_get_calendar_access_information_request import CoreCalendarGetCalendarAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarAccessInformationRequest from a JSON string
core_calendar_get_calendar_access_information_request_instance = CoreCalendarGetCalendarAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarAccessInformationRequest.to_json())

# convert the object into a dict
core_calendar_get_calendar_access_information_request_dict = core_calendar_get_calendar_access_information_request_instance.to_dict()
# create an instance of CoreCalendarGetCalendarAccessInformationRequest from a dict
core_calendar_get_calendar_access_information_request_from_dict = CoreCalendarGetCalendarAccessInformationRequest.from_dict(core_calendar_get_calendar_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


