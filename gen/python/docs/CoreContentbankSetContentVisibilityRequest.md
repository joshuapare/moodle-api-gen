# CoreContentbankSetContentVisibilityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentid** | **int** | The content id to rename | 
**visibility** | **int** | The new visibility for the content | [default to null]

## Example

```python
from openapi_client.models.core_contentbank_set_content_visibility_request import CoreContentbankSetContentVisibilityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreContentbankSetContentVisibilityRequest from a JSON string
core_contentbank_set_content_visibility_request_instance = CoreContentbankSetContentVisibilityRequest.from_json(json)
# print the JSON string representation of the object
print(CoreContentbankSetContentVisibilityRequest.to_json())

# convert the object into a dict
core_contentbank_set_content_visibility_request_dict = core_contentbank_set_content_visibility_request_instance.to_dict()
# create an instance of CoreContentbankSetContentVisibilityRequest from a dict
core_contentbank_set_content_visibility_request_from_dict = CoreContentbankSetContentVisibilityRequest.from_dict(core_contentbank_set_content_visibility_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


