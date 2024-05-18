# ModAssignSaveSubmissionRequestPlugindata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**files_filemanager** | **int** | The id of a draft area containing files for this submission. | [optional] [default to null]
**onlinetext_editor** | [**ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor**](ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_save_submission_request_plugindata import ModAssignSaveSubmissionRequestPlugindata

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveSubmissionRequestPlugindata from a JSON string
mod_assign_save_submission_request_plugindata_instance = ModAssignSaveSubmissionRequestPlugindata.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveSubmissionRequestPlugindata.to_json())

# convert the object into a dict
mod_assign_save_submission_request_plugindata_dict = mod_assign_save_submission_request_plugindata_instance.to_dict()
# create an instance of ModAssignSaveSubmissionRequestPlugindata from a dict
mod_assign_save_submission_request_plugindata_from_dict = ModAssignSaveSubmissionRequestPlugindata.from_dict(mod_assign_save_submission_request_plugindata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


