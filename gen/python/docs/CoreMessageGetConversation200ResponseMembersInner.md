# CoreMessageGetConversation200ResponseMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmessage** | **bool** | If the user can be messaged | [optional] [default to False]
**canmessageevenifblocked** | **bool** | If the user can still message even if they get blocked | [optional] [default to False]
**contactrequests** | [**List[CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner]**](CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.md) |  | [optional] 
**conversations** | [**List[CoreMessageGetConversation200ResponseMembersInnerConversationsInner]**](CoreMessageGetConversation200ResponseMembersInnerConversationsInner.md) |  | [optional] 
**fullname** | **str** | The user&#39;s name | [optional] 
**id** | **int** | The user id | [optional] 
**isblocked** | **bool** | If the user has been blocked | [optional] 
**iscontact** | **bool** | Is the user a contact? | [optional] [default to False]
**isdeleted** | **bool** | Is the user deleted? | [optional] [default to False]
**isonline** | **bool** | The user&#39;s online status | [optional] 
**profileimageurl** | **str** | User picture URL | [optional] 
**profileimageurlsmall** | **str** | Small user picture URL | [optional] 
**profileurl** | **str** | The link to the user&#39;s profile page | [optional] [default to 'null']
**requirescontact** | **bool** | If the user requires to be contacts | [optional] [default to False]
**showonlinestatus** | **bool** | Show the user&#39;s online status? | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation200_response_members_inner import CoreMessageGetConversation200ResponseMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversation200ResponseMembersInner from a JSON string
core_message_get_conversation200_response_members_inner_instance = CoreMessageGetConversation200ResponseMembersInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversation200ResponseMembersInner.to_json())

# convert the object into a dict
core_message_get_conversation200_response_members_inner_dict = core_message_get_conversation200_response_members_inner_instance.to_dict()
# create an instance of CoreMessageGetConversation200ResponseMembersInner from a dict
core_message_get_conversation200_response_members_inner_from_dict = CoreMessageGetConversation200ResponseMembersInner.from_dict(core_message_get_conversation200_response_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


