# CoreFilesUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | 
**contextid** | **int** | context id | [optional] [default to null]
**contextlevel** | **str** | The context level to put the file in,                         (block, course, coursecat, system, user, module) | [optional] [default to 'null']
**filearea** | **str** | file area | 
**filecontent** | **str** | file content | [default to 'null']
**filename** | **str** | file name | 
**filepath** | **str** | file path | 
**instanceid** | **int** | The Instance id of item associated                          with the context level | [optional] [default to null]
**itemid** | **int** | associated id | 

## Example

```python
from openapi_client.models.core_files_upload_request import CoreFilesUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesUploadRequest from a JSON string
core_files_upload_request_instance = CoreFilesUploadRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFilesUploadRequest.to_json())

# convert the object into a dict
core_files_upload_request_dict = core_files_upload_request_instance.to_dict()
# create an instance of CoreFilesUploadRequest from a dict
core_files_upload_request_from_dict = CoreFilesUploadRequest.from_dict(core_files_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


