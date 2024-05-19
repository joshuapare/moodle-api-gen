# CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the contact request | [optional] [default to null]
**requesteduserid** | **int** | The id of the user confirming the request | [optional] [default to null]
**timecreated** | **int** | The timecreated timestamp for the contact request | [optional] [default to null]
**userid** | **int** | The id of the user who created the contact request | [optional] [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation200_response_members_inner_contactrequests_inner import CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner from a JSON string
core_message_get_conversation200_response_members_inner_contactrequests_inner_instance = CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.to_json())

# convert the object into a dict
core_message_get_conversation200_response_members_inner_contactrequests_inner_dict = core_message_get_conversation200_response_members_inner_contactrequests_inner_instance.to_dict()
# create an instance of CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner from a dict
core_message_get_conversation200_response_members_inner_contactrequests_inner_from_dict = CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.from_dict(core_message_get_conversation200_response_members_inner_contactrequests_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


