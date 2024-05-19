# ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | field description | [optional] [default to 'null']
**format** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**name** | **str** | field name | [optional] [default to 'null']
**text** | **str** | field value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner import ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner from a JSON string
mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner_instance = ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner_dict = mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner from a dict
mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner_from_dict = ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.from_dict(mod_assign_get_submission_status200_response_feedback_plugins_inner_editorfields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


