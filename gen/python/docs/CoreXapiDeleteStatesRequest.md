# CoreXapiDeleteStatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_id** | **str** | xAPI activity ID IRI | 
**agent** | **str** | The xAPI agent json | 
**component** | **str** | Component name | 
**registration** | **str** | The xAPI registration UUID | [optional] 

## Example

```python
from openapi_client.models.core_xapi_delete_states_request import CoreXapiDeleteStatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreXapiDeleteStatesRequest from a JSON string
core_xapi_delete_states_request_instance = CoreXapiDeleteStatesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreXapiDeleteStatesRequest.to_json())

# convert the object into a dict
core_xapi_delete_states_request_dict = core_xapi_delete_states_request_instance.to_dict()
# create an instance of CoreXapiDeleteStatesRequest from a dict
core_xapi_delete_states_request_from_dict = CoreXapiDeleteStatesRequest.from_dict(core_xapi_delete_states_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


