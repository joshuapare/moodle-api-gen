# CoreGetStringsRequestStringsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | [optional] [default to 'moodle']
**lang** | **str** | lang | [optional] 
**stringid** | **str** | string identifier | [optional] 
**stringparams** | [**List[CoreGetStringsRequestStringsInnerStringparamsInner]**](CoreGetStringsRequestStringsInnerStringparamsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_get_strings_request_strings_inner import CoreGetStringsRequestStringsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetStringsRequestStringsInner from a JSON string
core_get_strings_request_strings_inner_instance = CoreGetStringsRequestStringsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGetStringsRequestStringsInner.to_json())

# convert the object into a dict
core_get_strings_request_strings_inner_dict = core_get_strings_request_strings_inner_instance.to_dict()
# create an instance of CoreGetStringsRequestStringsInner from a dict
core_get_strings_request_strings_inner_from_dict = CoreGetStringsRequestStringsInner.from_dict(core_get_strings_request_strings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


