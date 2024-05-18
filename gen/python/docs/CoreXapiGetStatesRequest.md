# CoreXapiGetStatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_id** | **str** | xAPI activity ID IRI | 
**agent** | **str** | The xAPI agent json | 
**component** | **str** | Component name | 
**registration** | **str** | The xAPI registration UUID | [optional] 
**since** | **str** | Filter ids stored since the timestamp (exclusive) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_xapi_get_states_request import CoreXapiGetStatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreXapiGetStatesRequest from a JSON string
core_xapi_get_states_request_instance = CoreXapiGetStatesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreXapiGetStatesRequest.to_json())

# convert the object into a dict
core_xapi_get_states_request_dict = core_xapi_get_states_request_instance.to_dict()
# create an instance of CoreXapiGetStatesRequest from a dict
core_xapi_get_states_request_from_dict = CoreXapiGetStatesRequest.from_dict(core_xapi_get_states_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


