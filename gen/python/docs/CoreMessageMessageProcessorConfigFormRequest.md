# CoreMessageMessageProcessorConfigFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formvalues** | [**List[CoreMessageMessageProcessorConfigFormRequestFormvaluesInner]**](CoreMessageMessageProcessorConfigFormRequestFormvaluesInner.md) |  | 
**name** | **str** | The name of the message processor | 
**userid** | **int** | id of the user, 0 for current user | 

## Example

```python
from openapi_client.models.core_message_message_processor_config_form_request import CoreMessageMessageProcessorConfigFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMessageProcessorConfigFormRequest from a JSON string
core_message_message_processor_config_form_request_instance = CoreMessageMessageProcessorConfigFormRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMessageProcessorConfigFormRequest.to_json())

# convert the object into a dict
core_message_message_processor_config_form_request_dict = core_message_message_processor_config_form_request_instance.to_dict()
# create an instance of CoreMessageMessageProcessorConfigFormRequest from a dict
core_message_message_processor_config_form_request_from_dict = CoreMessageMessageProcessorConfigFormRequest.from_dict(core_message_message_processor_config_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


