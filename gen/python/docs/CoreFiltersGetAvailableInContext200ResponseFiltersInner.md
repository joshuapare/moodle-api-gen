# CoreFiltersGetAvailableInContext200ResponseFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id. | [optional] [default to null]
**contextlevel** | **str** | The context level where the filters are:                                 (coursecat, course, module). | [optional] [default to 'null']
**filter** | **str** | Filter plugin name. | [optional] [default to 'null']
**inheritedstate** | **int** | 1 or 0 to use when localstate is set to inherit. | [optional] [default to null]
**instanceid** | **int** | The instance id of item associated with the context. | [optional] 
**localstate** | **int** | Filter state: 1 for on, -1 for off, 0 if inherit. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_filters_get_available_in_context200_response_filters_inner import CoreFiltersGetAvailableInContext200ResponseFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFiltersGetAvailableInContext200ResponseFiltersInner from a JSON string
core_filters_get_available_in_context200_response_filters_inner_instance = CoreFiltersGetAvailableInContext200ResponseFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreFiltersGetAvailableInContext200ResponseFiltersInner.to_json())

# convert the object into a dict
core_filters_get_available_in_context200_response_filters_inner_dict = core_filters_get_available_in_context200_response_filters_inner_instance.to_dict()
# create an instance of CoreFiltersGetAvailableInContext200ResponseFiltersInner from a dict
core_filters_get_available_in_context200_response_filters_inner_from_dict = CoreFiltersGetAvailableInContext200ResponseFiltersInner.from_dict(core_filters_get_available_in_context200_response_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


