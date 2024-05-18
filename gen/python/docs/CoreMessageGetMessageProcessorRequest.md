# CoreMessageGetMessageProcessorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the message processor | [default to 'null']
**userid** | **int** | id of the user, 0 for current user | [default to null]

## Example

```python
from openapi_client.models.core_message_get_message_processor_request import CoreMessageGetMessageProcessorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageGetMessageProcessorRequest from a JSON string
core_message_get_message_processor_request_instance = CoreMessageGetMessageProcessorRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageGetMessageProcessorRequest.to_json())

# convert the object into a dict
core_message_get_message_processor_request_dict = core_message_get_message_processor_request_instance.to_dict()
# create an instance of CoreMessageGetMessageProcessorRequest from a dict
core_message_get_message_processor_request_from_dict = CoreMessageGetMessageProcessorRequest.from_dict(core_message_get_message_processor_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


