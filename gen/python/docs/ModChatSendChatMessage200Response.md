# ModChatSendChatMessage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageid** | **int** | message sent id | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_send_chat_message200_response import ModChatSendChatMessage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatSendChatMessage200Response from a JSON string
mod_chat_send_chat_message200_response_instance = ModChatSendChatMessage200Response.from_json(json)
# print the JSON string representation of the object
print(ModChatSendChatMessage200Response.to_json())

# convert the object into a dict
mod_chat_send_chat_message200_response_dict = mod_chat_send_chat_message200_response_instance.to_dict()
# create an instance of ModChatSendChatMessage200Response from a dict
mod_chat_send_chat_message200_response_from_dict = ModChatSendChatMessage200Response.from_dict(mod_chat_send_chat_message200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


