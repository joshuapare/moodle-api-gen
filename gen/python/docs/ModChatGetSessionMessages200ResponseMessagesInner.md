# ModChatGetSessionMessages200ResponseMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatid** | **int** | The chat id. | [optional] [default to 0]
**groupid** | **int** | The group this message belongs to. | [optional] [default to 0]
**id** | **int** | The message record id. | [optional] [default to null]
**issystem** | **bool** | Whether is a system message or not. | [optional] [default to False]
**message** | **str** | The message text. | [optional] [default to 'null']
**timestamp** | **int** | The message timestamp (indicates when the message was sent). | [optional] [default to 0]
**userid** | **int** | The user who wrote the message. | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_chat_get_session_messages200_response_messages_inner import ModChatGetSessionMessages200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetSessionMessages200ResponseMessagesInner from a JSON string
mod_chat_get_session_messages200_response_messages_inner_instance = ModChatGetSessionMessages200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(ModChatGetSessionMessages200ResponseMessagesInner.to_json())

# convert the object into a dict
mod_chat_get_session_messages200_response_messages_inner_dict = mod_chat_get_session_messages200_response_messages_inner_instance.to_dict()
# create an instance of ModChatGetSessionMessages200ResponseMessagesInner from a dict
mod_chat_get_session_messages200_response_messages_inner_from_dict = ModChatGetSessionMessages200ResponseMessagesInner.from_dict(mod_chat_get_session_messages200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


