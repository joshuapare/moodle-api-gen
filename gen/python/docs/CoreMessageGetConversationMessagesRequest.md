# CoreMessageGetConversationMessagesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convid** | **int** | The conversation id | 
**currentuserid** | **int** | The current user&#39;s id | [default to null]
**limitfrom** | **int** | Limit from | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 0]
**newest** | **bool** | Newest first? | [optional] [default to False]
**timefrom** | **int** | The timestamp from which the messages were created | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_message_get_conversation_messages_request import CoreMessageGetConversationMessagesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationMessagesRequest from a JSON string
core_message_get_conversation_messages_request_instance = CoreMessageGetConversationMessagesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationMessagesRequest.to_json())

# convert the object into a dict
core_message_get_conversation_messages_request_dict = core_message_get_conversation_messages_request_instance.to_dict()
# create an instance of CoreMessageGetConversationMessagesRequest from a dict
core_message_get_conversation_messages_request_from_dict = CoreMessageGetConversationMessagesRequest.from_dict(core_message_get_conversation_messages_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


