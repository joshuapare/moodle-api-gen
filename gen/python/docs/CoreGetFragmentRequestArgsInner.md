# CoreGetFragmentRequestArgsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | param name | [optional] [default to 'null']
**value** | **str** | param value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_get_fragment_request_args_inner import CoreGetFragmentRequestArgsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetFragmentRequestArgsInner from a JSON string
core_get_fragment_request_args_inner_instance = CoreGetFragmentRequestArgsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGetFragmentRequestArgsInner.to_json())

# convert the object into a dict
core_get_fragment_request_args_inner_dict = core_get_fragment_request_args_inner_instance.to_dict()
# create an instance of CoreGetFragmentRequestArgsInner from a dict
core_get_fragment_request_args_inner_from_dict = CoreGetFragmentRequestArgsInner.from_dict(core_get_fragment_request_args_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


