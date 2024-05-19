# CoreMessageUnblockUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unblockeduserid** | **int** | The id of the user being unblocked | [default to null]
**userid** | **int** | The id of the user who is unblocking | [default to null]

## Example

```python
from openapi_client.models.core_message_unblock_user_request import CoreMessageUnblockUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageUnblockUserRequest from a JSON string
core_message_unblock_user_request_instance = CoreMessageUnblockUserRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageUnblockUserRequest.to_json())

# convert the object into a dict
core_message_unblock_user_request_dict = core_message_unblock_user_request_instance.to_dict()
# create an instance of CoreMessageUnblockUserRequest from a dict
core_message_unblock_user_request_from_dict = CoreMessageUnblockUserRequest.from_dict(core_message_unblock_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


