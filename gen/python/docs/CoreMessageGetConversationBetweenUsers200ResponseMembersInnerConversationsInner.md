# CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner

information about conversation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Conversations id | [optional] 
**name** | **str** | Multilang compatible conversation name2 | [optional] 
**timecreated** | **int** | The timecreated timestamp for the conversation | [optional] 
**type** | **int** | Conversation type: private or public | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation_between_users200_response_members_inner_conversations_inner import CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner from a JSON string
core_message_get_conversation_between_users200_response_members_inner_conversations_inner_instance = CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.to_json())

# convert the object into a dict
core_message_get_conversation_between_users200_response_members_inner_conversations_inner_dict = core_message_get_conversation_between_users200_response_members_inner_conversations_inner_instance.to_dict()
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner from a dict
core_message_get_conversation_between_users200_response_members_inner_conversations_inner_from_dict = CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.from_dict(core_message_get_conversation_between_users200_response_members_inner_conversations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


