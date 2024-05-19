# ModChatSendChatMessageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beepid** | **str** | the beep id | [optional] [default to '']
**chatsid** | **str** | chat session id (obtained via mod_chat_login_user) | 
**messagetext** | **str** | the message text | [default to 'null']

## Example

```python
from openapi_client.models.mod_chat_send_chat_message_request import ModChatSendChatMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatSendChatMessageRequest from a JSON string
mod_chat_send_chat_message_request_instance = ModChatSendChatMessageRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatSendChatMessageRequest.to_json())

# convert the object into a dict
mod_chat_send_chat_message_request_dict = mod_chat_send_chat_message_request_instance.to_dict()
# create an instance of ModChatSendChatMessageRequest from a dict
mod_chat_send_chat_message_request_from_dict = ModChatSendChatMessageRequest.from_dict(mod_chat_send_chat_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


