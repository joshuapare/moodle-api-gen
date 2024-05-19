# CoreMessageGetConversations200ResponseConversationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to False]
**id** | **int** | The conversation id | [optional] 
**imageurl** | **str** | A link to the conversation picture, if set | [optional] 
**isfavourite** | **bool** | If the user marked this conversation as a favourite | [optional] 
**ismuted** | **bool** | If the user muted this conversation | [optional] 
**isread** | **bool** | If the user has read all messages in the conversation | [optional] 
**membercount** | **int** | Total number of conversation members | [optional] 
**members** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMembersInner]**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | [optional] 
**messages** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMessagesInner]**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | [optional] 
**name** | **str** | The conversation name, if set | [optional] 
**subname** | **str** | A subtitle for the conversation name, if set | [optional] 
**type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [optional] 
**unreadcount** | **int** | The number of unread messages in this conversation | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversations200_response_conversations_inner import CoreMessageGetConversations200ResponseConversationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversations200ResponseConversationsInner from a JSON string
core_message_get_conversations200_response_conversations_inner_instance = CoreMessageGetConversations200ResponseConversationsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversations200ResponseConversationsInner.to_json())

# convert the object into a dict
core_message_get_conversations200_response_conversations_inner_dict = core_message_get_conversations200_response_conversations_inner_instance.to_dict()
# create an instance of CoreMessageGetConversations200ResponseConversationsInner from a dict
core_message_get_conversations200_response_conversations_inner_from_dict = CoreMessageGetConversations200ResponseConversationsInner.from_dict(core_message_get_conversations200_response_conversations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


