# ModChatGetChatLatestMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatlasttime** | **int** | last time messages were retrieved (epoch time) | [optional] [default to 0]
**chatsid** | **str** | chat session id (obtained via mod_chat_login_user) | [default to 'null']

## Example

```python
from openapi_client.models.mod_chat_get_chat_latest_messages_request import ModChatGetChatLatestMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatLatestMessagesRequest from a JSON string
mod_chat_get_chat_latest_messages_request_instance = ModChatGetChatLatestMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatLatestMessagesRequest.to_json())

# convert the object into a dict
mod_chat_get_chat_latest_messages_request_dict = mod_chat_get_chat_latest_messages_request_instance.to_dict()
# create an instance of ModChatGetChatLatestMessagesRequest from a dict
mod_chat_get_chat_latest_messages_request_from_dict = ModChatGetChatLatestMessagesRequest.from_dict(mod_chat_get_chat_latest_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


