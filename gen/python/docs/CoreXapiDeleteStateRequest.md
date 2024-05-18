# CoreXapiDeleteStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_id** | **str** | xAPI activity ID IRI | [default to 'null']
**agent** | **str** | The xAPI agent json | [default to 'null']
**component** | **str** | Component name | [default to 'null']
**registration** | **str** | The xAPI registration UUID | [optional] [default to 'null']
**state_id** | **str** | The xAPI state ID | [default to 'null']

## Example

```python
from openapi_client.models.core_xapi_delete_state_request import CoreXapiDeleteStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreXapiDeleteStateRequest from a JSON string
core_xapi_delete_state_request_instance = CoreXapiDeleteStateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreXapiDeleteStateRequest.to_json())

# convert the object into a dict
core_xapi_delete_state_request_dict = core_xapi_delete_state_request_instance.to_dict()
# create an instance of CoreXapiDeleteStateRequest from a dict
core_xapi_delete_state_request_from_dict = CoreXapiDeleteStateRequest.from_dict(core_xapi_delete_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


