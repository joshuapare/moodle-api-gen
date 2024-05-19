# CoreContentbankCopyContent200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the new content | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_contentbank_copy_content200_response import CoreContentbankCopyContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreContentbankCopyContent200Response from a JSON string
core_contentbank_copy_content200_response_instance = CoreContentbankCopyContent200Response.from_json(json)
# print the JSON string representation of the object
print(CoreContentbankCopyContent200Response.to_json())

# convert the object into a dict
core_contentbank_copy_content200_response_dict = core_contentbank_copy_content200_response_instance.to_dict()
# create an instance of CoreContentbankCopyContent200Response from a dict
core_contentbank_copy_content200_response_from_dict = CoreContentbankCopyContent200Response.from_dict(core_contentbank_copy_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


