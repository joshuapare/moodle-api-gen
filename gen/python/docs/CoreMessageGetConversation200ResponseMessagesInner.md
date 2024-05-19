# CoreMessageGetConversation200ResponseMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the message | [optional] [default to null]
**text** | **str** | The text of the message | [optional] [default to 'null']
**timecreated** | **int** | The timecreated timestamp for the message | [optional] [default to null]
**useridfrom** | **int** | The id of the user who sent the message | [optional] [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation200_response_messages_inner import CoreMessageGetConversation200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversation200ResponseMessagesInner from a JSON string
core_message_get_conversation200_response_messages_inner_instance = CoreMessageGetConversation200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversation200ResponseMessagesInner.to_json())

# convert the object into a dict
core_message_get_conversation200_response_messages_inner_dict = core_message_get_conversation200_response_messages_inner_instance.to_dict()
# create an instance of CoreMessageGetConversation200ResponseMessagesInner from a dict
core_message_get_conversation200_response_messages_inner_from_dict = CoreMessageGetConversation200ResponseMessagesInner.from_dict(core_message_get_conversation200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


