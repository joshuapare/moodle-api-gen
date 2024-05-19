# CoreMessageMarkMessageReadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageid** | **int** | id of the message in the messages table | [default to null]
**timeread** | **int** | timestamp for when the message should be marked read | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_message_mark_message_read_request import CoreMessageMarkMessageReadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMarkMessageReadRequest from a JSON string
core_message_mark_message_read_request_instance = CoreMessageMarkMessageReadRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMarkMessageReadRequest.to_json())

# convert the object into a dict
core_message_mark_message_read_request_dict = core_message_mark_message_read_request_instance.to_dict()
# create an instance of CoreMessageMarkMessageReadRequest from a dict
core_message_mark_message_read_request_from_dict = CoreMessageMarkMessageReadRequest.from_dict(core_message_mark_message_read_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


