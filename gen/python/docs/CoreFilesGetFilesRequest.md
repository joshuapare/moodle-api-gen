# CoreFilesGetFilesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | component | 
**contextid** | **int** | context id Set to -1 to use contextlevel and instanceid. | [default to null]
**contextlevel** | **str** | The context level for the file location. | [optional] [default to 'null']
**filearea** | **str** | file area | [default to 'null']
**filename** | **str** | file name | [default to 'null']
**filepath** | **str** | file path | [default to 'null']
**instanceid** | **int** | The instance id for where the file is located. | [optional] [default to null]
**itemid** | **int** | associated id | 
**modified** | **int** | timestamp to return files changed after this time. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_files_get_files_request import CoreFilesGetFilesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesGetFilesRequest from a JSON string
core_files_get_files_request_instance = CoreFilesGetFilesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreFilesGetFilesRequest.to_json())

# convert the object into a dict
core_files_get_files_request_dict = core_files_get_files_request_instance.to_dict()
# create an instance of CoreFilesGetFilesRequest from a dict
core_files_get_files_request_from_dict = CoreFilesGetFilesRequest.from_dict(core_files_get_files_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


