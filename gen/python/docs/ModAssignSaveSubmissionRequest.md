# ModAssignSaveSubmissionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | The assignment id to operate on | 
**plugindata** | [**ModAssignSaveSubmissionRequestPlugindata**](ModAssignSaveSubmissionRequestPlugindata.md) |  | 

## Example

```python
from openapi_client.models.mod_assign_save_submission_request import ModAssignSaveSubmissionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveSubmissionRequest from a JSON string
mod_assign_save_submission_request_instance = ModAssignSaveSubmissionRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveSubmissionRequest.to_json())

# convert the object into a dict
mod_assign_save_submission_request_dict = mod_assign_save_submission_request_instance.to_dict()
# create an instance of ModAssignSaveSubmissionRequest from a dict
mod_assign_save_submission_request_from_dict = ModAssignSaveSubmissionRequest.from_dict(mod_assign_save_submission_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


