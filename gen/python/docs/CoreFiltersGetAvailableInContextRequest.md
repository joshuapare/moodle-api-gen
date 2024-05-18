# CoreFiltersGetAvailableInContextRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contexts** | [**List[CoreFiltersGetAvailableInContextRequestContextsInner]**](CoreFiltersGetAvailableInContextRequestContextsInner.md) |  | 

## Example

```python
from openapi_client.models.core_filters_get_available_in_context_request import CoreFiltersGetAvailableInContextRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFiltersGetAvailableInContextRequest from a JSON string
core_filters_get_available_in_context_request_instance = CoreFiltersGetAvailableInContextRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFiltersGetAvailableInContextRequest.to_json())

# convert the object into a dict
core_filters_get_available_in_context_request_dict = core_filters_get_available_in_context_request_instance.to_dict()
# create an instance of CoreFiltersGetAvailableInContextRequest from a dict
core_filters_get_available_in_context_request_from_dict = CoreFiltersGetAvailableInContextRequest.from_dict(core_filters_get_available_in_context_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


