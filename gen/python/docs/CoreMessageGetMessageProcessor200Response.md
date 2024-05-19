# CoreMessageGetMessageProcessor200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**systemconfigured** | **bool** | Site configuration status | [default to False]
**userconfigured** | **bool** | The user configuration status | [default to False]

## Example

```python
from openapi_client.models.core_message_get_message_processor200_response import CoreMessageGetMessageProcessor200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMessageProcessor200Response from a JSON string
core_message_get_message_processor200_response_instance = CoreMessageGetMessageProcessor200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMessageProcessor200Response.to_json())

# convert the object into a dict
core_message_get_message_processor200_response_dict = core_message_get_message_processor200_response_instance.to_dict()
# create an instance of CoreMessageGetMessageProcessor200Response from a dict
core_message_get_message_processor200_response_from_dict = CoreMessageGetMessageProcessor200Response.from_dict(core_message_get_message_processor200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


