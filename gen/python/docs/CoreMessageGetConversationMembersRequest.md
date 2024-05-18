# CoreMessageGetConversationMembersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | The id of the conversation | 
**includecontactrequests** | **bool** | Do we want to include contact requests? | [optional] [default to False]
**includeprivacyinfo** | **bool** | Do we want to include privacy info? | [optional] [default to False]
**limitfrom** | **int** | Limit from | [optional] [default to 0]
**limitnum** | **int** | Limit number | [optional] [default to 0]
**userid** | **int** | The id of the user we are performing this action on behalf of | [default to null]

## Example

```python
from openapi_client.models.core_message_get_conversation_members_request import CoreMessageGetConversationMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationMembersRequest from a JSON string
core_message_get_conversation_members_request_instance = CoreMessageGetConversationMembersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationMembersRequest.to_json())

# convert the object into a dict
core_message_get_conversation_members_request_dict = core_message_get_conversation_members_request_instance.to_dict()
# create an instance of CoreMessageGetConversationMembersRequest from a dict
core_message_get_conversation_members_request_from_dict = CoreMessageGetConversationMembersRequest.from_dict(core_message_get_conversation_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


