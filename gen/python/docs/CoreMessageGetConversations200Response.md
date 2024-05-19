# CoreMessageGetConversations200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversations** | [**List[CoreMessageGetConversations200ResponseConversationsInner]**](CoreMessageGetConversations200ResponseConversationsInner.md) |  | 

## Example

```python
from openapi_client.models.core_message_get_conversations200_response import CoreMessageGetConversations200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetConversations200Response from a JSON string
core_message_get_conversations200_response_instance = CoreMessageGetConversations200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetConversations200Response.to_json())

# convert the object into a dict
core_message_get_conversations200_response_dict = core_message_get_conversations200_response_instance.to_dict()
# create an instance of CoreMessageGetConversations200Response from a dict
core_message_get_conversations200_response_from_dict = CoreMessageGetConversations200Response.from_dict(core_message_get_conversations200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


