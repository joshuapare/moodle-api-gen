# ModWorkshopEvaluateSubmissionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackformat** | **int** | The feedback format for text. | [optional] [default to 0]
**feedbacktext** | **str** | The feedback for the author. | [optional] [default to '']
**gradeover** | **str** | The new submission grade. | [optional] [default to '']
**published** | **bool** | Publish the submission for others?. | [optional] [default to False]
**submissionid** | **int** | submission id. | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_evaluate_submission_request import ModWorkshopEvaluateSubmissionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopEvaluateSubmissionRequest from a JSON string
mod_workshop_evaluate_submission_request_instance = ModWorkshopEvaluateSubmissionRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopEvaluateSubmissionRequest.to_json())

# convert the object into a dict
mod_workshop_evaluate_submission_request_dict = mod_workshop_evaluate_submission_request_instance.to_dict()
# create an instance of ModWorkshopEvaluateSubmissionRequest from a dict
mod_workshop_evaluate_submission_request_from_dict = ModWorkshopEvaluateSubmissionRequest.from_dict(mod_workshop_evaluate_submission_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


