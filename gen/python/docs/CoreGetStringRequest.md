# CoreGetStringRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | [optional] [default to 'moodle']
**lang** | **str** | lang | [optional] 
**stringid** | **str** | string identifier | [default to 'null']
**stringparams** | [**List[CoreGetStringRequestStringparamsInner]**](CoreGetStringRequestStringparamsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_get_string_request import CoreGetStringRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGetStringRequest from a JSON string
core_get_string_request_instance = CoreGetStringRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGetStringRequest.to_json())

# convert the object into a dict
core_get_string_request_dict = core_get_string_request_instance.to_dict()
# create an instance of CoreGetStringRequest from a dict
core_get_string_request_from_dict = CoreGetStringRequest.from_dict(core_get_string_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


