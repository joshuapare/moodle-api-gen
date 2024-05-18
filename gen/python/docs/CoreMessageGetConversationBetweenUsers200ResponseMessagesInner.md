# CoreMessageGetConversationBetweenUsers200ResponseMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the message | [optional] 
**text** | **str** | The text of the message | [optional] 
**timecreated** | **int** | The timecreated timestamp for the message | [optional] 
**useridfrom** | **int** | The id of the user who sent the message | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation_between_users200_response_messages_inner import CoreMessageGetConversationBetweenUsers200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMessagesInner from a JSON string
core_message_get_conversation_between_users200_response_messages_inner_instance = CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.to_json())

# convert the object into a dict
core_message_get_conversation_between_users200_response_messages_inner_dict = core_message_get_conversation_between_users200_response_messages_inner_instance.to_dict()
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMessagesInner from a dict
core_message_get_conversation_between_users200_response_messages_inner_from_dict = CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.from_dict(core_message_get_conversation_between_users200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


