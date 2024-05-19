# CoreMessageDeleteMessageForAllUsersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageid** | **int** | The message id | 
**userid** | **int** | The user id of who we want to delete the message for all users | [default to null]

## Example

```python
from openapi_client.models.core_message_delete_message_for_all_users_request import CoreMessageDeleteMessageForAllUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDeleteMessageForAllUsersRequest from a JSON string
core_message_delete_message_for_all_users_request_instance = CoreMessageDeleteMessageForAllUsersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDeleteMessageForAllUsersRequest.to_json())

# convert the object into a dict
core_message_delete_message_for_all_users_request_dict = core_message_delete_message_for_all_users_request_instance.to_dict()
# create an instance of CoreMessageDeleteMessageForAllUsersRequest from a dict
core_message_delete_message_for_all_users_request_from_dict = CoreMessageDeleteMessageForAllUsersRequest.from_dict(core_message_delete_message_for_all_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


