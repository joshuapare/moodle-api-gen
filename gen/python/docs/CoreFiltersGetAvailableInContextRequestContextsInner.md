# CoreFiltersGetAvailableInContextRequestContextsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextlevel** | **str** | The context level where the filters are:                                 (coursecat, course, module) | [optional] [default to 'null']
**instanceid** | **int** | The instance id of item associated with the context. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_filters_get_available_in_context_request_contexts_inner import CoreFiltersGetAvailableInContextRequestContextsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFiltersGetAvailableInContextRequestContextsInner from a JSON string
core_filters_get_available_in_context_request_contexts_inner_instance = CoreFiltersGetAvailableInContextRequestContextsInner.from_json(json)
# print the JSON string representation of the object
print(CoreFiltersGetAvailableInContextRequestContextsInner.to_json())

# convert the object into a dict
core_filters_get_available_in_context_request_contexts_inner_dict = core_filters_get_available_in_context_request_contexts_inner_instance.to_dict()
# create an instance of CoreFiltersGetAvailableInContextRequestContextsInner from a dict
core_filters_get_available_in_context_request_contexts_inner_from_dict = CoreFiltersGetAvailableInContextRequestContextsInner.from_dict(core_filters_get_available_in_context_request_contexts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


