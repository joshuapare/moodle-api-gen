# CoreMessageGetMessages200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[CoreMessageGetMessages200ResponseMessagesInner]**](CoreMessageGetMessages200ResponseMessagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_get_messages200_response import CoreMessageGetMessages200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMessages200Response from a JSON string
core_message_get_messages200_response_instance = CoreMessageGetMessages200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMessages200Response.to_json())

# convert the object into a dict
core_message_get_messages200_response_dict = core_message_get_messages200_response_instance.to_dict()
# create an instance of CoreMessageGetMessages200Response from a dict
core_message_get_messages200_response_from_dict = CoreMessageGetMessages200Response.from_dict(core_message_get_messages200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


