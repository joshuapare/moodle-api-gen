# ModAssignSaveGradesRequestGradesInnerPlugindata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignfeedbackcomments_editor** | [**ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor**](ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor.md) |  | [optional] 
**files_filemanager** | **int** | The id of a draft area containing files for this feedback. | [optional] 

## Example

```python
from openapi_client.models.mod_assign_save_grades_request_grades_inner_plugindata import ModAssignSaveGradesRequestGradesInnerPlugindata

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradesRequestGradesInnerPlugindata from a JSON string
mod_assign_save_grades_request_grades_inner_plugindata_instance = ModAssignSaveGradesRequestGradesInnerPlugindata.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradesRequestGradesInnerPlugindata.to_json())

# convert the object into a dict
mod_assign_save_grades_request_grades_inner_plugindata_dict = mod_assign_save_grades_request_grades_inner_plugindata_instance.to_dict()
# create an instance of ModAssignSaveGradesRequestGradesInnerPlugindata from a dict
mod_assign_save_grades_request_grades_inner_plugindata_from_dict = ModAssignSaveGradesRequestGradesInnerPlugindata.from_dict(mod_assign_save_grades_request_grades_inner_plugindata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


