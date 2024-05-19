# CoreMessageMessageSearchUsers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contacts** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMembersInner]**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**noncontacts** | [**List[CoreMessageGetConversationBetweenUsers200ResponseMembersInner]**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 

## Example

```python
from openapi_client.models.core_message_message_search_users200_response import CoreMessageMessageSearchUsers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMessageSearchUsers200Response from a JSON string
core_message_message_search_users200_response_instance = CoreMessageMessageSearchUsers200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMessageSearchUsers200Response.to_json())

# convert the object into a dict
core_message_message_search_users200_response_dict = core_message_message_search_users200_response_instance.to_dict()
# create an instance of CoreMessageMessageSearchUsers200Response from a dict
core_message_message_search_users200_response_from_dict = CoreMessageMessageSearchUsers200Response.from_dict(core_message_message_search_users200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


