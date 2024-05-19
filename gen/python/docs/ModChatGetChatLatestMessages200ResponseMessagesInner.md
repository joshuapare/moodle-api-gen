# ModChatGetChatLatestMessages200ResponseMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | message id | [optional] [default to null]
**message** | **str** | message text | [optional] [default to 'null']
**system** | **bool** | true if is a system message (like user joined) | [optional] [default to False]
**timestamp** | **int** | timestamp for the message | [optional] [default to null]
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_chat_latest_messages200_response_messages_inner import ModChatGetChatLatestMessages200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatLatestMessages200ResponseMessagesInner from a JSON string
mod_chat_get_chat_latest_messages200_response_messages_inner_instance = ModChatGetChatLatestMessages200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatLatestMessages200ResponseMessagesInner.to_json())

# convert the object into a dict
mod_chat_get_chat_latest_messages200_response_messages_inner_dict = mod_chat_get_chat_latest_messages200_response_messages_inner_instance.to_dict()
# create an instance of ModChatGetChatLatestMessages200ResponseMessagesInner from a dict
mod_chat_get_chat_latest_messages200_response_messages_inner_from_dict = ModChatGetChatLatestMessages200ResponseMessagesInner.from_dict(mod_chat_get_chat_latest_messages200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


