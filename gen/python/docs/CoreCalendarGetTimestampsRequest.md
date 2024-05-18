# CoreCalendarGetTimestampsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[CoreCalendarGetTimestampsRequestDataInner]**](CoreCalendarGetTimestampsRequestDataInner.md) |  | 

## Example

```python
from openapi_client.models.core_calendar_get_timestamps_request import CoreCalendarGetTimestampsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCalendarGetTimestampsRequest from a JSON string
core_calendar_get_timestamps_request_instance = CoreCalendarGetTimestampsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCalendarGetTimestampsRequest.to_json())

# convert the object into a dict
core_calendar_get_timestamps_request_dict = core_calendar_get_timestamps_request_instance.to_dict()
# create an instance of CoreCalendarGetTimestampsRequest from a dict
core_calendar_get_timestamps_request_from_dict = CoreCalendarGetTimestampsRequest.from_dict(core_calendar_get_timestamps_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


