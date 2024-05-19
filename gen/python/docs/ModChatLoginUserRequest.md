# ModChatLoginUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatid** | **int** | chat instance id | [default to null]
**groupid** | **int** | group id, 0 means that the function will determine the user group | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_chat_login_user_request import ModChatLoginUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatLoginUserRequest from a JSON string
mod_chat_login_user_request_instance = ModChatLoginUserRequest.from_json(json)
# print the JSON string representation of the object
print(ModChatLoginUserRequest.to_json())

# convert the object into a dict
mod_chat_login_user_request_dict = mod_chat_login_user_request_instance.to_dict()
# create an instance of ModChatLoginUserRequest from a dict
mod_chat_login_user_request_from_dict = ModChatLoginUserRequest.from_dict(mod_chat_login_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


