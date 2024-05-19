# ModChatGetSessionMessages200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[ModChatGetSessionMessages200ResponseMessagesInner]**](ModChatGetSessionMessages200ResponseMessagesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_chat_get_session_messages200_response import ModChatGetSessionMessages200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModChatGetSessionMessages200Response from a JSON string
mod_chat_get_session_messages200_response_instance = ModChatGetSessionMessages200Response.from_json(json)
# print the JSON string representation of the object
print(ModChatGetSessionMessages200Response.to_json())

# convert the object into a dict
mod_chat_get_session_messages200_response_dict = mod_chat_get_session_messages200_response_instance.to_dict()
# create an instance of ModChatGetSessionMessages200Response from a dict
mod_chat_get_session_messages200_response_from_dict = ModChatGetSessionMessages200Response.from_dict(mod_chat_get_session_messages200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


