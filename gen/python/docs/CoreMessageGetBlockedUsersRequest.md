# CoreMessageGetBlockedUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | the user whose blocked users we want to retrieve | [default to null]

## Example

```python
from openapi_client.models.core_message_get_blocked_users_request import CoreMessageGetBlockedUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetBlockedUsersRequest from a JSON string
core_message_get_blocked_users_request_instance = CoreMessageGetBlockedUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetBlockedUsersRequest.to_json())

# convert the object into a dict
core_message_get_blocked_users_request_dict = core_message_get_blocked_users_request_instance.to_dict()
# create an instance of CoreMessageGetBlockedUsersRequest from a dict
core_message_get_blocked_users_request_from_dict = CoreMessageGetBlockedUsersRequest.from_dict(core_message_get_blocked_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


