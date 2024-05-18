# CoreCalendarGetCalendarAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanageentries** | **bool** | Whether the user can manage entries. | [default to False]
**canmanagegroupentries** | **bool** | Whether the user can manage group entries. | [default to False]
**canmanageownentries** | **bool** | Whether the user can manage its own entries. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_calendar_get_calendar_access_information200_response import CoreCalendarGetCalendarAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetCalendarAccessInformation200Response from a JSON string
core_calendar_get_calendar_access_information200_response_instance = CoreCalendarGetCalendarAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetCalendarAccessInformation200Response.to_json())

# convert the object into a dict
core_calendar_get_calendar_access_information200_response_dict = core_calendar_get_calendar_access_information200_response_instance.to_dict()
# create an instance of CoreCalendarGetCalendarAccessInformation200Response from a dict
core_calendar_get_calendar_access_information200_response_from_dict = CoreCalendarGetCalendarAccessInformation200Response.from_dict(core_calendar_get_calendar_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


