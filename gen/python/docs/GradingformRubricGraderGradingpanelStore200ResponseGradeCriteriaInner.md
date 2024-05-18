# GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the Criteria | [optional] 
**id** | **int** | ID of the Criteria | [optional] 
**levels** | [**List[GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner]**](GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner.md) |  | [optional] 
**remark** | **str** | Any remarks for this criterion for the user being assessed | [optional] 

## Example

```python
from openapi_client.models.gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner import GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner from a JSON string
gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner_instance = GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.to_json())

# convert the object into a dict
gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner_dict = gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner_instance.to_dict()
# create an instance of GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner from a dict
gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner_from_dict = GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.from_dict(gradingform_rubric_grader_gradingpanel_store200_response_grade_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


