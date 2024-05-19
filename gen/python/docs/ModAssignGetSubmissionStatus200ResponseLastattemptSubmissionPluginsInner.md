# ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**editorfields** | [**List[ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner]**](ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner.md) |  | [optional] 
**fileareas** | [**List[ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner]**](ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.md) |  | [optional] 
**name** | **str** | submission plugin name | [optional] 
**type** | **str** | submission plugin type | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner import ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner from a JSON string
mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_instance = ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_dict = mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner from a dict
mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_from_dict = ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.from_dict(mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


