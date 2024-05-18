# ModFolderViewFolderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folderid** | **int** | folder instance id | [default to null]

## Example

```python
from openapi_client.models.mod_folder_view_folder_request import ModFolderViewFolderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFolderViewFolderRequest from a JSON string
mod_folder_view_folder_request_instance = ModFolderViewFolderRequest.from_json(json)
# print the JSON string representation of the object
print(ModFolderViewFolderRequest.to_json())

# convert the object into a dict
mod_folder_view_folder_request_dict = mod_folder_view_folder_request_instance.to_dict()
# create an instance of ModFolderViewFolderRequest from a dict
mod_folder_view_folder_request_from_dict = ModFolderViewFolderRequest.from_dict(mod_folder_view_folder_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


