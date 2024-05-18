# CoreGetStringsRequestStringsInnerStringparamsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | param name                                     - if the string expect only one $a parameter then don&#39;t send this field, just send the value. | [optional] [default to 'null']
**value** | **str** | param value | [optional] 

## Example

```python
from openapi_client.models.core_get_strings_request_strings_inner_stringparams_inner import CoreGetStringsRequestStringsInnerStringparamsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetStringsRequestStringsInnerStringparamsInner from a JSON string
core_get_strings_request_strings_inner_stringparams_inner_instance = CoreGetStringsRequestStringsInnerStringparamsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGetStringsRequestStringsInnerStringparamsInner.to_json())

# convert the object into a dict
core_get_strings_request_strings_inner_stringparams_inner_dict = core_get_strings_request_strings_inner_stringparams_inner_instance.to_dict()
# create an instance of CoreGetStringsRequestStringsInnerStringparamsInner from a dict
core_get_strings_request_strings_inner_stringparams_inner_from_dict = CoreGetStringsRequestStringsInnerStringparamsInner.from_dict(core_get_strings_request_strings_inner_stringparams_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


