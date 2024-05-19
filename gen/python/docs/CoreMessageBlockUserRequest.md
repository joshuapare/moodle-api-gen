# CoreMessageBlockUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockeduserid** | **int** | The id of the user being blocked | [default to null]
**userid** | **int** | The id of the user who is blocking | [default to null]

## Example

```python
from openapi_client.models.core_message_block_user_request import CoreMessageBlockUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageBlockUserRequest from a JSON string
core_message_block_user_request_instance = CoreMessageBlockUserRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageBlockUserRequest.to_json())

# convert the object into a dict
core_message_block_user_request_dict = core_message_block_user_request_instance.to_dict()
# create an instance of CoreMessageBlockUserRequest from a dict
core_message_block_user_request_from_dict = CoreMessageBlockUserRequest.from_dict(core_message_block_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


