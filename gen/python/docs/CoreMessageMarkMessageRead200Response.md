# CoreMessageMarkMessageRead200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageid** | **int** | the id of the message in the messages table | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_mark_message_read200_response import CoreMessageMarkMessageRead200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageMarkMessageRead200Response from a JSON string
core_message_mark_message_read200_response_instance = CoreMessageMarkMessageRead200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageMarkMessageRead200Response.to_json())

# convert the object into a dict
core_message_mark_message_read200_response_dict = core_message_mark_message_read200_response_instance.to_dict()
# create an instance of CoreMessageMarkMessageRead200Response from a dict
core_message_mark_message_read200_response_from_dict = CoreMessageMarkMessageRead200Response.from_dict(core_message_mark_message_read200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


