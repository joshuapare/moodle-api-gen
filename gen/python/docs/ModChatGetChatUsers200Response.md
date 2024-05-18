# ModChatGetChatUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[ModChatGetChatUsers200ResponseUsersInner]**](ModChatGetChatUsers200ResponseUsersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_chat_users200_response import ModChatGetChatUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatUsers200Response from a JSON string
mod_chat_get_chat_users200_response_instance = ModChatGetChatUsers200Response.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatUsers200Response.to_json())

# convert the object into a dict
mod_chat_get_chat_users200_response_dict = mod_chat_get_chat_users200_response_instance.to_dict()
# create an instance of ModChatGetChatUsers200Response from a dict
mod_chat_get_chat_users200_response_from_dict = ModChatGetChatUsers200Response.from_dict(mod_chat_get_chat_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


