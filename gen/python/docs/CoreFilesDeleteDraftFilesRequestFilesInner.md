# CoreFilesDeleteDraftFilesRequestFilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | Name of the file to delete. | [optional] [default to 'null']
**filepath** | **str** | Path to the file or directory to delete. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_files_delete_draft_files_request_files_inner import CoreFilesDeleteDraftFilesRequestFilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesDeleteDraftFilesRequestFilesInner from a JSON string
core_files_delete_draft_files_request_files_inner_instance = CoreFilesDeleteDraftFilesRequestFilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreFilesDeleteDraftFilesRequestFilesInner.to_json())

# convert the object into a dict
core_files_delete_draft_files_request_files_inner_dict = core_files_delete_draft_files_request_files_inner_instance.to_dict()
# create an instance of CoreFilesDeleteDraftFilesRequestFilesInner from a dict
core_files_delete_draft_files_request_files_inner_from_dict = CoreFilesDeleteDraftFilesRequestFilesInner.from_dict(core_files_delete_draft_files_request_files_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


