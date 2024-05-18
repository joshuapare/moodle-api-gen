# CoreMessageSendMessagesToConversationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | id of the conversation | [default to null]
**messages** | [**List[CoreMessageSendMessagesToConversationRequestMessagesInner]**](CoreMessageSendMessagesToConversationRequestMessagesInner.md) |  | 

## Example

```python
from openapi_client.models.core_message_send_messages_to_conversation_request import CoreMessageSendMessagesToConversationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageSendMessagesToConversationRequest from a JSON string
core_message_send_messages_to_conversation_request_instance = CoreMessageSendMessagesToConversationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageSendMessagesToConversationRequest.to_json())

# convert the object into a dict
core_message_send_messages_to_conversation_request_dict = core_message_send_messages_to_conversation_request_instance.to_dict()
# create an instance of CoreMessageSendMessagesToConversationRequest from a dict
core_message_send_messages_to_conversation_request_from_dict = CoreMessageSendMessagesToConversationRequest.from_dict(core_message_send_messages_to_conversation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


