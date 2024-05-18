# ModChatGetChatUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatsid** | **str** | chat session id (obtained via mod_chat_login_user) | 

## Example

```python
from openapi_client.models.mod_chat_get_chat_users_request import ModChatGetChatUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatUsersRequest from a JSON string
mod_chat_get_chat_users_request_instance = ModChatGetChatUsersRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatUsersRequest.to_json())

# convert the object into a dict
mod_chat_get_chat_users_request_dict = mod_chat_get_chat_users_request_instance.to_dict()
# create an instance of ModChatGetChatUsersRequest from a dict
mod_chat_get_chat_users_request_from_dict = ModChatGetChatUsersRequest.from_dict(mod_chat_get_chat_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


