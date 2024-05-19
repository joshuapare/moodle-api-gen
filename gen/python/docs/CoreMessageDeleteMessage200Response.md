# CoreMessageDeleteMessage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the message was deleted, false otherwise | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_message_delete_message200_response import CoreMessageDeleteMessage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMessageDeleteMessage200Response from a JSON string
core_message_delete_message200_response_instance = CoreMessageDeleteMessage200Response.from_json(json)
# print the JSON string representation of the object
print(CoreMessageDeleteMessage200Response.to_json())

# convert the object into a dict
core_message_delete_message200_response_dict = core_message_delete_message200_response_instance.to_dict()
# create an instance of CoreMessageDeleteMessage200Response from a dict
core_message_delete_message200_response_from_dict = CoreMessageDeleteMessage200Response.from_dict(core_message_delete_message200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


