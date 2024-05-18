# CoreXapiPostStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_id** | **str** | xAPI activity ID IRI | 
**agent** | **str** | The xAPI agent json | 
**component** | **str** | Component name | 
**registration** | **str** | The xAPI registration UUID | [optional] 
**state_data** | **str** | JSON object with the state data | [default to 'null']
**state_id** | **str** | The xAPI state ID | 

## Example

```python
from openapi_client.models.core_xapi_post_state_request import CoreXapiPostStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreXapiPostStateRequest from a JSON string
core_xapi_post_state_request_instance = CoreXapiPostStateRequest.from_json(json)
# print the JSON string representation of the object
print(CoreXapiPostStateRequest.to_json())

# convert the object into a dict
core_xapi_post_state_request_dict = core_xapi_post_state_request_instance.to_dict()
# create an instance of CoreXapiPostStateRequest from a dict
core_xapi_post_state_request_from_dict = CoreXapiPostStateRequest.from_dict(core_xapi_post_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


