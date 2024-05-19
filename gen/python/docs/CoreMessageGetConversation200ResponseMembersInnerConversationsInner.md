# CoreMessageGetConversation200ResponseMembersInnerConversationsInner

information about conversation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Conversations id | [optional] [default to null]
**name** | **str** | Multilang compatible conversation name2 | [optional] [default to 'null']
**timecreated** | **int** | The timecreated timestamp for the conversation | [optional] [default to null]
**type** | **int** | Conversation type: private or public | [optional] [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation200_response_members_inner_conversations_inner import CoreMessageGetConversation200ResponseMembersInnerConversationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversation200ResponseMembersInnerConversationsInner from a JSON string
core_message_get_conversation200_response_members_inner_conversations_inner_instance = CoreMessageGetConversation200ResponseMembersInnerConversationsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversation200ResponseMembersInnerConversationsInner.to_json())

# convert the object into a dict
core_message_get_conversation200_response_members_inner_conversations_inner_dict = core_message_get_conversation200_response_members_inner_conversations_inner_instance.to_dict()
# create an instance of CoreMessageGetConversation200ResponseMembersInnerConversationsInner from a dict
core_message_get_conversation200_response_members_inner_conversations_inner_from_dict = CoreMessageGetConversation200ResponseMembersInnerConversationsInner.from_dict(core_message_get_conversation200_response_members_inner_conversations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


