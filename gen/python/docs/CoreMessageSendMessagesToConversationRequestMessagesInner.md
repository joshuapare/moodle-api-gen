# CoreMessageSendMessagesToConversationRequestMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | the text of the message | [optional] 
**textformat** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_message_send_messages_to_conversation_request_messages_inner import CoreMessageSendMessagesToConversationRequestMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageSendMessagesToConversationRequestMessagesInner from a JSON string
core_message_send_messages_to_conversation_request_messages_inner_instance = CoreMessageSendMessagesToConversationRequestMessagesInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageSendMessagesToConversationRequestMessagesInner.to_json())

# convert the object into a dict
core_message_send_messages_to_conversation_request_messages_inner_dict = core_message_send_messages_to_conversation_request_messages_inner_instance.to_dict()
# create an instance of CoreMessageSendMessagesToConversationRequestMessagesInner from a dict
core_message_send_messages_to_conversation_request_messages_inner_from_dict = CoreMessageSendMessagesToConversationRequestMessagesInner.from_dict(core_message_send_messages_to_conversation_request_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


