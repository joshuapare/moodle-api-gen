# ModAssignSaveGradeRequestPlugindata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignfeedbackcomments_editor** | [**ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor**](ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor.md) |  | [optional] 
**files_filemanager** | **int** | The id of a draft area containing files for this feedback. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_assign_save_grade_request_plugindata import ModAssignSaveGradeRequestPlugindata

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradeRequestPlugindata from a JSON string
mod_assign_save_grade_request_plugindata_instance = ModAssignSaveGradeRequestPlugindata.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradeRequestPlugindata.to_json())

# convert the object into a dict
mod_assign_save_grade_request_plugindata_dict = mod_assign_save_grade_request_plugindata_instance.to_dict()
# create an instance of ModAssignSaveGradeRequestPlugindata from a dict
mod_assign_save_grade_request_plugindata_from_dict = ModAssignSaveGradeRequestPlugindata.from_dict(mod_assign_save_grade_request_plugindata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


