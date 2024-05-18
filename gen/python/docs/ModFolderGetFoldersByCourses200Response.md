# ModFolderGetFoldersByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folders** | [**List[ModFolderGetFoldersByCourses200ResponseFoldersInner]**](ModFolderGetFoldersByCourses200ResponseFoldersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_folder_get_folders_by_courses200_response import ModFolderGetFoldersByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFolderGetFoldersByCourses200Response from a JSON string
mod_folder_get_folders_by_courses200_response_instance = ModFolderGetFoldersByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModFolderGetFoldersByCourses200Response.to_json())

# convert the object into a dict
mod_folder_get_folders_by_courses200_response_dict = mod_folder_get_folders_by_courses200_response_instance.to_dict()
# create an instance of ModFolderGetFoldersByCourses200Response from a dict
mod_folder_get_folders_by_courses200_response_from_dict = ModFolderGetFoldersByCourses200Response.from_dict(mod_folder_get_folders_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


