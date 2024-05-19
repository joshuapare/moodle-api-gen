# CoreMessageGetConversation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to False]
**id** | **int** | The conversation id | [default to null]
**imageurl** | **str** | A link to the conversation picture, if set | [optional] [default to 'null']
**isfavourite** | **bool** | If the user marked this conversation as a favourite | [default to False]
**ismuted** | **bool** | If the user muted this conversation | [default to False]
**isread** | **bool** | If the user has read all messages in the conversation | [default to False]
**membercount** | **int** | Total number of conversation members | [default to null]
**members** | [**List[CoreMessageGetConversation200ResponseMembersInner]**](CoreMessageGetConversation200ResponseMembersInner.md) |  | 
**messages** | [**List[CoreMessageGetConversation200ResponseMessagesInner]**](CoreMessageGetConversation200ResponseMessagesInner.md) |  | 
**name** | **str** | The conversation name, if set | [optional] [default to 'null']
**subname** | **str** | A subtitle for the conversation name, if set | [optional] [default to 'null']
**type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | [default to null]
**unreadcount** | **int** | The number of unread messages in this conversation | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation200_response import CoreMessageGetConversation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversation200Response from a JSON string
core_message_get_conversation200_response_instance = CoreMessageGetConversation200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversation200Response.to_json())

# convert the object into a dict
core_message_get_conversation200_response_dict = core_message_get_conversation200_response_instance.to_dict()
# create an instance of CoreMessageGetConversation200Response from a dict
core_message_get_conversation200_response_from_dict = CoreMessageGetConversation200Response.from_dict(core_message_get_conversation200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


