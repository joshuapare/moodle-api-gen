# CoreContentbankRenameContentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentid** | **int** | The content id to rename | [default to null]
**name** | **str** | The new name for the content | 

## Example

```python
from openapi_client.models.core_contentbank_rename_content_request import CoreContentbankRenameContentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreContentbankRenameContentRequest from a JSON string
core_contentbank_rename_content_request_instance = CoreContentbankRenameContentRequest.from_json(json)
# print the JSON string representation of the object
print(CoreContentbankRenameContentRequest.to_json())

# convert the object into a dict
core_contentbank_rename_content_request_dict = core_contentbank_rename_content_request_instance.to_dict()
# create an instance of CoreContentbankRenameContentRequest from a dict
core_contentbank_rename_content_request_from_dict = CoreContentbankRenameContentRequest.from_dict(core_contentbank_rename_content_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


