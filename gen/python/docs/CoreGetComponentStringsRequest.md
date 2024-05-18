# CoreGetComponentStringsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | 
**lang** | **str** | lang | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_get_component_strings_request import CoreGetComponentStringsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetComponentStringsRequest from a JSON string
core_get_component_strings_request_instance = CoreGetComponentStringsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGetComponentStringsRequest.to_json())

# convert the object into a dict
core_get_component_strings_request_dict = core_get_component_strings_request_instance.to_dict()
# create an instance of CoreGetComponentStringsRequest from a dict
core_get_component_strings_request_from_dict = CoreGetComponentStringsRequest.from_dict(core_get_component_strings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


