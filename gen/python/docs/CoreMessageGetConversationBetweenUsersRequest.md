# CoreMessageGetConversationBetweenUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includecontactrequests** | **bool** | Include contact requests in the members | 
**includeprivacyinfo** | **bool** | Include privacy info in the members | 
**memberlimit** | **int** | Limit for number of members | [optional] [default to 0]
**memberoffset** | **int** | Offset for member list | [optional] [default to 0]
**messagelimit** | **int** | Limit for number of messages | [optional] [default to 100]
**messageoffset** | **int** | Offset for messages list | [optional] [default to 0]
**newestmessagesfirst** | **bool** | Order messages by newest first | [optional] [default to True]
**otheruserid** | **int** | The other user id | [default to null]
**userid** | **int** | The id of the user who we are viewing conversations for | 

## Example

```python
from openapi_client.models.core_message_get_conversation_between_users_request import CoreMessageGetConversationBetweenUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversationBetweenUsersRequest from a JSON string
core_message_get_conversation_between_users_request_instance = CoreMessageGetConversationBetweenUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversationBetweenUsersRequest.to_json())

# convert the object into a dict
core_message_get_conversation_between_users_request_dict = core_message_get_conversation_between_users_request_instance.to_dict()
# create an instance of CoreMessageGetConversationBetweenUsersRequest from a dict
core_message_get_conversation_between_users_request_from_dict = CoreMessageGetConversationBetweenUsersRequest.from_dict(core_message_get_conversation_between_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


