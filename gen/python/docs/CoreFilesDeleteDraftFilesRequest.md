# CoreFilesDeleteDraftFilesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**draftitemid** | **int** | Item id of the draft file area | [default to null]
**files** | [**List[CoreFilesDeleteDraftFilesRequestFilesInner]**](CoreFilesDeleteDraftFilesRequestFilesInner.md) |  | 

## Example

```python
from openapi_client.models.core_files_delete_draft_files_request import CoreFilesDeleteDraftFilesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesDeleteDraftFilesRequest from a JSON string
core_files_delete_draft_files_request_instance = CoreFilesDeleteDraftFilesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFilesDeleteDraftFilesRequest.to_json())

# convert the object into a dict
core_files_delete_draft_files_request_dict = core_files_delete_draft_files_request_instance.to_dict()
# create an instance of CoreFilesDeleteDraftFilesRequest from a dict
core_files_delete_draft_files_request_from_dict = CoreFilesDeleteDraftFilesRequest.from_dict(core_files_delete_draft_files_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


