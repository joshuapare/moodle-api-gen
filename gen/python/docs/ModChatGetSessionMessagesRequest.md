# ModChatGetSessionMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatid** | **int** | Chat instance id. | [default to null]
**groupid** | **int** | Get messages from users in this group.                                                 0 means that the function will determine the user group | [optional] [default to 0]
**sessionend** | **int** | The session end time (timestamp). | [default to null]
**sessionstart** | **int** | The session start time (timestamp). | [default to null]

## Example

```python
from openapi_client.models.mod_chat_get_session_messages_request import ModChatGetSessionMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetSessionMessagesRequest from a JSON string
mod_chat_get_session_messages_request_instance = ModChatGetSessionMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatGetSessionMessagesRequest.to_json())

# convert the object into a dict
mod_chat_get_session_messages_request_dict = mod_chat_get_session_messages_request_instance.to_dict()
# create an instance of ModChatGetSessionMessagesRequest from a dict
mod_chat_get_session_messages_request_from_dict = ModChatGetSessionMessagesRequest.from_dict(mod_chat_get_session_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


