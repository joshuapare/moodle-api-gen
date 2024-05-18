# CoreGetStringRequestStringparamsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | param name                             - if the string expect only one $a parameter then don&#39;t send this field, just send the value. | [optional] [default to 'null']
**value** | **str** | param value | [optional] 

## Example

```python
from openapi_client.models.core_get_string_request_stringparams_inner import CoreGetStringRequestStringparamsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetStringRequestStringparamsInner from a JSON string
core_get_string_request_stringparams_inner_instance = CoreGetStringRequestStringparamsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGetStringRequestStringparamsInner.to_json())

# convert the object into a dict
core_get_string_request_stringparams_inner_dict = core_get_string_request_stringparams_inner_instance.to_dict()
# create an instance of CoreGetStringRequestStringparamsInner from a dict
core_get_string_request_stringparams_inner_from_dict = CoreGetStringRequestStringparamsInner.from_dict(core_get_string_request_stringparams_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


