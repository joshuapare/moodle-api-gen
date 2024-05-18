# CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the contact request | [optional] 
**requesteduserid** | **int** | The id of the user confirming the request | [optional] 
**timecreated** | **int** | The timecreated timestamp for the contact request | [optional] 
**userid** | **int** | The id of the user who created the contact request | [optional] 

## Example

```python
from openapi_client.models.core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner import CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner from a JSON string
core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner_instance = CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.to_json())

# convert the object into a dict
core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner_dict = core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner_instance.to_dict()
# create an instance of CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner from a dict
core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner_from_dict = CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.from_dict(core_message_get_conversation_between_users200_response_members_inner_contactrequests_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


