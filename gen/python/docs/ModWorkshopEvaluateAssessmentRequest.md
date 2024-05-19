# ModWorkshopEvaluateAssessmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | Assessment id. | [default to null]
**feedbackformat** | **int** | The feedback format for text. | [optional] [default to 0]
**feedbacktext** | **str** | The feedback for the reviewer. | [optional] [default to '']
**gradinggradeover** | **str** | The new grading grade. | [optional] [default to '']
**weight** | **int** | The new weight for the assessment. | [optional] [default to 1]

## Example

```python
from openapi_client.models.mod_workshop_evaluate_assessment_request import ModWorkshopEvaluateAssessmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopEvaluateAssessmentRequest from a JSON string
mod_workshop_evaluate_assessment_request_instance = ModWorkshopEvaluateAssessmentRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopEvaluateAssessmentRequest.to_json())

# convert the object into a dict
mod_workshop_evaluate_assessment_request_dict = mod_workshop_evaluate_assessment_request_instance.to_dict()
# create an instance of ModWorkshopEvaluateAssessmentRequest from a dict
mod_workshop_evaluate_assessment_request_from_dict = ModWorkshopEvaluateAssessmentRequest.from_dict(mod_workshop_evaluate_assessment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


