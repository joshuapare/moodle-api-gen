# ModChatGetChatUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | user full name | [optional] 
**id** | **int** | user id | [optional] 
**profileimageurl** | **str** | user picture URL | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_chat_get_chat_users200_response_users_inner import ModChatGetChatUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatUsers200ResponseUsersInner from a JSON string
mod_chat_get_chat_users200_response_users_inner_instance = ModChatGetChatUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatUsers200ResponseUsersInner.to_json())

# convert the object into a dict
mod_chat_get_chat_users200_response_users_inner_dict = mod_chat_get_chat_users200_response_users_inner_instance.to_dict()
# create an instance of ModChatGetChatUsers200ResponseUsersInner from a dict
mod_chat_get_chat_users200_response_users_inner_from_dict = ModChatGetChatUsers200ResponseUsersInner.from_dict(mod_chat_get_chat_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


