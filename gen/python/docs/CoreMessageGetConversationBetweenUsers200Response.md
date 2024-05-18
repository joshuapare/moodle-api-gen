# CoreMessageGetConversationBetweenUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to False]
**id** | **int** | The conversation id | 
**imageurl** | **str** | A link to the conversation picture, if set | [optional] 
**isfavourite** | **bool** | If the user marked this conversation as a favourite | 
**ismuted** | **bool** | If the user muted this conversation | 
**isread** | **bool** | If the user has read all messages in the conversation | 
**membercount** | **int** | Total number of conversation members | 
**members** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMembersInner]**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**messages** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMessagesInner]**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | 
**name** | **str** | The conversation name, if set | [optional] 
**subname** | **str** | A subtitle for the conversation name, if set | [optional] 
**type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | 
**unreadcount** | **int** | The number of unread messages in this conversation | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation_between_users200_response import CoreMessageGetConversationBetweenUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationBetweenUsers200Response from a JSON string
core_message_get_conversation_between_users200_response_instance = CoreMessageGetConversationBetweenUsers200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationBetweenUsers200Response.to_json())

# convert the object into a dict
core_message_get_conversation_between_users200_response_dict = core_message_get_conversation_between_users200_response_instance.to_dict()
# create an instance of CoreMessageGetConversationBetweenUsers200Response from a dict
core_message_get_conversation_between_users200_response_from_dict = CoreMessageGetConversationBetweenUsers200Response.from_dict(core_message_get_conversation_between_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


