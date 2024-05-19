# CoreMessageMarkAllConversationMessagesAsReadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | The conversation id who who we are marking the messages as read for | [default to null]
**userid** | **int** | The user id who who we are marking the messages as read for | [default to null]

## Example

```python
from openapi_client.models.core_message_mark_all_conversation_messages_as_read_request import CoreMessageMarkAllConversationMessagesAsReadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMarkAllConversationMessagesAsReadRequest from a JSON string
core_message_mark_all_conversation_messages_as_read_request_instance = CoreMessageMarkAllConversationMessagesAsReadRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMarkAllConversationMessagesAsReadRequest.to_json())

# convert the object into a dict
core_message_mark_all_conversation_messages_as_read_request_dict = core_message_mark_all_conversation_messages_as_read_request_instance.to_dict()
# create an instance of CoreMessageMarkAllConversationMessagesAsReadRequest from a dict
core_message_mark_all_conversation_messages_as_read_request_from_dict = CoreMessageMarkAllConversationMessagesAsReadRequest.from_dict(core_message_mark_all_conversation_messages_as_read_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


