# ModChatGetChatsByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chats** | [**List[ModChatGetChatsByCourses200ResponseChatsInner]**](ModChatGetChatsByCourses200ResponseChatsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_chats_by_courses200_response import ModChatGetChatsByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetChatsByCourses200Response from a JSON string
mod_chat_get_chats_by_courses200_response_instance = ModChatGetChatsByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModChatGetChatsByCourses200Response.to_json())

# convert the object into a dict
mod_chat_get_chats_by_courses200_response_dict = mod_chat_get_chats_by_courses200_response_instance.to_dict()
# create an instance of ModChatGetChatsByCourses200Response from a dict
mod_chat_get_chats_by_courses200_response_from_dict = ModChatGetChatsByCourses200Response.from_dict(mod_chat_get_chats_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


