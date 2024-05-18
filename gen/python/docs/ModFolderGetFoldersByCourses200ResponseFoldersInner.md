# ModFolderGetFoldersByCourses200ResponseFoldersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**display** | **int** | Display type of folder contents on a separate page or inline | [optional] [default to null]
**forcedownload** | **int** | Whether file download is forced | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] [default to null]
**section** | **int** | Course section id | [optional] 
**showdownloadfolder** | **int** | Whether to show the download folder button | [optional] [default to null]
**showexpanded** | **int** | 1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders | [optional] [default to null]
**timemodified** | **int** | Last time the folder was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_folder_get_folders_by_courses200_response_folders_inner import ModFolderGetFoldersByCourses200ResponseFoldersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFolderGetFoldersByCourses200ResponseFoldersInner from a JSON string
mod_folder_get_folders_by_courses200_response_folders_inner_instance = ModFolderGetFoldersByCourses200ResponseFoldersInner.from_json(json)
# print the JSON string representation of the object
print(ModFolderGetFoldersByCourses200ResponseFoldersInner.to_json())

# convert the object into a dict
mod_folder_get_folders_by_courses200_response_folders_inner_dict = mod_folder_get_folders_by_courses200_response_folders_inner_instance.to_dict()
# create an instance of ModFolderGetFoldersByCourses200ResponseFoldersInner from a dict
mod_folder_get_folders_by_courses200_response_folders_inner_from_dict = ModFolderGetFoldersByCourses200ResponseFoldersInner.from_dict(mod_folder_get_folders_by_courses200_response_folders_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


