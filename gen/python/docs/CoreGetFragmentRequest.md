# CoreGetFragmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | [**List[CoreGetFragmentRequestArgsInner]**](CoreGetFragmentRequestArgsInner.md) |  | [optional] 
**callback** | **str** | Name of the callback to execute | [default to 'null']
**component** | **str** | Component for the callback e.g. mod_assign | [default to 'null']
**contextid** | **int** | Context ID that the fragment is from | [default to null]

## Example

```python
from openapi_client.models.core_get_fragment_request import CoreGetFragmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetFragmentRequest from a JSON string
core_get_fragment_request_instance = CoreGetFragmentRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGetFragmentRequest.to_json())

# convert the object into a dict
core_get_fragment_request_dict = core_get_fragment_request_instance.to_dict()
# create an instance of CoreGetFragmentRequest from a dict
core_get_fragment_request_from_dict = CoreGetFragmentRequest.from_dict(core_get_fragment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


