# ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**editorfields** | [**List[ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner]**](ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.md) |  | [optional] 
**fileareas** | [**List[ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner]**](ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.md) |  | [optional] 
**name** | **str** | submission plugin name | [optional] [default to 'null']
**type** | **str** | submission plugin type | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_feedback_plugins_inner import ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner from a JSON string
mod_assign_get_submission_status200_response_feedback_plugins_inner_instance = ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_feedback_plugins_inner_dict = mod_assign_get_submission_status200_response_feedback_plugins_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner from a dict
mod_assign_get_submission_status200_response_feedback_plugins_inner_from_dict = ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.from_dict(mod_assign_get_submission_status200_response_feedback_plugins_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


