# CoreCalendarGetTimestamps200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamps** | [**List[CoreCalendarGetTimestamps200ResponseTimestampsInner]**](CoreCalendarGetTimestamps200ResponseTimestampsInner.md) |  | 

## Example

```python
from openapi_client.models.core_calendar_get_timestamps200_response import CoreCalendarGetTimestamps200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetTimestamps200Response from a JSON string
core_calendar_get_timestamps200_response_instance = CoreCalendarGetTimestamps200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetTimestamps200Response.to_json())

# convert the object into a dict
core_calendar_get_timestamps200_response_dict = core_calendar_get_timestamps200_response_instance.to_dict()
# create an instance of CoreCalendarGetTimestamps200Response from a dict
core_calendar_get_timestamps200_response_from_dict = CoreCalendarGetTimestamps200Response.from_dict(core_calendar_get_timestamps200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


