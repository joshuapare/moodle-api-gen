# CoreMessageDeleteMessageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageid** | **int** | The message id | [default to null]
**read** | **bool** | If is a message read | [optional] [default to True]
**userid** | **int** | The user id of who we want to delete the message for | [default to null]

## Example

```python
from openapi_client.models.core_message_delete_message_request import CoreMessageDeleteMessageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDeleteMessageRequest from a JSON string
core_message_delete_message_request_instance = CoreMessageDeleteMessageRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDeleteMessageRequest.to_json())

# convert the object into a dict
core_message_delete_message_request_dict = core_message_delete_message_request_instance.to_dict()
# create an instance of CoreMessageDeleteMessageRequest from a dict
core_message_delete_message_request_from_dict = CoreMessageDeleteMessageRequest.from_dict(core_message_delete_message_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


