# CoreMessageGetBlockedUsers200ResponseUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | User full name | [optional] [default to 'null']
**id** | **int** | User ID | [optional] 
**profileimageurl** | **str** | User picture URL | [optional] 

## Example

```python
from openapi_client.models.core_message_get_blocked_users200_response_users_inner import CoreMessageGetBlockedUsers200ResponseUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetBlockedUsers200ResponseUsersInner from a JSON string
core_message_get_blocked_users200_response_users_inner_instance = CoreMessageGetBlockedUsers200ResponseUsersInner.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetBlockedUsers200ResponseUsersInner.to_json())

# convert the object into a dict
core_message_get_blocked_users200_response_users_inner_dict = core_message_get_blocked_users200_response_users_inner_instance.to_dict()
# create an instance of CoreMessageGetBlockedUsers200ResponseUsersInner from a dict
core_message_get_blocked_users200_response_users_inner_from_dict = CoreMessageGetBlockedUsers200ResponseUsersInner.from_dict(core_message_get_blocked_users200_response_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


